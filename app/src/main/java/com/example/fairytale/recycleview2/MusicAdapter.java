package com.example.fairytale.recycleview2;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dow on 27/12/2558.
 */
public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder>{

    List <Music> musicList;
    public MusicAdapter(List<Music> list){
        this.musicList = list;

    }
    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_music_item, parent, false);
        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position) {
        Music music = musicList.get(position);
        holder.tvMusicName.setText(music.getMusicName());
        holder.tvMusicArtist.setText(music.getMucicArtist());
        holder.imgArtist.setImageResource(music.getPhoto());

    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }
    public class MusicViewHolder extends RecyclerView.ViewHolder{
        TextView tvMusicName;
        TextView tvMusicArtist;
        ImageView imgArtist;

        public MusicViewHolder(View itemView) {
            super(itemView);

            tvMusicName = (TextView) itemView.findViewById(R.id.tvMusicname);
            tvMusicArtist = (TextView) itemView.findViewById(R.id.tvMusicartist);
            imgArtist = (ImageView) itemView.findViewById(R.id.imgArtist);
        }
    }
}

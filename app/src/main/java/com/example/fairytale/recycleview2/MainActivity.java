package com.example.fairytale.recycleview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MusicAdapter adapter;
    List<Music> musicList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialView();

        setupView();

    }


    private void initialView() {
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
    }
    private void setupView() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        musicList = new ArrayList<>();
        Music music = new Music("Belong With Me", "Talor swift", R.drawable.taylor);
        musicList.add(music);
        Music music1 = new Music("Belong With Me", "Talor swift", R.drawable.swift);
        musicList.add(music1);
        Music music2 = new Music("Belong With Me", "Talor swift", R.drawable.swift);
        musicList.add(music2);

        adapter = new MusicAdapter(musicList);
        recyclerView.setAdapter(adapter);
    }
}

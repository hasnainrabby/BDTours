package com.aerobola.bdtravels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import java.util.ArrayList;

public class ListActivityKhulna extends AppCompatActivity {

    private ArrayList<Integer> mImages_urls = new ArrayList<>();
    private ArrayList<String> mImage_names = new ArrayList<>();
    private ArrayList<String> mImage_detail = new ArrayList<>();
    private ArrayList<String> mImage_activity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        InitImageBitmaps();
    }

    private void InitImageBitmaps() {
        mImages_urls.add(R.drawable.sundorban);
        mImage_names.add("সুন্দরবন");
        mImage_detail.add("খুলনা,বাগেরহাট।");
        mImage_activity.add("Sundarban");



        InitRecyclerView();
    }

    private void InitRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ListAdapter recyclerViewAdapter = new ListAdapter(this, mImages_urls, mImage_names, mImage_detail, mImage_activity) {
        };
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }


}

package com.aerobola.bdtravels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivityMymensingh extends AppCompatActivity {

    private ArrayList<Integer> mImages_urls = new ArrayList<>();
    private ArrayList<String> mImage_names = new ArrayList<>();
    private ArrayList<String> mImage_detail = new ArrayList<>();
    private ArrayList<Integer> mImage_activity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        InitImageBitmaps();
    }

    private void InitImageBitmaps() {
        mImages_urls.add(R.drawable.birishiri1);
        mImage_names.add("বিরিশিরি");
        mImage_detail.add("নেত্রকোনা।");
        mImage_activity.add(80);

        mImages_urls.add(R.drawable.gojni1);
        mImage_names.add("গজনি");
        mImage_detail.add("ঝিনাইগাতী,শেরপুর।");
        mImage_activity.add(81);

        mImages_urls.add(R.drawable.modhutila1);
        mImage_names.add("মধুটিলা ইকো পার্ক");
        mImage_detail.add("নলিতাবাড়ি,শেরপুর।");
        mImage_activity.add(82);




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

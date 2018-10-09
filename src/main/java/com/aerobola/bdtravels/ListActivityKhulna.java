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
    private ArrayList<Integer> mImage_activity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        InitImageBitmaps();
    }

    private void InitImageBitmaps() {
        mImages_urls.add(R.drawable.sundarban2);
        mImage_names.add("সুন্দরবন");
        mImage_detail.add("খুলনা,বাগেরহাট।");
        mImage_activity.add(1);


        mImages_urls.add(R.drawable.kuthibari1);
        mImage_names.add("কুঠিবাড়ী");
        mImage_detail.add("শিলাইদাহ,কুষ্টিয়া।");
        mImage_activity.add(2);


        mImages_urls.add(R.drawable.shat_gombuj4);
        mImage_names.add("ষাট গম্বুজ মসজিদ");
        mImage_detail.add("বাগেরহাট");
        mImage_activity.add(3);

        mImages_urls.add(R.drawable.mujibnagar6);
        mImage_names.add("মুজিবনগর");
        mImage_detail.add("মুজিবনগর,মেহেরপুর।");
        mImage_activity.add(4);

        mImages_urls.add(R.drawable.lalon1);
        mImage_names.add("লালন শাহের মাজার");
        mImage_detail.add("ছেউড়িয়া,কুমারখালী,কুষ্টিয়া।");
        mImage_activity.add(5);




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

package com.aerobola.bdtravels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivityDhaka extends AppCompatActivity {

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
        mImage_names.add("আহসান মঞ্জিল");
        mImage_detail.add("পুরান ঢাকার ইসলামপুর।");
        mImage_activity.add(11);


        mImages_urls.add(R.drawable.kuthibari1);
        mImage_names.add("হোসেনি দালান");
        mImage_detail.add("পুরান ঢাকা।");
        mImage_activity.add(12);


        mImages_urls.add(R.drawable.shat_gombuj4);
        mImage_names.add("লালবাগ কেল্লা");
        mImage_detail.add("পুরান ঢাকার লালবাগ।");
        mImage_activity.add(13);


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

package com.aerobola.bdtravels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListActivitySylhet extends AppCompatActivity {
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
        mImages_urls.add(R.drawable.bisanakandi1);
        mImage_names.add("বিছানাকান্দি");
        mImage_detail.add("গোয়াইনঘাট,সিলেট।");
        mImage_activity.add(60);

        mImages_urls.add(R.drawable.jaflong1);
        mImage_names.add("জাফলং");
        mImage_detail.add("জাফলং,সিলেট।");
        mImage_activity.add(61);

        mImages_urls.add(R.drawable.lalakhal1);
        mImage_names.add("লালাখাল");
        mImage_detail.add("খাদিমনগর,সিলেট।");
        mImage_activity.add(62);

        mImages_urls.add(R.drawable.panthumai1);
        mImage_names.add("পানথুমাই");
        mImage_detail.add("গোয়াইনঘাট,সিলেট।");
        mImage_activity.add(63);

        mImages_urls.add(R.drawable.ratargul1);
        mImage_names.add("রাতারগুল");
        mImage_detail.add("গোয়াইনঘাট,সিলেট।");
        mImage_activity.add(64);

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

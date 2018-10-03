package com.aerobola.bdtravels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


public class DetailsActivitySundarban extends AppCompatActivity {
    CarouselView carouselView;
    TextView tvDetail, tvHeadline;
    int[] sampleImages = {
            R.drawable.sundarban_1,
            R.drawable.sundarban_2,
            R.drawable.sundarban_3,
            R.drawable.sundarban_4,
            R.drawable.sundarban_5
    };
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHeadline = findViewById(R.id.tvHeadline);
        tvHeadline.setMovementMethod(new ScrollingMovementMethod());
        String data = "";
        StringBuffer stringBuffer = new StringBuffer();
        InputStream is = this.getResources().openRawResource(R.raw.sundarban_hl);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        if (is != null) {
            try {
                while ((data = bufferedReader.readLine()) != null) {
                    stringBuffer.append(data + "\n");
                }
                tvDetail.setText(stringBuffer);
                is.close();
            } catch (Exception e) {

                e.printStackTrace();

            }
        }


        tvDetail = findViewById(R.id.tvDetails);
        tvDetail.setMovementMethod(new ScrollingMovementMethod());
        //String data = "";
        //StringBuffer stringBuffer=new StringBuffer();
        is = this.getResources().openRawResource(R.raw.sundarban);
        bufferedReader = new BufferedReader(new InputStreamReader(is));
        if (is != null) {
            try {
                while ((data = bufferedReader.readLine()) != null) {
                    stringBuffer.append(data + "\n");
                }
                tvDetail.setText(stringBuffer);
                is.close();
            } catch (Exception e) {

                e.printStackTrace();

            }
        }


        Toolbar toolbar = findViewById(R.id.toolBar);
        TextView mTitle = toolbar.findViewById(R.id.toolBarTitle);
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }


}




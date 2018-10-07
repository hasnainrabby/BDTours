package com.aerobola.bdtravels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class DetailsActivitySundarban extends AppCompatActivity {
    CarouselView carouselView;
    ExpandableTextView etvIntro, etvKivabeJaben, etvKivabePousaben, etvKothaiThakben, etvKiKhaben, etvVromonTips;
    TextView tvIntro, tvKivabeJaben, tvKivabePousaben, tvKothaiThakben, tvKiKhaben, tvVromonTips;
    int[] sampleImages = {
            R.drawable.sundarban1,
            R.drawable.sundarban2,
            R.drawable.sundarban3,
            R.drawable.sundarban4,
            R.drawable.sundarban7
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
        setContentView(R.layout.activity_details);

        TextView toolBarTitle;
        toolBarTitle = findViewById(R.id.toolBarTitle);
        toolBarTitle.setText("---সুন্দরবন---");

        //expandable intro read from text file

        etvIntro = findViewById(R.id.etvIntro);
        tvIntro = (TextView) etvIntro.findViewById(R.id.expandable_text);

        InputStream inputStream = getResources().openRawResource(R.raw.sundarban_intro);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i;
        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        etvIntro.setText(byteArrayOutputStream.toString());


        //expandable kivabe jaben read from text file
        etvKivabeJaben = findViewById(R.id.etvKivabeJaben);
        tvKivabeJaben = (TextView) etvKivabeJaben.findViewById(R.id.expandable_text);

        inputStream = getResources().openRawResource(R.raw.sundarban_kivabejaben);

        byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        etvKivabeJaben.setText(byteArrayOutputStream.toString());

        //expandable kivabe pousaben read from text file
        etvKivabePousaben = findViewById(R.id.etvKivabePousaben);
        tvKivabePousaben = (TextView) etvKivabePousaben.findViewById(R.id.expandable_text);

        inputStream = getResources().openRawResource(R.raw.sundarban_kivabepousaben);

        byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        etvKivabePousaben.setText(byteArrayOutputStream.toString());

        //expandable kothai thakben read from text file
        etvKothaiThakben = findViewById(R.id.etvKothaiThakben);
        tvKothaiThakben = (TextView) etvKothaiThakben.findViewById(R.id.expandable_text);

        inputStream = getResources().openRawResource(R.raw.sundarban_kothaithakben);

        byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        etvKothaiThakben.setText(byteArrayOutputStream.toString());

        //expandable ki khaben read from text file
        etvKiKhaben = findViewById(R.id.etvKiKhaben);
        tvKiKhaben = (TextView) etvKiKhaben.findViewById(R.id.expandable_text);

        inputStream = getResources().openRawResource(R.raw.sundarban_khabar);

        byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        etvKiKhaben.setText(byteArrayOutputStream.toString());

        //expandable vromon tips read from text file
        etvVromonTips = findViewById(R.id.etvVromonTips);
        tvVromonTips = (TextView) etvVromonTips.findViewById(R.id.expandable_text);

        inputStream = getResources().openRawResource(R.raw.sundarban_vromontips);

        byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        etvVromonTips.setText(byteArrayOutputStream.toString());


        Toolbar toolbar = findViewById(R.id.toolBar);
        TextView mTitle = toolbar.findViewById(R.id.toolBarTitle);
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }


}




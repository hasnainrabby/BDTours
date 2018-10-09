package com.aerobola.bdtravels;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public abstract class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ArrayList<Integer> mImages = new ArrayList<>();
    private ArrayList<String> mImage_names = new ArrayList<>();
    private ArrayList<String> mImage_detail = new ArrayList<>();
    private ArrayList<Integer> mImage_activity = new ArrayList<>();
    private Context mContext;


    public ListAdapter(Context mContext, ArrayList<Integer> mImages, ArrayList<String> mImage_names, ArrayList<String> mImage_detail, ArrayList<Integer> mImage_activity) {
        this.mImages = mImages;
        this.mImage_names = mImage_names;
        this.mImage_detail = mImage_detail;
        this.mContext = mContext;
        this.mImage_activity = mImage_activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item,
                parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Glide.with(mContext).asBitmap().load(mImages.get(position)).into(holder.image);
        holder.image_name.setText(mImage_names.get(position));
        holder.image_detail.setText(mImage_detail.get(position));
        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, mImage_names.get(holder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
               //Khulna
                if (mImage_activity.get(holder.getAdapterPosition()) == 1) {
                    Intent intent = new Intent(mContext, DetailsActivitySundarban.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 2) {
                    Intent intent = new Intent(mContext, DetailsActivityKuthibari.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 3) {
                    Intent intent = new Intent(mContext, DetailsActivityShatGombujMashjid.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 4) {
                    Intent intent = new Intent(mContext, DetailsActivityMujibNagor.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 5) {
                    Intent intent = new Intent(mContext, DetailsActivityLalon.class);
                    mContext.startActivity(intent);
                }

                //Dhaka

                if (mImage_activity.get(holder.getAdapterPosition()) == 11) {
                    Intent intent = new Intent(mContext, DetailsActivityAhsanMonjil.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 12) {
                    Intent intent = new Intent(mContext, DetailsActivityHosniDalan.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 13) {
                    Intent intent = new Intent(mContext, DetailsActivityLalbagKella.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 21) {
                    Intent intent = new Intent(mContext, DetailsActivityBaghamosjid.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 22) {
                    Intent intent = new Intent(mContext, DetailsActivityPuthiaRajbari.class);
                    mContext.startActivity(intent);
                }
                //Barisal
                if (mImage_activity.get(holder.getAdapterPosition()) == 31) {
                    Intent intent = new Intent(mContext, DetailsActivitySatla.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 32) {
                    Intent intent = new Intent(mContext, DetailsActivityGutiamosjid.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 33) {
                    Intent intent = new Intent(mContext, DetailsActivityDurgasagor.class);
                    mContext.startActivity(intent);
                }

                //Rangpur
                if (mImage_activity.get(holder.getAdapterPosition()) == 41) {
                    Intent intent = new Intent(mContext, DetailsActivityKantojir.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 42) {
                    Intent intent = new Intent(mContext, DetailsActivitySopnopuri.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 43) {
                    Intent intent = new Intent(mContext, DetailsActivityTajhat.class);
                    mContext.startActivity(intent);
                }
                //Chittagong
                if (mImage_activity.get(holder.getAdapterPosition()) == 71) {
                    Intent intent = new Intent(mContext, DetailsActivityBashbariya.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 72) {
                    Intent intent = new Intent(mContext, DetailsActivityKhoiyachora.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 73) {
                    Intent intent = new Intent(mContext, DetailsActivityPotenga.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 74) {
                    Intent intent = new Intent(mContext,DetailsActivityShitakundu.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 75) {
                    Intent intent = new Intent(mContext, DetailsActivityChandranath.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 76) {
                    Intent intent = new Intent(mContext, DetailsActivityFoysLake.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 77) {
                    Intent intent = new Intent(mContext, DetailsActivityBogalek.class);
                    mContext.startActivity(intent);
                }
                if (mImage_activity.get(holder.getAdapterPosition()) == 78) {
                    Intent intent = new Intent(mContext, DetailsActivityNilachol.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 79) {
                    Intent intent = new Intent(mContext, DetailsActivityNilgiri.class);
                    mContext.startActivity(intent);
                }

//Sylhet
                if (mImage_activity.get(holder.getAdapterPosition()) ==60)  {
                    Intent intent = new Intent(mContext, DetailsActivityBisanakandi.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 61) {
                    Intent intent = new Intent(mContext, DetailsActivityJaflong.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 62) {
                    Intent intent = new Intent(mContext, DetailsActivityLalakhal.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 63) {
                    Intent intent = new Intent(mContext, DetailsActivityPanthumai.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 64) {
                    Intent intent = new Intent(mContext, DetailsActivityRatargul.class);
                    mContext.startActivity(intent);
                }

//Mymonshing
                if (mImage_activity.get(holder.getAdapterPosition()) == 80) {
                    Intent intent = new Intent(mContext, DetailsActivityBirishiri.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 81) {
                    Intent intent = new Intent(mContext, DetailsActivityGojni.class);
                    mContext.startActivity(intent);
                }

                if (mImage_activity.get(holder.getAdapterPosition()) == 82) {
                    Intent intent = new Intent(mContext, DetailsActivityModhutila.class);
                    mContext.startActivity(intent);
                }


            }

        });
    }

    @Override
    public int getItemCount() {
        return mImage_names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView image_name;
        TextView image_detail;
        LinearLayout parent_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            image_name = itemView.findViewById(R.id.image_name);
            image_detail = itemView.findViewById(R.id.image_details);
            parent_layout = itemView.findViewById(R.id.parent_layout);
        }
    }
}


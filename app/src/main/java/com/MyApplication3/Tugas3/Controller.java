package com.MyApplication3.Tugas3;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Controller extends RecyclerView.Adapter<Controller.AgentViewHolder> {
    private ArrayList<SetGet> listIphone;
    private Context context;

    public Controller(ArrayList<SetGet> dataList, Context context) {
        this.listIphone = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public AgentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_card_recyclerview, parent, false);
        return new AgentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AgentViewHolder holder, int position) {
        String image    = listIphone.get(position).getImage();
        String series     = listIphone.get(position).getSeries();
        String release     = listIphone.get(position).getRelease();
        String judul  = listIphone.get(position).getJudul();

        Glide.with(holder.itemView.getContext())
            .load(listIphone.get(position).getImage())
            .into(holder.image);

        holder.series.setText(series);
        holder.release.setText(release);
        holder.judul.setText(judul);

        try {

            holder.btnPreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openDetailActivity(image, series, release, judul);
                }
            });

            holder.btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareAgent(series, judul);
                }
            });
        }catch (Exception e) {
            Log.d("DetailActivity", "MyErr : " + e);
        }
    }

    @Override
    public int getItemCount() {
        return (listIphone != null) ? listIphone.size() : 0;
    }


    public static class AgentViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView series, release, judul;
        private final Button btnPreview, btnShare;

        public AgentViewHolder(View itemView) {
            super(itemView);
            image      = (ImageView) itemView.findViewById(R.id.image);
            series = (TextView) itemView.findViewById(R.id.series);
            release = (TextView) itemView.findViewById(R.id.release);
            judul = (TextView) itemView.findViewById(R.id.desc);
            btnPreview = (Button) itemView.findViewById(R.id.preview);
            btnShare   = (Button) itemView.findViewById(R.id.share);
        }
    }

    public void openDetailActivity(@NonNull String ...agent) {
        Intent i = new Intent(context, Preview.class);
        i.putExtra("IMAGE_KEY", agent[0]);
        i.putExtra("NAME_KEY", agent[1]);
        i.putExtra("ROLE_KEY", agent[2]);
        i.putExtra("SUMMARY_KEY", agent[3]);
        context.startActivity(i);
    }

    public void shareAgent(@NonNull String ...agent) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, agent[0] + "\n\n" + agent[1]);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        context.startActivity(shareIntent);
    }
}

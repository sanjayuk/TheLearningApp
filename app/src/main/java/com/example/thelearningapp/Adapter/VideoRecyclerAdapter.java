package com.example.thelearningapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thelearningapp.Model.VideoModel;
import com.example.thelearningapp.R;

import java.util.ArrayList;
import java.util.List;

public class VideoRecyclerAdapter extends RecyclerView.Adapter<VideoRecyclerAdapter.VideoViewHolder> {

    private Context context;
    private List<VideoModel> videoModels;

    public VideoRecyclerAdapter(Context context, List<VideoModel> videoModels) {
        this.context = context;
        this.videoModels = videoModels;
    }

    public VideoRecyclerAdapter(List<VideoModel> videoModels) {
        this.videoModels = videoModels;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_cardview, parent, false);

        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.videoImg.setImageResource(videoModels.get(position).getVideoImage());
        holder.videoDesc.setText(videoModels.get(position).getVideoTitle());
    }

    @Override
    public int getItemCount() {
        return videoModels.size();
    }

    public static final class VideoViewHolder extends RecyclerView.ViewHolder{
        ImageView videoImg;
        TextView videoDesc;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoImg = itemView.findViewById(R.id.videoImg);
            videoDesc = itemView.findViewById(R.id.videoCardDesc);



        }
    }
}

package com.example.thelearningapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thelearningapp.Model.Model;
import com.example.thelearningapp.Model.VideoModel;
import com.example.thelearningapp.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    //private static final String TAG = "MyAdapter";
    public ArrayList<Model> models;
    private Context context;



    public MyAdapter(ArrayList<Model> models) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.live_class_card, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Model m = models.get(position);
        holder.mliveTime.setText(m.getLiveTime());
        holder.msubject.setText(m.getSubject());
        holder.mname.setText(m.getName());
        holder.myrsExp.setText(m.getYrsExp());
        holder.mprofIn.setText(m.getProfIn());
        holder.mteacherImg.setImageResource(m.getTeacherImg());

        boolean isExpanded = models.get(position).isExpanded();
        holder.expandableView.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

        setVideoRecycler(holder.videoRecycler,models.get(position).getVideoModels())    ;


    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView mteacherImg,arrowBtn;
        TextView mliveTime, msubject, mname, myrsExp, mprofIn;
        ConstraintLayout expandableView,constraintRevise;
//        Button ;

        RecyclerView videoRecycler;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mteacherImg = itemView.findViewById(R.id.teacher_image);
            mliveTime = itemView.findViewById(R.id.live_time_cardview);
            msubject = itemView.findViewById(R.id.subject_cardview);
            mname = itemView.findViewById(R.id.name_cardview);
            myrsExp = itemView.findViewById(R.id.yrs_exp_cardview);
            mprofIn = itemView.findViewById(R.id.prof_in_cardview);
            expandableView = itemView.findViewById(R.id.expandableView);
            arrowBtn = itemView.findViewById(R.id.arrowBtn);
            constraintRevise = itemView.findViewById(R.id.constraintRevise);

            videoRecycler = itemView.findViewById(R.id.videoRecycler);

            arrowBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Model m = models.get(getAdapterPosition());
                    m.setExpanded(!m.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                    arrowBtn.setImageResource(R.drawable.ic_up_24);
                }
            });

            constraintRevise.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Model m = models.get(getAdapterPosition());
                    m.setExpanded(!m.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                    arrowBtn.setImageResource(R.drawable.ic_up_24);

                }
            });


        }
    }

    public void setVideoRecycler(RecyclerView recyclerView, List<VideoModel> videoModels) {

        VideoRecyclerAdapter videoRecyclerAdapter = new VideoRecyclerAdapter(context,videoModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(videoRecyclerAdapter);

    }
}

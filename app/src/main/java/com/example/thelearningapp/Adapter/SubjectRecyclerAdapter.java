package com.example.thelearningapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thelearningapp.Model.SubjectModel;
import com.example.thelearningapp.R;
import com.example.thelearningapp.SubjectDetailsActivity;

import java.util.List;

public class SubjectRecyclerAdapter extends RecyclerView.Adapter<SubjectRecyclerAdapter.SubjectViewHolder> {
    Context context;
    List<SubjectModel>subjectModels;

   // SubjectCallback callback;

    public SubjectRecyclerAdapter(List<SubjectModel> subjectModels, Context context /*SubjectCallback callback*/) {
        this.subjectModels = subjectModels;
        this.context = context;
      //  this.callback = callback;
    }

    public SubjectRecyclerAdapter(List<SubjectModel> subjectModels) {
        this.subjectModels = subjectModels;

    }

    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subject_learning_card, parent, false);
        return new SubjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder holder, int position) {
        final SubjectModel temp = subjectModels.get(position);

        holder.subjectImage.setImageResource(subjectModels.get(position).getSubjectImg());
        holder.subjectTitleName.setText(subjectModels.get(position).getSubjectTitle());

        holder.subjectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SubjectDetailsActivity.class);
                intent.putExtra("subjectImage",temp.getSubjectImg());
                intent.putExtra("subjectTitleName",temp.getSubjectTitle());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
//        holder.subjectTitleName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, SubjectDetailsActivity.class);
//                intent.putExtra("subjectImage",temp.getSubjectImg());
//                intent.putExtra("subjectTitleName",temp.getSubjectTitle());
//
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return subjectModels.size();
    }

    public class SubjectViewHolder extends RecyclerView.ViewHolder{
        ImageView subjectImage;
        TextView subjectTitleName;

        public SubjectViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectImage = itemView.findViewById(R.id.subImg);
            subjectTitleName= itemView.findViewById(R.id.subTitle);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    callback.onSubjectItemClick(getAdapterPosition(),
//                            subjectImage,
//                            subjectTitleName);
//                }
//            });
        }
    }
}

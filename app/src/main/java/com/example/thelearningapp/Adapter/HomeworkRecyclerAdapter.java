package com.example.thelearningapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thelearningapp.Model.HomeWorkModel;
import com.example.thelearningapp.R;

import java.util.List;

public class HomeworkRecyclerAdapter extends RecyclerView.Adapter<HomeworkRecyclerAdapter.HomeworkViewHolder> {

    Context context;
    List<HomeWorkModel> homeWorkModels;

    public HomeworkRecyclerAdapter(List<HomeWorkModel> homeWorkModels) {
        //this.context = context;
        this.homeWorkModels = homeWorkModels;
    }

    @NonNull
    @Override
    public HomeworkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.homework_card, parent, false);

        return new HomeworkViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeworkViewHolder holder, int position) {
        holder.homeworkSubject.setText(homeWorkModels.get(position).getHwSubject());
        holder.homeworkAssigned.setText(homeWorkModels.get(position).getHwAssigned());
        holder.homeworkCompletion.setText(homeWorkModels.get(position).getHwCompleetion());
        holder.homeworkChecked.setText(homeWorkModels.get(position).getHwChecked());
        holder.homeworkDate.setText(homeWorkModels.get(position).getHwDay());
        holder.homeworkMonth.setText(homeWorkModels.get(position).getHwMonth());


    }

    @Override
    public int getItemCount() {
        return homeWorkModels.size();
    }


    public class HomeworkViewHolder extends RecyclerView.ViewHolder{
        TextView homeworkSubject,homeworkAssigned,homeworkCompletion,homeworkChecked,homeworkDate,homeworkMonth;
        Button homeworkUpload,homeworkDownload;

        public HomeworkViewHolder(@NonNull View itemView) {
            super(itemView);

            homeworkSubject = itemView.findViewById(R.id.homework_title);
            homeworkAssigned = itemView.findViewById(R.id.assignedDate);
            homeworkCompletion = itemView.findViewById(R.id.completionDate);
            homeworkChecked = itemView.findViewById(R.id.checkedDate);
            homeworkDate = itemView.findViewById(R.id.date_textView);
            homeworkMonth = itemView.findViewById(R.id.month_textView);

        }
    }

}

package com.example.thelearningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.thelearningapp.Adapter.HomeworkRecyclerAdapter;
import com.example.thelearningapp.Adapter.MyAdapter;
import com.example.thelearningapp.Adapter.VideoRecyclerAdapter;
import com.example.thelearningapp.Model.HomeWorkModel;
import com.example.thelearningapp.Model.Model;
import com.example.thelearningapp.Model.VideoModel;

import java.util.ArrayList;

public class HomeWork extends AppCompatActivity {

    RecyclerView homeworkRecyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work);

        homeworkRecyclerView = findViewById(R.id.homework_recylerView);

        homeworkRecycler();
    }

    private void homeworkRecycler() {
        homeworkRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<HomeWorkModel> homeWorkModels = new ArrayList<>();
        homeWorkModels.add(new HomeWorkModel("Physics Homework","Assigned Date: 15 Oct 2020","Completion Date: 16 Oct 2020","Checked Date: 15 Oct 2020","14","Oct"));
        homeWorkModels.add(new HomeWorkModel("Chemistry Homework","Assigned Date: 15 Oct 2020","Completion Date: 16 Oct 2020","Checked Date: 15 Oct 2020","15","Oct"));
        homeWorkModels.add(new HomeWorkModel("Biology Homework","Assigned Date: 16 Oct 2020","Completion Date: 17 Oct 2020","Checked Date: 16 Oct 2020","16","Oct"));
        homeWorkModels.add(new HomeWorkModel("Mathematics Homework","Assigned Date: 16 Oct 2020","Completion Date: 17 Oct 2020","Checked Date: 16 Oct 2020","16","Oct"));
        homeWorkModels.add(new HomeWorkModel("Physics Homework","Assigned Date: 16 Oct 2020","Completion Date: 17 Oct 2020","Checked Date: 16 Oct 2020","17","Oct"));

        adapter = new HomeworkRecyclerAdapter(homeWorkModels);
        homeworkRecyclerView.setAdapter(adapter);
    }
}
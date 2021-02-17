package com.example.thelearningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thelearningapp.Adapter.MyAdapter;
import com.example.thelearningapp.Adapter.VideoRecyclerAdapter;
import com.example.thelearningapp.Model.VideoModel;

import java.util.ArrayList;
import java.util.List;

public class SubjectDetailsActivity extends AppCompatActivity {
    ImageView subImg;
    TextView subTitle,subDescription;
    String subValue;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_details);

        subImg = (ImageView) findViewById(R.id.subject_image);
        subTitle = (TextView) findViewById(R.id.subject_name);
        subDescription = (TextView) findViewById(R.id.subject_desc);

//        recyclerView = findViewById(R.id.lesson_video_recyclerview);

        subImg.setImageResource(getIntent().getIntExtra("subjectImage",0));
        subTitle.setText(getIntent().getStringExtra("subjectTitleName"));
        subValue = subTitle.getText().toString();
   //     creatingIndividualView();


    }

//    private void creatingIndividualView() {
//        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
//
//        List<VideoModel> videoModels1 = new ArrayList<>();
//        if(subValue == "Physics"){
//
//            videoModels1.add(new VideoModel(R.drawable.vi1,1,"What is Linear Programming?"));
//            videoModels1.add(new VideoModel(R.drawable.vi2,1,"Components of Linear Programming"));
//            videoModels1.add(new VideoModel(R.drawable.vi3,1,"Characteristics of Linear Programming"));
//            videoModels1.add(new VideoModel(R.drawable.vi4,1,"Linear Programming Example"));
//            videoModels1.add(new VideoModel(R.drawable.vi5,1,"Importance of Linear Programming"));
//        }else{
////            subDescription.setText(subValue);
//        }
//
//        adapter = new VideoRecyclerAdapter(videoModels1);
//        recyclerView.setAdapter(adapter);
//
//    }
}
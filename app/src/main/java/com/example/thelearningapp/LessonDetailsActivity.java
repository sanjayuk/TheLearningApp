package com.example.thelearningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.thelearningapp.Model.SubjectModel;

public class LessonDetailsActivity extends AppCompatActivity {

    ImageView imgSubject;
    TextView txtSubject;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_details);

        imgSubject = findViewById(R.id.subject_image);
        txtSubject = findViewById(R.id.subject_name);



        //get subject item object

        SubjectModel item = (SubjectModel) getIntent().getExtras().getSerializable("subjectObject");
        loadSubjectData(item);

    }

    private void loadSubjectData(SubjectModel item) {
        Glide.with(this).load(item.getSubjectImg()).into(imgSubject);
    }
}
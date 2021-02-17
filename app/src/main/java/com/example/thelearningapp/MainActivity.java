package com.example.thelearningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.core.util.Pair;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thelearningapp.Adapter.HomeworkRecyclerAdapter;
import com.example.thelearningapp.Adapter.SubjectCallback;
import com.example.thelearningapp.Adapter.SubjectRecyclerAdapter;
import com.example.thelearningapp.Model.HomeWorkModel;
import com.example.thelearningapp.Model.SubjectModel;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity /*implements SubjectCallback */{

    TextView correctAnswer,incorrectAnswer,queSkipped;
    PieChart pieChart;

    Button liveMoreButton,homeworkmoreButton;
    RecyclerView subjectLearningRecyclerView;
    RecyclerView.Adapter adapter;
    List<SubjectModel> mdata ;


    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correctAnswer = findViewById(R.id.correctAnswer);
        incorrectAnswer = findViewById(R.id.incorrectAnswer);
        queSkipped = findViewById(R.id.questionSkipped);
        pieChart = findViewById(R.id.piechart);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        subjectLearningRecyclerView = findViewById(R.id.startLearning_recyclerView);


        liveMoreButton = findViewById(R.id.more_btn_liveclass);
        homeworkmoreButton = findViewById(R.id.more_btn_homework);
        liveMoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LiveClass.class);
                startActivity(intent);
            }
        });

        homeworkmoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HomeWork.class);
                startActivity(intent);
            }
        });

        setData();

        //creating Subject cards
        creatingSubjectCards();

    }

    private void creatingSubjectCards() {
        subjectLearningRecyclerView.setLayoutManager(new GridLayoutManager(this,3 ));

        ArrayList<SubjectModel> subjectModels = new ArrayList<>();
        subjectModels.add(new SubjectModel(R.drawable.physics,"Physics"));
        subjectModels.add(new SubjectModel(R.drawable.chemistry,"Chemistry"));
        subjectModels.add(new SubjectModel(R.drawable.biology,"Biology"));
        subjectModels.add(new SubjectModel(R.drawable.mathematics,"Maths"));
        subjectModels.add(new SubjectModel(R.drawable.science,"Science"));
        subjectModels.add(new SubjectModel(R.drawable.geography,"Geography"));

        adapter = new SubjectRecyclerAdapter(subjectModels,getApplicationContext());
        subjectLearningRecyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    private void setData() {

        String final_value;

        correctAnswer.setText(Integer.toString(45));
        incorrectAnswer.setText(Integer.toString(35));
        queSkipped.setText(Integer.toString(20));



        pieChart.addPieSlice(new PieModel("Correct Ans",
                        Integer.parseInt(correctAnswer.getText().toString()),
                        Color.parseColor("#6af32b")));
        pieChart.addPieSlice(
                new PieModel(
                        "Incorrect Ans",
                        Integer.parseInt(incorrectAnswer.getText().toString()),
                        Color.parseColor("#f80231")));
        pieChart.addPieSlice(
                new PieModel(
                        "Question Skip",
                        Integer.parseInt(queSkipped.getText().toString()),
                        Color.parseColor("#b7a8af")));

        pieChart.startAnimation();
        pieChart.setInnerValueString(correctAnswer.getText().toString()+"%");
   }

//    @Override
//    public void onSubjectItemClick(int pos,
//                                   ImageView subImage,
//                                   TextView subName) {
//
//        //create intent and send the details to Details Activity
//        Intent intent = new Intent(this,LessonDetailsActivity.class);
//        intent.putExtra("subjectObject",mdata.get(pos));
//
//        //shared animation setup
//        //import the pair class
//
//        Pair<View,String> p1 = Pair.create((View)subImage,"subjectImg"); //second argument is the transition string name
//        Pair<View,String> p2 = Pair.create((View)subName,"subjectTitle");
//
//        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this,p1,p2);
//
//        //start the activity with scene transition
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
//        startActivity(intent,optionsCompat.toBundle());
//        }else{
//            startActivity(intent);
//        }
//
//    }
}
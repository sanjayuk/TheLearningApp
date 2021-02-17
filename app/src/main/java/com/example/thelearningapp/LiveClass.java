package com.example.thelearningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.thelearningapp.Adapter.MyAdapter;
import com.example.thelearningapp.Model.Model;
import com.example.thelearningapp.Model.VideoModel;

import java.util.ArrayList;
import java.util.List;

public class LiveClass extends AppCompatActivity {

    ConstraintLayout expandableView;
    CardView cardView;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_class);
        expandableView = findViewById(R.id.expandableView);
        cardView = findViewById(R.id.cardView);

        recyclerView = findViewById(R.id.recylerView);

        liveclassRecycler();


    }

    private void liveclassRecycler() {

        //recyclerView.setHasFixedSize(true);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //for 1st live class
        List<VideoModel> videoModels1 = new ArrayList<>();
        videoModels1.add(new VideoModel(R.drawable.vi1,1,"What is Linear Programming?"));
        videoModels1.add(new VideoModel(R.drawable.vi2,1,"Components of Linear Programming"));
        videoModels1.add(new VideoModel(R.drawable.vi3,1,"Characteristics of Linear Programming"));
        videoModels1.add(new VideoModel(R.drawable.vi4,1,"Linear Programming Example"));
        videoModels1.add(new VideoModel(R.drawable.vi5,1,"Importance of Linear Programming"));

        //for 2nd live class
        List<VideoModel> videoModels2 = new ArrayList<>();
        videoModels2.add(new VideoModel(R.drawable.vi3,1,"Social Welfare Programs"));
        videoModels2.add(new VideoModel(R.drawable.vi2,1,"Some social welfare issues"));
        videoModels2.add(new VideoModel(R.drawable.vi1,1,"Government Act towards Social Welfare"));
      //  videoModels2.add(new VideoModel(R.drawable.vi4,1,"qweadsd"));
        //videoModels2.add(new VideoModel(R.drawable.vi5,1,"qweadsd"));

        //for 3rd live class
        List<VideoModel> videoModels3 = new ArrayList<>();
        videoModels3.add(new VideoModel(R.drawable.vi1,1,"Define cell as a nit of life."));
        videoModels3.add(new VideoModel(R.drawable.vi3,1,"List different cell organelles with their functions."));
        videoModels3.add(new VideoModel(R.drawable.vi2,1,"Differentiate prokaryotic and eukaryotic cells."));
        videoModels3.add(new VideoModel(R.drawable.vi4,1,"Interrelationship Between Cell, Tissue and Organs in Human Body"));
        //videoModels3.add(new VideoModel(R.drawable.vi5,1,"qweadsd"));

        //for 4th live class
        List<VideoModel> videoModels4 = new ArrayList<>();
        videoModels4.add(new VideoModel(R.drawable.vi2,1,"Computer systems hardware"));
        videoModels4.add(new VideoModel(R.drawable.vi1,1,"Application software"));
        videoModels4.add(new VideoModel(R.drawable.vi4,1,"Network architecture"));
        videoModels4.add(new VideoModel(R.drawable.vi3,1,"Management information systems"));
        videoModels4.add(new VideoModel(R.drawable.vi2,1,"Data management"));
        videoModels4.add(new VideoModel(R.drawable.vi5,1,"Programming Languages"));


        //for 5th live class
        List<VideoModel> videoModels5 = new ArrayList<>();
        videoModels5.add(new VideoModel(R.drawable.vi5,1,"What is an adjective?"));
        videoModels5.add(new VideoModel(R.drawable.vi4,1,"How to use adjectives"));
        videoModels5.add(new VideoModel(R.drawable.vi3,1,"The order of adjectives"));
        videoModels5.add(new VideoModel(R.drawable.vi2,1,"Comparative and superlative adjectives"));
        videoModels5.add(new VideoModel(R.drawable.vi1,1,"Comparison with than"));


        //Main live
        ArrayList<Model> models = new ArrayList<>();

        models.add(new Model("live at 10.00 am", "Math- Linear Programming", "Vasant Shastri", "10 years", "BA. in Mathematics from BHU", R.drawable.t2,videoModels1));
        models.add(new Model("live at 11.00 am", "Social Welfare", "Ravi Shastri", "6 years", "BA. in Social Science from BHU", R.drawable.t1,videoModels2));
        models.add(new Model("live at 12.00 pm", "Cells and Tissues", "Kamalakshi", "12 years", "BA. in Science from BHU", R.drawable.t5,videoModels3));
        models.add(new Model("live at 1.30 pm", "Introduction to Computers", "Veena", "8 years", "BA. in Computers from BHU", R.drawable.t2,videoModels4));
        models.add(new Model("live at 2.30 pm", "English grammar(Adjectives)", "Vikas", "7 years", "BA. in English from BHU", R.drawable.t3,videoModels5));


//        Model topic5 = new Model();
//        topic5.setLiveTime("");
//        topic5.setName("");
//        topic5.setProfIn("");
//        topic5.setSubject("");
//        topic5.setYrsExp("");
//        topic5.setTeacherImg();
//
//
//
//        models.add(topic1);
//        models.add(topic2);
//        models.add(topic3);
//        models.add(topic4);
//        models.add(topic5);


        adapter = new MyAdapter(models);
        recyclerView.setAdapter(adapter);

    }


}

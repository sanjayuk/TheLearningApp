package com.example.thelearningapp.Adapter;

import android.widget.ImageView;
import android.widget.TextView;

public interface SubjectCallback {

    void onSubjectItemClick(int pos,
                            ImageView subImage,
                            TextView subName);
}

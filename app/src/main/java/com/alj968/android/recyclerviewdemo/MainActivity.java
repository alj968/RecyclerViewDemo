package com.alj968.android.recyclerviewdemo;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private CourseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Mobile Apps", "Jones",R.drawable.ic_android_black_24dp));
        courses.add(new Course("Apple Scripts", "Kusma",R.drawable.ic_phone_iphone_black_24dp));
        courses.add(new Course("Crazy-Good UI Design", "DeSeta",R.drawable.ic_palette_black_24dp));
        courses.add(new Course("Mastering Chess", "Iyengar", R.drawable.ic_grid_on_black_24dp));
        courses.add(new Course("Advanced LandCandy", "Traweek",R.drawable.ic_school_black_24dp));
        courses.add(new Course("Soccer 101", "Neary",R.drawable.ic_tag_faces_black_24dp));
        mAdapter = new CourseAdapter(courses);
        mRecyclerView.setAdapter(mAdapter);
    }
}



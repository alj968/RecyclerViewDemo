package com.alj968.android.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class CourseAdapter extends RecyclerView.Adapter<CourseViewHolder> {
    private ArrayList<Course> mCourses;

    public CourseAdapter(ArrayList<Course> courses) {
        mCourses = courses;

    }

    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.listitem_layout, parent, false);
        CourseViewHolder newViewHolder = new CourseViewHolder(rootView);
        return newViewHolder;
    }

    @Override
    public void onBindViewHolder(CourseViewHolder currentViewHolder, int position) {
        Course currentCourse = mCourses.get(position);
        currentViewHolder.bindCourse(currentCourse);
    }

    @Override
    public int getItemCount() {
        return mCourses.size();
    }
}


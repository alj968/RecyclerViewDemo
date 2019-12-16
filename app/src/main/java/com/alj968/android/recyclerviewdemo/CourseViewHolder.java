package com.alj968.android.recyclerviewdemo;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class CourseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView mCourseTitleTextView;
    private TextView mCourseInstructorTextView;
    private ImageView mCourseImageView;
    private Course mCourse;

    public CourseViewHolder(View rootView) {
        super(rootView);
        rootView.setOnClickListener(this);
        mCourseTitleTextView = rootView.findViewById(R.id.textViewCourseTitle);
        mCourseInstructorTextView = rootView.findViewById(R.id.textViewCourseInstructor);
        mCourseImageView = rootView.findViewById(R.id.imageViewCourseImage);
    }

    public void bindCourse(Course course) {
        mCourse = course;
        mCourseTitleTextView.setText(mCourse.getCourseTitle());
        mCourseInstructorTextView.setText(mCourse.getCourseInstructor());
        mCourseImageView.setImageResource(mCourse.getCourseImageResourceId());
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), mCourse.getCourseTitle() + " clicked!",
                Toast.LENGTH_SHORT).show();
    }
}





package com.alj968.android.recyclerviewdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

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

    private class CourseHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mCourseTitleTextView;
        private TextView mCourseInstructorTextView;
        private ImageView mCourseImageView;
        private Course mCourse;


        public CourseHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            mCourseTitleTextView = (TextView) itemView.findViewById(R.id.textViewCourseTitle);
            mCourseInstructorTextView = (TextView) itemView.findViewById(R.id.textViewCourseInstructor);
            mCourseImageView = (ImageView) itemView.findViewById(R.id.imageViewCourseImage);
        }

        public void bindCourse(Course course) {
            mCourse = course;
            mCourseTitleTextView.setText(mCourse.getCourseTitle());
            mCourseInstructorTextView.setText(mCourse.getCourseInstructor());
            if(course.getCourseImageResourceId() > 0) {
                mCourseImageView.setImageResource(mCourse.getCourseImageResourceId());
            }
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,mCourse.getCourseTitle() + " clicked!", Toast.LENGTH_SHORT).show();
        }
    }

    private class CourseAdapter extends RecyclerView.Adapter<CourseHolder> {
        private List<Course> mCourses;

        public CourseAdapter(List<Course> courses) {
            mCourses = courses;
        }

        @Override
        public CourseHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
            View view = layoutInflater
                    .inflate(R.layout.listitem_layout, parent, false);
            return new CourseHolder(view);
        }

        @Override
        public void onBindViewHolder(CourseHolder holder, int position) {
            Course course = mCourses.get(position);
            holder.bindCourse(course);
        }

        @Override
        public int getItemCount() {
            return mCourses.size();
        }
    }
}



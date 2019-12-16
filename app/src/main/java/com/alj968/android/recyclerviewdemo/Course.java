package com.alj968.android.recyclerviewdemo;

/**
 * Created by amandajones on 11/18/17.
 */

public class Course {

    private String mCourseTitle;
    private String mCourseInstructor;
    private int mCourseImageResourceId;

    public Course(String courseTitle, String courseInstructor, int courseImageResourceId) {
        mCourseTitle = courseTitle;
        mCourseInstructor = courseInstructor;
        mCourseImageResourceId = courseImageResourceId;
    }

    public String getCourseTitle() {
        return mCourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        mCourseTitle = courseTitle;
    }

    public String getCourseInstructor() {
        return mCourseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        mCourseInstructor = courseInstructor;
    }

    public int getCourseImageResourceId() {
        return mCourseImageResourceId;
    }

    public void setCourseImageResourceId(int courseImageResourceId) {
        mCourseImageResourceId = courseImageResourceId;
    }

}


package com.company;

//Temel özellikleri inherit aldığı base class'ta mevcut. Burada sadece Instructor'a özel olan özellikler barındırıyor. Encapsulation uygulandı.
public class Instructor extends User{
    private int instructorId;
    private int courseId;

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}

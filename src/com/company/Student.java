package com.company;

//Temel özellikleri inherit aldığı base class'ta mevcut. Burada sadece Student'a özel olan özellikler barındırıyor. Encapsulation uygulandı.
public class Student extends User{
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}



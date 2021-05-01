package com.company;

public class Main {

    public static void main(String[] args) {
        //Instructor oluşturuldu
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setInstructorId(1);
        instructor.setCourseId(1);
        instructor.setEmail("istructor@gmail.com");
        instructor.setFirstName("Instructor First Name");
        instructor.setLastName("Instructor Last Name");
        instructor.setUserName("Instructor User Name");
        instructor.setPassword("1234");

        //Student oluşturuldu
        Student student = new Student();
        student.setId(2);
        student.setStudentId(1);
        student.setEmail("student@gmail.com");
        student.setFirstName("Student First Name");
        student.setLastName("Student Last Name");
        student.setPassword("1234");
        student.setUserName("Student User Name");


        //UserManager'daki bütün işlemler hem student ile hem de instructor ile çalışabilir.
        UserManager userManager = new UserManager();
        userManager.Add(student);
        userManager.Delete(instructor);
        userManager.Update(student);
        userManager.GetUserByUserId(2);

    }
}

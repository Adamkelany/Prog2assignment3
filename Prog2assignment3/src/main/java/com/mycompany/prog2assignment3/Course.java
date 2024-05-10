/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2assignment3;

/**
 *
 * @author AGHA SMART STORE
 */
class Course {
    String name;
    int creditHours;
    int Id;
    String lecturerName;
    
    Course(String name, int creditHours, int Id, String lecturerName) {
        this.name = name;
        this.creditHours = creditHours;
        this.Id = Id;
        this.lecturerName = lecturerName;
    }
    
    void printCourseDetails() {
        System.out.println("Course Name: " + name);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Course ID: " + Id);
        System.out.println("Lecturer Name: " + lecturerName);
        System.out.println();
    }
}

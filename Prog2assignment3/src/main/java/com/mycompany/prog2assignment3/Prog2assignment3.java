/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog2assignment3;
import java.util.Scanner;
/**
 *
 * @author AGHA SMART STORE
 */
public class Prog2assignment3 {
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course[] courses = new Course[5];
        
        for (int i = 1; i < 2; i++) {
            System.out.println("Enter Course details" + (i));
            System.out.print("Enter course name:");
                String name = scanner.nextLine();
            System.out.print("Enter credit hours:");
                int creditHours = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter course ID:");
                int Id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter lecturer name:");
                String lecturerName = scanner.nextLine();
            
            courses[i-1] = new Course(name, creditHours, Id, lecturerName);
        }
        
        System.out.println("Course Details:");
        
        for (int i = 0; i < 1; i++) {
            Course course = courses[i];
            course.printCourseDetails();
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */package com.mycompany.studenttimetablemanager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentTimetableManager extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Timetable Manager");

        Button btnStudent = new Button("Add Student");
        Button btnCourse = new Button("Add Course");
        Button btnTimetable = new Button("View Timetable");

        btnStudent.setOnAction(e -> {
            Student s = new Student("Ali", "2025");
            System.out.println("Student created: " + s.getName());
        });

        btnCourse.setOnAction(e -> {
            Course c = new Course("Mathematics", "Dr. Smith");
            System.out.println("Course created: " + c.getTitle());
        });

        btnTimetable.setOnAction(e -> {
            Timetable t = new Timetable("Ali");
            System.out.println("Timetable created for student: " + t.getStudentName());
        });

        VBox vbox = new VBox(10, btnStudent, btnCourse, btnTimetable);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package com.wjx.jdk8.lesson13;

public class StudentComparator {

    public  int compareStudentByScore( Student student1, Student student2 ){
        return student1.getScore() - student2.getScore();
    }

    public  int compareStudentByName( Student student1, Student student2 ){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}

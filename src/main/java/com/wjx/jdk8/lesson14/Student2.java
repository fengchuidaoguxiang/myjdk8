package com.wjx.jdk8.lesson14;

public class Student2 {

        private String name;

        private int score;

    public Student2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static int compareStudentByScore(Student2 student1, Student2 student2 ){
        return student1.getScore() - student2.getScore();
    }

    public static int compareStudentByName(Student2 student1, Student2 student2 ){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    public int compareByScore( Student2 student ){
        return this.getScore() - student.getScore();
    }

    public int compareByName( Student2 student ){
        return this.getName().compareToIgnoreCase(student.getName());
    }
}

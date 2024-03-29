package com.wjx.jdk8.lesson13;

public class Student {

        private String name;

        private int score;

    public Student(String name, int score) {
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

    public static int compareStudentByScore( Student student1, Student student2 ){
        return student1.getScore() - student2.getScore();
    }

    public static int compareStudentByName( Student student1, Student student2 ){
        return student1.getName().compareToIgnoreCase(student2.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

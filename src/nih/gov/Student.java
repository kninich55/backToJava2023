package nih.gov;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

public class Student {
    private String id;
    private String name;
    private int[] grades=new int[3];
    private int gpa;
    private LEVEL level;

    public Student(){
        this.id = UUID.randomUUID().toString();
        int[] grades={0,0,0};
        this.gpa=0;
        this.level=LEVEL.BEGINNER;



    }

    public Student(String id, String name, int[] grades, int gpa, LEVEL level) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        //org.apache.commons.lang3
        //this.pword = RandomStringUtils.randomAlphanumeric(20).toUpperCase();
        this.grades = grades;
        this.gpa = gpa;
        this.level = LEVEL.BEGINNER;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public LEVEL getLevel() {
        return level;
    }

    public void setLevel(LEVEL level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +

                ", grades=" + Arrays.toString(grades) +
                ", gpa=" + gpa +
                ", level=" + level +
                '}';
    }


}








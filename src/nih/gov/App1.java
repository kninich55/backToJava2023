package nih.gov;

import java.util.ArrayList;
import java.util.List;

public class App1 {

    public static List<Student> studentList= new ArrayList<Student>();

    public static void main(String[] args) {

       //create 10 student
        for (int i = 0; i < 10; i++) {
            Student st=new Student();
            //System.out.println(st.toString());
            studentList.add(st);
        }
        studentList=takeExam();

        System.out.println("-----------After taking all 3 Exam-----------");

        for(Student st:studentList)
            System.out.println(st.toString());

        System.out.println("-----------Ranking graduated student gpa>70 level advanced-----------");

        for(Student st:studentList) {
            if(st.getLevel().equals(LEVEL.ADVANCED) && st.getGpa()>=70) {
                System.out.println(st.toString());
            }

        }

        //todo
        System.out.println("-----------Ranking all students-----------");

        for(Student st:studentList) {

                System.out.println(st.toString());


        }
    }

    private static List<Student> takeExam() {

        for (Student st:studentList) {
            //take first exam
            int[] grades = new int[3];
            int grade0= (int) (Math.random() * 100);
            grades[0]=grade0;
            st.setGrades(grades);
            st.setGpa((int) grade0/3);

            if(grade0>=50) {
                st.setLevel(LEVEL.INTERMEDIATE);
                int grade1= (int) (Math.random() * 100);
                grades[1]=grade1;
                st.setGrades(grades);
                st.setGpa((int) (grade0+grade1) / 3);

                if(grade1>=50){

                    st.setLevel(LEVEL.ADVANCED);
                    int grade2= (int) (Math.random() * 100);
                    grades[2]=grade2;
                    st.setGrades(grades);
                    st.setGpa((int) (grade0+grade1+grade2) / 3);

                }

                }

            }

        return studentList;
    }
}

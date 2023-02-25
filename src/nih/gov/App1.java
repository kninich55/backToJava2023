package nih.gov;

import java.util.ArrayList;
import java.util.List;

public class App1 {

    public static List<Student> studentList= new ArrayList<Student>();

    public static void main(String[] args) {

       //create 10 student
        for (int i = 0; i < 10; i++) {
            Student st=new Student();
            System.out.println(st.toString());
            studentList.add(st);
        }
        studentList=takeExam();

        System.out.println("-----------After taking First Exam-----------");

        for(Student st:studentList)
            System.out.println(st.toString());
    }

    private static List<Student> takeExam() {
        for (Student st:studentList) {
            //take first exam
            int[] grades = new int[3];
            int grade1= (int) (Math.random() * 100);
            grades[0]=grade1;
            st.setGrades(grades);

            if(grade1>=50)
                st.setLevel(LEVEL.INTERMEDIATE);

            st.setGpa((int) grade1/3);



        }
        return studentList;
    }
}

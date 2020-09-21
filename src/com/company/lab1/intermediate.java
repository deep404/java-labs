package com.company.lab1;

public class intermediate {

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.name = "Mihai";
        st1.age = 20;
        st1.mark = 9.84;

        Student st2 = new Student();
        st2.name = "Alexandru";
        st2.age = 21;
        st2.mark = 8.45;

        University uni1 = new University();
        uni1.name = "UTM";
        uni1.foundationYear = 1964;
        uni1.students_list.add(st1);

//        System.out.println(uni1.students_list);

        uni1.students_list.add(st2);

//        System.out.println(uni1.students_list);


        Student st3 = new Student();
        st3.name = "Ion";
        st3.age = 19;
        st3.mark = 9.05;

        Student st4 = new Student();
        st4.name = "Vasile";
        st4.age = 20;
        st4.mark = 7.85;

        University uni2 = new University();
        uni2.name = "USM";
        uni2.foundationYear = 1949;
        uni2.students_list.add(st3);

//        System.out.println(uni1.students_list);

        uni2.students_list.add(st4);

//        System.out.println(uni1.students_list);

//        System.out.println(uni2.name+" "+uni2.students_list);
//        System.out.println(uni1.name+" "+uni1.students_list);


    }
}

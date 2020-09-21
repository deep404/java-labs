package com.company.lab1;

public class advanced {

    public static void main(String[] args) {

        Student st1 = new Student();
        st1.name = "Roman";
        st1.age = 23;
        st1.mark = 9.67;

        Student st2 = new Student();
        st2.name = "Iurie";
        st2.age = 22;
        st2.mark = 9.34;

        Student st3 = new Student();
        st3.name = "Gheorghe";
        st3.age = 23;
        st3.mark = 6.89;



        Student st4 = new Student();
        st4.name = "Costel";
        st4.age = 19;
        st4.mark = 7.82;

        Student st5 = new Student();
        st5.name = "Antonela";
        st5.age = 20;
        st5.mark = 5.35;

        Student st6 = new Student();
        st6.name = "Ana";
        st6.age = 18;
        st6.mark = 10.00;




        Student st7 = new Student();
        st7.name = "";
        st7.age = 23;
        st7.mark = 9.67;

        Student st8 = new Student();
        st8.name = "Nicolae";
        st8.age = 24;
        st8.mark = 6.92;

        Student st9 = new Student();
        st9.name = "Dumitru";
        st9.age = 23;
        st9.mark = 9.90;



        University uni1 = new University();
        uni1.name = "UTM";
        uni1.foundationYear = 1964;
        uni1.students_list.add(st1);
        uni1.students_list.add(st2);
        uni1.students_list.add(st3);



        University uni2 = new University();
        uni2.name = "USM";
        uni2.foundationYear = 1949;
        uni2.students_list.add(st4);
        uni2.students_list.add(st5);
        uni2.students_list.add(st6);



        University uni3 = new University();
        uni3.name = "ASEM";
        uni3.foundationYear = 1991;
        uni3.students_list.add(st7);
        uni3.students_list.add(st8);
        uni3.students_list.add(st9);




        uni1.average_media = uni1.students_list.stream().filter(o->o.mark > 0).mapToDouble(o->o.mark).sum() / uni1.students_list.size();
        uni2.average_media = uni2.students_list.stream().filter(o->o.mark > 0).mapToDouble(o->o.mark).sum() / uni2.students_list.size();
        uni3.average_media = uni3.students_list.stream().filter(o->o.mark > 0).mapToDouble(o->o.mark).sum() / uni3.students_list.size();



        System.out.println("Media of first university: "+uni1.average_media);
        System.out.println("Media of second university: "+uni2.average_media);
        System.out.println("Media of third university: "+uni3.average_media);

    }
}

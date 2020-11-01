package com.company.lab5;

public class Main {
    public static void main(String[] args)
    {
        X obj_x = new X("x");

        A obj_a = new A("A" ,obj_x);
        B obj_b = new B("B");
        C obj_c = new C("C");
        D obj_d = new D("D");
        E obj_e = new E("E");
        F obj_f = new F("F") ;
        G obj_g = new G("G");
        H obj_h = new H("H");
        I obj_i = new I("I");
        J obj_j = new J("J");

        System.out.println(obj_a.toString());
        System.out.println(obj_b.toString());
        System.out.println(obj_c.toString());
        System.out.println(obj_d.toString());
        System.out.println(obj_e.toString());
        System.out.println(obj_f.toString());
        System.out.println(obj_g.toString());
        System.out.println(obj_h.toString());
        System.out.println(obj_i.toString());
        System.out.println(obj_j.toString());

    }
}

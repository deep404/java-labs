package com.company.lab3;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Paragraf s = new Paragraf("Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit, sed do eiusmod " +
                "tempor incididunt ut labore et dolore magna " +
                "aliqua. Ut enim ad minim veniam, quis nostrud" +
                " exercitation ullamco laboris nisi ut aliquip" +
                " ex ea commodo consequat. Duis aute irure dolor" +
                " in reprehenderit in voluptate velit esse cillum " +
                "dolore eu fugiat nulla pariatur. Excepteur sint " +
                "occaecat cupidatat non proident, sunt in culpa qui " +
                "officia deserunt mollit anim id est laborum.");

        s.numara_cuvinte();
        s.numara_enunturi();
        s.numara_litere();
        s.the_longest_word();
        s.freceventa_cuvintelor_1();
        System.out.println("Numarul de cuvinte este " + s.nr_cuvinte);
        System.out.println("Numarul de enunturi este " + s.nr_enunturi);
        System.out.println("Numarul de litere este " + s.nr_litere);
        System.out.println("Numarul de vocale este " + s.nr_vocale);
        System.out.println("Numarul de consoane este " + s.nr_consoane);
        System.out.println("Cel mai lung cuvant este " + s.cel_mai_lung_cuvant);
        System.out.println("Cele mai des intalnite cuvinte sunt: ");
        System.out.println(s.words[1].cuvant + s.words[1].frecventa);
        System.out.println(s.words[2].cuvant + s.words[2].frecventa);
        System.out.println(s.words[3].cuvant + s.words[3].frecventa);
        System.out.println(s.words[4].cuvant + s.words[4].frecventa);
        System.out.println(s.words[5].cuvant + s.words[5].frecventa);



    }
}

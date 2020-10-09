package com.company.lab3;
import java.util.ArrayList;

public class Paragraf {
    String text;
    int lungime;
    int nr_cuvinte;
    int nr_enunturi;
    int nr_litere;
    int nr_vocale;
    int nr_consoane;
    String cel_mai_lung_cuvant;
    int nr_cuvinte_distincte;
    Frecventa_Cuvintelor[] words = new Frecventa_Cuvintelor[100];

    Paragraf(String text)
    {
        this.text = text;
        this.lungime = this.text.length();
        this.cel_mai_lung_cuvant = "";
        this.nr_cuvinte_distincte = 0;
    }
    public int numara_cuvinte()
    {
        String aux="";
        String semne_punctuatie = "!., ?";
        int i = 0;
        while(i < this.lungime)
        {
            if (semne_punctuatie.indexOf(this.text.charAt(i)) == -1)
            {
                aux = aux + this.text.charAt(i);
            }
            else
            {
                if(aux.length() > 0)
                {
                    this.nr_cuvinte = this.nr_cuvinte + 1;
                }
                aux = "";
            }
            i = i + 1;
        }
        return 0;
    }

    public int numara_enunturi()
    {
        String aux="";
        String semne_punctuatie = ".!?";
        int i = 0;
        while(i < this.lungime)
        {
            if (semne_punctuatie.indexOf(this.text.charAt(i)) == -1)
            {
                aux = aux + this.text.charAt(i);
            }
            else
            {
                if(aux.length() > 0)
                {
                    this.nr_enunturi = this.nr_enunturi + 1;
                }
                aux = "";
            }
            i = i + 1;
        }
        return 0;
    }
    public int numara_litere()
    {
        String litere = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String vocale = "euioaEUIOA";
        int i = 0;
        while(i < this.lungime)
        {
            if (litere.indexOf(this.text.charAt(i)) != -1)
            {
                this.nr_litere = this.nr_litere + 1;
            }
            if (vocale.indexOf(this.text.charAt(i)) != -1)
            {
                this.nr_vocale = this.nr_vocale + 1;
            }
            i = i + 1;
        }
        this.nr_consoane = this.nr_litere - this.nr_vocale;
        return 0;
    }
    public int the_longest_word()
    {
        String aux="";
        String semne_punctuatie = "!., ?";
        int i = 0;
        while(i < this.lungime)
        {
            if (semne_punctuatie.indexOf(this.text.charAt(i)) == -1)
            {
                aux = aux + this.text.charAt(i);
            }
            else
            {
                if( aux.length() > this.cel_mai_lung_cuvant.length())
                {
                    this.cel_mai_lung_cuvant = aux;
                }
                aux = "";
            }
            i = i + 1;
        }
        return 0;
    }
    public int freceventa_cuvintelor_1() {
        String aux = "";
        String semne_punctuatie = " ";
        int i = 0;
        int temp;
        this.text = this.text.replace('.', ' ');
        this.text = this.text.replace('!', ' ');
        this.text = this.text.replace(',', ' ');
        this.text = this.text.replace('?', ' ');
        this.text = " " + this.text;
        this.text = this.text.toLowerCase();
        //System.out.println(this.text);
        while (i < this.text.length()) {
            if (semne_punctuatie.indexOf(this.text.charAt(i)) == -1) {
                aux = aux + this.text.charAt(i);
            } else {
                if (aux != "") {
                    aux = " " + aux + " ";
                    this.nr_cuvinte_distincte = this.nr_cuvinte_distincte + 1;
                    this.words[this.nr_cuvinte_distincte] = new Frecventa_Cuvintelor("", 0);
                    this.words[this.nr_cuvinte_distincte].cuvant = aux;
                    //System.out.println(aux);
                    while (this.text.indexOf(aux) >= 0) {
                        this.words[this.nr_cuvinte_distincte].frecventa = this.words[this.nr_cuvinte_distincte].frecventa + 1;
                        this.text = this.text.replaceFirst(aux, " ");
                        this.text = " " + this.text;
                        //System.out.println(this.text);
                    }
                    i = 0;
                    aux = "";
                }
            }
            i = i + 1;
        }
        for ( i = 1; i <this.nr_cuvinte_distincte; i++) {
           for (int j = i+1; j <this.nr_cuvinte_distincte; j++) {
                if(this.words[i].frecventa < this.words[j].frecventa) {      //swap elements if not in order
                    temp = this.words[i].frecventa;
                    aux = this.words[i].cuvant;
                    this.words[i].frecventa = this.words[j].frecventa;
                    this.words[i].cuvant = this.words[j].cuvant;
                    this.words[j].frecventa = temp;
                    this.words[j].cuvant = aux;
                }
            }
        }
        //for(i = 1;  i < this.nr_cuvinte_distincte; i++) {
        //    System.out.println(this.words[i].cuvant);
        //    System.out.println(this.words[i].frecventa);
        //}

        return 0;

    }
}

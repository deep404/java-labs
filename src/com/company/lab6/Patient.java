package com.company.lab6;
import java.util.ArrayList;


public class Patient extends Person{
    private String id;
    private FullName name;
    private Gender gender;
    private Date birthDate;
    private int age;
    private Date accepted;
    private History sickness;
    private ArrayList<String> prescriptions;
    private ArrayList<String> allergies;
    private ArrayList<String> specialReqs;

    private ArrayList<Operations_Staff> OperationStaff;


}

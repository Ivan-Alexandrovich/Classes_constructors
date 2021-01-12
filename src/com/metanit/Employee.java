package com.metanit;

public class Employee {
    private String FIO, position, email, telephone;
    private int age, salary;

    //создадим конструктор
    public Employee (String fio, String pos, String mail, String tel, int sal, int a) {
        this.FIO = fio;
        this.position = pos;
        this.email = mail;
        this.telephone = tel;
        this.salary = sal;
        if (a > 18) this.age = a;
        else System.out.println("Age must be greater than 18");
    }

    public void Info () {
       System.out.println(FIO + " " + position + " " + email + " " + telephone + " " +
               salary + " " + age);
    }

    int GetAge () {
        return age;
    }

}

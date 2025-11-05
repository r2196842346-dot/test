package com.ran.two;

public class Student {

    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {


        System.out.println(this.name + " " + this.age);
    }

    public static void main(String[] args) {
        Student student = new Student("张三",13);

        student.show();

        Undergraduate undergraduate = new Undergraduate("李四",14,"大学");

        undergraduate.show();
    }
}

class Undergraduate extends Student {

    private String degree;

    public Undergraduate(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    @Override
    public void show() {
        System.out.println(getName() + " " + getAge() + " " + degree);
    }
}


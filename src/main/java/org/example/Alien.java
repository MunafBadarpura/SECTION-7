package org.example;

public class Alien {
    private int age;
    private Student s;
    private Computer com;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student getS(){
        return s;
    }
    public void setS(Student s){
        this.s = s;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    // non-parameterized constructor
    Alien(){
        System.out.println("Alien Constructor Called");
    }

    // parameterized constructor
//    Alien(int age, Student s){
//        this.age = age;
//        this.s = s;
//    }

    public void code(){
        System.out.println("Coding...");
        com.compile();
    }
}

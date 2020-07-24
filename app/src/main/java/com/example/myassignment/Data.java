package com.example.myassignment;

public class Data {

    private String name;
    private String age, rollNo;

    public Data(String name, String age, String rollNo){
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getRollNo() {
        return rollNo;
    }

}

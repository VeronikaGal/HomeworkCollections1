package com.galeeva.homeworkcollections1.task2;

public class User {

    private int id;
    private String fisrtName;
    private int age;

    public User(int id, String fisrtName, int age) {
        this.id = id;
        this.fisrtName = fisrtName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fisrtName='" + fisrtName + '\'' +
                ", age=" + age +
                '}';
    }
}

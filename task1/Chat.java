package com.galeeva.homeworkcollections1.task1;

public class Chat {

    private String name;
    private int numberUsers;

    public Chat(String name, int numberUsers) {
        this.name = name;
        this.numberUsers = numberUsers;
    }

    public String getName() {
        return name;
    }

    public int getNumberUsers() {
        return numberUsers;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", numberUsers=" + numberUsers +
                '}';
    }
}

package com.galeeva.homeworkcollections1.task2;

import java.util.ArrayList;

public class ChatNew {

    private String name;
    private ArrayList<User> user;

    public ChatNew(String name, ArrayList<User> user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public ArrayList<User> getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "ChatNew{" +
                "name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}

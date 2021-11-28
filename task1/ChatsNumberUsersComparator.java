package com.galeeva.homeworkcollections1.task1;

import java.util.Comparator;

public class ChatsNumberUsersComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o2.getNumberUsers(), o1.getNumberUsers());
    }
}

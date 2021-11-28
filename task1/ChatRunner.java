package com.galeeva.homeworkcollections1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Дан список чатов. Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 * а если это количество совпадает, то по названию в алфавитном порядке.
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */
public class ChatRunner {

    public static void main(String[] args) {
        List<Chat> list = new ArrayList<>(Arrays.asList(
                new Chat("English", 1562),
                new Chat("Spanish", 1562),
                new Chat("German", 1562),
                new Chat("Italian", 957),
                new Chat("Japanese", 767),
                new Chat("Russian", 1458),
                new Chat("Polish", 1562),
                new Chat("French", 999),
                new Chat("Chinese", 1874),
                new Chat("Turkish", 957),
                new Chat("Arabic", 1578),
                new Chat("Korean", 1562)
        ));

        list.sort(new ChatsNameComparator());
        // list.removeIf(value -> value.getNumberUsers() < 1000);
        Iterator<Chat> iterator = list.iterator();
        while (iterator.hasNext()) {
            Chat value = iterator.next();
            if (value.getNumberUsers() < 1000) {
                iterator.remove();
            }
        }

        list.sort(new ChatsNumberUsersComparator());
        System.out.println(list);
    }
}

package com.galeeva.homeworkcollections1.task2;

import java.util.*;

/**
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список
 * объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * Задача:
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей
 */
public class UserRunner {

    public static void main(String[] args) {
        List<ChatNew> list = new ArrayList<>(List.of(
                new ChatNew("English", new ArrayList<>(List.of(
                        new User(1, "Alena", 15),
                        new User(2, "Dima", 18),
                        new User(3, "Petr", 25)
                ))),
                new ChatNew("Spanish", new ArrayList<>(List.of(
                        new User(4, "Alena", 14),
                        new User(5, "Dima", 17),
                        new User(6, "Petr", 25)
                ))),
                new ChatNew("German", new ArrayList<>(List.of(
                        new User(7, "Tanya", 19),
                        new User(8, "Aleksandr", 16),
                        new User(9, "Veronika", 25)
                ))),
                new ChatNew("Italian", new ArrayList<>(List.of(
                        new User(10, "Ksenia", 12),
                        new User(11, "Emilia", 18),
                        new User(12, "Ivan", 25)
                ))),
                new ChatNew("Japanese", new ArrayList<>(List.of(
                        new User(13, "Olga", 11),
                        new User(14, "Igor", 18),
                        new User(15, "Nina", 25)
                ))),
                new ChatNew("Russian", new ArrayList<>(List.of(
                        new User(16, "Anna", 10),
                        new User(17, "Artur", 18),
                        new User(18, "Kristina", 25)
                ))),
                new ChatNew("Polish", new ArrayList<>(List.of(
                        new User(19, "Julia", 20),
                        new User(20, "Sergei", 18),
                        new User(21, "Kira", 25)
                )))));
        List<User> users = getAgeMore(list);
        System.out.println(users);
        double averageAge = getAverageAge(list);
        System.out.println(averageAge);
    }

    public static List<User> getAgeMore(List<ChatNew> list) {
        List<User> result = new ArrayList<>();
        for (ChatNew chatNew : list) {
            List<User> users = chatNew.getUser();
            for (User user : users) {
                if (user.getAge() > 17) {
                    result.add(user);
                }
            }
        }
        return result;
    }

    public static double getAverageAge(List<ChatNew> list) {
        double result = 0;
        int size = 0;
        for (ChatNew chatNew : list) {
            List<User> users = chatNew.getUser();
            for (User user : users) {
                if (user.getAge() < 18) {
                    result += user.getAge();
                    size++;
                }
            }
        }
        return result / size;
    }
}



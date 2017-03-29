package ru.amizichenko.tracker.map;

/**
 * Created by Defo on 29.03.2017.
 */
public class User {
    private String name;
    private int children;
    private Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }



    private class Calendar {
        private int day;
        private int mounth;
        private int year;

        public Calendar(int day, int mounth, int year) {
            this.day = day;
            this.mounth = mounth;
            this.year = year;
        }
    }
}

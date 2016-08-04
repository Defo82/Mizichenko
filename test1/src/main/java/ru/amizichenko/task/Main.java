package ru.amizichenko.task;
public class Main {
    public static void main(String[] args) {

        String origin = "Qui bene distinguit, bene docet";
        String sub =             "distinguit";

        SubWord one = new SubWord();

        System.out.println(one.contains(origin, sub));

    }
}
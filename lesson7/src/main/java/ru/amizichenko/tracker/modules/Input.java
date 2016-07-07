package ru.amizichenko.tracker.modules;
import java.util.*;

public class Input extends Item{

    public Scanner scanner = new Scanner(System.in);

    public String ask(String question) { 

        System.out.println(question);
        return scanner.nextLine();
    }

}

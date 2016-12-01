package ru.amizichenko.tracker.store;

/**
 * Base определяет поведение моделей Role и User.
 * Created by defo on 30.11.16.
 */
public abstract class Base {

    private String id;

    String getId() {
        return this.id;
    }

    void setId(String id) {
        this.id = id;
    }
}

package ru.amizichenko.tracker.store;

import ru.amizichenko.tracker.services.SimpleArray;

/**
 *
 * Created by defo on 30.11.16.
 */
public class RoleStore implements Store{

    private SimpleArray<Base> simpleArray;

    public RoleStore(SimpleArray<Base> simpleArray) {
        this.simpleArray = simpleArray;
    }

    @Override
    public void add(Base value) {
        this.simpleArray.add(value);
    }

    @Override
    public void update(int id, Base value) {
        this.simpleArray.update(id, value);
    }

    @Override
    public void delete(int id) {
        this.simpleArray.delete(id);
    }

    @Override
    public Base get(int id) {
        return this.simpleArray.get(id);
    }
}

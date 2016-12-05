package ru.amizichenko.tracker.store;

import ru.amizichenko.tracker.services.SimpleArray;

/**
 * Created by defo on 30.11.16.
 */
public class UserStore implements Store {

    private SimpleArray<Base> simpleArray;

    public UserStore(SimpleArray<Base> simpleArray) {
        this.simpleArray = simpleArray;
    }

    @Override
    public void add(Base value) {
        this.simpleArray.add(value);
    }

    @Override
    public void update(Base value) {
        this.simpleArray.update(findIndexById(value), value);
    }

    @Override
    public void delete(String id) {
        this.simpleArray.delete(findIndexById(id));
    }

    @Override
    public Base get(String id) {
        return this.simpleArray.get(findIndexById(id));
    }

    /**
     * Пробегает по массиву в simpleArray.
     *
     * @param id
     * @return index
     */
    private int findIndexById(String id) {
        int index = 0;
        for (int i = index; i < this.simpleArray.getSize(); i++) {
            if (this.simpleArray.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * @param value
     * @return index
     */
    private int findIndexById(Base value) {
        int index = 0;
        for (int i = index; i < this.simpleArray.getSize(); i++) {
            if (this.simpleArray.get(i).getId().equals(value.getId())) {
                index = i;
                break;
            }
        }

        return index;
    }
}

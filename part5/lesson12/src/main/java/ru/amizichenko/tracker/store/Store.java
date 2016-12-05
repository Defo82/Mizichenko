package ru.amizichenko.tracker.store;

/**
 * Store определяет поведение хранилищ RoleStore и UserStore.
 * Created by defo on 30.11.16.
 */
public interface Store<T extends Base> {
    /**
     * Эти методы будут использоваться вместо методов SimpleArray.
     */
    void add(T value);
    void update(T value);
    void delete(String id);
    T get(String id);
}

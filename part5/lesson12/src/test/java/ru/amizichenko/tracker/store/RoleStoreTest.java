package ru.amizichenko.tracker.store;

import org.junit.Assert;
import org.junit.Test;
import ru.amizichenko.tracker.services.SimpleArray;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by defo on 01.12.16.
 */
public class RoleStoreTest {

    RoleStore rs = new RoleStore(new SimpleArray<Base>(1));

    @Test
    public void add() throws Exception {
        Role role = new Role();
        role.setId("1");
        rs.add(role);

        String result = rs.get("1").getId();

        assertThat(result, is("1"));


    }

    @Test
    public void update() {
        Role role = new Role();
        rs.add(role);
        role.setId("1");
        rs.update(role);

        String result = rs.get("1").getId();

        assertThat(result, is("1"));

    }

    @Test
    public void delete() throws Exception {
        Role role = new Role();
        role.setId("1");
        rs.add(role);

        rs.delete("1");

        Assert.assertNull(rs.get(0));


    }

    @Test
    public void get() throws Exception {
        Role role = new Role();
        role.setId("1");
        rs.add(role);

        Base result = rs.get("1");

        assertThat(result, is(role));
    }

}
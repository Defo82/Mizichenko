package ru.amizichenko.tracker.templates;
import ru.amizichenko.tracker.start.*;

public abstract class BaseAction implements UserAction {

    public String name;

    public BaseAction(String name) {
        this.name = name;
    }

    public abstract int key();

    public abstract void execute(Input input, Tracker tracker);

    public String info() {
        return String.format("\t%s. %s", this.key(), this.name);
    }

}

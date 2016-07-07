package ru.amizichenko.tracker.working;
import ru.amizichenko.tracker.modules.*;

public class Tracker {

	public static Item[] items = new Item[10];

	public static void main(String[] args) {

		new UserWork().mainLoop();

	}
}
package ru.amizichenko.tracker.start;

public interface UserAction {
	
	int key();
	
	void execute(Input input, Tracker tracker);
	
	String info();
}
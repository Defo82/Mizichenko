package ru.amizichenko.tracker.start;

public class StartUITest {
	
	public static void main(String[] args) {
		Input input = new StubInput(new String[] {"create stab task"});
		new StartUI(input).init();
	}
}
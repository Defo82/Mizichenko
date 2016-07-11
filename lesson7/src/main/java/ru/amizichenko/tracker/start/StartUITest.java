package ru.amizichenko.tracker.start;

public class StartUITest {

	public static void main(String[] args) {

		Input input = new StubInput(new String[] {"1","1","a","b","4","6"});
		new StartUI(input).init();


	}
}
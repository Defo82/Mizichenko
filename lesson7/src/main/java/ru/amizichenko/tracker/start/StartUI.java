package ru.amizichenko.tracker.start;

public class StartUI {
	
	private Input input;
	
	public StartUI(Input input) {
		this.input = input;
	}
	
	public void init() {
		Tracker tracker = new Tracker();
		MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();

        System.out.println(String.format("\n\n\nWelcome to the accounting software applications.\n "));
        String point = input.ask(String.format("To skip this greeting press Enter.\n"));

        if (point != null) {
            System.out.println("The following actions are available: ");
            int exit = 0;
            while (exit != 6){
                menu.show();
                int key = Integer.valueOf(input.ask("Enter your choice: "));
                exit = key;
                if (key != 6) menu.select(key);
            }

        }

    }
	
	public static void main(String[] args) {
		Input input = new ConsoleInput();
		new StartUI(input).init();

	}
}
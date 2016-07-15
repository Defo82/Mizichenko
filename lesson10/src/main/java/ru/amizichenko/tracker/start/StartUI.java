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
        String skipGreeting = input.ask(String.format("To skip this greeting press Enter.\n"));

        if (skipGreeting != null) {
            System.out.println("The following actions are available: ");
            int key;
            do {
                menu.show();
                key = input.ask("Enter your choice: ", menu.getRangeActions());
                if (key != 6) menu.select(key);
            } while (key != 6);

        }

    }
	
	public static void main(String[] args) {
		new StartUI(new ValidateInput()).init();

	}
}
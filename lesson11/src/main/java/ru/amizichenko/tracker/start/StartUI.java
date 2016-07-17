package ru.amizichenko.tracker.start;

public class StartUI {
	public StartUI(Input input) {
		this.input = input;
	}

    private Input input;


	
	public void init() {
		Tracker tracker = new Tracker();
		MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();

        System.out.println(String.format("\n\n\nWelcome to the accounting software applications.\n "));
        String skipGreeting = input.ask(String.format("To skip this greeting press Enter.\n"));

        if (skipGreeting != null) {
            System.out.println("The following actions are available: ");
            while (tracker.exit) {
               menu.show();
               menu.select(input.ask("Enter your choice: ", menu.getRangeActions()));
           }

        }
    }
	
	public static void main(String[] args) {
		new StartUI(new ValidateInput()).init();
	}
}
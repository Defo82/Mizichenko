package ru.amizichenko.tracker.start;
import ru.amizichenko.tracker.models.*;

public class StartUI {
	
	private String greeting = String.format("\n\n\nWelcome to the accounting software applications.\n ");
    private String menu = String.format("\n\t1. Add a new application\n\t2. Edit\n\t3. Delete\n\t4. View all\n\t5. Sort of word\n\t6. Exit");
	
	private Input input;
	
	public StartUI(Input input) {
		this.input = input;
	}
	
	public void init() {
		Tracker tracker = new Tracker();
		System.out.println(greeting);
        String point = input.ask(String.format("To skip this greeting press Enter.\n"));
        System.out.print("The following actions are available: ");
        if (point != null) System.out.println(menu);

        int key = 0;
        while (key != 6) {
            key = Integer.parseInt(input.ask("Enter your choice: "));
                if (key == 1) {
                    tracker.add(new Item(   input.ask("Fill in 'name': "),
                                            input.ask("Fill in 'description': ")));
                    System.out.println(menu);
                }
                if (key == 2) {
                    tracker.edit(new Item(  input.ask("Enter Id for edit: "),
                                            input.ask("Enter new name: "),
                                            input.ask("Enter new description: ")));
                    System.out.println(menu);
                }
                if (key == 3) {
                    tracker.remove(input.ask("Enter Id for remove: "));
                    System.out.println(menu);
                }
                if (key == 4) {
                    tracker.show(tracker.items);
                    System.out.println(menu);
                }
                if (key == 5) {
                    tracker.show(tracker.sort(input.ask("Enter word for search: ")));
                    System.out.println(menu);
                }
                if (key == 6) break;
        }

    }



	
	public static void main(String[] args) {
		Input input = new ConsoleInput();
		new StartUI(input).init();

	}
}
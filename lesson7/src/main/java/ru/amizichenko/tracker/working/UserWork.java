package ru.amizichenko.tracker.working;
import ru.amizichenko.tracker.modules.*; 

public class UserWork {

    private Task task = new Task();
    private Input get = new Input();

    private String greeting = String.format("\n\n\nWelcome to the accounting software applications.\n ");
    private String menu = String.format("\n1. Add a new application\n2. Edit\n3. Delete\n4. View all\n5. Exit\n");


    public void mainLoop() {  
	
        System.out.println(greeting);
        String point = get.ask("To skip this greeting press Enter.");
        System.out.print("The following actions are available: ");
        if (point != null) System.out.println(menu);

        int key = 0;
        while (key != 5) {
            key = Integer.parseInt(get.ask("Enter your choice: "));
                if (key == 1) {
                    task.add();
                    System.out.println(menu);
                }
                if (key == 2) {
                    task.edit();
                    System.out.println(menu);
                }
                if (key == 3) {
                    task.remove();
                    System.out.println(menu);
                }
                if (key == 4) {
                    task.show();
                    System.out.println(menu);
                }
                if (key == 5) break;
        }

    }

}

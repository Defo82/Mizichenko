package ru.amizichenko.tracker.start;
import ru.amizichenko.tracker.models.*;

public class MenuTracker {
	
	private Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[6];
	
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	public void fillActions() {
		this.actions[0] = this.new AddItem();
		this.actions[1] = this.new Edit();
		this.actions[2] = this.new Remove();
		this.actions[3] = this.new ShowItems();
		this.actions[4] = this.new Sort();
		this.actions[5] = this.new Exit();
	}
	public void select(int key) {
		this.actions[--key].execute(this.input, this.tracker);
	}

	public void show() {
		for(UserAction action : this.actions) {
			if (actions != null) {
			System.out.println(action.info());
			}
		}
	}
	
	private class AddItem implements UserAction {
		public int key() {
			return 1;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.add(new Item(input.ask("Fill in 'name': "),
                                 input.ask("Fill in 'description': ")));
		}
		public String info() {
			return String.format("\t%s. %s", this.key(), "Add the new item");
		}
	}

	private class Edit implements UserAction {
		public int key() {
			return 2;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.edit(new Item(  input.ask("Enter Id for edit: "),
									input.ask("Enter new name: "),
									input.ask("Enter new description: ")));
		}
		public String info() {
			return String.format("\t%s. %s", this.key(), "Edit item");
		}
	}

	private class Remove implements UserAction {
		public int key() {
			return 3;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.remove(input.ask("Enter Id for remove: "));
		}
		public String info() {
			return String.format("\t%s. %s", this.key(), "Remove item");
		}
	}

	private class ShowItems implements UserAction {
		public int key() {
			return 4;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.show(tracker.items);
		}
		public String info() {
			return String.format("\t%s. %s", this.key(), "Show all items");
		}
	}

	private class Sort implements UserAction {
		public int key() {
			return 5;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.show(tracker.sort(input.ask("Enter word for search: ")));
		}
		public String info() {
			return String.format("\t%s. %s", this.key(), "Sort items of word");
		}
	}

	private class Exit implements UserAction {
		public int key() {
			return 6;
		}
		public void execute(Input input, Tracker tracker) {
			}
		public String info() {
			return String.format("\t%s. %s", this.key(), "Exit");
		}
	}

}
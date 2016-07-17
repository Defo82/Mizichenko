package ru.amizichenko.tracker.start;
import ru.amizichenko.tracker.models.*;
import ru.amizichenko.tracker.templates.BaseAction;

public class MenuTracker {

	private Input input;
	private Tracker tracker;
	private UserAction[] actions = new UserAction[6];


	public int[] getRangeActions() {
		int[] arr = new int[this.actions.length];
		for (int i = 0; i < this.actions.length; i++) {
			arr[i] = actions[i].key();
		}
		return arr;
	}
	
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
	
	private class AddItem extends BaseAction {
		AddItem() {
			super("AddItem");
		};
		public int key() {
			return 1;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.add(new Item(input.ask("Fill in 'name': "),
                                 input.ask("Fill in 'description': ")));
		}
	}

	private class Edit extends BaseAction {
		Edit() {
			super("Edit");
		};
		public int key() {
			return 2;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.edit(new Item(  input.ask("Enter Id for edit: "),
									input.ask("Enter new name: "),
									input.ask("Enter new description: ")));
		}
	}

	private class Remove extends BaseAction {
		Remove() {
		super("Remove");
	};
		public int key() {
			return 3;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.remove(input.ask("Enter Id for remove: "));
		}
	}

	private class ShowItems extends BaseAction {
		ShowItems() {
			super("Show all items");
		};
		public int key() {
			return 4;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.show(tracker.getAll());
		}

	}

	private class Sort extends BaseAction {
		Sort() {
			super("Sort of word");
		};
		public int key() {
			return 5;
		}
		public void execute(Input input, Tracker tracker) {
			tracker.show(tracker.sort(input.ask("Enter word for search: ")));
		}
	}

	private class Exit extends BaseAction {

		Exit() {
			super("Exit");
		};

		public int key() {
			return 6;
		}
		public void execute(Input input, Tracker tracker) {
			if("yes".equals(input.ask("Are you really want to exit? \nEnter yes: "))) {
			tracker.exit = false;
			} else System.out.println("\nIncorrect input\n");
		}
	}
}
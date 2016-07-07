package ru.amizichenko.tracker.modules;
import ru.amizichenko.tracker.working.*;

public class Task extends Input {

	private String name = "Enter your name: ";
	private String desc = "Fill in description: ";
	
	private int index = 0;
	
	public void add() {
		Tracker.items[index++] = new Item(this.ask(this.name),this.ask(this.desc));
	}
	
	public void edit() {

		index = Integer.parseInt(this.ask("Enter your cell number to be edited: "));
		if (index >=0 && index<=Tracker.items.length){
			Tracker.items[index-1] = new Item(this.ask(this.name),this.ask(this.desc));
		}else System.out.println("Such cell is not found");
		
	}
	
	public void remove() {

			index = Integer.parseInt(this.ask("Enter cell number for deleted: "));
			if (index >= 0 && index < Tracker.items.length) {
				index -=1;
				Item[] copy = new Item[Tracker.items.length-1];
				System.arraycopy(Tracker.items, 0, copy, 0, index);
				System.arraycopy(Tracker.items, index+1, copy, index, Tracker.items.length-index-1);
				Tracker.items = copy;
			}
	}
	
	public void show() { 
		System.out.println("================================================================================");

		int cell = 1;
		for (Item item : Tracker.items) {
			if (item != null) {
				System.out.printf("%3d \tName: %s \n\tDescription: %s\n",
						cell++, item.getName(),item.getDescription());
						System.out.println();
			}
		}
		System.out.println("================================================================================");
		
	}
	
	public void sort() {
		
	}
}
package ru.amizichenko.tracker.modules;

public class Item {
	private String name;
	private String description;
	private long create;
	
	public Item() {
		
	}
	
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public long getCreate() {
		return this.create;
	}
}
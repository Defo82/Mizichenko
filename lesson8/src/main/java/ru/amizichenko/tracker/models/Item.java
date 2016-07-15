package ru.amizichenko.tracker.models;


public class Item {

	private String id;
	private String name;
	private String description;
	private long create;
	
	
	public Item() {
		
	}
	
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Item (String id, String name, String description) {
		this.id = id;
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
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
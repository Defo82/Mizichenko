package ru.amizichenko.tracker.start;
import ru.amizichenko.tracker.models.*;
import java.util.*;

public class Tracker {	
		public Item[] items = new Item[10];
		private int position = 0;
		
		//Добовление
		public Item add(Item item) {
			item.setId(this.generateId());
			this.items[position++] = item;
			return item;
		}

		//Редактирование
		public void edit(Item item) {
			for (int i =0; i < this.items.length; i++) {
				if (this.items[i].getId().equals(item.getId())) {
					this.items[i] = item;
					break;
				} else System.out.println("Such Id is not found");
			}
		}

		//Удаление
		public void remove(int index) {
			
			if (index >= 0 && index < this.items.length) {
				Item[] copy = new Item[this.items.length-1];
				System.arraycopy(this.items, 0, copy, 0, index);
				System.arraycopy(this.items, index+1, copy, index, this.items.length-index-1);
				this.items = copy;
				this.position--;
			}
		}
		
		//Поиск по Id
		public Item findById(String id) {
			Item result = null;
			for(Item item : items) {
				if(item != null && item.getId().equals(id)) {
					result = item;
					break;
				}
			}
			return result;
		}
		
		String generateId() {
			return String.valueOf(Math.round(Math.random() * 100));
		}
		
		//Вернуть все
		public Item[] getAll() {
			Item[] result = new Item[position];
			for(int index = 0; index != this.position; index++) {
				result[index] = this.items[index];
			}
			return result;
		}
		
		//Показть все
		public void show() {
			System.out.println("================================================================================");

			int cell = 1;
			for (Item item : this.items) {
				if (item != null) {
					System.out.printf("%s \tName: %s \n\tDescription: %s\n",
							item.getId(),item.getName(),item.getDescription());
					System.out.println();
				}
			}
		System.out.println("================================================================================");
		}

		//Ищет все объекты с заданным словом
		public Item[] sort(String word) {
			Item[] sorted = new Item[this.items.length];
			int filterIndex = 0;
			for (int i = 0; i < this.items.length; i++) {
				if (this.items[i] != null && (this.items[i].getName().contains(word) || this.items[i].getName().contains(word))) {
					sorted[filterIndex++] = this.items[i];
				}
			}
			return sorted;
		}

		
}

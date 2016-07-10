package ru.amizichenko.tracker.start;
import ru.amizichenko.tracker.models.*;

public class StartUI {
	public static void main(String[] args) {
		Tracker tracker = new Tracker();

		//Добавляем
		tracker.add(new Item("name","description"));
		tracker.add(new Item("imya","opisanie"));
		tracker.show();

		//Редактируем
		Item item = new Item(tracker.items[1].getId(),"NAME","DESCRIPTION");
		tracker.edit(item);
		tracker.show();

		//Удаляем
		tracker.remove(0);
		tracker.show();

		//Сортируем
		for (Item it : tracker.sort("NAME")) {
			if (it != null){
			System.out.println(it.getName());
			System.out.println(it.getDescription());}

		}

	
	}
}
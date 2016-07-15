package ru.amizichenko.tracker.start;
import java.util.*;

public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);
	
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}

	/**
	 * Переопределенный метод для выбора пункта меню
	 * @param question сообщение перед вводом ключа
	 * @param range массив хранящий ключи от всех пунктов меню
     * @return возвращает ключ если тот находит соответствие в массиве range
	 * @throws MenuOutException если ключ не находит соответствия в range
     */
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int value : range) {
			if(value == key) {
				exist = true;
				break;
			}
		}
		if (exist) {
			return key;
		}else {
			throw new MenuOutException("Out of menu range.");

		}
	}
	
}
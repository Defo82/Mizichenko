package ru.amizichenko.chess;

/**
 * Created by Defo on 25.07.2016.
 */
public class ValidateInput extends ConsoleInput {
    /**
     *
     * @param question показывает вопрос перед вводом с клавиатуры
     * @param range содержит ключи из массива UserAction
     * @return возвращает значение принятое родительским методом ask
     * @throws MenuOutException если введен ключ несуществующего меню
     * @throws NumberFormatException если введено не число
     */
    public int ask(String question, String[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            }
            catch (MenuOutException moe) {
                System.out.println("Please select key from menu. ");
            }
            catch (NumberFormatException nfe) {
                System.out.println("Please enter validate data again. ");
            }
        }while (invalid);
        return value;
    }
}

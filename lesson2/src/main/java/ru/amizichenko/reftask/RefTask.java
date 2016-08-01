/*Задание 1.
Посмотрите данный код и ответьте на вопросы.
Что будет выведено на консоль и почему?

*/


public class RefTask {
public static void main(String[] args) {
Integer value = 1;
RefTask.change(value);
System.out.println(value);
}
publib static void change(Integer value) {
value++;
}

// Выыедет 2. Метод chenge инкрементирует переданый параметр.
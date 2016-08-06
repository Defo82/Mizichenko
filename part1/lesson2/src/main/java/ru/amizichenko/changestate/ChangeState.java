/*Задание 2.
Посмотрите данный код и ответьте на вопросы.

Сколько объектов класс Сlaim создано?
Что будет выведенно на консоль?
*/

package lesson2;

public class ChangeState {

   public static class Claim {
      public String name;
   }

   public static void main(String[] args) {
      Claim claim = new Claim();
      claim.name = "bug";
      processClaim(claim);
      System.out.println(claim.name);
   }

   private static void processClaim(Claim value) {
      value.name = "task";
   }
}

// Создан один объект Claim. Выведет "task".
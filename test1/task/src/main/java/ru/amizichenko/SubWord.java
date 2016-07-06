package task;
public class SubWord {
	
	/**
	первый цикл смещает проверку каждый раз вправо на 1
    заканчивается там где начинается последнее сравнение
	
	k - индекс для каждой новой проверки соответствует массиву оригинальной фразы
    count - считает количество соответствий	
	*/

    public boolean contains(String origin, String sub) {
        boolean result = false;

        char[] sorurce = origin.toCharArray();
        char[] quotes = sub.toCharArray();

        for (int i = 0; i < sorurce.length - quotes.length; i++){
            int k =i;
            int count = 0;
            for (int j = 0; j < quotes.length; j++){
			
                if (sorurce[k] == quotes[j]) {
                    count++;
                }
                k++;

            }

            if (count == quotes.length){
                result = true;
                break;

            }
        }
        return result;
        }

    }


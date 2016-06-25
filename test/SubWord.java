package test;
public class SubWord {

    public boolean contains(String origin, String sub) {
        boolean result = false;//если часть соответствует целому, вернется true

        char[] sorurce = origin.toCharArray();
        char[] quotes = sub.toCharArray();

        for (int i = 0; i < sorurce.length - quotes.length; i++){//первый цикл смещает проверку каждый раз вправо на 1
                                                                 //заканчивается там где начинается последнее сравнение
            int k =i;//индекс для каждой новой проверки соответствует массиву оригинальной фразы
            int count = 0;//считает количество соответствий
            for (int j = 0; j < quotes.length; j++){//цикл сравнивает фразы
                System.out.println(sorurce[k]+" "+quotes[j]);//смотрим что с чем сравнивается
                if (sorurce[k] == quotes[j]) {
                    count++;//индекс считает совпаления
                }
                k++;//после проверки  цикл сдвинется и k пойдет с того места

            }

            if (count == quotes.length){//количество совпадений должно быть равно размеру подстроки
                result = true;
                break;//совпадение найдено, дальше не проверяем

            }
        }
        return result;
        }

    }


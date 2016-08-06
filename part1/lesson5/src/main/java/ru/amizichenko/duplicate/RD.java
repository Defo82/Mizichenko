package duplicate;
public class RD {

    public void removeDuplicate(String[] values) {

        /**
        метод должен найти дубликат
        и сдвинуть все последующие элементы влево затерев тем самым его,
        последний элемент занулить
        */

        for (int i = 0; i < values.length-1; i++){
            for (int j = i+1; j < values.length; j++){
                if (values[i].equals(values[j])){
                    for (int k = j; k < values.length - 1; k++){
                        values[k] = values[k+1];
                    }
                    values[values.length - 1] = "0";
                }
            }

        }
    }
}

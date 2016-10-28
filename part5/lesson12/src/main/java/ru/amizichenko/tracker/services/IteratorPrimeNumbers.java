package ru.amizichenko.tracker.services;

import java.util.Iterator;

/**
 * Created by Defo on 14.09.2016.
 */
public class IteratorPrimeNumbers implements Iterator<Integer> {

    private final int[] values;
    private int index = 0;

    public IteratorPrimeNumbers(int[] values) {
        this.values = values;
    }


    public boolean hasNext() {
        boolean check = false;
        for (int i = this.index; i < this.values.length; i++) {
            if(isPrime(values[i])) {
                check = true;
                break;
            } else check = false;
        }
        return check;
    }

    public Integer next() {
        int primeNumber = 0;
        for (int i = this.index; i < this.values.length; i++) {
            if (isPrime(values[i])) {
                primeNumber = values[i];
                this.index = i+1;
                break;
            }
        }

        return primeNumber;
    }

    public void remove() {
    }

    private boolean isPrime(int n){
        boolean prime = true;
        if( n == 1 ) prime = false; // 1 - не простое число

        // перебираем возможные делители от 2 до sqrt(n)
        for(int i=2; i*i<=n; i++){
            // если разделилось нацело, то составное
            if(n % i ==0) prime = false;
        }
        // если нет нетривиальных делителей, то простое
        return prime;
    }
}

package com.example.numeros;

public class NumeroService {

    public Integer obtenerTotal(Integer n) {

        int digitSearched = 13;
        String digitAsString = String.valueOf(digitSearched);
        int count = 0;
        for (int i = 0; i < n; i++) {
            String numberAsString = String.valueOf(i);
            if (numberAsString.contains(digitAsString)){
                count ++;
            }
        }
        return n - count;
    }
}

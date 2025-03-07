package com.mycompany.repetetb;

public class SomaNumInteiros {

    public static void main(String[] args) {
        
        int soma = 0;
        
        for (int i = 1; i < 101; i++) {
            soma = soma + i;
        }
        
        System.out.println("Resultado da soma dos números inteiros de 1 a 100: "+ soma);
    }
}

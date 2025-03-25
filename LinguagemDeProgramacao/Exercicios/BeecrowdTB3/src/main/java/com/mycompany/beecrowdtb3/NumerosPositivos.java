package com.mycompany.beecrowdtb3;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;    // Conta o número de iterações (6 valores)
        int positivos = 0;   // Conta os valores positivos
        
        // Lê 6 valores usando while
        while (contador < 6) {
            double valor = sc.nextDouble(); // Lê um valor (usamos double para aceitar decimais)
            if (valor > 0) {                // Verifica se é positivo
                positivos++;                // Incrementa o contador de positivos
            }
            contador++;                     // Incrementa o contador de iterações
        }
        
        // Mostra o resultado
        System.out.println(positivos + " valores positivos");
        
        sc.close();
    }
}

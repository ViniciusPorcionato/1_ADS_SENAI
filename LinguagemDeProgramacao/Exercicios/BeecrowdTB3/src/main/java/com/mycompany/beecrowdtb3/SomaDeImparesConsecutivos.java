package com.mycompany.beecrowdtb3;

import java.util.Scanner;

public class SomaDeImparesConsecutivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lê os dois valores inteiros
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        // Determina o menor e o maior valor
        int menor = Math.min(X, Y);
        int maior = Math.max(X, Y);
        
        // Inicializa a soma dos ímpares
        int soma = 0;
        
        // Começa do próximo número após o menor
        int numero = menor + 1;
        
        // Loop para somar os ímpares entre menor e maior
        while (numero < maior) {
            if (numero % 2 != 0) { // Verifica se o número é ímpar
                soma += numero;    // Adiciona à soma
            }
            numero++;              // Avança para o próximo número
        }
        
        // Imprime o resultado
        System.out.println(soma);
        
        sc.close();
    }
}

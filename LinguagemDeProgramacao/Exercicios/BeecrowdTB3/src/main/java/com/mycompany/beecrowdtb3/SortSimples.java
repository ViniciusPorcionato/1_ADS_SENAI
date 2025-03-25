package com.mycompany.beecrowdtb3;

import java.util.Scanner;

public class SortSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lê os três valores inteiros
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Armazena os valores originais para exibir depois
        int originalA = a;
        int originalB = b;
        int originalC = c;
        
        // Ordenação em ordem crescente usando while e trocas
        while (a > b || b > c) { // Enquanto não estiver ordenado
            if (a > b) {         // Troca a e b se a > b
                int temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {         // Troca b e c se b > c
                int temp = b;
                b = c;
                c = temp;
            }
        }
        
        // Mostra os valores em ordem crescente
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        // Linha em branco
        System.out.println();
        
        // Mostra os valores na ordem original
        System.out.println(originalA);
        System.out.println(originalB);
        System.out.println(originalC);
        
        sc.close();
    }

}

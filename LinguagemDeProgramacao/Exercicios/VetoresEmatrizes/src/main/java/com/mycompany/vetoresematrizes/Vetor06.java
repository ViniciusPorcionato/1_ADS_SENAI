package com.mycompany.vetoresematrizes;

import java.util.Scanner;

public class Vetor06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[10];

        System.out.println("Insira valores pro vetor a");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Insira valores pro vetor b");

        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
        }
        
        int j = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("C[" + j + "]" + " = " + (c[j] = a[i]));
            j++;
            System.out.println("C[" + j + "]" + " = " + (c[j] = b[i]));
            j++;
        }

    }
}

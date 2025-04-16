package com.mycompany.vetoresematrizes;

import java.util.Scanner;

public class Vetor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idades[] = new int[5];
        int soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
            soma += idades[i];
        }
        
        //casting de int para double 
        double media = (double)soma / 5;
        
        System.out.println("A média das idades é: " + media);
    }
}

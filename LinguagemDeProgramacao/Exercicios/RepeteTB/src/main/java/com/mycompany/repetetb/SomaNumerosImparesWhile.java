package com.mycompany.repetetb;

import java.util.Scanner;

public class SomaNumerosImparesWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade N de números: ");
        int n = sc.nextInt();
        
        int somaImpares = 0;
        int i = 1;
        
        while (i <= n) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();
            
            if (numero % 2 != 0) {
                somaImpares += numero;
            }
            i++;
        }
        
        System.out.println("A soma dos números ímpares é: " + somaImpares);
    }
}

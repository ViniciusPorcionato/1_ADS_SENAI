package com.mycompany.repetetb;

import java.util.Scanner;

public class NumeroPrimoEntreValores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("De valor para X");
        int inicioNumero = sc.nextInt();

        System.out.println("De valor para Y");
        int finalNumero = sc.nextInt();

        for (int i = inicioNumero; i < finalNumero; i++) {
            
            int f = 0;
            
            for (int j = 2; j < i; j++) {
                
                if (i % j == 0) {
                    f = 1;
                }
            }
            
            if (f == 0) {
                System.out.println(i);
            }
        }
    }
}

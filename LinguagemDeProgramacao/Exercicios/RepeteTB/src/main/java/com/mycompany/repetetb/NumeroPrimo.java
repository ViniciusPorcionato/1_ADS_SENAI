package com.mycompany.repetetb;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = sc.nextInt();

        int f = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                f = 1;
            }
        }

        if (f == 0) {
            System.out.println("Esse número é primo");
        }else{
            System.out.println("Esse número não é primo");
        }
    }

}

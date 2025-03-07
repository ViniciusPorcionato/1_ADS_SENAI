package com.mycompany.repetetb;

import java.util.Scanner;

public class RepeticaoFor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor inicial: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o valor final: ");
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i+=3) {
            System.out.println(i);
        }

    }
}

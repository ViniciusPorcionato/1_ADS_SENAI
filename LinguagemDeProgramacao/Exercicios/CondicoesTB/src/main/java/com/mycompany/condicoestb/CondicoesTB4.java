package com.mycompany.condicoestb;

import java.util.Scanner;

public class CondicoesTB4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.println("Digite o valor do primeiro número");
        number1 = sc.nextInt();

        System.out.println("Digite o valor do segundo número");
        number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("A diferença de l" + number1 + "para " + number2 + "é :" + (number1 - number2));
        } else {
            System.out.println("A diferença de " + number2 + "para " + number1 + " é :" + (number2 - number1));
        }
    }
}

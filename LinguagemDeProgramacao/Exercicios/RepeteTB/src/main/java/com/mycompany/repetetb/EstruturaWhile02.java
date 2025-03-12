package com.mycompany.repetetb;

import java.util.Scanner;

public class EstruturaWhile02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        while (num == 0) {
            System.out.println("java eh para quem quiser aprender");
            System.out.println("Deseja repetir? 0 = Sim 1 = Não");
            num = sc.nextInt();
        }

    }

}

package com.mycompany.condicoestb;

import java.util.Scanner;

public class CondicoesTB3 {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um valor:");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("O número"+ number + "é par" );
        }else{
            System.out.println("O número"+ number + "é ímpar" );
        }
        
        if (number >= 0) {
            System.out.println("O número"+ number + "é positivo" );
        }else{
            System.out.println("O número"+ number + "é negativo" );
        }
    }
}

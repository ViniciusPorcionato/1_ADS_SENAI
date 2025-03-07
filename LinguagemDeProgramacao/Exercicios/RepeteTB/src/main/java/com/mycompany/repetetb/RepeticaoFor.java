package com.mycompany.repetetb;

import java.util.Scanner;

public class RepeticaoFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite quanl tabuada vc quer (0 - 10)");
        int numTabuada = sc.nextInt();
        
        for (int i = 0; i < 11; i++) {
            System.out.println(numTabuada + " X " + i + " = " + numTabuada * i);
        }
    }

}
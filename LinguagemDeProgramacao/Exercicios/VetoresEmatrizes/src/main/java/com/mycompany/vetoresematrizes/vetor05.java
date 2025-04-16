package com.mycompany.vetoresematrizes;

import java.util.Scanner;


public class vetor05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int a[] = new int[5];
        int b[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            b[i] = 2*a[i];
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("B [" + i + "]" + " = " + b[i]);
        }
    }
}

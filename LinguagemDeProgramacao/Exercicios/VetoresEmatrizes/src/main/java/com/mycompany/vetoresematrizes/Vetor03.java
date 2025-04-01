package com.mycompany.vetoresematrizes;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class Vetor03 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        int n = sc.nextInt();
        
        int[] vetor1 = new int[n]; 
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor de %d: ", (i + 1), n);
            vetor1[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Posição %d: %d\n", i, vetor1[i]);
        }
    }
}

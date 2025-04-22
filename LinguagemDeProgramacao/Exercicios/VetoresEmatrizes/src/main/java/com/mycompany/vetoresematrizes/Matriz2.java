/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetoresematrizes;

import java.util.Scanner;

/**
 *
 * @author 25170641
 */
public class Matriz2 {

    public static void main(String[] args) {
        int num[][] = new int[2][2];
        int i, j;
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int somaLinhas;
        for (i = 0; i < 2; i++) {
            somaLinhas = 0;
            for (j = 0; j < 2; j++) {
                System.out.println("Digite o valor: ");
                num[i][j] = sc.nextInt();
                somaLinhas += num[i][j];
            }
            System.out.println("A soma da linha " + i + " é = " + somaLinhas);
            total += somaLinhas;
        }
        
        System.out.printf("A soma total é = %2d\n", total);
    }
}

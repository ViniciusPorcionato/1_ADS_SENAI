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
public class Matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M[][] = new int[2][3];
        int i;//i segue as linhas
        int j;//j segue as colunas
        
        System.out.println("Digite números inteiros: ");
        for (i = 0; i < 2; i++) {
            for ( j = 0; j < 3; j++) {
                M[i][j] = sc.nextInt();
            }
        }
        
        for ( i = 0; i < 2; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print("M["+i+"]"+"["+j+"] = "+ M[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

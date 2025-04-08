/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowdtb2;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura dos dois valores inteiros
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // Verifica se A é múltiplo de B ou se B é múltiplo de A
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}

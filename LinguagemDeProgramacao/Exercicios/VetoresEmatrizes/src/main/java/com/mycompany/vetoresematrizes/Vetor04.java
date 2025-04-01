/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetoresematrizes;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class Vetor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;
        
        // Solicitar as idades ao usuário
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
            soma += idades[i];
        }
        
        // Calcular a média das idades
        double media = (double) soma / idades.length;
        
        // Exibir o resultado
        System.out.println("A média das idades é: " + media);
    }
}

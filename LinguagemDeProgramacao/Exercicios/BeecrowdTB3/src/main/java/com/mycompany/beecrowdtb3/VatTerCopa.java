/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowdtb3;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class VatTerCopa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop enquanto houver entrada disponível
        while (sc.hasNextInt()) {
            int N = sc.nextInt(); // Lê o número de reclamações

            // Verifica o valor de N e imprime a saída correspondente
            if (N == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }

        sc.close();
    }
}

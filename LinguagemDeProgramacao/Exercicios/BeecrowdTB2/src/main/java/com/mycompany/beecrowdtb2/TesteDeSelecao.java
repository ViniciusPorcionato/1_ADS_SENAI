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
public class TesteDeSelecao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê os 4 números inteiros
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        // Verifica todas as condições pedidas
        if (B > C
                && // B precisa ser maior que C
                D > A
                && // D precisa ser maior que A
                (C + D) > (A + B)
                && // A soma de C+D precisa ser maior que A+B
                C > 0 && D > 0
                && // C e D precisam ser positivos
                A % 2 == 0) {        // A precisa ser par (resto da divisão por 2 igual a 0)

            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}

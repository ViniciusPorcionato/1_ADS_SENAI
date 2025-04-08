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
public class NotasEMoedas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pega o valor que o usuário digitou (exemplo: 576.73)
        double valor = sc.nextDouble();

        // Vamos trabalhar com o valor em centavos pra ficar mais fácil
        // Multiplica por 100 (576.73 vira 57673 centavos)
        int centavos = (int) (valor * 100);

        // Parte das notas
        System.out.println("NOTAS:");

        // Vamos pegar cada nota, uma por vez
        int notas100 = centavos / 10000; // Quantas notas de 100 (10000 centavos)
        centavos = centavos - (notas100 * 10000); // Tira o valor das notas de 100

        int notas50 = centavos / 5000; // Quantas notas de 50 (5000 centavos)
        centavos = centavos - (notas50 * 5000); // Tira o valor das notas de 50

        int notas20 = centavos / 2000; // Quantas notas de 20
        centavos = centavos - (notas20 * 2000);

        int notas10 = centavos / 1000; // Quantas notas de 10
        centavos = centavos - (notas10 * 1000);

        int notas5 = centavos / 500; // Quantas notas de 5
        centavos = centavos - (notas5 * 500);

        int notas2 = centavos / 200; // Quantas notas de 2
        centavos = centavos - (notas2 * 200);

        // Mostra quantas notas de cada
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        // Parte das moedas
        System.out.println("MOEDAS:");

        int moedas1 = centavos / 100; // Quantas moedas de 1 real (100 centavos)
        centavos = centavos - (moedas1 * 100);

        int moedas050 = centavos / 50; // Quantas moedas de 0.50
        centavos = centavos - (moedas050 * 50);

        int moedas025 = centavos / 25; // Quantas moedas de 0.25
        centavos = centavos - (moedas025 * 25);

        int moedas010 = centavos / 10; // Quantas moedas de 0.10
        centavos = centavos - (moedas010 * 10);

        int moedas005 = centavos / 5; // Quantas moedas de 0.05
        centavos = centavos - (moedas005 * 5);

        int moedas001 = centavos / 1; // Quantas moedas de 0.01
        centavos = centavos - (moedas001 * 1);

        // Mostra quantas moedas de cada
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas050 + " moeda(s) de R$ 0.50");
        System.out.println(moedas025 + " moeda(s) de R$ 0.25");
        System.out.println(moedas010 + " moeda(s) de R$ 0.10");
        System.out.println(moedas005 + " moeda(s) de R$ 0.05");
        System.out.println(moedas001 + " moeda(s) de R$ 0.01");
    }
}

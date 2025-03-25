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
public class Experiencias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lê o número de casos de teste
        int N = sc.nextInt();
        
        // Variáveis para contar os totais
        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        int contador = 0;
        
        // Processa os N casos de teste
        while (contador < N) {
            int quantia = sc.nextInt();     // Quantidade de cobaias
            char tipo = sc.next().charAt(0); // Tipo de cobaia (C, R ou S)
            
            // Atualiza os totais
            totalCobaias += quantia;
            if (tipo == 'C') {
                totalCoelhos += quantia;
            } else if (tipo == 'R') {
                totalRatos += quantia;
            } else if (tipo == 'S') {
                totalSapos += quantia;
            }
            
            contador++;
        }
        
        // Calcula os percentuais
        double percCoelhos = (totalCoelhos * 100.0) / totalCobaias;
        double percRatos = (totalRatos * 100.0) / totalCobaias;
        double percSapos = (totalSapos * 100.0) / totalCobaias;
        
        // Imprime os resultados
        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percSapos);
        
        sc.close();
    }
}

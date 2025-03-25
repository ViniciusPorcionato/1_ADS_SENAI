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
public class Grenais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variáveis para estatísticas
        int totalGrenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        
        // Variável para controle do loop
        int resposta = 1;
        
        // Loop principal enquanto o usuário quiser novos Grenais
        while (resposta == 1) {
            // Lê os gols do Inter e do Grêmio
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();
            
            // Atualiza as estatísticas
            totalGrenais++;
            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }
            
            // Pergunta se haverá novo Grenal
            System.out.println("Novo grenal (1-sim 2-nao)");
            resposta = sc.nextInt();
        }
        
        // Imprime as estatísticas finais
        System.out.println(totalGrenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);
        
        // Determina o vencedor
        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
        
        sc.close();
    }
}

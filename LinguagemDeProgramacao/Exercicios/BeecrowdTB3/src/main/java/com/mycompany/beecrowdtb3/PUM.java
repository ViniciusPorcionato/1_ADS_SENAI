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
public class PUM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lê o valor inteiro N
        int N = sc.nextInt();
        
        // Inicializa o primeiro número da sequência
        int numero = 1;
        int contador = 0;
        
        // Imprime N linhas
        while (contador < N) {
            // Imprime os três números consecutivos e "PUM"
            System.out.println(numero + " " + (numero + 1) + " " + (numero + 2) + " PUM");
            
            // Pula 4 unidades para o próximo início de linha
            numero += 4;
            contador++; // Incrementa o contador de linhas
        }
                
        sc.close();
    }
}

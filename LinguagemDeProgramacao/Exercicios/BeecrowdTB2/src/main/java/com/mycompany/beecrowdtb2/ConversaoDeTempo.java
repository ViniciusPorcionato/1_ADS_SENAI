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
public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura do tempo em segundos
        int N = sc.nextInt();
        
        // Cálculo das horas, minutos e segundos
        int horas = N / 3600; // Divide por 3600 para obter as horas
        int resto = N % 3600; // Resto da divisão por 3600
        int minutos = resto / 60; // Divide o resto por 60 para obter os minutos
        int segundos = resto % 60; // Resto da divisão por 60 para obter os segundos
        
        // Imprime no formato horas:minutos:segundos
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
        
    }
}

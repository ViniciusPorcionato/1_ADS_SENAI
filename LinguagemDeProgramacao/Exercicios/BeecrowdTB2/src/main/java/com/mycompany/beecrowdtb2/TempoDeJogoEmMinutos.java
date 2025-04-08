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
public class TempoDeJogoEmMinutos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Lê as quatro entradas
        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int minutoFim = sc.nextInt();
        
        // Converte tudo para minutos desde o início do dia
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int fimEmMinutos = horaFim * 60 + minutoFim;
        
        // Calcula a duração em minutos
        int duracaoMinutos;
        if (fimEmMinutos <= inicioEmMinutos) {
            // Se o fim é menor ou igual ao início, significa que passou de um dia para outro
            // Adiciona 24 horas (1440 minutos) ao fim
            duracaoMinutos = (fimEmMinutos + 1440) - inicioEmMinutos;
        } else {
            // Caso normal: fim maior que início, no mesmo dia
            duracaoMinutos = fimEmMinutos - inicioEmMinutos;
        }
        
        // Converte a duração para horas e minutos
        int horas = duracaoMinutos / 60;
        int minutos = duracaoMinutos % 60;
        
        // Imprime o resultado no formato exigido
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
    }
}

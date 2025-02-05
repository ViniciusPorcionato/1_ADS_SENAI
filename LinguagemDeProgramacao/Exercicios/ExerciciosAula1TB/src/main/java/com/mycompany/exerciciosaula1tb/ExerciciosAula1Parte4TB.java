package com.mycompany.exerciciosaula1tb;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class ExerciciosAula1Parte4TB {

    public static void main(String[] args) {
//        5. Construir um algoritmo que apresenta o cálculo da área de um quadrado de 350m de lado.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o lado do quadrado em cm:");
        float lado = sc.nextFloat();
        
        float area = lado * lado;
        
        System.out.print("Aréa do quadrado: " + area);
    }
}

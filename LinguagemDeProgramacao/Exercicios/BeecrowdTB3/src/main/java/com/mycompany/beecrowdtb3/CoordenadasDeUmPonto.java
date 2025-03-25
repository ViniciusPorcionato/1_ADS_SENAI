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
public class CoordenadasDeUmPonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lê as coordenadas x e y
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        // Verifica a posição do ponto
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        
        sc.close();
    }
}

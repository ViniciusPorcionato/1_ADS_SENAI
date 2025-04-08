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
public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura das três palavras
        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        String palavra3 = sc.nextLine();
        
        // Determinação do animal com base nas palavras
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else { // onivoro
                    System.out.println("pomba");
                }
            } else { // mamifero
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else { // herbivoro
                    System.out.println("vaca");
                }
            }
        } else { // invertebrado
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else { // herbivoro
                    System.out.println("lagarta");
                }
            } else { // anelideo
                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else { // onivoro
                    System.out.println("minhoca");
                }
            }
        }
    }
}

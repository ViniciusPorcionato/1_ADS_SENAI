package com.mycompany.repetetb;

import java.util.Scanner;


public class EuSouCapaz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas vezes vc quer dizer que você é capaz?");
        int vezes = sc.nextInt();
        
        for (int i = 0; i < vezes; i++) {
            System.out.println("Eu sou capaz!");
        }
    }
}

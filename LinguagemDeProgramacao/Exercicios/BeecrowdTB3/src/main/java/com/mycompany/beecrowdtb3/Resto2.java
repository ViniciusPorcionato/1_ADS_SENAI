package com.mycompany.beecrowdtb3;

import java.util.Scanner;

public class Resto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int numero = 2; // Começa no primeiro número com resto 2
        
        while (numero <= 10000) {
            System.out.println(numero);
            numero += N; // Pula para o próximo número que tem resto 2
        }
        
        sc.close();
    }
}

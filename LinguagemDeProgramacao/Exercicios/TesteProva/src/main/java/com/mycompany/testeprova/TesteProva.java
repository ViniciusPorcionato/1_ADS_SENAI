package com.mycompany.testeprova;

import java.util.Scanner;

public class TesteProva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEsquerda = sc.nextInt();
        int numDireita = sc.nextInt();

        int resultado;

        if (numEsquerda >= 0 && numEsquerda <= 5 && numDireita >= 0 && numDireita <= 5 && numEsquerda != numDireita) {
            if (numEsquerda > numDireita) {
                resultado = numEsquerda + numDireita;
                System.out.println(resultado);
            } else {
                resultado = 2 * (numDireita - numEsquerda);
                System.out.println(resultado);
            }
        }
    }
}

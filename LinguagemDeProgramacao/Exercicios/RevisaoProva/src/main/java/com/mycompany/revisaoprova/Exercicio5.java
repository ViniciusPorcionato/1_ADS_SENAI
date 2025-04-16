
package com.mycompany.revisaoprova;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tempoExpediente = sc.nextInt();
        
        int tempo1Ovo = sc.nextInt();
        
        int tempo2Ovo = sc.nextInt();
        
        int somaProducao = tempo1Ovo + tempo2Ovo;
        
        if (tempoExpediente >= somaProducao) {
            System.out.println("Farei Hoje !");
        }else{
            System.out.println("Deixa para amanhã !");
        }
        
    }
    
}

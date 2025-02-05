package aula1tb.aula1tb;

import java.util.Scanner;

/**
 *
 * @author vestibular
 */
public class Aula1Parte3TB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int x = sc.nextInt();
        
        System.out.println("Digite um texto");
        String text = sc1.nextLine();
        
        System.out.println("Digite um char");
        char a = sc2.next().charAt(0);
        
        
        System.out.println("x = " + x);
        System.out.println("Text = " + text);
        System.out.println("Char = " + a);
    }
}

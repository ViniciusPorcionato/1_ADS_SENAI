package com.mycompany.condicoestb;

import java.util.Scanner;

public class CondicoesTB2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sexo;
        
        System.out.println("Tipo de sexo:");
        sexo = sc.next().charAt(0);
        
        if (sexo == 'M' || sexo == 'F' || sexo == 'f' || sexo == 'm') {
            System.out.println("Sexo binário!");
        }else{
            System.out.println("Sexo não binário!");
        }
        
        
    }
}

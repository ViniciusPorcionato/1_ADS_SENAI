package com.mycompany.testeprova;

import java.util.Scanner;

public class TesteProva2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     //   int q = sc.nextInt();
        
        int[][] matriz = new int[50][100];
        for (int i=0;i<n;i++){              
         for (int j=0;j<n;j++){
               matriz[i][j]=sc.nextInt();                
         }
        }   
    }
}

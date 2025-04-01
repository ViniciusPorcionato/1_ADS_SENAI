package com.mycompany.vetoresematrizes;

public class Vetor02 {
    public static void main(String[] args) {
        int n = 10;
        int vetor1[] = new int [10];
        
        for (int j = 0; j < n; j++) {
            vetor1[j] = j;
            System.out.println("V[" + j + "] = " + vetor1[j]);
        }
    }
}

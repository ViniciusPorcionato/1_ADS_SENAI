
package com.mycompany.repetetb;

import java.util.Scanner;

public class RepeteTB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, c=0;
        System.out.println("Digite um número");
        x = sc.nextInt();
        if (x % 2 == 0) {
            c++;
        }else{
            c--;
        }
        
        System.out.println("c = " + c);
        
    }
}

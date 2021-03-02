
package com.mycompany.formulabhaskara;

import java.util.Scanner;

public class FormulaBhaskara {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informa o A: ");
        double a = ler.nextDouble();
        
        System.out.println("Informa o B: ");
        double b = ler.nextDouble();
        
        System.out.println("Informa o C: ");
        double c = ler.nextDouble();
        
        double d = (b * b) - (4 * a * c);
        
        double r1 = (double)(- b + Math.sqrt(d))/(2 * a);
        double r2 = (double) (- b - Math.sqrt(d))/(2 * a);
        
        if(a ==0 || d<0){
            System.out.println("Impossivel calcular");
        }else{
            System.out.println("1 raiz = " + r1 + "\n");
            System.out.println("2 raiz = " + r2 + "\n");
        }
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a5.condicionales;

import java.util.Scanner;

/**
 *
 * @author festr
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        double valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        double valor2 = entrada.nextInt();
        
        double media;
        
        media = (valor1+valor2)/2;
        
        System.out.printf("La media entre %.2f y %.2f es: %.2f\n",valor1,valor2,media);
        
        entrada.close();
        
    }

}

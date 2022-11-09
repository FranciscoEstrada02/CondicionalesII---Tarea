/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a5.condicionales;

import java.util.Scanner;

/**
 *
 * @author festr
 */
public class E2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        double valor1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double valor2 = entrada.nextDouble();
        
        if(valor1 > valor2){
            System.out.println("El valor 1 es mayor");
        }else{
            System.out.println("El valor 2 es mayor");
        }
        entrada.close();
    }
}

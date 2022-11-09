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
public class E3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma;
        double resta;
        double division;
        double multiplicacion;

        System.out.println("Ingrese la operacion que desea hacer:\n"
                + "1 para sumar\n"
                + "2 para restar\n"
                + "3 para multiplicar\n"
                + "4 para dividir");
        int eleccion = entrada.nextInt();
        System.out.println("Ingrese el primer numero");
        double valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        double valor2 = entrada.nextInt();

        if (eleccion == 1) {
            suma = valor1 + valor2;
            System.out.println("El resultado de la suma es: " + suma);
        } else {
            if (eleccion == 2) {
                resta = valor1 - valor2;
                System.out.println("El resultado de la resta es: " + resta);
            } else {
                if (eleccion == 3) {
                    multiplicacion = valor1 * valor2;
                    System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                } else {
                    if (eleccion == 4) {
                        division = valor1 / valor2;
                        if (valor2 == 0) {
                            System.out.println("El resultado de la division es indefinido");
                        } else {
                            System.out.println("El resultado de la divison es: " + division);
                        }
                    }
                }

            }
        }
        entrada.close();
    }
}

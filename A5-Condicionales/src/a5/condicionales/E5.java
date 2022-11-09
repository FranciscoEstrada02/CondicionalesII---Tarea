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
public class E5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la operacion que desea hacer:\n"
                + "1. Calculo del area de un rectangulo\n"
                + "2. Calculo del area de un circulo\n"
                + "3. Calculo del area de un triangulo"
        );
        int opcion = entrada.nextInt();
        if (opcion < 1 || opcion > 3) {
            System.out.println("Ingrese una opcion valida");
        } else {
            if (opcion == 1) {
                System.out.println("Ingrese el largo del rectangulo");
                int largo = entrada.nextInt();
                System.out.println("Ingrese el ancho del rectangulo");
                int ancho = entrada.nextInt();

                int areaRectangulo = largo * ancho;

                System.out.println("El area de rectangulo es: " + areaRectangulo);
            } else {
                if (opcion == 2) {
                    System.out.println("Ingrese el radio del circulo");
                    int radio = entrada.nextInt();

                    double radioElevado = Math.pow(radio, 2);
                    double pi = 3.1416;

                    double areaCirculo = pi * radioElevado;

                    System.out.println("El area del circulo es: " + areaCirculo);

                } else {
                    if (opcion == 3) {
                        System.out.println("Ingrese la base del triangulo");
                        int base = entrada.nextInt();
                        System.out.println("Ingrese la altura del triangulo");
                        int altura = entrada.nextInt();

                        double areaTriangulo = (base * altura) / 2;

                        System.out.println("El area del triangulo es: " + areaTriangulo);

                    } else {
                        System.out.println("Ingrese una opcion valida");
                    }
                }
            }
        }
    }
}

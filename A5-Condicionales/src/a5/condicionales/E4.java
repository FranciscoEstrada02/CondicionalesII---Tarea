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
public class E4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        //Limpieza buffer
        entrada.nextLine();

        if (edad >= 18 && edad <= 67) {
            System.out.println("Ingrese su nombre");
            String nombre = entrada.nextLine();
            System.out.printf("Bienvenido %s\n"
                    + "Edad: %d", nombre, edad);

        } else {
            System.out.println("ERROR:No cumple las condiciones para entrar en el sistema");
        }
        entrada.close();
    }
}

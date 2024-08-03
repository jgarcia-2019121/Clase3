/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jona.main;

/**
 *
 * @author garci
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la operacion a realizar (S = suma, R = resta, M = multiplicacion, D = division): ");
            char operacion = lector.next().charAt(0);
            
            // Validar que la operación sea válida
            if (operacion == 'S' || operacion == 's' || operacion == 'R' || operacion == 'r' ||
                operacion == 'M' || operacion == 'm' || operacion == 'D' || operacion == 'd') {

                System.out.print("Ingrese el primer numero: ");
                double num1 = lector.nextDouble();

                System.out.print("Ingrese el segundo numero: ");
                double num2 = lector.nextDouble();

                switch (operacion) {
                    case 'S':
                    case 's':
                        System.out.println("El resultado es: " + (num1 + num2));
                        break;
                    case 'R':
                    case 'r':
                        System.out.println("El resultado es: " + (num1 - num2));
                        break;
                    case 'M':
                    case 'm':
                        System.out.println("El resultado es: " + (num1 * num2));
                        break;
                    case 'D':
                    case 'd':
                        if (num2 != 0) {
                            System.out.println("El resultado es: " + (num1 / num2));
                        } else {
                            System.out.println("No se puede dividir por cero.");
                        }
                        break;
                    default:
                        System.out.println("Operacion no valida.");
                }
            } else {
                System.out.println("Este no es una opcion valida. Por favor, coloque una que este en las opciones.");
            }

            System.out.print("Desea continuar? (S/N): ");
            char respuesta = lector.next().charAt(0);
            if (respuesta != 'S' && respuesta != 's') {
                continuar = false;
            }
        }

        lector.close();
        System.out.println("Gracias por usar la calculadora.");
    }
}

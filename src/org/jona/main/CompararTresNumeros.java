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

public class CompararTresNumeros {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int num1 = lector.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = lector.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        int num3 = lector.nextInt();
        
        int mayor = num1;
        
        if (num2 > mayor) {
            mayor = num2;
        }
        
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El mayor es: " + mayor);
        
        lector.close();
    }
}

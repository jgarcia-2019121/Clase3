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

public class DeterminarEdad {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = lector.nextInt();
        
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
        
        lector.close();
    }
}


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

public class SoloPositivos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese un numero positivo: ");
        int numero = lector.nextInt();
        
        if (numero >= 0) {
            System.out.println("Numero ingresado: " + numero + " 'Es positivo' ");
        } else {
            System.out.println("Error: Numero negativo ingresado.");
        }
        
        lector.close();
    }
}


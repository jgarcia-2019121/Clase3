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

public class IntercambioValores {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el primer valor (a): ");
        int a = lector.nextInt();

        System.out.print("Ingrese el segundo valor (b): ");
        int b = lector.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Despues del intercambio: a = " + a + ", b = " + b);

        lector.close();
    }
}


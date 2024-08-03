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

public class NombreMes {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Ingrese el numero del mes (1-12): ");
        int mes = lector.nextInt();
        String nombreMes = "";
        
        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        if (mes >= 1 && mes <= 12) {
            nombreMes = meses[mes];
        } else {
            nombreMes = "Numero de mes no valido.";
        }
        
        System.out.println("El nombre del mes es: " + nombreMes);
        
        lector.close();
    }
}


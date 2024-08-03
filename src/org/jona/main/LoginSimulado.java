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

public class LoginSimulado {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String usuarioCorrecto = "usuario";
        String passwordCorrecta = "password";
        
        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = lector.nextLine();
        
        System.out.print("Ingrese el password: ");
        String password = lector.nextLine();
        
        if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecta)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
        
        lector.close();
    }
}


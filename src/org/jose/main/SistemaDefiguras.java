/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jose.main;

/**
 *
 * @author garci
 */
abstract class Figura {
    //Métodos abstractos para calcular el área y el perímetro
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

//Clase que representa un círculo
class Circulo extends Figura{
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    //Implementación del método calucularArea
    @Override //Es una herramienta para garantizar que los metodos que crees para spbreescribir otros en clases padres.
    public double calcularArea(){
        return Math.PI + Math.pow(radio, 2);
    }
    
    @Override //Es una herramienta para garantizar que los metodos que crees para spbreescribir otros en clases padres.
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}

//Clase que representa un rectangulo
class Rectangulo extends Figura{
    private double largo;
    private double ancho;
    
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    //Implementación del método calcularAra
    @Override
    public double calcularArea(){
        return largo * ancho;
    }
    
    //Implementación del método calcularPerimetro
    @Override
    public double calcularPerimetro(){
        return 2 * (largo + ancho);
    }
}

//Clase principal para probar el sistema de figuras
public class SistemaDefiguras {
    public static void main(String[] args){
        Figura circulo = new Circulo(10.0);
        Figura rectangulo = new Rectangulo(12.0, 4.0);
        
        //Circulo
        System.out.println("Area del circulo es: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo es: " + circulo.calcularPerimetro());
        
        //Rectangulo 
        System.out.println("Area del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
    }
}

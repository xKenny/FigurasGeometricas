/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *Clase para calcular los datos de un Cubo
 * @author Duvan Poveda
 */
public class Cubo extends Figura3D{
     private double altura;
    private double base;
    
    public void metodoCubo(){
        System.out.println("Imprimiendo datos del Cubo");
    }
    @Override
    public void pedirDatos() {
        System.out.println("Ingrese la altura de el cubo");
        altura = scanner.nextDouble();
        System.out.println("Ingrese el area de la base de el cubo");
        base = scanner.nextDouble();
        volumen = hallarVolumen();
    } 
    
    @Override
    public double hallarVolumen() { 
        return base * altura;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *Clase que calcula los datos de la piramide
 * @author Duvan Poveda
 */
public class Piramide extends Figura3D{
    
    private double altura;
    private double base;

   public void metodoPiramide(){
        System.out.println("Imprimiendo datos de la piramide");
    }

    @Override
    public void pedirDatos() {
        System.out.println("Ingrese la altura de la piramide");
        altura = scanner.nextDouble();
        System.out.println("Ingrese el area de la base de la piramide");
        base = scanner.nextDouble();
        volumen = hallarVolumen();
    } 
    
    @Override
    public double hallarVolumen() { 
        return (base * altura)/ 3;
    }
}

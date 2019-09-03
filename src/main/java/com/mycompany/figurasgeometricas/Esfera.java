/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *Clase para calcular los datos de una Esfera
 * @author Duvan Poveda
 */
public class Esfera extends Figura3D{

     private double radio;
    
     public void metodoEsfera(){
        System.out.println("Imprimiendo datos de la esfera");
    } 
    @Override
    public void pedirDatos() {
        
        System.out.println("Ingrese el radio de la esfera");
        radio = scanner.nextDouble();
        volumen = hallarVolumen();
    }
    
    @Override
    public double hallarVolumen() {
        return (4*Math.PI*(Math.pow(radio, 3)))/3;
    }
    
}

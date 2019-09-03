/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *Clase para el manejo de figuras en 3D
 * @author Duvan Poveda
 */
public abstract class Figura3D implements Figuras {
    
    public double volumen;
    /**
    *metodo para calcular el volumen de cada figura
    */
    public abstract double hallarVolumen();
    
    @Override
    public void pedirDatos() {
    }

    @Override
    public void imprimirResultados() {
        System.out.println("El volumen es: "+ volumen +"cm3");
    }
  
}

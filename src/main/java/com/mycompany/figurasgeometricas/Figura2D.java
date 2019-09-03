/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *clase Padre para el manejo de figuras en 2D
 * @author Duvan Poveda
 */
public abstract class Figura2D implements Figuras{

    public double area;
    public double perimetro;
    /**
    *metodo para hallar el area de cada figura
    */
    public abstract double hallarArea();
    /**
    *metodo para hallar el perimetro de cada figura
    */   
    public abstract double hallarPerimetro();
    
    @Override
    public void pedirDatos() {
    }

    @Override
    public void imprimirResultados(){
        System.out.println("El area es: "+ area);
        System.out.println("El perimetro es: "+ perimetro);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;
/**
 *Clase para calcular los datos de un circulo
 * @author Duvan Poveda
 */
public class Circulo extends Figura2D{

    private double radio;
   
    public void metodoCirculo(){
        System.out.println("Imprimiendo datos del Circulo");
    } 
    
    @Override
    public void pedirDatos() {
        
        System.out.println("Ingrese el radio del circulo");
        radio = scanner.nextDouble();
        area = hallarArea();
        perimetro = hallarPerimetro();
    }
    
    @Override
    public double hallarArea() {
        return (Math.PI * (Math.pow(radio, 2.0)));
    }

    @Override
    public double hallarPerimetro() {
        return ((Math.PI*2)*radio);
    }
    
}

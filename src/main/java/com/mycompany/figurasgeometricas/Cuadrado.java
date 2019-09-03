/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *Clase para calcular los datos de un Cuadrado
 * @author Duvan Poveda
 */
public class Cuadrado extends Figura2D{

    private double altura;
    private double base;
    /**
    *Este metodo se encarga de definir si es un cuadrado o un rectangulo
    */
    public void metodoCuadrado(){
        if(base!=altura){
        System.out.println("Imprimiendo datos del Cuadrado Rectangulo");
        }else
            System.out.println("Imprimiendo datos del Cuadrado");
    }
    @Override
    public void pedirDatos() {
        System.out.println("Ingrese la altura del cuadrado");
        altura = scanner.nextDouble();
        System.out.println("Ingrese la base del cuadrado");
        base = scanner.nextDouble();
        area = hallarArea();
        perimetro = hallarPerimetro();
    }
    
    
    @Override
    public double hallarArea() {
        return base*altura;
    }

    @Override
    public double hallarPerimetro() {
        return 2*(base+altura);
    }
    
}

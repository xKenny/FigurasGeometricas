/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

/**
 *Clase que calcula los datos del triangulo
 * 
 * @author Duvan Poveda
 */
public class Triangulo extends Figura2D{

    private double altura;
    private double base;
    private double lado1, lado2, lado3;
    
    /**
    *Este metodo se encarga de definir que tipo de triangulo se esta ingresando
    */
    public void metodoTriangulo(){
        if(lado1==lado2 && lado2==lado3){
            System.out.println("Imprimiendo datos del triangulo equilatero");
        }else if(lado1==lado2&&lado2!=lado3||lado2==lado2&&lado3!=lado1|| lado3==lado1 && lado1!=lado2) {
            System.out.println("Imprimiendo datos del triangulo isoceles");   
        }else if(lado1!=lado2&& lado2!=lado3 && lado3!=lado1){
           System.out.println("Imprimiendo datos del triangulo escaleno"); 
        }
          
        
    }
    
    @Override
    public void pedirDatos() {
        System.out.println("Ingrese la altura del triangulo");
        altura = scanner.nextDouble();
        System.out.println("Ingrese la base del triangulo");
        base = scanner.nextDouble();
        System.out.println("Ingrese la longitud del lado 1 del triangulo");
        lado1 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del lado 2 del triangulo");
        lado2 = scanner.nextDouble();
        System.out.println("Ingrese la longitud del lado 3 del triangulo");
        lado3 = scanner.nextDouble();
        area = hallarArea();
        perimetro = hallarPerimetro();
    }

    
    @Override
    public double hallarArea() {
        return (base*altura)/2;
    }

    @Override
    public double hallarPerimetro() {
        return lado1+lado2+lado3;
    }
    
}

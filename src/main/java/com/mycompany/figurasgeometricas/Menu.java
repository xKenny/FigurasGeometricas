/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *Clase que maneja el menu principal para la peticion de datos
 * @author Duvan Poveda
 */
public class Menu {
    
    private List<Figuras> listaFiguras = new ArrayList();
    private final Scanner scanner = new Scanner(System.in);
    /**
    *Metodo que pregunta que tipo de figura desea ingresar el usuario
    */
    public void menuPrincipal(){
    String respuesta = "si";
    short opcion;
        do{
            System.out.println("Que figura desea ingresar?");
            System.out.println("1:Circulo");
            System.out.println("2:Cuadrado");
            System.out.println("3:Triangulo");
            System.out.println("4:Esfera");
            System.out.println("5:Cubo");
            System.out.println("6:Piramide");
            opcion = scanner.nextShort();
            scanner.nextLine();
            guardarFigura(opcion);
            System.out.println("Desea ingresar otra figura? ..(si/no)");
            respuesta = scanner.nextLine();
            
        }while(respuesta.equals("SI")||respuesta.equals("si"));
        imprimirResultados(listaFiguras);
    }
    /**
    *Metodo para guardar la figura en la lista de figuras
    * @param opcion esta es la figura seleccionada por el usuario
    */
    private void guardarFigura(short opcion) {
        
        switch(opcion){
            case 1:
                Figuras circulo = new Circulo();
                circulo.pedirDatos();
                listaFiguras.add(circulo);
                break;
            case 2:
                Figuras cuadrado = new Cuadrado();
                cuadrado.pedirDatos();
                listaFiguras.add(cuadrado);
                break;
            case 3:
                Figuras triangulo = new Triangulo();
                triangulo.pedirDatos();
                listaFiguras.add(triangulo);
                break;
            case 4:
                Figuras esfera = new Esfera();
                esfera.pedirDatos();
                listaFiguras.add(esfera);
                break;
            case 5:
                Figuras cubo = new Cubo();
                cubo.pedirDatos();
                listaFiguras.add(cubo);
                break;
            case 6:
                Figuras piramide = new Piramide();
                piramide.pedirDatos();
                listaFiguras.add(piramide);
                break;
        }
        
    }

    /**
    *Metodo que imprime cada figura que se ha guardado en la lista
    * @param listaFiguras lista de las figuras que ingreso el usuario
    */
    private void imprimirResultados(List<Figuras> listaFiguras) {
        System.out.println("Imprimiendo Resultados: ");
           for (Figuras objetoFigura : listaFiguras) {
            if(objetoFigura instanceof Circulo) {
                ((Circulo) objetoFigura).metodoCirculo();
                ((Circulo) objetoFigura).imprimirResultados();
            } else if (objetoFigura instanceof Cuadrado) {
                ((Cuadrado) objetoFigura).metodoCuadrado();
                ((Cuadrado) objetoFigura).imprimirResultados();
            }  else if (objetoFigura instanceof Triangulo) {
                ((Triangulo) objetoFigura).metodoTriangulo();
                ((Triangulo) objetoFigura).imprimirResultados();
            } else if (objetoFigura instanceof Esfera) {
                ((Esfera) objetoFigura).metodoEsfera();
                ((Esfera) objetoFigura).imprimirResultados();
            }else if (objetoFigura instanceof Cubo) {
                ((Cubo) objetoFigura).metodoCubo();
                ((Cubo) objetoFigura).imprimirResultados();
            }else if (objetoFigura instanceof Piramide) {
                ((Piramide) objetoFigura).metodoPiramide();
                ((Piramide) objetoFigura).imprimirResultados();
            }
        }
    }
}

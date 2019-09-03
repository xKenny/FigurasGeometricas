/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figurasgeometricas;

import java.util.Scanner;

/**
 *Interfaz para los metodos y variables en comun de cada tipo de figuras
 * @author Duvan Poveda
 */
public interface Figuras {
    
    Scanner scanner = new Scanner(System.in);
    /**
    *Metodo para pedir los datos requeridos de cada figura
    */
    public void pedirDatos();
     /**
    *Metodo para imprimir los resultados de cada figura
    */
    public void imprimirResultados();
}

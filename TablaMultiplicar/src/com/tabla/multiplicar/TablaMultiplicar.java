/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tabla.multiplicar;

/**
 *
 * @author loren
 */
public class TablaMultiplicar {
    public static void main(String[]args){
    int num = 1;    
    
    System.out.println("Tabla de multiplicar del " + num);
    for (int i = 1; i <= 12; i++) {
    System.out.println(num + " x " + i + " = " + (num * i));
    }
    }
}

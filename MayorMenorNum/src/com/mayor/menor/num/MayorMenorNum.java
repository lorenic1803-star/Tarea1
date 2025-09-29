/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mayor.menor.num;

/**
 *
 * @author loren
 */
public class MayorMenorNum {
    public static void main(String[]args){
    int num1 = 1; 
    int num2= 2;
    if(num1>num2){
       System.out.println("El numero " + num1 +" es el mayor, y por lo tanto el numero " + num2 + " es el menor");  
       }
    else if(num1<num2){
        System.out.println("El numero " + num2 +" es el mayor, y por lo tanto el numero " + num1 + " es el menor");
       }
    else {
       
        System.out.println("Ambos numeros son iguales");
       }
    }
}

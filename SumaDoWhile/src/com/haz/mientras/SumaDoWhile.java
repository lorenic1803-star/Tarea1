/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haz.mientras;

/**
 *
 * @author loren
 */
public class SumaDoWhile {
    public static void main(String[]args){
	int i=0;
        int sum=0;
        do{
        i++;
        sum+=i;
        }while(i<50);
        System.out.println("La suma total es:"+ sum);

    }
    
}

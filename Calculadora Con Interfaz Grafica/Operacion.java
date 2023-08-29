/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora3;

/**
 *
 * @author ALEJANDRO
 */
public class Operacion {
    
   public static double suma (double a, double b){
       return a+b;
   }
   
   public static double resta (double a, double b){
       return a-b;
       
   }
   public static double multi (double a, double b){
       return a*b;
       
   }
   public static double divi (double a, double b){
     
      return  a/b; 
   }
   public static double sen (double a){  //Angulo a en grados sexagecimale
       return Math.sin(Math.toRadians(a));
   }
   public static double cos(double a){
       return Math.cos(Math.toRadians(a));
       
   }
   public static double tangente(double a){
       return Math.tan(Math.toRadians(a));
   }
   
   public static double potencia (double a, double b){
       return Math.pow(a,b);
   }
   
   public static double raiz(double a, double b){
       return Math.pow(a,(1/b));
   }
   
   
   
    
    
    
}

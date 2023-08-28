/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora3;

import IGU.Interfaz;
import java.util.Scanner;

/**
 *
 * @author ALEJANDRO
 */
public class Calculadora3  extends javax.swing.JFrame{

    double num1;
    double num2; 
    double resultado;
    
 /* public Calculadora3(double valor1, double valor2){
    
        num1= valor1;
        num2= valor2;
        
    
} */
   public static void main(String[] args) throws InterruptedException {

        Scanner s = new Scanner(System.in);
        Interfaz inte= new Interfaz();
        inte.setVisible(true);
        inte.setLocationRelativeTo(null);
        
        
        
   }
   
     public double suma(double v1, double v2) {
       
       resultado=num1+num2;
       return resultado;
      
       
   }


        

    
}


/*public class suma extends javax.swing.JFrame{
    Interfaz inter= new Interfaz();
        double resultado2;

       double operacion(double valor1, double valor2) {
            resultado2 = valor1 + valor2;
            return resultado2;

        }

    }*/

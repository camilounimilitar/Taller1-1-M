/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora3;


import java.util.Scanner;

/**
 *
 * @author ALEJANDRO
 */
public class Calculadora3  extends javax.swing.JFrame{

    Scanner s = new Scanner(System.in);
        int opcion;
        int num1;
        int num2;
        double resultado;
        float resultado2;
        float num3;
        float num4;
        double grados;
        double num5;
        double num6;
        double radianes;
        double resultado3;


        do {


            System.out.println("\nElija una opcion \n1.Suma \n2.resta \n3.multiplicacion \n4.Division \n5.salir \n6.Seno en grados \n7.Coseno en grados \n8.Tangente \n9.Raiz enesima \n10.Potencia enesima \n11.Iva ");
            opcion = s.nextInt();
            while (opcion < 0 || opcion > 11) {
                System.out.println("Opcion invalida elija una de las siguientes: ");
                System.out.println("\nElija una opcion \n1.Suma \n2.resta \n3.multiplicacion \n4.Division \n5.salir \n6.Seno en grados  \n7.Coseno En Grados \n8.Tangente \n9.Raiz enesima \n10.Potencia enesima \n11.Iva");
                opcion = s.nextInt();
            }

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el primer valor a sumar ");
                    num5 = s.nextInt();
                    System.out.println("Ingrese el segundo valor a sumar ");
                    num6 = s.nextInt();
                    resultado = Operacion.suma(num5, num6);
                    System.out.println("el resultado es: " + resultado);
                    //Thread.sleep(5000);
                    break;


                }
                case 2: {
                    System.out.println("Ingrese el primer valor a restar ");
                    num5 = s.nextInt();
                    System.out.println("Ingrese el segundo valor a restar ");
                    num6 = s.nextInt();
                    resultado = Operacion.resta(num5, num6);
                    System.out.println("El resultado es: " + resultado);
                    //Thread.sleep(5000);
                    break;


                }
                case 3: {
                    System.out.println("Ingrese el primer valor ");
                    num5 = s.nextInt();
                    System.out.println("Ingrese el segundo valor ");
                    num6 = s.nextInt();
                    resultado = Operacion.multi(num5, num6);
                    System.out.println("El resultado es: " + resultado);
                    //Thread.sleep(5000);
                    break;

                }
                case 4: {

                    System.out.println("Ingrese el dividendo ");
                    num5 = s.nextInt();
                    System.out.println("Ingrese el divisor ");
                    num6 = s.nextInt();
                    while (num6 == 0) {

                        System.out.println("Division por cero no admitida");
                        System.out.println("Ingrese un nuevo divisor ");
                        num6 = s.nextInt();


                    }
                    resultado = Operacion.divi(num5, num6);
                    System.out.println("El resultado de dividir " + num5 + " entre " + num6 + " es: " + resultado);
                    //Thread.sleep(5000);
                    break;


                }
                case 6: {

                    System.out.println("Ingrese un valor para calcular el seno ");
                    grados = s.nextDouble();
                    System.out.println(grados);
                    radianes = Math.toRadians(grados);
                    System.out.println(radianes);
                    resultado3 = Seno.operacion(radianes);
                    System.out.println(resultado3);
                    //grados2 = //Math.toDegrees(resultado3);
                    System.out.println(resultado3);
                    System.out.println("El seno de " + grados + " es: " + resultado3);
                    //Thread.sleep(5000);
                    break;


                }
                case 7: {
                    System.out.println("Ingrese el angulo en grados ");
                    grados = s.nextDouble();
                    radianes = Math.toRadians(grados);
                    resultado3 = coseno.operacion(radianes);
                    System.out.println("El coseno de " + grados + " es: " + resultado3);
                    //Thread.sleep(5000);
                    break;


                }

                case 8: {

                    System.out.println("Ingrese el angulo en grados");
                    grados = s.nextDouble();
                    radianes = Math.toRadians(grados);



                    /*while (Math.cos(Math.toRadians(90))==Math.cos(radianes)){
                        System.out.println("Ingrese el angulo en grados");
                        grados = s.nextDouble();
                        radianes = Math.toRadians(grados);

                    }*/
                   resultado3=tangente.operacion(radianes);


                   Thread.sleep(5000);
                    break;

                }

                case 9: {
                    System.out.println("Ingrese el valor del radicando: ");
                    num5 = s.nextDouble();
                    while (num5 < 0) {
                        System.out.println("No se puede calcular el valor de un radicando negativo ");
                        System.out.println("Ingrese un nuevo valor del radicando: ");
                        num5 = s.nextDouble();


                    }
                    System.out.println("Ingrese el valor del indice de la raiz ");
                    num6 = s.nextDouble();
                    resultado3 = raiz.operacion(num5, num6);
                    System.out.println("La raiz " + num6 + " de " + num5 + " es: " + resultado3);
                    Thread.sleep(5000);
                    break;


                }

                case 10: {
                    System.out.println("Ingrese la base");
                    num5 = s.nextDouble();
                    System.out.println("Ingrese el exponente ");
                    num6 = s.nextDouble();

                    resultado3 = potencia.operacion(num5, num6);
                    System.out.println("El resultado es: " + resultado3);
                    Thread.sleep(5000);
                    break;


                }

                case 11: {
                    System.out.println("Ingrese una cantidad para calcular el iva ");
                    num5 = s.nextDouble();

                    System.out.println("Ingrese el valor del iva ");
                    num6 = s.nextDouble();

                    resultado3 = iva.operacion(num5, num6);

                    System.out.println("El iva es: " + resultado3);
                    Thread.sleep(5000);
                    break;


                }


            }

        } while (opcion != 5);


    

        

    
}*/
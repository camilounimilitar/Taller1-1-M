import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int opcion;
        int num1;
        int num2;
        int resultado;
        float resultado2;
        float num3;
        float num4;
        double grados;
        double num5;
        double num6;
        double radianes;
        double resultado3;


        do {


            System.out.println("Elija una opcion \n1.Suma \n2.resta \n3.multiplicacion \n4.Division \n5.salir \n6.Seno en grados \n7.Coseno en grados \n8.Tangente \n9.Raiz enesima ");
            opcion = s.nextInt();
            while (opcion < 0 || opcion > 9) {
                System.out.println("Opcion invalida elija una de las siguientes: ");
                System.out.println("Elija una opcion \n1.Suma \n2.resta \n3.multiplicacion \n4.Division \n5.salir \n6.Seno en grados  \n7.Coseno En Grados \n8.Tangente \n9.Raiz enesima ");
                opcion = s.nextInt();
            }

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el primer valor a sumar ");
                    num1 = s.nextInt();
                    System.out.println("Ingrese el segundo valor a sumar ");
                    num2 = s.nextInt();
                    resultado = suma.operacion(num1, num2);
                    System.out.println("el resultado es: " + resultado);
                    break;


                }
                case 2: {
                    System.out.println("Ingrese el primer valor a restar ");
                    num1 = s.nextInt();
                    System.out.println("Ingrese el segundo valor a restar ");
                    num2 = s.nextInt();
                    resultado = resta.operacion(num1, num2);
                    System.out.println("El resultado es: " + resultado);
                    break;


                }
                case 3: {
                    System.out.println("Ingrese el primer valor ");
                    num1 = s.nextInt();
                    System.out.println("Ingrese el segundo valor ");
                    num2 = s.nextInt();
                    resultado = multi.operacion(num1, num2);
                    System.out.println("El resultado es: " + resultado);

                }
                case 4: {

                    System.out.println("Ingrese el dividendo ");
                    num3 = s.nextInt();
                    System.out.println("Ingrese el divisor ");
                    num4 = s.nextInt();
                    resultado2 = Divi.operacion(num3, num4);
                    System.out.println("El resultado de dividir " + num3 + " entre " + num4 + " es: " + resultado2);


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
                    break;


                }
                case 7: {
                    System.out.println("Ingrese el angulo en grados ");
                    grados = s.nextDouble();
                    radianes = Math.toRadians(grados);
                    resultado3 = coseno.operacion(radianes);
                    System.out.println("El coseno de " + grados + " es: " + resultado3);
                    break;


                }

                case 8:{

                    System.out.println("Ingrese el angulo en grados");
                    grados=s.nextDouble();
                    radianes=Math.toRadians(grados);
                    resultado3=tangente.operacion(radianes);
                    System.out.println("La tangebte de " + grados + " es: " + resultado3);
                    break;

                }

                case 9 :{
                    System.out.println("Ingrese el valor del radicando: ");
                    num5=s.nextDouble();
                    System.out.println("Ingrese el valor del indice de la raiz ");
                    num6=s.nextDouble();
                    resultado3=raiz.operacion(num5,num6);
                    System.out.println("La raiz " + num6 + " de " + num5 +" es: " + resultado3);




                }

                case 10:{
                    


                }

            }

        } while (opcion != 5);


    }

    static class suma {
        private static int resultado2;

        public static int operacion(int valor1, int valor2) {
            resultado2 = valor1 + valor2;
            return resultado2;

        }

    }

    static class resta {
        private static int resultado3;

        public static int operacion(int valor1, int valor2) {

            resultado3 = valor1 - valor2;
            return resultado3;

        }


    }

    static class multi {
        private static int resultado4;

        public static int operacion(int valor1, int valor2) {
            resultado4 = valor1 * valor2;
            return resultado4;
        }


    }

    static class Divi {
        private static float resultado5;

        public static float operacion(float valor1, float valor2) {

            resultado5 = valor1 / valor2;
            return resultado5;


        }


    }

    static class Seno {
        private static double resultado4;

        public static double operacion(double valor1) {
            resultado4 = Math.sin(valor1);
            return resultado4;
        }

    }


    static class coseno {
        private static double resultado5;

        private static double operacion(double valor1) {
            resultado5 = Math.cos(valor1);
            return resultado5;
        }
    }

    private static class tangente{

        private static double resultado6;

        private static double operacion(double valor1) {
            resultado6=Math.tan(valor1);
            return resultado6;


    }



    }

    private  static  class raiz{
        private  static double resultado7;

        private static double operacion(double valor1,double valor2){

        resultado7=Math.pow(valor1,1/valor2);

        return resultado7;

        }


    }


    private  static class  potencia{
        private static  double resultado8;

        private static double operacion(int valor1, int valor2){



        }


    }





}

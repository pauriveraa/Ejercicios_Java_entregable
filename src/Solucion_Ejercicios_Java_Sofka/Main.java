package Solucion_Ejercicios_Java_Sofka;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean confirmacion =true;

        while (confirmacion){
            Scanner pregunta = new Scanner(System.in);
            System.out.println("'\n Digite si para comparar dos numeros o no para salir del programa:  ");
            String respuesta = pregunta.nextLine();

            if(respuesta.equals("si")){
                Scanner entrada = new Scanner(System.in);
                double primero;
                System.out.println("Digite el primer numero a comparar: ");
                primero = entrada.nextDouble();

                Scanner entrada2 = new Scanner(System.in);
                double segundo;
                System.out.println("Digite el segundo numero a comparar: ");
                segundo = entrada2.nextDouble();

                Numero_Mayor M_Q;
                M_Q = new Numero_Mayor(primero,segundo);
                M_Q.Mayor();
            }
            else if(respuesta.equals("no")){
                confirmacion = false;
            }
            else{

            }
        }

    }
}

package Solucion_Ejercicios_Java_Sofka;

public class Numero_Mayor {
    private double x;
    private double y;

    public Numero_Mayor(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void Mayor(){
        if(x>y){
            System.out.println("El numero " + x + " es " + "mayor que " + y + ".");
        }
        else {
            System.out.println("El numero " + y + " es " + "mayor que " + x + ".");
        }
    }
}

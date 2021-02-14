package Solucion_Ejercicios_Java_Sofka;

public class Numero_Mayor_Menor_Igual {
    private double x;
    private double y;

    public Numero_Mayor_Menor_Igual(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void Mayor() {
        if (x > y) {
            System.out.println("El numero " + x + " es " + "mayor que " + y + ".");
        } else if (x < y) {
            System.out.println("El numero " + x + " es " + "menor que " + y + ".");
        } else {
            System.out.println(x + " es igual a " + x + ".");
        }
    }
}

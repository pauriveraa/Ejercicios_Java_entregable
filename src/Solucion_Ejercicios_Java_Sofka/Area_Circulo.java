package Solucion_Ejercicios_Java_Sofka;

public class Area_Circulo {

    private static final double PI = 3.14159265;
    private double radio;
    private double area;

    public Area_Circulo(double radio){
        this.radio = radio;
    }

    public void Area(){
        area = PI* Math.pow(radio,2);
        System.out.println("El área del circulo de radio " + radio + " es: " + area);
    }
}

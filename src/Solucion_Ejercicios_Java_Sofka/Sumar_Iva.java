package Solucion_Ejercicios_Java_Sofka;

public class Sumar_Iva {

    private static final double IVA = 0.21;
    private double precio;

    public Sumar_Iva(double precio){
        this.precio = precio;
    }

    public void Precio_Final(){
        precio += precio * IVA;
        System.out.println("El precio final del producto con Iva incluido es de:  $" + precio + ".");
    }

}


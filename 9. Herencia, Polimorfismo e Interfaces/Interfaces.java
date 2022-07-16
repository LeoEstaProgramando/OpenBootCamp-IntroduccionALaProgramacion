//Interfaces nos da una serie de funciones que deben ser implementadas sí o sí en las clases.

public class Interfaces {
    
    public static void main(String[] args) {}

}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){

    }

    public void Frenar(int cuantaVelocidad){

    }
}
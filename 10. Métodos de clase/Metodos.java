public class Metodos {

    public static void main(String[] args){
        
        Coche coche = new Coche();
        Moto moto = new Moto();

        coche.Acelerar(50);
        coche.Frenar(20);
        
        EjecutaAcelerar(coche);
        EjecutaAcelerar(moto);
    }

    public static void EjecutaAcelerar(Vehiculo vehiculo){
        vehiculo.Acelerar(15);
    }
}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {

    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche() -> Acelerar()" + cuantaVelocidad);
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Coche() -> Frenar()" + cuantaVelocidad);
    }
}

class Moto implements Vehiculo {

    public void Acelerar(int cuantaVelocidad){
        System.out.println("Moto() -> Acelerar()" + cuantaVelocidad);
    }

    public void Frenar(int cuantaVelocidad) {
        System.out.println("Moto() -> Frenar()" + cuantaVelocidad   );
    }
}
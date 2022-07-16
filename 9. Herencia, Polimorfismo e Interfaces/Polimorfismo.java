//Polimorfismo es cuando las clases hijas sobreescriben las mismas funciones de la clase Padre.
//Poliformismo es igual a sobreescritura de métodos.

public class Polimorfismo{

    public static void main(String[] args){
        Coche coche = new Coche();
        coche.diHola();
    }
}

class Vehiculo {
    public void diHola(){
        System.out.println("Hola!");
    }
}

class Coche extends Vehiculo {
    public void diHola(){
        System.out.println("Soy un coche");
    }
}
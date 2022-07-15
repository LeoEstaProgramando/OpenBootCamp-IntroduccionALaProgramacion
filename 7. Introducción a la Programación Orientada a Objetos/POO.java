public class POO {

	public static void main(String[] args) {
		Coche coche = new Coche(); //instanciar nuevo objeto
		System.out.println(coche.numeroDePuertas);
		System.out.println(coche.velocidadMaxima);
		System.out.println(coche.velocidadActual);
		coche.acelerar();
		System.out.println(coche.velocidadActual);

		Coche coche2 = new Coche(2, 90); //instanciar nuevo objeto
		System.out.println(coche2.numeroDePuertas);
		System.out.println(coche2.velocidadMaxima);
		System.out.println(coche2.velocidadActual);
		coche2.desacelerar();
		System.out.println(coche2.velocidadActual);
	}
}

class Coche {
	int numeroDePuertas;
	int velocidadMaxima;
	float velocidadActual;
	
	public Coche() {
		numeroDePuertas = 5;
		velocidadMaxima = 120;
		System.out.println("Estoy en el constructor sin parámetros");
	}

	public Coche(int puertas, int velocidad) {
		numeroDePuertas = puertas;
		velocidadMaxima = velocidad;
		System.out.println("Estoy en el constructor con parámetros");
	}

	public void acelerar() {
		velocidadActual += 15;
	}

	public void desacelerar() {
		velocidadActual -= 15;
	}
}
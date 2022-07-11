public class Segundo {
    public static void main(String[] args) {
		coche miCoche = new coche();
		miCoche.AumentarPuerta();
		System.out.println(miCoche.puertas);
	}
}

class coche {
	public int puertas = 0;

	public void AumentarPuerta() {
		this.puertas++;
	}
}
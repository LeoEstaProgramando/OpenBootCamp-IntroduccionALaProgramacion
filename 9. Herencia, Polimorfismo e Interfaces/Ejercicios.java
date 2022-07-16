public class Ejercicios {

    public static void main(String[] args) {

        System.out.println("///////CLIENTE///////");

        Cliente cliente = new Cliente();


        cliente.setEdad(24);
        cliente.setNombre("Leonardo");
        cliente.setTelefono(947186998);
        cliente.setCredito(1500);

        System.out.println("La edad del clientes es: " + cliente.getEdad());
        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("El telefono del cliente es: " + cliente.getTelefono());
        System.out.println("El credito del cliente es: " + cliente.getCredito());

        System.out.println("///////TRABAJADOR///////");

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(18);
        trabajador.setNombre("Roman");
        trabajador.setTelefono(956848651);
        trabajador.setSalario(930);

        System.out.println("La edad del trabajador es: " + trabajador.getEdad());
        System.out.println("El nombre del trabajador es: " + trabajador.getNombre());
        System.out.println("El telefono del trabajador es: " + trabajador.getTelefono());
        System.out.println("El salario del trabajador es: " + trabajador.getSalario());
    }
}

class Persona {
    
    int edad;
    String nombre;
    int telefono;
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return telefono;
    }

}

class Cliente extends Persona {
    
    double credito;

    public void setCredito(double credito){
        this.credito = credito;
    }

    public double getCredito(){
        return credito;
    }
}

class Trabajador extends Persona {

    double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
}
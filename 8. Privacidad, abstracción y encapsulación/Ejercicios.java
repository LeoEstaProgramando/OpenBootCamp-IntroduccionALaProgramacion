public class Ejercicios {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(24);
        persona.setNombre("Leo");
        persona.setTelefono(947186998);

        System.out.println("Tu edad en años es: " + persona.getEdad());
        System.out.println("Tu nombre es: " + persona.getNombre());
        System.out.println("Tu telefono es: " + persona.getTelefono());
    }
}

class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public int getTelefono(){
        return telefono;
    }
}
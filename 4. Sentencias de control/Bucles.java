public class Bucles {
    
    public static void main(String[] args){
        
        //Bucle While

        int contador1 = 5;

        while (contador1>0){
            System.out.println(contador1);
            contador1 = contador1 - 1;
        }
    
        // Bucle Do While

        int contador2 = 5;

        do {
            System.out.println(contador2);
            contador2 = contador2 -1;
        } while (contador2>0);

        //Bucle For

        int valores[] = {10, 20, 30, 40, 50};

        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

        //Switch case

        var hoy_es = "SABADO";

        switch (hoy_es){
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Hoy es laborable");
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("Hoy no es laborable");
                break;
            default:
                System.out.println("Hoy es" + hoy_es);
        }
    }
}

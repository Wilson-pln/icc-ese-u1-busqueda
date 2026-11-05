import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 28, "F")
        );

        //1.Busque una persona con mombre "Maria"
        //RETORNE LA PERSONA SI LO ENCONTRO
        //2. BUSQUE UNA PERSONA CON NOMBRE "DIEGO"
        //RETORNE LA PERSONA SI LO ENCONTRO
        //3. BUSQUE UNA PERSONA CON NOMBRE ANA
        //IMPRIMA LA POSICION DE LA PERSONA SI LO ENCONTRO

        BusquedaLineal busqueda = new BusquedaLineal(personas);

         Persona persona1 = busqueda.findByName("Maria");

        if (persona1 != null) {
            System.out.println("Persona encontrada:");
            System.out.println(persona1);
        } else {
            System.out.println("Maria no fue encontrada");
        }
    }

    
}

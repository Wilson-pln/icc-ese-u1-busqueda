import java.util.List;

import models.Persona;

public class BusquedaLineal {
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas) {
        this.personas = personas;
    } 

    // Busqueda una persona
    //Reorne la persona si lo encuentra 
    //retorne --NULL-- si no lo encuentra

    public Persona findByName(String name){
        for (int i = 0; i < personas.size(); i++){
            if(personas.get(i).getNombre().equals(name)){
                return personas.get(i);
            }
        }
        return null;
    }

    // Busqueda LA POS DE UNA PERSONA
    //Reorne la persona si lo encuentra 
    //retorne ___-1____si no lo encuentra

    public int findPosByName(String name){
        //for (Persona persona : personas){
          //  if (persona.getNombre().equals(name))
            //return personas.indexOf(persona);
          for (int i = 0; i < personas.size(); i++) {

            if (personas.get(i).getNombre().equals(name)) {
                return i;
            }
        }

        return -1;
    }
}


package Clases;
import java.util.ArrayList;
import java.util.List;

public class Compañia {
    private String nombre;
    private int capacidad;
    private List<Object> ObjetosCreados;
    private int PersonasHoy;
   

    public Compañia(String nombre, int capacidad, int PersonasHoy) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.PersonasHoy = PersonasHoy;
        this.ObjetosCreados = new ArrayList<>();
    }

    // Métodos getters y setters para nombre, capacidad, PersonasHoy
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPersonasHoy() {
        return PersonasHoy;
    }

    public void setPersonasHoy(int PersonasHoy) {
        this.PersonasHoy = PersonasHoy;
    }


    public void escogerSede() {
        
        //falta esto
    }
}


package Clases;
import java.util.ArrayList;
import java.util.List;

public class Compañia {
    private String nombre;
    private int capacidad;
    private List<Object> ObjetosCreados;
    private int PersonasHoy;
    private int PrecioporKG;

    public Compañia(String nombre, int capacidad, int PersonasHoy, int PrecioporKG) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.PersonasHoy = PersonasHoy;
        this.PrecioporKG = PrecioporKG;
        this.ObjetosCreados = new ArrayList<>();
    }

    // Métodos getters y setters para nombre, capacidad, PersonasHoy y PrecioporKG
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

    public int getPrecioporKG() {
        return PrecioporKG;
    }

    public void setPrecioporKG(int PrecioporKG) {
        this.PrecioporKG = PrecioporKG;
    }

   
    public void escogerSede() {
        
        //falta esto
    }
}

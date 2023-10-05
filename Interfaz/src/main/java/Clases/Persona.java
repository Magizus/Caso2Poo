package Clases;


public class Persona {
    
    private String TipoR;
    private int capacidad;

    public String getTipoR() {
        return TipoR;
    }

    public void setTipoR(String TipoR) {
        this.TipoR = TipoR;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Resto de los métodos getters y setters...

    @Override
    public String toString() {
        return "Persona{" + "TipoR=" + TipoR + ", capacidad=" + capacidad + '}';
    }
}
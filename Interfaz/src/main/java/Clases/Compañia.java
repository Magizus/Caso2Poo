
package Clases;

public class Compañia {
    private String Tipo;
    private int capacidad;
    private int Treciclado;
   

    public Compañia(String nombre, int capacidad) {
        this.Tipo = nombre;
        this.capacidad = capacidad;
        
    }

    public Compañia() {
    // Constructor sin parámetros
}
    
    // Métodos getters y setters para nombre y capacidad
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getTreciclado() {
        return Treciclado;
    }

    public void setTreciclado(int Treciclado) {
        this.Treciclado = Treciclado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    

}


package Clases;

public class Persona {
    private int Cantidad;
    private String TipoR;

    public Persona(int Cantidad, String TipoR) {
        this.Cantidad = Cantidad;
        this.TipoR = TipoR;
    }

    // Métodos getters y setters para Cantidad y TipoR
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTipoR() {
        return TipoR;
    }

    public void setTipoR(String TipoR) {
        this.TipoR = TipoR;
    }
}
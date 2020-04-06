package co.com.choucair.reto.model;

public class UnidadDeNegocio {

    private String nombre;
    private String unidadPadre;

    public String getNombre() {
        return nombre;
    }

    public String getUnidadPadre() {
        return unidadPadre;
    }

    @Override
    public String toString() {
        return "UnidadDeNegocio{" +
                "nombre='" + nombre + '\'' +
                ", unidadPadre='" + unidadPadre + '\'' +
                '}';
    }
}

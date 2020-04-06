package co.com.choucair.reto.model;

public class Reunion {

    private String nombre;
    private String tipo;
    private String fechaInicio;
    private String horaInicio;
    private String fechaFin;
    private String horaFin;
    private String ubicacion;
    private String unidad;
    private String organizadaPor;
    private String reportero;
    private String asistentes;

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getOrganizadaPor() {
        return organizadaPor;
    }

    public String getReportero() {
        return reportero;
    }

    public String getAsistentes() {
        return asistentes;
    }

    @Override
    public String toString() {
        return "Reunion{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", unidad='" + unidad + '\'' +
                '}';
    }
}

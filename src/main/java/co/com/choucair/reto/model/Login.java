package co.com.choucair.reto.model;

public class Login {

    private String usuario;
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public String toString() {
        return "Login{" +
                "usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}

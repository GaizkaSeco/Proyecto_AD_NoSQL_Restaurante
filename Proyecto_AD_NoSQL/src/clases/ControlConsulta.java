package clases;

import java.io.Serializable;

public class ControlConsulta implements Serializable {
    String usuario;
    String fecha;
    String sentecia;

    public ControlConsulta(String usuario, String fecha, String sentecia) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.sentecia = sentecia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSentecia() {
        return sentecia;
    }

    public void setSentecia(String sentecia) {
        this.sentecia = sentecia;
    }
}

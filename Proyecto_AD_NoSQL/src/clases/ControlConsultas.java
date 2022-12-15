package clases;

import javax.crypto.SecretKey;
import java.io.Serializable;

public class ControlConsultas implements Serializable {
    String usuario;
    String fecha;
    String sentecia;

    public ControlConsultas(String usuario, String fecha, String sentecia) {
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

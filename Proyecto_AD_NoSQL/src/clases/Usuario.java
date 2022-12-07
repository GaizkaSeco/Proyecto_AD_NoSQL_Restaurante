package clases;

public class Usuario {
    int id;
    String nombre;
    boolean login;

    public Usuario(int id, String nombre, boolean login) {
        this.id = id;
        this.nombre = nombre;
        this.login = login;
    }

    public Usuario(boolean login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}

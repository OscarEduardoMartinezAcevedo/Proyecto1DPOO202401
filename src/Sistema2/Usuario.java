package Sistema2;

public abstract class Usuario {
    private int idUsuario;
    private String nombre;
    private int telefono;
    private String correo;
    private String login;
    private String password;

    public Usuario(int idUsuario, String nombre, int telefono, String correo, String login, String password) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.login = login;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
   
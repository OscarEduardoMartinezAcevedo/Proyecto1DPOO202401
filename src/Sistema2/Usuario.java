package Sistema2;

public abstract class Usuario {
	public int idUsuario;
	public String Nombre;
	public int Telefono;
	public String Correo;
	public String Login;
	public String Password;
	public Usuario(int idUsuario, String nombre, int telefono, String correo, String login, String password) {
		super();
		this.idUsuario = idUsuario;
		Nombre = nombre;
		Telefono = telefono;
		Correo = correo;
		Login = login;
		Password = password;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	

}

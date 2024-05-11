package Sistema2;

public class Empleado extends Usuario{
	public String nuevaUbicacion;

	public Empleado(int idUsuario, String nombre, int telefono, String correo, String login, String password,
			String nuevaUbicacion) {
		super(idUsuario, nombre, telefono, correo, login, password);
		this.nuevaUbicacion = nuevaUbicacion;
	}

	public String getNuevaUbicacion() {
		return nuevaUbicacion;
	}

	public void setNuevaUbicacion(String nuevaUbicacion) {
		this.nuevaUbicacion = nuevaUbicacion;
	}
	

}

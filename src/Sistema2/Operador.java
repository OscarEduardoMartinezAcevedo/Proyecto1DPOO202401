package Sistema2;

public class Operador extends Usuario{
	public int nuevaOferta;

	public Operador(int idUsuario, String nombre, int telefono, String correo, String login, String password,
			int nuevaOferta) {
		super(idUsuario, nombre, telefono, correo, login, password);
		this.nuevaOferta = nuevaOferta;
	}

	public int getNuevaOferta() {
		return nuevaOferta;
	}

	public void setNuevaOferta(int nuevaOferta) {
		this.nuevaOferta = nuevaOferta;
	}
	

}

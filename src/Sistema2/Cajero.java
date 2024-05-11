package Sistema2;

public class Cajero extends Usuario{
	public boolean pagoRealizado;

	public Cajero(int idUsuario, String nombre, int telefono, String correo, String login, String password,
			boolean pagoRealizado) {
		super(idUsuario, nombre, telefono, correo, login, password);
		this.pagoRealizado = pagoRealizado;
	}

	public boolean isPagoRealizado() {
		return pagoRealizado;
	}

	public void setPagoRealizado(boolean pagoRealizado) {
		this.pagoRealizado = pagoRealizado;
	}
	

}

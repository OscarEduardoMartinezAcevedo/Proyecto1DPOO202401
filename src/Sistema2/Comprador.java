package Sistema2;

public class Comprador extends Usuario{
	public boolean Compras;
	public int valorMaximoCompras;
	public boolean fondosSuficientes;
	public Comprador(int idUsuario, String nombre, int telefono, String correo, String login, String password,
			boolean compras, int valorMaximoCompras, boolean fondosSuficientes) {
		super(idUsuario, nombre, telefono, correo, login, password);
		Compras = compras;
		this.valorMaximoCompras = valorMaximoCompras;
		this.fondosSuficientes = fondosSuficientes;
	}
	public boolean isCompras() {
		return Compras;
	}
	public void setCompras(boolean compras) {
		Compras = compras;
	}
	public int getValorMaximoCompras() {
		return valorMaximoCompras;
	}
	public void setValorMaximoCompras(int valorMaximoCompras) {
		this.valorMaximoCompras = valorMaximoCompras;
	}
	public boolean isFondosSuficientes() {
		return fondosSuficientes;
	}
	public void setFondosSuficientes(boolean fondosSuficientes) {
		this.fondosSuficientes = fondosSuficientes;
	}
	

}

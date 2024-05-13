package Sistema1;

public class Fotografia extends Pieza{
	public String Formato;
	public String Tamanio;
	public Fotografia(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion, String formato, String tamanio) {
		super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
		Formato = formato;
		Tamanio = tamanio;
	}
	public String getFormato() {
		return Formato;
	}
	public String getTamanio() {
		return Tamanio;
	}
	

	public Fotografia registrarPieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion, String formato, String tamanio) {
		idPieza=Pieza.generarID();
		return new Fotografia(titulo,anio,lugarCreacion,idPieza,estadoPieza,autor,
			propietario,ubicacion,formato,tamanio);
	}

}

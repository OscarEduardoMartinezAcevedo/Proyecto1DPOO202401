package Sistema1;

public class Pintura extends Pieza{
	public double Alto;
	public double Ancho;
	public String Tecnica;
	public String Materiales;

	public Pintura(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion, double alto, double ancho, String tecnica, String materiales) {
		super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
		Alto = alto;
		Ancho = ancho;
		Tecnica = tecnica;
		Materiales = materiales;
	}

	public double getAlto() {
		return Alto;
	}

	public double getAncho() {
		return Ancho;
	}

	public String getTecnica() {
		return Tecnica;
	}

	public String getMateriales() {
		return Materiales;
	}
	

	
	public Pintura registrarPieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion, double alto, double ancho, String tecnica, String materiales) {
		idPieza=Pieza.generarID();
		return new Pintura(titulo,anio,lugarCreacion,idPieza,estadoPieza,autor,
			propietario,ubicacion,alto,ancho,tecnica,materiales);
	}
	

}

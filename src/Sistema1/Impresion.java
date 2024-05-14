package Sistema1;

public class Impresion extends Pieza{
	public double Alto;
	public double Ancho;
	public String Materiales;
	public String detallesInstalacion;
	public Impresion(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion, double alto, double ancho, String materiales,
			String detallesInstalacion) {
		super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
		Alto = alto;
		Ancho = ancho;
		Materiales = materiales;
		this.detallesInstalacion = detallesInstalacion;
	}
	public double getAlto() {
		return Alto;
	}
	public double getAncho() {
		return Ancho;
	}
	public String getMateriales() {
		return Materiales;
	}
	public String getDetallesInstalacion() {
		return detallesInstalacion;
	}
	

	
	public Impresion registrarPieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion, double alto, double ancho, String materiales,
			String detallesInstalacion) {
		idPieza=Pieza.generarID();
		return new Impresion(titulo,anio,lugarCreacion,idPieza,estadoPieza,autor,
			propietario,ubicacion,alto,ancho,materiales,detallesInstalacion);
	}

}

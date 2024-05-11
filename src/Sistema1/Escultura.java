package Sistema1;

public class Escultura extends Pieza{
	public double Alto;
	public double Ancho;
	public double Profundidad;
	public String Materiales;
	public double Peso;
	public String detallesInstalacion;
	public Escultura(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion, double alto, double ancho, double profundidad, String materiales,
			double peso, String detallesInstalacion) {
		super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
		Alto = alto;
		Ancho = ancho;
		Profundidad = profundidad;
		Materiales = materiales;
		Peso = peso;
		this.detallesInstalacion = detallesInstalacion;
	}
	public double getAlto() {
		return Alto;
	}
	public double getAncho() {
		return Ancho;
	}
	public double getProfundidad() {
		return Profundidad;
	}
	public String getMateriales() {
		return Materiales;
	}
	public double getPeso() {
		return Peso;
	}
	public String getDetallesInstalacion() {
		return detallesInstalacion;
	}
	

}

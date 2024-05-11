package Sistema1;

public abstract class Pieza {
	public String Titulo;
	public int anio;
	public String lugarCreacion;
	public int idPieza;
	public String estadoPieza;
	public String Autor;
	public String Propietario;
	public String Ubicacion;
	public Pieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion) {
		super();
		Titulo = titulo;
		this.anio = anio;
		this.lugarCreacion = lugarCreacion;
		this.idPieza = idPieza;
		this.estadoPieza = estadoPieza;
		Autor = autor;
		Propietario = propietario;
		Ubicacion = ubicacion;
	}
	public String getEstadoPieza() {
		return estadoPieza;
	}
	public void setEstadoPieza(String estadoPieza) {
		this.estadoPieza = estadoPieza;
	}
	public String getPropietario() {
		return Propietario;
	}
	public void setPropietario(String propietario) {
		Propietario = propietario;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	public String getTitulo() {
		return Titulo;
	}
	public int getAnio() {
		return anio;
	}
	public String getLugarCreacion() {
		return lugarCreacion;
	}
	public int getIdPieza() {
		return idPieza;
	}
	public String getAutor() {
		return Autor;
	}
	

}

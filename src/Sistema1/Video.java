package Sistema1;
import java.time.Duration;

public class Video extends Pieza{
	public Duration Duracion;
	public String Formato;
	public String Tamanio;
	public Video(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion, Duration duracion, String formato, String tamanio) {
		super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
		Duracion = duracion;
		Formato = formato;
		Tamanio = tamanio;
	}
	public Duration getDuracion() {
		return Duracion;
	}
	public String getFormato() {
		return Formato;
	}
	public String getTamanio() {
		return Tamanio;
	}
	

}

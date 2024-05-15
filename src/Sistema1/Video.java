package Sistema1;

import java.time.Duration;

public class Video extends Pieza {
    public Duration Duracion;
    public String Formato;
    public String Tamanio;
    public double valor;

    public Video(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
                 String propietario, String ubicacion, Duration duracion, String formato, String tamanio, double valor) {
        super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
        Duracion = duracion;
        Formato = formato;
        Tamanio = tamanio;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public static Video registrarPieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza,
                                       String autor, String propietario, String ubicacion, Duration duracion,
                                       String formato, String tamanio, double valor) {
        idPieza = Pieza.generarID();
        return new Video(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion, duracion,
                         formato, tamanio, valor);
    }

    @Override
    public ArrayList<Object> extraerValores() {
        ArrayList<Object> valores = new ArrayList<>();
        valores.add(Titulo);
        valores.add(anio);
        valores.add(lugarCreacion);
        valores.add(idPieza);
        valores.add(estadoPieza);
        valores.add(Autor);
        valores.add(Propietario);
        valores.add(Ubicacion);
        valores.add(Duracion);
        valores.add(Formato);
        valores.add(Tamanio);
        valores.add(valor);
        return valores;
    }
}

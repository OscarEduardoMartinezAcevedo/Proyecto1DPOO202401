package Sistema1;

public class Fotografia extends Pieza {
    public double Alto;
    public double Ancho;
    public String Materiales;
    public double valor;

    public Fotografia(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
                      String propietario, String ubicacion, double alto, double ancho, String materiales, double valor) {
        super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
        Alto = alto;
        Ancho = ancho;
        Materiales = materiales;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public static Fotografia registrarPieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza,
                                            String autor, String propietario, String ubicacion, double alto, double ancho,
                                            String materiales, double valor) {
        idPieza = Pieza.generarID();
        return new Fotografia(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion, alto, ancho,
                              materiales, valor);
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
        valores.add(Alto);
        valores.add(Ancho);
        valores.add(Materiales);
        valores.add(valor);
        return valores;
    }
}

package Sistema1;

public class Pintura extends Pieza {
    public double Alto;
    public double Ancho;
    public String Tecnica;
    public String Materiales;
    public double valor;

    public Pintura(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
                   String propietario, String ubicacion, double alto, double ancho, String tecnica, String materiales, double valor) {
        super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
        Alto = alto;
        Ancho = ancho;
        Tecnica = tecnica;
        Materiales = materiales;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public static Pintura registrarPieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza,
                                         String autor, String propietario, String ubicacion, double alto, double ancho,
                                         String tecnica, String materiales, double valor) {
        idPieza = Pieza.generarID();
        return new Pintura(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion, alto, ancho,
                           tecnica, materiales, valor);
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
        valores.add(Tecnica);
        valores.add(Materiales);
        valores.add(valor);
        return valores;
    }
}

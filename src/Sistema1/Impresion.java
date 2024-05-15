package Sistema1;

public class Impresion extends Pieza {
    public double Alto;
    public double Ancho;
    public String Materiales;
    public String detallesInstalacion;
    public double valor;

    public Impresion(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
                     String propietario, String ubicacion, double alto, double ancho, String materiales,
                     String detallesInstalacion, double valor) {
        super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
        Alto = alto;
        Ancho = ancho;
        Materiales = materiales;
        this.detallesInstalacion = detallesInstalacion;
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

    public String getDetallesInstalacion() {
        return detallesInstalacion;
    }

    public double getValor() {
        return valor;
    }

    public static Impresion registrarPieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza,
                                           String autor, String propietario, String ubicacion, double alto, double ancho,
                                           String materiales, String detallesInstalacion, double valor) {
        idPieza = Pieza.generarID();
        return new Impresion(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion, alto, ancho,
                             materiales, detallesInstalacion, valor);
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
        valores.add(detallesInstalacion);
        valores.add(valor);
        return valores;
    }
}

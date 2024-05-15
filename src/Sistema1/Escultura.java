package Sistema1;

public class Escultura extends Pieza {
    public double Alto;
    public double Ancho;
    public double Profundidad;
    public String Materiales;
    public double Peso;
    public String detallesInstalacion;
    public double valor;

    public Escultura(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
                     String propietario, String ubicacion, double alto, double ancho, double profundidad,
                     String materiales, double peso, String detallesInstalacion, double valor) {
        super(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion);
        Alto = alto;
        Ancho = ancho;
        Profundidad = profundidad;
        Materiales = materiales;
        Peso = peso;
        this.detallesInstalacion = detallesInstalacion;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public static Escultura registrarPieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza,
                                           String autor, String propietario, String ubicacion, double alto, double ancho,
                                           double profundidad, String materiales, double peso, String detallesInstalacion, double valor) {
        idPieza = Pieza.generarID();
        return new Escultura(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion, alto, ancho,
                             profundidad, materiales, peso, detallesInstalacion, valor);
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
        valores.add(Profundidad);
        valores.add(Materiales);
        valores.add(Peso);
        valores.add(detallesInstalacion);
        valores.add(valor);
        return valores;
    }
}

package Sistema2;

import Sistema1.Pieza;
import java.util.ArrayList;
import java.util.List;

public class Propietario extends Usuario {

    public Propietario(int idUsuario, String nombre, int telefono, String correo, String login, String password) {
        super(idUsuario, nombre, telefono, correo, login, password);
    }

    // Método para obtener todas las piezas actuales del propietario
    public List<Pieza> obtenerPiezasActuales() {
        List<Pieza> piezasActuales = new ArrayList<>();
        for (ArrayList<ArrayList<?>> historial : Pieza.inventarioPieza.values()) {
            Pieza pieza = (Pieza) historial.get(0).get(0);
            if (pieza.getPropietario().equalsIgnoreCase(this.getNombre())) {
                piezasActuales.add(pieza);
            }
        }
        return piezasActuales;
    }

    // Método para obtener el historial de todas las piezas que han sido del propietario
    public List<Pieza> obtenerHistorialPiezas() {
        List<Pieza> historialPiezas = new ArrayList<>();
        for (ArrayList<ArrayList<?>> historial : Pieza.inventarioPieza.values()) {
            for (ArrayList<?> evento : historial) {
                Pieza pieza = (Pieza) evento.get(0);
                if (pieza.getPropietario().equalsIgnoreCase(this.getNombre())) {
                    historialPiezas.add(pieza);
                    break;
                }
            }
        }
        return historialPiezas;
    }

    // Método para calcular el valor total de la colección actual del propietario
    public double calcularValorColeccionActual() {
        double valorTotal = 0;
        for (Pieza pieza : obtenerPiezasActuales()) {
            // Aquí se supone que cada Pieza tiene un método getValor(), que debe ser implementado
            valorTotal += pieza.getValor();
        }
        return valorTotal;
    }
}

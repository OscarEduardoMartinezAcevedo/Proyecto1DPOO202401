package Sistema2;

import Sistema1.*;

public class adminGaleria extends Usuario {

    public adminGaleria(int idUsuario, String nombre, int telefono, String correo, String login, String password) {
        super(idUsuario, nombre, telefono, correo, login, password);
    }

    public void crearPieza(int tipoPieza) {
        try {
            Pieza.crearPieza(tipoPieza);
        } catch (Exception e) {
            System.out.println("Error al crear la pieza: " + e.getMessage());
        }
    }

    public void verHistorialPieza(int idPieza) {
        try {
            ArrayList<ArrayList<?>> historial = Pieza.consultarHistorialPieza(idPieza);
            for (ArrayList<?> evento : historial) {
                System.out.println(evento);
            }
        } catch (Exception e) {
            System.out.println("Error al consultar el historial de la pieza: " + e.getMessage());
        }
    }

    public void verHistorialArtista(String autor) {
        try {
            ArrayList<Integer> historial = Pieza.consultarAutor(autor);
            for (int idPieza : historial) {
                ArrayList<ArrayList<?>> eventos = Pieza.consultarHistorialPieza(idPieza);
                System.out.println("Pieza ID: " + idPieza);
                for (ArrayList<?> evento : eventos) {
                    System.out.println(evento);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al consultar el historial del artista: " + e.getMessage());
        }
    }

    public void verHistorialComprador(int idComprador) {
        // Implementación para ver el historial de un comprador
    }
}

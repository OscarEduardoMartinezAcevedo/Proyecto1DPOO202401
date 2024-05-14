package Sistema2;

public class Cajero extends Usuario {
    private boolean pagoRealizado;

    public Cajero(int idUsuario, String nombre, int telefono, String correo, String login, String password, boolean pagoRealizado) {
        super(idUsuario, nombre, telefono, correo, login, password);
        this.pagoRealizado = pagoRealizado;
    }

    public boolean isPagoRealizado() {
        return pagoRealizado;
    }

    public void setPagoRealizado(boolean pagoRealizado) {
        this.pagoRealizado = pagoRealizado;
    }

    public void registrarPago(PiezaArte pieza, double montoPago) {
        if (pieza != null && montoPago >= pieza.getPrecio() && !pieza.isVendida()) {
            pieza.setVendida(true);
            setPagoRealizado(true);
            System.out.println("Pago registrado correctamente para la pieza: " + pieza.getId() + " por un monto de: $" + montoPago);
        } else {
            setPagoRealizado(false);
            System.out.println("Error al registrar el pago. Verifique el monto y el estado de la pieza.");
        }
    }
}

class PiezaArte {
    private int id;
    private double precio;
    private boolean vendida;

    public PiezaArte(int id, double precio, boolean vendida) {
        this.id = id;
        this.precio = precio;
        this.vendida = vendida;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isVendida() {
        return vendida;
    }

    public void setVendida(boolean vendida) {
        this.vendida = vendida;
    }
}

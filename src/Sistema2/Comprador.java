package Sistema2;

import java.util.ArrayList;
import java.util.List;

public class Comprador extends Usuario {
    private List<PiezaArte> piezasCompradas;
    private int valorMaximoCompras;
    private double saldoDisponible;

    public Comprador(int idUsuario, String nombre, int telefono, String correo, String login, String password, int valorMaximoCompras, double saldoDisponible) {
        super(idUsuario, nombre, telefono, correo, login, password);
        this.valorMaximoCompras = valorMaximoCompras;
        this.saldoDisponible = saldoDisponible;
        this.piezasCompradas = new ArrayList<>();
    }

    public List<PiezaArte> getPiezasCompradas() {
        return piezasCompradas;
    }

    public int getValorMaximoCompras() {
        return valorMaximoCompras;
    }

    public void setValorMaximoCompras(int valorMaximoCompras) {
        this.valorMaximoCompras = valorMaximoCompras;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public boolean comprarPieza(PiezaArte pieza) {
        if (pieza != null && !pieza.isVendida() && saldoDisponible >= pieza.getPrecio()) {
            if (pieza.getPrecio() <= valorMaximoCompras) {
                piezasCompradas.add(pieza);
                pieza.setVendida(true);
                saldoDisponible -= pieza.getPrecio();
                System.out.println("Compra realizada exitosamente de la pieza: " + pieza.getId());
                return true;
            } else {
                System.out.println("El precio de la pieza excede su límite de compra permitido.");
                return false;
            }
        } else {
            System.out.println("No se puede comprar la pieza. Verifique que no esté vendida y que tenga fondos suficientes.");
            return false;
        }
    }

    public void pujarEnSubasta(Subasta subasta, double monto) {
        if (subasta != null && subasta.isActiva() && saldoDisponible >= monto) {
            if (subasta.realizarPuja(this, monto)) {
                saldoDisponible -= monto;
                System.out.println("Puja realizada exitosamente en la subasta para la pieza: " + subasta.getPiezaArte().getId());
            } else {
                System.out.println("Puja fallida. Es posible que su puja sea menor al mínimo requerido o que la subasta haya finalizado.");
            }
        } else {
            System.out.println("No tiene fondos suficientes para participar en la subasta o la subasta no está activa.");
        }
    }
}


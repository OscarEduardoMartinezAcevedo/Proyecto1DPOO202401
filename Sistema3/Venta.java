package Sistema3;

import java.util.ArrayList;
import Sistema2.adminGaleria;

public class Venta {
    private static int contadorIdVenta = 1;
    public int idVenta;
    public int Producto;
    public int Precio;
    public boolean Confirmacion;
    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getProducto() {
        return Producto;
    }

    public void setProducto(int producto) {
        Producto = producto;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public boolean isConfirmacion() {
        return Confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        Confirmacion = confirmacion;
    }
    
    public Venta(int idVenta, int producto, int precio, boolean confirmacion) {
        super();
        this.idVenta = idVenta;
        Producto = producto;
        Precio = precio;
        Confirmacion = confirmacion;
    }

    public static Venta crearVentaConConfirmacion(int idPieza, int precio, adminGaleria administrador) {
        if (administrador.verificarUsuario() && administrador.verificarOferta()) {
            Venta nuevaVenta = new Venta(contadorIdVenta++, idPieza, precio, true);
            return nuevaVenta;
        } else {
            System.out.println("No se puede confirmar la venta. Verificación del administrador fallida.");
            return null;
        }}}



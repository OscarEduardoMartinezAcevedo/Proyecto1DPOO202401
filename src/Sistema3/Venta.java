package Sistema3;

import java.util.ArrayList;

public class Venta {
    public int idVenta;
    public ArrayList<Integer> Producto;
    public int Precio;
    public boolean Confirmacion;

    public Venta(int idVenta, ArrayList<Integer> producto, int precio, boolean confirmacion) {
        this.idVenta = idVenta;
        Producto = producto;
        Precio = precio;
        Confirmacion = confirmacion;
    }

    public ArrayList<Integer> getProducto() {
        return Producto;
    }

    public void setProducto(ArrayList<Integer> producto) {
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

    public int getIdVenta() {
        return idVenta;
    }
}

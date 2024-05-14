package Sistema2;

public class Operador extends Usuario {
    private int nuevaOferta;

    public Operador(int idUsuario, String nombre, int telefono, String correo, String login, String password, int nuevaOferta) {
        super(idUsuario, nombre, telefono, correo, login, password);
        this.nuevaOferta = nuevaOferta;
    }

    public int getNuevaOferta() {
        return nuevaOferta;
    }

    public void setNuevaOferta(int nuevaOferta) {
        this.nuevaOferta = nuevaOferta;
    }

    public void añadirOferta(Subasta subasta, double monto) {
        subasta.realizarPuja(this, monto);
        System.out.println("Oferta añadida para la subasta de la pieza: " + subasta.getPiezaArte().getId());
    }
}

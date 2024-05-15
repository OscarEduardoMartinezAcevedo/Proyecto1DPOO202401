package Sistema3;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class Subasta {
    public int idSubasta;
    public ArrayList<Integer> Piezas;
    public ArrayList<Integer> valoresIniciales;
    public Dictionary<Integer, Integer> Ofertas;
    public ArrayList<Integer> Compradores;
    public boolean activa;

    public Subasta(int idSubasta, ArrayList<Integer> piezas, ArrayList<Integer> valoresIniciales) {
        this.idSubasta = idSubasta;
        Piezas = piezas;
        this.valoresIniciales = valoresIniciales;
        Ofertas = new Hashtable<>();
        Compradores = new ArrayList<>();
        activa = true;
    }

    public ArrayList<Integer> getPiezas() {
        return Piezas;
    }

    public void setPiezas(ArrayList<Integer> piezas) {
        Piezas = piezas;
    }

    public ArrayList<Integer> getValoresIniciales() {
        return valoresIniciales;
    }

    public void setValoresIniciales(ArrayList<Integer> valoresIniciales) {
        this.valoresIniciales = valoresIniciales;
    }

    public Dictionary<Integer, Integer> getOfertas() {
        return Ofertas;
    }

    public void setOfertas(Dictionary<Integer, Integer> ofertas) {
        Ofertas = ofertas;
    }

    public int getIdSubasta() {
        return idSubasta;
    }

    public ArrayList<Integer> getCompradores() {
        return Compradores;
    }

    public boolean isActiva() {
        return activa;
    }

    public boolean realizarPuja(Usuario usuario, double monto) {
        // Lógica para realizar una puja
        return true;
    }
}

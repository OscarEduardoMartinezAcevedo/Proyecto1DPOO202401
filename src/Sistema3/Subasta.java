package Sistema3;

import java.util.ArrayList;
import java.util.Dictionary;

public class Subasta {
	public int idSubasta;
	public ArrayList<Integer> Piezas;
	public ArrayList<Integer> valoresIniciales;
	public Dictionary<Integer, Integer> Ofertas;
	public ArrayList<Integer> Compradores;
	public Subasta(int idSubasta, ArrayList<Integer> piezas, ArrayList<Integer> valoresIniciales,
			Dictionary<Integer, Integer> ofertas, ArrayList<Integer> compradores) {
		super();
		this.idSubasta = idSubasta;
		Piezas = piezas;
		this.valoresIniciales = valoresIniciales;
		Ofertas = ofertas;
		Compradores = compradores;
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
	

	

}

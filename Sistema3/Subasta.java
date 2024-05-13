package Sistema3;

import java.util.ArrayList;
import java.util.HashMap;

import Sistema1.Pieza;
import Sistema2.adminGaleria;

public class Subasta {
	public int idSubasta;
	public ArrayList<Integer> Piezas; //YA ESTA
	public ArrayList<Integer> valoresIniciales;
	public HashMap<Integer, Integer> Ofertas;
	private HashMap<Integer, HashMap<Integer, Integer>> ofertasPorPieza;
	public ArrayList<Integer> Compradores; //INICIA VACIO Y SEGUN LP QUE DIGA EL ADMIN
	private boolean subastaFinalizada;
	
	public Subasta(int idSubasta, ArrayList<Integer> piezas, ArrayList<Integer> valoresIniciales,
			HashMap<Integer, Integer> ofertas, ArrayList<Integer> compradores) {
		super();
		this.idSubasta = idSubasta;
		Piezas = piezas;
		this.valoresIniciales = valoresIniciales;
		Ofertas = ofertas;
		Compradores = compradores;
		this.subastaFinalizada=false;
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
	public HashMap<Integer, Integer> getOfertas() {
		return Ofertas;
	}
	public void setOfertas(HashMap<Integer, Integer> ofertas) {
		Ofertas = ofertas;
	}
	public int getIdSubasta() {
		return idSubasta;
	}
	public ArrayList<Integer> getCompradores() {
		return Compradores;
	}
	
	//REVISAR
    public void agregarPiezas(Pieza piezas) {
        ArrayList<Integer> piezasparasubastar = piezas.obtenerPiezasDisponibles();
        this.Piezas = piezasparasubastar;
    }
    
    public ArrayList<Integer> obtenerPiezasDisponiblesParaSubasta() {
        ArrayList<Integer> piezasDisponibles = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> inventarioPieza = Pieza.getInventarioPieza();
        for (Integer idPieza : inventarioPieza.keySet()) {
            if (!Ofertas.containsKey(idPieza)) {
                piezasDisponibles.add(idPieza);
            }
        }
        return piezasDisponibles;
    }
    public void agregarComprador (adminGaleria administrador){
    	ArrayList<Integer> compradoresVerificados = administrador.obtenerCompradoresVerificados();
    	this.Compradores= compradoresVerificados;
    	
    }
    public void Puja (int idcomprador, int nuevovalor) {
        if (Compradores.contains(idcomprador)) {
            Integer pujaActual = Ofertas.getOrDefault(idcomprador, 0);
            if (nuevovalor > pujaActual) {
                Ofertas.put(idcomprador, nuevovalor);
                System.out.println("Puja realizada por el comprador " + idcomprador + " de " + nuevovalor);
            } else {
                System.out.println("La oferta debe ser mayor que la oferta actual");
            }
        } else {
            System.out.println("El comprador no está autorizado para realizar una puja en esta subasta");
        }
    }
    public void realizarOferta(int idComprador, int idPieza, int oferta) throws Exception {
        if (!subastaFinalizada) {
            HashMap<Integer, Integer> ofertasPieza = ofertasPorPieza.getOrDefault(idPieza, new HashMap<>());
            int ofertaMasAlta = obtenerOfertaMasAlta(ofertasPieza);
            if (oferta > ofertaMasAlta) {
                ofertasPieza.put(idComprador, oferta);
                ofertasPorPieza.put(idPieza, ofertasPieza);
                System.out.println("Oferta realizada por el comprador " + idComprador + " de " + oferta + " para la pieza " + idPieza);
                subastaFinalizada = true;
            } else {
                throw new Exception("La oferta debe ser mayor que la oferta más alta actual.");
            }
        } else {
            throw new Exception("La subasta ya ha finalizado, no se pueden realizar más ofertas.");
        }
    }
   
    private int obtenerOfertaMasAlta(HashMap<Integer, Integer> ofertasPieza) {
        int ofertaMasAlta = 0;
        for (int oferta : ofertasPieza.values()) {
            if (oferta > ofertaMasAlta) {
                ofertaMasAlta = oferta;
            }
        }
        return ofertaMasAlta;
    }
}

package Sistema2;

import Sistema1.CreacionPiezas; //aca el creacion de obras es el metodo que crea una obra con la informacion que se necesite de esta 

public class adminGaleria extends Usuario{

	public adminGaleria(int idUsuario, String nombre, int telefono, String correo, String login, String password) {
		super(idUsuario, nombre, telefono, correo, login, password);
		
	}

public void crearPieza(String Titulo, int Anno, String lugarCreacion, String idPieza, boolean disponibleValorFijo, boolean piezaBloqueada, boolean piezaVendida, double valorMinimo, double valorInicial, String ubicacion, double alto, double ancho, String tecnica, String autor, double profundidad, String materiales, double peso, String detallesInstalacion, String detallesPresentacion, String duracion  ){
	if (tipo.equalsIgnoreCase("Pintura")){

		CreacionPiezas.crearPieza(Titulo, Anno, lugarCreacion, idPieza, disponibleValorFijo, piezaBloqueada, piezaVendida, valorMinimo, valorInicial, ubicacion, alto, ancho, tecnica, autor);

	}else if (tipo.equalsIgnoreCase("Esculturas")){
		CreacionPiezas.crearPieza(Titulo, Anno, lugarCreacion, idPieza, disponibleValorFijo, piezaBloqueada, piezaVendida, valorMinimo, valorInicial, ubicacion, alto, ancho, profundidad, materiales, peso, detallesInstalacion);
	}else if (tipo.equalsIgnoreCase("Videos")){
		CreacionPiezas.crearPieza(Titulo, Anno, lugarCreacion, idPieza, disponibleValorFijo, piezaBloqueada, piezaVendida, valorMinimo, valorInicial, ubicacion, duracion, autor, materiales, detallesPresentacion);
	}else if (tipo.equals.crearPieza("Fotografias")){
		CreacionPiezas.crearPieza(Titulo, Anno, lugarCreacion, idPieza, disponibleValorFijo, piezaBloqueada, piezaVendida, valorMinimo, valorInicial, ubicacion, duracion, autor, materiales, detallesPresentacion);
	}else if (tipo.equalsIgnoreCase("Impresiones")){
		CreacionPiezas.crearPieza(Titulo, Anno, lugarCreacion, idPieza, disponibleValorFijo, piezaBloqueada, piezaVendida, valorMinimo, valorInicial, ubicacion, alto, ancho, materiales, detallesInstalacion );
	} else {
	System.out.println("Tipo de pieza no reconocido");
	}
		}

	}


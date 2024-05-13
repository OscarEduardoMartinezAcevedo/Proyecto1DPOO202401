package Sistema1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;
import java.lang.reflect.Field;

public abstract class Pieza {
	public String Titulo;
	public int anio;
	public String lugarCreacion;
	public int idPieza;
	public String estadoPieza;
	public String Autor;
	public String Propietario;
	public String Ubicacion;
	public Pieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
			String propietario, String ubicacion) {
		super();
		Titulo = titulo;
		this.anio = anio;
		this.lugarCreacion = lugarCreacion;
		this.idPieza = idPieza;
		this.estadoPieza = estadoPieza;
		Autor = autor;
		Propietario = propietario;
		Ubicacion = ubicacion;
	}
	public String getEstadoPieza() {
		return estadoPieza;
	}
	public void setEstadoPieza(String nuevoEstadoPieza) {
		estadoPieza = nuevoEstadoPieza;
	}
	public String getPropietario() {
		return Propietario;
	}
	public void setPropietario(String nuevoPropietario) {
		Propietario = nuevoPropietario;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String nuevaUbicacion) {
		Ubicacion = nuevaUbicacion;
	}
	public String getTitulo() {
		return Titulo;
	}
	public int getAnio() {
		return anio;
	}
	public String getLugarCreacion() {
		return lugarCreacion;
	}
	public int getIdPieza() {
		return idPieza;
	}
	public String getAutor() {
		return Autor;
	}
	
	protected static Set<Integer> numerosGenerados = new HashSet<>();
    protected static Random random = new Random();
    protected static int generarID() {
        int numero;
        do {
            numero = random.nextInt(1_000_000); // Genera un número
        } while (numerosGenerados.contains(numero)); // Verifica si el número ya ha sido generado antes

        numerosGenerados.add(numero); // Agrega el número al conjunto de números generados
        return numero;
    }
    
	public void actualizarPieza(int idPieza,int atributo,String nuevoValor) throws Exception {
		ArrayList<ArrayList<?>> Evento = new ArrayList<>();
		if (Pieza.inventarioPieza.containsKey(idPieza)==true) {
			Evento.add(Pieza.inventarioPieza.get(idPieza));
			if (atributo==1) {
				this.setEstadoPieza(nuevoValor);
				Evento.add(extraerValores(this));
				Pieza.inventarioPieza.remove(idPieza);
				Pieza.inventarioPieza.put(idPieza, Evento);
			}
			else if(atributo==2) {
				this.setPropietario(nuevoValor);
				Evento.add(extraerValores(this));
				Pieza.inventarioPieza.remove(idPieza);
				Pieza.inventarioPieza.put(idPieza, Evento);
				
			}
			else if (atributo==3) {
				this.setUbicacion(nuevoValor);
				Evento.add(extraerValores(this));
				Pieza.inventarioPieza.remove(idPieza);
				Pieza.inventarioPieza.put(idPieza, Evento);
			}
			else {throw new Exception("Atributo a cambiar no encontrado");
				}
		}else{
			throw new Exception("Pieza no encontrada para actualizar");
		};
	}
	
	public static Map<Integer, ArrayList<ArrayList<?>>> inventarioPieza = new HashMap<>();
	
	public static Map<String, ArrayList<Integer>> inventarioAutor = new HashMap<>();
	
    public void crearPieza(int tipoPieza) {
        Scanner scanner = new Scanner(System.in);
        switch (tipoPieza) {
            case 1:
                System.out.println("Creando una escultura...");
                System.out.println("Ingrese título:");
                String titulo = scanner.nextLine();
                System.out.println("Ingrese año:");
                int anio = scanner.nextInt();
                System.out.println("Ingrese lugar de creación:");
                String lugarCreacion = scanner.nextLine(); // Consumir el salto de línea pendiente
                lugarCreacion = scanner.nextLine(); // Leer la entrada del usuario
                System.out.println("Ingrese el estado de la pieza:");
                String estadoPieza = scanner.nextLine();
                System.out.println("Ingrese el autor:");
                String autor = scanner.nextLine();
                System.out.println("Ingrese el propietario:");
                String propietario = scanner.nextLine();
                System.out.println("Ingrese la ubicación:");
                String ubicacion = scanner.nextLine();
                System.out.println("Ingrese el alto:");
                double alto = scanner.nextDouble();
                System.out.println("Ingrese el ancho:");
                double ancho = scanner.nextDouble();
                System.out.println("Ingrese la profundidad:");
                double profundidad = scanner.nextDouble();
                System.out.println("Ingrese los materiales:");
                String materiales = scanner.nextLine();
                materiales = scanner.nextLine();
                System.out.println("Ingrese el peso:");
                double peso = scanner.nextDouble();
                System.out.println("Ingrese los detalles de la instalación:");
                String detallesInstalacion = scanner.nextLine();
                detallesInstalacion = scanner.nextLine();
                idPieza=Pieza.generarID();
                Escultura.registrarPieza(titulo, anio, lugarCreacion,idPieza, estadoPieza, autor, propietario, ubicacion,
                        alto, ancho, profundidad, materiales, peso, detallesInstalacion);
                ArrayList<ArrayList<?>> informacion = new ArrayList<>();
                ArrayList<Object> informacionPieza = new ArrayList<>();
                ArrayList<Integer> Obras = new ArrayList<>();
                informacionPieza.add(titulo);
                informacionPieza.add(anio);
                informacionPieza.add(lugarCreacion);
                informacionPieza.add(idPieza);
                informacionPieza.add(estadoPieza);
                informacionPieza.add(autor);
                informacionPieza.add(propietario);
                informacionPieza.add(ubicacion);
                informacionPieza.add(alto);
                informacionPieza.add(ancho);
                informacionPieza.add(profundidad);
                informacionPieza.add(materiales);
                informacionPieza.add(peso);
                informacionPieza.add(detallesInstalacion);
                informacion.add(informacionPieza);
                Obras.add(idPieza);
                Pieza.inventarioPieza.put(idPieza, informacion);
                Pieza.inventarioAutor.put(autor,Obras);

                break;
            case 2:
            	//replicacion en proceso
                System.out.println("Creando una pintura...");
                System.out.println("Ingrese título:");
                titulo = scanner.nextLine();
                System.out.println("Ingrese año:");
                anio = scanner.nextInt();
                System.out.println("Ingrese lugar de creación:");
                lugarCreacion = scanner.nextLine(); // Consumir el salto de línea pendiente
                lugarCreacion = scanner.nextLine(); // Leer la entrada del usuario
                System.out.println("Ingrese el estado de la pieza:");
                estadoPieza = scanner.nextLine();
                System.out.println("Ingrese el autor:");
                autor = scanner.nextLine();
                System.out.println("Ingrese el propietario:");
                propietario = scanner.nextLine();
                System.out.println("Ingrese la ubicación:");
                ubicacion = scanner.nextLine();
                System.out.println("Ingrese el alto:");
                alto = scanner.nextDouble();
                System.out.println("Ingrese el ancho:");
                ancho = scanner.nextDouble();
                System.out.println("Ingrese los materiales:");
                materiales = scanner.nextLine(); // Consumir el salto de línea pendiente
                materiales = scanner.nextLine(); // Leer la entrada del usuario
                System.out.println("Ingrese los detalles de la técnica:");
                String detallesTecnica = scanner.nextLine();
                System.out.println("Ingrese los detalles de la firma:");
                String detallesFirma = scanner.nextLine();
                // Luego, llamar al método registrarPieza de Pintura
                //Pintura.registrarPieza(titulo, anio, lugarCreacion, estadoPieza, autor, propietario, ubicacion,
                //        alto, ancho, materiales, detallesTecnica, detallesFirma);
                break;
            case 3:
            	break;
            case 4:
            	break;
            case 5:
            	break;
            default:
                throw new Exception("Tipo de pieza no válido");
                break;
        }
        scanner.close();
    }
	
	public ArrayList<ArrayList<?>> consultarHistorialPieza(int idPieza) {
		ArrayList<ArrayList<?>> HistorialP = new ArrayList<>();
		HistorialP.addAll(Pieza.inventarioPieza.get(idPieza));
		return HistorialP;
	}

	public ArrayList<Integer> consultarAutor(String Autor) {
		ArrayList<Integer> HistorialA = new ArrayList<>();
		HistorialA.addAll(Pieza.inventarioAutor.get(Autor));
		return HistorialA;
	}
	
	public void ingresarPieza(int idPieza) {}
	
	public void devolverPieza(int idPieza) {}
	
	public ArrayList<Object> extraerValores(Object objeto) {
		ArrayList<Object> valores = new ArrayList<>();
	    // Obtener la clase del objeto
	    Class<?> clase = objeto.getClass();

	    // Obtener todos los campos (atributos) de la clase
	    Field[] campos = clase.getDeclaredFields();

	    // Iterar sobre cada campo y obtener su valor
	    for (Field campo : campos) {
	        // Acceder al campo (atributo)
	        campo.setAccessible(true);

	        try {
	            // Obtener el valor del campo en el objeto proporcionado
	            Object valor = campo.get(objeto);

	            // Imprimir el nombre del campo y su valor
	            valores.add(valor); // valor representa el valor del campo en esta instancia
	        } catch (IllegalAccessException e) {
	            // Manejar excepción si no se puede acceder al campo
	            e.printStackTrace();
	        }
	    }
		return valores;
	}
	}
	
	
	
	
	
	



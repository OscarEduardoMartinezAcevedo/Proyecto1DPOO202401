package Sistema1;

import java.io.*;
import java.util.*;

public abstract class Pieza {
    public String Titulo;
    public int anio;
    public String lugarCreacion;
    public int idPieza;
    public String estadoPieza;
    public String Autor;
    public String Propietario;
    public String Ubicacion;
    protected static Set<Integer> numerosGenerados = new HashSet<>();
    protected static Random random = new Random();

    public Pieza(String titulo, int anio, String lugarCreacion, int idPieza, String estadoPieza, String autor,
                 String propietario, String ubicacion) {
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

    protected static int generarID() {
        int numero;
        do {
            numero = random.nextInt(1_000_000);
        } while (numerosGenerados.contains(numero));
        numerosGenerados.add(numero);
        return numero;
    }

    public abstract double getValor(); // Método abstracto para obtener el valor de la pieza

    public abstract ArrayList<Object> extraerValores();

    public static Map<Integer, ArrayList<ArrayList<?>>> inventarioPieza = new HashMap<>();
    public static Map<String, ArrayList<Integer>> inventarioAutor = new HashMap<>();

    public void actualizarPieza(int idPieza, int atributo, String nuevoValor) throws Exception {
        if (!Pieza.inventarioPieza.containsKey(idPieza)) {
            throw new Exception("Pieza no encontrada para actualizar");
        }
        ArrayList<ArrayList<?>> Evento = new ArrayList<>(Pieza.inventarioPieza.get(idPieza));
        switch (atributo) {
            case 1 -> this.setEstadoPieza(nuevoValor);
            case 2 -> this.setPropietario(nuevoValor);
            case 3 -> this.setUbicacion(nuevoValor);
            default -> throw new Exception("Atributo a cambiar no encontrado");
        }
        Evento.add(extraerValores());
        Pieza.inventarioPieza.put(idPieza, Evento);
    }

    public static void crearPieza(int tipoPieza) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese título:");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese año:");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese lugar de creación:");
        String lugarCreacion = scanner.nextLine();
        System.out.println("Ingrese el estado de la pieza:");
        String estadoPieza = scanner.nextLine();
        System.out.println("Ingrese el autor:");
        String autor = scanner.nextLine();
        System.out.println("Ingrese el propietario:");
        String propietario = scanner.nextLine();
        System.out.println("Ingrese la ubicación:");
        String ubicacion = scanner.nextLine();
        int idPieza = Pieza.generarID();

        switch (tipoPieza) {
            case 1 -> {
                System.out.println("Ingrese el alto:");
                double alto = scanner.nextDouble();
                System.out.println("Ingrese el ancho:");
                double ancho = scanner.nextDouble();
                System.out.println("Ingrese la profundidad:");
                double profundidad = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.println("Ingrese los materiales:");
                String materiales = scanner.nextLine();
                System.out.println("Ingrese el peso:");
                double peso = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.println("Ingrese los detalles de la instalación:");
                String detallesInstalacion = scanner.nextLine();
                System.out.println("Ingrese el valor de la pieza:");
                double valor = scanner.nextDouble();
                Escultura escultura = Escultura.registrarPieza(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion,
                        alto, ancho, profundidad, materiales, peso, detallesInstalacion, valor);
                agregarPiezaInventario(escultura, autor, idPieza);
            }
            case 2 -> {
                System.out.println("Ingrese el alto:");
                double alto = scanner.nextDouble();
                System.out.println("Ingrese el ancho:");
                double ancho = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.println("Ingrese los materiales:");
                String materiales = scanner.nextLine();
                System.out.println("Ingrese los detalles de la técnica:");
                String detallesTecnica = scanner.nextLine();
                System.out.println("Ingrese el valor de la pieza:");
                double valor = scanner.nextDouble();
                Pintura pintura = Pintura.registrarPieza(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion,
                        alto, ancho, detallesTecnica, materiales, valor);
                agregarPiezaInventario(pintura, autor, idPieza);
            }
            case 3 -> {
                System.out.println("Ingrese duración (en minutos):");
                int duracion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.println("Ingrese el formato:");
                String formato = scanner.nextLine();
                System.out.println("Ingrese el tamaño:");
                String tamanio = scanner.nextLine();
                System.out.println("Ingrese el valor de la pieza:");
                double valor = scanner.nextDouble();
                Video video = Video.registrarPieza(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion,
                        Duration.ofMinutes(duracion), formato, tamanio, valor);
                agregarPiezaInventario(video, autor, idPieza);
            }
            case 4 -> {
                System.out.println("Ingrese el alto:");
                double alto = scanner.nextDouble();
                System.out.println("Ingrese el ancho:");
                double ancho = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.println("Ingrese los materiales:");
                String materiales = scanner.nextLine();
                System.out.println("Ingrese los detalles de la instalación:");
                String detallesInstalacion = scanner.nextLine();
                System.out.println("Ingrese el valor de la pieza:");
                double valor = scanner.nextDouble();
                Impresion impresion = Impresion.registrarPieza(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion,
                        alto, ancho, materiales, detallesInstalacion, valor);
                agregarPiezaInventario(impresion, autor, idPieza);
            }
            case 5 -> {
                System.out.println("Ingrese el alto:");
                double alto = scanner.nextDouble();
                System.out.println("Ingrese el ancho:");
                double ancho = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente
                System.out.println("Ingrese los materiales:");
                String materiales = scanner.nextLine();
                System.out.println("Ingrese el valor de la pieza:");
                double valor = scanner.nextDouble();
                Fotografia fotografia = Fotografia.registrarPieza(titulo, anio, lugarCreacion, idPieza, estadoPieza, autor, propietario, ubicacion,
                        alto, ancho, materiales, valor);
                agregarPiezaInventario(fotografia, autor, idPieza);
            }
            default -> throw new Exception("Tipo de pieza no válido");
        }
        scanner.close();
    }

    private static void agregarPiezaInventario(Pieza pieza, String autor, int idPieza) {
        ArrayList<ArrayList<?>> informacion = new ArrayList<>();
        ArrayList<Object> informacionPieza = pieza.extraerValores();
        informacion.add(informacionPieza);
        Pieza.inventarioPieza.put(idPieza, informacion);

        ArrayList<Integer> Obras = Pieza.inventarioAutor.getOrDefault(autor, new ArrayList<>());
        Obras.add(idPieza);
        Pieza.inventarioAutor.put(autor, Obras);
    }

    public ArrayList<ArrayList<?>> consultarHistorialPieza(int idPieza) {
        return new ArrayList<>(Pieza.inventarioPieza.get(idPieza));
    }

    public ArrayList<Integer> consultarAutor(String autor) {
        return new ArrayList<>(Pieza.inventarioAutor.get(autor));
    }

    public void ingresarPieza(int idPieza, String nuevoEstado) {
        ArrayList<ArrayList<?>> Evento = new ArrayList<>(Pieza.inventarioPieza.get(idPieza));
        this.setEstadoPieza(nuevoEstado);
        Evento.add(extraerValores());
        Pieza.inventarioPieza.put(idPieza, Evento);
    }

    public void devolverPieza(int idPieza, String antiguoEstado) {
        ArrayList<ArrayList<?>> Evento = new ArrayList<>(Pieza.inventarioPieza.get(idPieza));
        this.setEstadoPieza(antiguoEstado);
        Evento.add(extraerValores());
        Pieza.inventarioPieza.put(idPieza, Evento);
    }

    public static void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos_piezas.dat"))) {
            oos.writeObject(inventarioPieza);
            oos.writeObject(inventarioAutor);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public static void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datos_piezas.dat"))) {
            inventarioPieza = (Map<Integer, ArrayList<ArrayList<?>>>) ois.readObject();
            inventarioAutor = (Map<String, ArrayList<Integer>>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }
}

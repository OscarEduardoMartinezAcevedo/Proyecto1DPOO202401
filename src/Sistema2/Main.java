package Sistema2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de la galería");
        System.out.println("Ingrese su tipo de usuario: 1-Administrador, 2-Comprador, 3-Empleado");
        int tipoUsuario = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        switch (tipoUsuario) {
            case 1:
                adminGaleria admin = new adminGaleria(1, "Admin", 123456789, "admin@galeria.com", "admin", "admin123");
                System.out.println("Bienvenido, Admin");
                // Menú de opciones para administrador
                break;
            case 2:
                Comprador comprador = new Comprador(2, "Comprador", 987654321, "comprador@galeria.com", "comprador", "comprador123", 10000, 5000);
                System.out.println("Bienvenido, Comprador");
                // Menú de opciones para comprador
                break;
            case 3:
                Empleado empleado = new Empleado(3, "Empleado", 1122334455, "empleado@galeria.com", "empleado", "empleado123", "Bodega");
                System.out.println("Bienvenido, Empleado");
                // Menú de opciones para empleado
                break;
            default:
                System.out.println("Tipo de usuario no reconocido");
        }
        scanner.close();
    }
}

import java.util.*;

public class Votantes {

    static Scanner sc = new Scanner(System.in);

    public void inicio() {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Elija una opcion: ");

            switch (opcion) {
                case 1:
                    registrarVotante();
                    break;
                case 2:
                    votar();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);
    }

    public static void mostrarMenu() {
        System.out.println("\nMenu");
        System.out.println("1. Registrar votante");
        System.out.println("2. Votar");
        System.out.println("3. Salir");
    }

    public static void registrarVotante() {
        System.out.println("\nRegistro");

        String nombre = leerTexto("Digite su nombre: ");
        int edad = leerEntero("Digite su edad: ");

        if (edad >= 18) {
            System.out.println("Registro exitoso. Puede votar.");
        } else {
            System.out.println("Registro exitoso, pero NO puede votar (menor de edad).");
        }
    }

    public static void votar() {
        System.out.println("\nVotacion");

        int edad = leerEntero("Digite su edad para validar: ");

        if (edad < 18) {
            System.out.println("No puede votar.");
            return;
        }

        System.out.println("1. Candidato A");
        System.out.println("2. Candidato B");
        System.out.println("3. Candidato C");

        int voto = leerEntero("Digite su voto: ");

        if (voto >= 1 && voto <= 3) {
            System.out.println("Voto registrado con exito.");
        } else {
            System.out.println("Voto invalido.");
        }
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        int num = sc.nextInt();
        sc.nextLine(); // Necesito este para limpiar el enter y no se quede pegado
        return num;
    }

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}

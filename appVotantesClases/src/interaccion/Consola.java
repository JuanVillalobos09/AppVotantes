package interaccion;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Consola {

    private static Scanner sc = new Scanner (System.in);

    public static String leer (String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }

    public static void imprimir (String mensaje) {
        System.out.println(mensaje);
    }
}

package interaccion;

import java.util.Scanner;

public class Consola {

    private Scanner scanner = new Scanner(System.in);

    public String leer(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void imprimir(String mensaje) {
        System.out.println(mensaje);
    }
}
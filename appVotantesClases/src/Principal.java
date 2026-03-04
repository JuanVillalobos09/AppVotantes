import datosPrincipales.VotanteNacional;
import interaccion.Consola;
import util.Utilidades;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        Consola consola = new Consola();

        String nombre = consola.leer("Nombre: ");
        String apellido = consola.leer("Apellido: ");
        Long id = Long.parseLong(consola.leer("Identificacion: "));
        String fechaStr = consola.leer("Fecha nacimiento (dd/MM/yyyy): ");
        String departamento = consola.leer("Departamento: ");

        Date fechaNacimiento = Utilidades.convertirStringDate(fechaStr);

        VotanteNacional votante = new VotanteNacional(
                nombre, apellido, id, fechaNacimiento, departamento
        );

        consola.imprimir("Nombre completo: " + votante.getNombreCompleto());
        consola.imprimir("Edad: " + votante.calcularEdad());
        consola.imprimir("Departamento: " + votante.getDepartamento());

        if (votante.puedeVotar()) {
            consola.imprimir("Puede votar");
        } else {
            consola.imprimir("No puede votar");
        }
    }
}
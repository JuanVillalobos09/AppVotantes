import datosPrincipales.Votante;
import interaccion.Consola;
import util.Utilidades;

import java.util.Date;

public class Principal {
    public static void main (String[] args) {

        Consola.imprimir("Registro votante");

        Votante v =new Votante ();

        v.nombre= Consola.leer("Digite su nombre");
        v.apellido= Consola.leer("Digite su apellido");

        String idTexto = Consola.leer ("Digite su numero de identificacion");
        v.numeroIdentificacion = Long.parseLong(idTexto);

        String fechaTexto = Consola.leer("Digite su fecha de nacimiento (dia/mes/año)");
        Date fecha = Utilidades.convertirStringDate(fechaTexto);

        if (fecha == null) {
            Consola.imprimir("Fecha invalida");
            return;
        }

        v.fechaNacimiento = fecha;

        int edad = v.calcularEdad();

        Consola.imprimir("Datos del votante");
        Consola.imprimir("Nombre " + v.nombre + " " + v.apellido);
        Consola.imprimir("Identificacion " + v.numeroIdentificacion);
        Consola.imprimir("Edad " + edad);

        if (edad >= 18) {
            Consola.imprimir("Puede votar");
        } else {
            Consola.imprimir("No puede votar");
        }
    }
}
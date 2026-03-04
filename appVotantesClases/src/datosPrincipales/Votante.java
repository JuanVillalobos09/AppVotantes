package datosPrincipales;

import java.util.Date;

public class Votante extends Persona {

    public Votante(String nombre, String apellido, Long numeroIdentificacion, Date fechaNacimiento) {
        super(nombre, apellido, numeroIdentificacion, fechaNacimiento);
    }

    public boolean puedeVotar() {
        return calcularEdad() >= 18;
    }
}
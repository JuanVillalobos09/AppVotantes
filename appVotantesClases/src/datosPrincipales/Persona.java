package datosPrincipales;

import java.util.Date;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected Long numeroIdentificacion;
    protected Date fechaNacimiento;

    public Persona(String nombre, String apellido, Long numeroIdentificacion, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        Date hoy = new Date();
        long diferencia = hoy.getTime() - fechaNacimiento.getTime();
        long anios = diferencia / (1000L * 60 * 60 * 24 * 365);
        return (int) anios;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}
package datosPrincipales;
import java.util.Date;
import java.util.Calendar;

public class Votante {

    public String nombre;
    public String apellido;
    public Long numeroIdentificacion;
    public Date fechaNacimiento;

    public int calcularEdad() {
        Calendar hoy = Calendar.getInstance();
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);

        int edad = hoy.get(Calendar.YEAR)- nacimiento.get(Calendar.YEAR);

        if (hoy.get(Calendar.MONTH)< nacimiento.get(Calendar.MONTH)|| (hoy.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH) && hoy.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }

}

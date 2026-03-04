package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {

    public static Date convertirStringDate(String fecha) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            return formato.parse(fecha);
        } catch (Exception e) {
            return null;
        }
    }
}
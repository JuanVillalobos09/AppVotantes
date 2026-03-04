package datosPrincipales;

import java.util.Date;

public class VotanteNacional extends Votante {

    private String departamento;

    public VotanteNacional(String nombre, String apellido, Long numeroIdentificacion,
                           Date fechaNacimiento, String departamento) {
        super(nombre, apellido, numeroIdentificacion, fechaNacimiento);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
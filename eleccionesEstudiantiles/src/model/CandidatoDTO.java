package model;

import java.sql.Timestamp;

public class CandidatoDTO {
    // variables
    int numeroIdentificacion;
    int idProcesoElectoral;
    int numeroCandidato;
    String procesoElectoral;
    Timestamp fechaInscripcion;

    // constructor
    public CandidatoDTO(int numeroIdentificacion, int idProcesoElectoral, int numeroCandidato, String procesoElectoral,
                        Timestamp fechaInscripcion) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.idProcesoElectoral = idProcesoElectoral;
        this.numeroCandidato = numeroCandidato;
        this.procesoElectoral = procesoElectoral;
        this.fechaInscripcion = fechaInscripcion;
    }

    // Metodos

}

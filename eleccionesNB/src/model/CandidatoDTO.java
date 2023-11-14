package model;

import control.CandidatoDAO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CandidatoDTO {

    // variables
    int numeroIdentificacion;
    int idProcesoElectoral;
    int numeroCandidato;
    Timestamp fechaInscripcion;

    CandidatoDAO candidato = new CandidatoDAO();

    // constructor
    public CandidatoDTO(int numeroIdentificacion, int idProcesoElectoral, int numeroCandidato,
            Timestamp fechaInscripcion) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.idProcesoElectoral = idProcesoElectoral;
        this.numeroCandidato = numeroCandidato;
        this.fechaInscripcion = fechaInscripcion;
    }

    // Metodos
    public String crearCandidato() throws ClassNotFoundException {
        boolean crear = candidato.crearCandidato(numeroCandidato, numeroIdentificacion, fechaInscripcion, idProcesoElectoral);
        if (crear) {
            // vista creado
            return "Candidato Creado";
        } else {
            // vista no creada
            return "No se creo el candidato";
        }
    }

    public List consultarCandidato() throws ClassNotFoundException {
        List lista = new ArrayList();
        return lista = candidato.consultarCandidato(numeroCandidato);
    }

    public String actualizarCandidato() throws ClassNotFoundException {
        boolean actualizar = candidato.actualizarCandidato(numeroCandidato, numeroIdentificacion, fechaInscripcion, idProcesoElectoral);

        if (actualizar) {
            // vista actualizado
            return "Candidato Actualizado";
        } else {
            // vista no actualizada
            return "No se pudo actualizar el candidato";
        }
    }

}

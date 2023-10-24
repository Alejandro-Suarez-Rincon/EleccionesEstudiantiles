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
    public void crearCandidato() throws ClassNotFoundException {
        boolean crear = candidato.crearCandidato(numeroCandidato, numeroIdentificacion, fechaInscripcion, idProcesoElectoral);
        if (crear) {
            // vista creado
            System.out.println("Si");
        } else {
            // vista no creada
            System.out.println("No");
        }
    }

    public void consultarCandidato() throws ClassNotFoundException {
        List lista = new ArrayList();
        lista = candidato.consultarCandidato(numeroCandidato);

        if (lista.isEmpty()) {
            // vista no se encuentra candidato
            System.out.println("No se encuentra");
        } else {
            // vista impresion informacion
            System.out.println(lista);
        }
    }

    public void actualizarCandidato() throws ClassNotFoundException {
        boolean actualizar = candidato.actualizarCandidato(numeroCandidato, numeroIdentificacion, fechaInscripcion, idProcesoElectoral);

        if (actualizar) {
            // vista actualizado
            System.out.println("Si");
        } else {
            // vista no actualizada
            System.out.println("No");
        }
    }

}

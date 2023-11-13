package test;

import model.CandidatoDTO;

import java.sql.Timestamp;

public class TestCandidato {
    // variables
    int numeroIdentificacion = 0;
    int idProcesoElectoral = 0;
    int numeroCandidato = 1;
    Timestamp fechaInscripcion = Timestamp.valueOf("2023-10-20 22:55:10");

    CandidatoDTO candidato = new CandidatoDTO(numeroIdentificacion, idProcesoElectoral, numeroCandidato, fechaInscripcion);

    // constructor
    public TestCandidato() {

    }

    // metodos Test
    public void crear() throws ClassNotFoundException {
        candidato.crearCandidato();
    }// PASS

    public void consultar() throws ClassNotFoundException {
        candidato.consultarCandidato();
    } // PASS

    public void actualizar() throws ClassNotFoundException {
        candidato.actualizarCandidato();
    } // PASS

}

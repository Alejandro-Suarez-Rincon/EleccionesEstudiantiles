package test;

import model.VotacionDTO;

import java.sql.Timestamp;

public class TestVotacion {
    // variables
    int numeroIdentificacion = 0;
    int numeroCandidato = 1;
    Timestamp fechaVoto;

    VotacionDTO votacion = new VotacionDTO(numeroIdentificacion, numeroCandidato, fechaVoto);

    // constructor
    public TestVotacion() {

    }

    // metodos de test
    public void crear() throws ClassNotFoundException {
        votacion.crearVotacion();
    } // PASS

    public void consultar() throws ClassNotFoundException {
        votacion.consultarVotacion();
    } // PASS

    public void buscarVoto() throws ClassNotFoundException {
        votacion.buscarVoto();
    }

}

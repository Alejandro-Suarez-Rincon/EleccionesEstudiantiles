package model;

import control.VotacionDAO;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class VotacionDTO {
    // Variables
    int numeroIdentificacion;
    int numeroCandidato;
    Timestamp fechaVoto;

    VotacionDAO votacion = new VotacionDAO();

    // constructor
    public VotacionDTO(int numeroIdentificacion, int numeroCandidato, Timestamp fechaVoto) {
        this.numeroCandidato = numeroCandidato;
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaVoto = fechaVoto;
    }

    // metodos
    public void crearVotacion() throws ClassNotFoundException {
        // Obtener la fecha y hora actual
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Formatear la fecha y hora actual
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        fechaVoto = Timestamp.valueOf(formattedDateTime);


        boolean crear = votacion.crearVotacion(fechaVoto, numeroIdentificacion, numeroCandidato);
        if (crear) {
            // vista a voto registrado
            System.out.println("Si");
        } else {
            // vista a voto no registrado
            System.out.println("No");
        }
    }

    public void consultarVotacion() throws ClassNotFoundException {
        List lista = new ArrayList<>();

        lista = votacion.consultarVotacion(numeroCandidato);

        if (lista.isEmpty()) {
            // no se encuentran los votos
            System.out.println("no hay votos");
        } else {
            // mandar informacion de votos
            System.out.println(lista);
        }
    }

    public void buscarVoto() throws ClassNotFoundException {
        List lista = new ArrayList();

        lista = votacion.buscarVotacion(numeroIdentificacion);

        if (lista.isEmpty()) {
            // se puede votar
            System.out.println("se puede votar");
        } else {
            // no se puede votar
            System.out.println("no se pude votar");
        }
    }

}

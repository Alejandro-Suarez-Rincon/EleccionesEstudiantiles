package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VotacionDAO {
    // Variables

    // Metodo Constructor
    public VotacionDAO() {

    }

    // Metodos Propios
    public List consultarVotacion(int numeroCandidato) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        List listaRetorno = new ArrayList();

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("SELECT * FROM votacion WHERE numero_candidato_candidato = ?");
            sentencia.setInt(1, numeroCandidato);

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                Timestamp fechaVotoSQL = rs.getTimestamp("fecha_voto");
                int numeroIdentificacionSQL = rs.getInt("numero_identificacion_estudiante");
                int numeroCandidatoSQL = rs.getInt("numero_candidato_candidato");

                listaRetorno.addAll(Arrays.asList(fechaVotoSQL, numeroIdentificacionSQL, numeroCandidatoSQL));

                // Ver como se mete en una lista //
                //retorno = numeroCandidatoSQL + idCandidatoSQL + fechaInscripcionSQL + nombre;
            }

            // Cerrar la coneccion
            con.obtenerConexion().close();

            return listaRetorno;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean crearVotacion(Timestamp fechaVoto, int numeroIdentificacion, int numeroCandidato) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO votacion (fecha_voto, numero_identificacion_estudiante, " +
                    "numero_candidato_candidato) VALUES (?, ?, ?)");
            sentencia.setTimestamp(1, fechaVoto);
            sentencia.setInt(2, numeroIdentificacion);
            sentencia.setInt(3, numeroCandidato);

            // Reqerieminto SQL
            int creado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (creado > 0) {
                retorno = "voto creado correctamente.";
                return true;
            } else {
                retorno = "No se pudo crear.";
                return false;
            }

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public List buscarVotacion(int numeroIdentificacion) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        List listaRetorno = new ArrayList();

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("SELECT numero_identificacion_estudiante FROM votacion WHERE numero_identificacion_estudiante = ?");
            sentencia.setInt(1, numeroIdentificacion);

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) {
                int numeroIdentificacionSQL = rs.getInt("numero_identificacion_estudiante");
                if (numeroIdentificacionSQL == numeroIdentificacion) {
                    listaRetorno.add(numeroIdentificacionSQL);
                }
            }

            // Cerrar la coneccion
            con.obtenerConexion().close();

            // Hacer el retorno aqui
            return listaRetorno;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

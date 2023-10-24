package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidatoDAO {
    // Variables

    // Metodo Constructor
    public CandidatoDAO() {

    }

    // Metodos Propios
    public boolean crearCandidato(int numeroCandidato, int numeroIdentificacion, Timestamp fechaInscripcion, int idProcesoElectoral) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO candidatos (numero_candidato, numero_identificacion, fecha_inscripcion," +
                    " id_proceso_electoral) VALUES (?, ?, ?, ?)");
            sentencia.setInt(1, numeroCandidato);
            sentencia.setInt(2, numeroIdentificacion);
            sentencia.setTimestamp(3, fechaInscripcion);
            sentencia.setInt(4, idProcesoElectoral);


            // Reqerieminto SQL
            int creado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (creado > 0) {
                retorno = "Candidato creado correctamente.";
                return true;
            } else {
                retorno = "No se pudo crear.";
                return false;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List consultarCandidato(int numeroCandidato) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        List listaRetorno = new ArrayList();

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("SELECT * FROM candidatos WHERE numero_candidato = ?");
            sentencia.setInt(1, numeroCandidato);

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                int numeroCandidatoSQL = rs.getInt("numero_candidato");
                int numeroIdentificacionSQL = rs.getInt("numero_identificacion");
                Timestamp fechaInscripcionSQL = rs.getTimestamp("fecha_inscripcion");
                String idProcesoElectoralSQL = rs.getString("id_proceso_electoral");

                // Ver como se mete en una lista //
                listaRetorno.addAll(Arrays.asList(numeroCandidatoSQL, numeroIdentificacionSQL, fechaInscripcionSQL, idProcesoElectoralSQL));
                //retorno = numeroCandidatoSQL + idCandidatoSQL + fechaInscripcionSQL + nombre;
            }

            // Cerrar la coneccion
            con.obtenerConexion().close();

            return listaRetorno;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean actualizarCandidato(int numeroCandidato, int numeroIdentificacion, Timestamp fechaInscripcion, int idProcesoElectoral) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE candidatos SET numero_identificacion = ?," +
                    " fecha_inscripcion = ?,id_proceso_electoral = ? WHERE numero_candidato = ?");
            sentencia.setInt(1, numeroIdentificacion);
            sentencia.setTimestamp(2, fechaInscripcion);
            sentencia.setInt(3, idProcesoElectoral);
            sentencia.setInt(4, numeroCandidato);

            int actualizado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (actualizado > 0) {
                retorno = "Se actualizo: " + actualizado + " Columnas.";
                return true;
            } else {
                retorno = "No se actualizo correctamente.";
                return false;
            }


            // return retorno;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


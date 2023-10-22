package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class CandidatoDAO {
    // Variables

    // Metodo Constructor
    public CandidatoDAO() {

    }

    // Metodos Propios
    public void crearCandidato(int numeroIdentificacion, Timestamp fechaInscripcion, int idProcesoElectoral) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO candidatos (numero_identificacion, fecha_identificacion," +
                    " id_proceso_electoral) VALUES (?, ?, ?)");
            sentencia.setInt(1, numeroIdentificacion);
            sentencia.setTimestamp(2, fechaInscripcion);
            sentencia.setInt(3, idProcesoElectoral);


            // Reqerieminto SQL
            int creado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (creado > 0) {
                retorno = "Candidato creado correctamente.";
            } else {
                retorno = "No se pudo crear.";
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void consultarCandidato(int numeroCandidato) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

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
                //retorno = numeroCandidatoSQL + idCandidatoSQL + fechaInscripcionSQL + nombre;
            }

            // Cerrar la coneccion
            con.obtenerConexion().close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarCandidato(int numeroCandidato, int numeroIdentificacion, Timestamp fechaInscripcion, String procesoElectoral) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE candidato SET numero_identificacion = ?," +
                    " fecha_inscripcion = ?,id_proceso_electoral = ? WHERE numero_candidato = ?");
            sentencia.setInt(1, numeroIdentificacion);
            sentencia.setTimestamp(2, fechaInscripcion);
            sentencia.setString(3, procesoElectoral);
            sentencia.setInt(4, numeroCandidato);

            int actualizado = sentencia.executeUpdate();
            if (actualizado > 0) {
                retorno = "Se actualizo: " + actualizado + " Columnas.";
            } else {
                retorno = "No se actualizo correctamente.";
            }

            // Cerrar la coneccion
            con.obtenerConexion().close();
            // return retorno;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


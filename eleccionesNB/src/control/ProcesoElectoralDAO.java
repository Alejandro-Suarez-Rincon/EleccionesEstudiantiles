package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcesoElectoralDAO {
    // Variables

    // Constructor
    public ProcesoElectoralDAO() {

    }

    // Metodos
    public boolean crearProceso(int idProceso, String descripcion, Timestamp fechaEleccion, String fechaCreacion, Timestamp fechaFinalizacion) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO proceso_electoral (id_proceso, descripcion, " +
                    "fecha_eleccion, fecha_creacion, fecha_finalizacion) VALUES (?, ?, ?, ?, ?)");
            sentencia.setInt(1, idProceso);
            sentencia.setString(2, descripcion);
            sentencia.setTimestamp(3, fechaEleccion);
            sentencia.setString(4, fechaCreacion);
            sentencia.setTimestamp(5, fechaFinalizacion);

            // Reqerieminto SQL
            int creado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (creado > 0) {
                retorno = "proceso Creado Correctamente.";
                return true;
            } else {
                retorno = "No se insertaron datos.";
                return false;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean actualizarProceso(int idProceso, String descripcion, Timestamp fechaEleccion, Timestamp fechaFinalizacion) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE proceso_electoral SET descripcion = ?, fecha_eleccion = ?, " +
                    "fecha_finalizacion = ? WHERE id_proceso = ?");
            sentencia.setString(1, descripcion);
            sentencia.setTimestamp(2, fechaEleccion);
            sentencia.setTimestamp(3, fechaFinalizacion);
            sentencia.setInt(4, idProceso);

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

    public List consultarProceso(int idProceso) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        List listaRetorno = new ArrayList();
        String mensajeRetorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("SELECT * FROM proceso_electoral WHERE id_proceso = ?");
            sentencia.setInt(1, idProceso);

            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                int idProcesoSQL = rs.getInt("id_proceso");
                String descripcionSQL = rs.getString("descripcion");
                Timestamp fechaEleccionSQL = rs.getTimestamp("fecha_eleccion");
                Timestamp fechaCreacionSQL = rs.getTimestamp("fecha_creacion");
                Timestamp fechaFinalizacionSQL = rs.getTimestamp("fecha_finalizacion");

                listaRetorno.addAll(Arrays.asList(idProcesoSQL, descripcionSQL, fechaEleccionSQL, fechaCreacionSQL, fechaFinalizacionSQL));
            }

            // Retornar lista
            return listaRetorno;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void buscarProceso() {

    }

}

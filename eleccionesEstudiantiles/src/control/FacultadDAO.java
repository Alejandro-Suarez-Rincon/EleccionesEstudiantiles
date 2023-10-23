package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FacultadDAO {
    // Variables

    // Constructor
    public FacultadDAO() {

    }

    // Metodos
    public void crearFacultad(int idFacultad, String nombre, String estado) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO facultad (id_facultad, nombre_facultad, estado) " +
                    "VALUES (?, ?, ?)");
            sentencia.setInt(1, idFacultad);
            sentencia.setString(2, nombre);
            sentencia.setString(3, estado);

            // Reqerieminto SQL
            int creado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (creado > 0) {
                retorno = "Facultad Creado Correctamente.";
            } else {
                retorno = "No se insertaron datos.";
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarFacultad(int idFacultad, String nombre) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE facultad SET nombre_facultad = ? WHERE id_facultad = ?");
            sentencia.setString(1, nombre);
            sentencia.setInt(2, idFacultad);

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

    public void consultarFacultad(int idFacultad) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        List listaRetorno = new ArrayList();
        String mensajeRetorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("SELECT * FROM facultad WHERE id_facultad = ?");
            sentencia.setInt(1, idFacultad);

            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                int idFacultadSQL = rs.getInt("id_facultad");
                String nombreSQL = rs.getString("nombre_facultad");
                String estadoSQL = rs.getString("estado");

                listaRetorno.addAll(Arrays.asList(idFacultadSQL, nombreSQL, estadoSQL));
            }

            // Retornar lista


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void estadoFacultad(int idFacultad, String estado) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE facultad SET estado = ? WHERE id_facultad = ?");
            sentencia.setString(1, estado);
            sentencia.setInt(2, idFacultad);

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

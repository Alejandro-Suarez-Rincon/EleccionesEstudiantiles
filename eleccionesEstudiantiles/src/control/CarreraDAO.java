package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarreraDAO {
    // Variables

    // Constructor
    public CarreraDAO() {

    }

    // Metodos
    public void crearCarrera(int idCarrera, int idFacultad, String nombre, String estado) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO carrera (id_carrera, nombre_facultad, " +
                    "id_facultad_carrera) VALUES (?, ?, ?, ?)");
            sentencia.setInt(1, idCarrera);
            sentencia.setString(2, nombre);
            sentencia.setInt(3, idFacultad);
            sentencia.setString(4, estado);

            // Reqerieminto SQL
            int creado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (creado > 0) {
                retorno = "Carrera Creado Correctamente.";
            } else {
                retorno = "No se insertaron datos.";
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarCarrera(int idCarrera, int idFacultad, String nombre) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE carrera SET nombre_facultad = ?, " +
                    "id_facultad_carrera = ? WHERE id_carrera = ?");
            sentencia.setString(1, nombre);
            sentencia.setInt(2, idFacultad);
            sentencia.setInt(2, idCarrera);

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

    public void consultarCarrera(int idCarrera) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        List listaRetorno = new ArrayList();
        String mensajeRetorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("SELECT * FROM carrera WHERE id_carrera = ?");
            sentencia.setInt(1, idCarrera);

            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                int idCarreraSQL = rs.getInt("id_facultad");
                String nombreSQL = rs.getString("nombre_facultad");
                int idFacultadSQL = rs.getInt("id_facultad");
                String estadoSQL = rs.getString("estado");

                listaRetorno.addAll(Arrays.asList(idCarreraSQL, nombreSQL, idFacultadSQL, estadoSQL));
            }

            // Retornar lista


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void estadoCarrera(int idCarrera, String estado) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE carrera SET estado = ? WHERE id_carrera = ?");
            sentencia.setString(1, estado);
            sentencia.setInt(2, idCarrera);

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

package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsuarioDAO {
    // Variables

    // Metodo Constructor
    public UsuarioDAO() {

    }

    // Metodos Propios
    public List consultarUsuario(int numeroIdentificacion, String correo) throws ClassNotFoundException, SQLException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        List listaRetorno = new ArrayList();
        String mensajeRetorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("SELECT * FROM usuario WHERE numero_identificacion = ? AND correo = ?");
            sentencia.setInt(1, numeroIdentificacion);
            sentencia.setString(2, correo);

            ResultSet rs = sentencia.executeQuery();

            while (rs.next()) {
                int idSQL = rs.getInt("numero_identificacion");
                String correoSQL = rs.getString("correo");

                if (idSQL == numeroIdentificacion && correoSQL.equals(correo)) {
                    String estadoSQL = rs.getString("estado");
                    if (estadoSQL.equals("ACTIVO")) {
                        String rolSQL = rs.getString("rol");
                        String nombreSQL = rs.getString("nombre");
                        String apellidoSQL = rs.getString("apellido");
                        long telefonoSQL = rs.getLong("telefono");
                        String sexoSQL = rs.getString("sexo");
                        int idCarreraSQL = rs.getInt("id_carrera_estudiante");
                        int idMunicipioSQL = rs.getInt("id_municipio_estudiante");

                        listaRetorno.add(nombreSQL);
                        listaRetorno.add(apellidoSQL);
                        listaRetorno.add(telefonoSQL);
                        listaRetorno.add(sexoSQL);
                        listaRetorno.add(idCarreraSQL);
                        listaRetorno.add(idMunicipioSQL);
                        listaRetorno.add(rolSQL);
                        listaRetorno.add(estadoSQL);
                        listaRetorno.add(correoSQL);
                        listaRetorno.add(idSQL);


                        return listaRetorno;
                    } else {
                        return listaRetorno;
                    }
                }
            }
            // Cerrar la coneccion
            con.obtenerConexion().close();
            return listaRetorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean desactivarEstudiante(int numeroIdentificacion, String estado) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";
        boolean rtn = false;
        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE usuario SET estado = ? WHERE numero_identificacion = ?");
            sentencia.setString(1, estado);
            sentencia.setInt(2, numeroIdentificacion);

            int actualizado = sentencia.executeUpdate();
            if (actualizado > 0) {
                retorno = "Se actualizo: " + actualizado + " Columnas.";
                rtn = true;
            } else {
                retorno = "No se actualizo correctamente.";
                rtn = false;
            }

            // Cerrar la coneccion
            con.obtenerConexion().close();
            return rtn;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean crearEstudiante(int numeroIdentificacion, String nombre, String apellido, String correo, long telefono, String sexo, int idCarrera, int idMunicipio, String estado, String rol) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO usuario (numero_identificacion, nombre, apellido, correo, telefono, sexo, id_carrera_estudiante, id_municipio_estudiante, estado, rol) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            sentencia.setInt(1, numeroIdentificacion);
            sentencia.setString(2, nombre);
            sentencia.setString(3, apellido);
            sentencia.setString(4, correo);
            sentencia.setLong(5, telefono);
            sentencia.setString(6, sexo);
            sentencia.setInt(7, idCarrera);
            sentencia.setInt(8, idMunicipio);
            sentencia.setString(9, estado);
            sentencia.setString(10, rol);

            // Reqerieminto SQL
            int creado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (creado > 0) {
                retorno = "Estudiente Creado Correctamente.";
                return true;
            } else {
                retorno = "No se insertaron datos.";
                return false;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean actualizarEstudiante(int numeroIdentificacion, String nombre, String apellido, String correo, long telefono, String sexo, int idCarrera, int idMunicipio, String estado, String rol) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";
        boolean rtn = false;

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE usuario SET nombre = ?, apellido = ?, correo = ?, telefono = ?, sexo = ?, id_carrera_estudiante = ?, id_municipio_estudiante = ?, estado = ?, rol = ? WHERE numero_identificacion = ?");
            sentencia.setString(1, nombre);
            sentencia.setString(2, apellido);
            sentencia.setString(3, correo);
            sentencia.setLong(4, telefono);
            sentencia.setString(5, sexo);
            sentencia.setInt(6, idCarrera);
            sentencia.setInt(7, idMunicipio);
            sentencia.setString(8, estado);
            sentencia.setString(9, rol);
            sentencia.setInt(10, numeroIdentificacion);


            int actualizado = sentencia.executeUpdate();
            if (actualizado > 0) {
                retorno = "Se actualizo: " + actualizado + " Columnas.";
                rtn = true;
            } else {
                retorno = "No se actualizo correctamente.";
                rtn = false;
            }

            // Cerrar la coneccion
            con.obtenerConexion().close();
            return rtn;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

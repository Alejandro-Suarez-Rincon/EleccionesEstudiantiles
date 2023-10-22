package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsuarioDAO {
    // Variables

    // Metodo Constructor
    public UsuarioDAO() {

    }

    // Metodos Propios
    public void consultarUsuario(int numeroIdentificacion, String correo) throws ClassNotFoundException {
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

                if (idSQL == numeroIdentificacion && correoSQL == correo) {
                    String estadoSQL = rs.getString("estado");
                    if (estadoSQL == "Activo") {
                        String rolSQL = rs.getString("rol");
                        if (rolSQL == "Estudiante") {
                            String nombreSQL = rs.getString("nombre");
                            String apellidoSQL = rs.getString("apellido");
                            long telefonoSQL = rs.getLong("telefono");
                            String sexoSQL = rs.getString("sexo");
                            int idCarreraSQL = rs.getInt("id_carrera_estudiante");
                            int idMunicipioSQL = rs.getInt("id_municipio_estudiante");

                            listaRetorno.addAll(Arrays.asList(nombreSQL, apellidoSQL, telefonoSQL, sexoSQL, idCarreraSQL,
                                    idMunicipioSQL, rolSQL, estadoSQL, correoSQL, idSQL));

                        } else if (rolSQL == "Administrador") {
                            String nombreSQL = rs.getString("nombre");
                            String apellidoSQL = rs.getString("apellido");
                            long telefonoSQL = rs.getLong("telefono");
                            String sexoSQL = rs.getString("sexo");
                            listaRetorno.addAll(Arrays.asList(nombreSQL, apellidoSQL, telefonoSQL, sexoSQL, rolSQL,
                                    estadoSQL, correoSQL, idSQL));
                        } else {
                            mensajeRetorno = "No se reconoce el rol.";
                        }
                    } else {
                        mensajeRetorno = "El usuario no se encuentra activo.";
                    }
                } else {
                    mensajeRetorno = "No se encontro el estudiante";
                }
            }

            // Cerrar la coneccion
            con.obtenerConexion().close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void desactivarEstudiante(int numeroIdentificacion, String estado) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";
        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE estudiantes SET estado = ? WHERE numero_identificacion = ?");
            sentencia.setString(1, estado);
            sentencia.setInt(2, numeroIdentificacion);

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

    public void crearEstudiante(int numeroIdentificacion, String nombre, String apellido, String correo, long telefono, String sexo, int idCarrera, int idMunicipio, String estado) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO estudiantes (numero_identificacion, nombre, apellido, correo, telefono, sexo, id_carrera_estudiante, id_municipio_estudiante, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
            sentencia.setInt(1, numeroIdentificacion);
            sentencia.setString(2, nombre);
            sentencia.setString(3, apellido);
            sentencia.setString(4, correo);
            sentencia.setLong(5, telefono);
            sentencia.setString(6, sexo);
            sentencia.setInt(7, idCarrera);
            sentencia.setInt(8, idMunicipio);
            sentencia.setString(9, estado);

            // Reqerieminto SQL
            int creado = sentencia.executeUpdate();

            // Cerrar la coneccion
            con.obtenerConexion().close();

            if (creado > 0) {
                retorno = "Estudiente Creado Correctamente.";
            } else {
                retorno = "No se insertaron datos.";
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void actualizarEstudiante(int numeroIdentificacion, String nombre, String apellido, String correo, long telefono, String sexo, int idCarrera, int idMunicipio, String estado) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("UPDATE estudiantes SET nombre = ?, apellido = ?, correo = ?, telefono = ?, sexo = ?, id_carrera_estudiante = ?, id_municipio_estudiante = ?, estado = ? WHERE numero_identificacion = ?");
            sentencia.setString(1, nombre);
            sentencia.setString(2, apellido);
            sentencia.setString(3, correo);
            sentencia.setLong(4, telefono);
            sentencia.setString(5, sexo);
            sentencia.setInt(6, idCarrera);
            sentencia.setInt(7, idMunicipio);
            sentencia.setString(8, estado);
            sentencia.setInt(9, numeroIdentificacion);

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

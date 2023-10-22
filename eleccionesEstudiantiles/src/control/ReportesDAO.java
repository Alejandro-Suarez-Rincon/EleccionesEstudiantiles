package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReportesDAO {
    // variables

    // constructor
    public ReportesDAO(){

    }

    // Metodos
    public void crearReporte(int idProcesoElectoral, int idVotacion) throws ClassNotFoundException {
        Conexion con = new Conexion();
        PreparedStatement sentencia = null;
        String retorno = "";

        try {
            // Sentencia SQL
            sentencia = con.obtenerConexion().prepareStatement("INSERT INTO reportes (id_porceso_electoral, id_votacion) " +
                    "VALUES (?, ?)");
            sentencia.setInt(1, idProcesoElectoral);
            sentencia.setInt(2, idVotacion);


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

}

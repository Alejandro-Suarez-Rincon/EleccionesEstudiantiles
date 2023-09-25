package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conexion {

    public Connection obtenerConexion() throws ClassNotFoundException {
        Connection conexion = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/elecciones_uno", "root", "alejandro");//datos necesarios para conectar con la red

            System.out.println("Conexion a la base de datos exitosa");

        } catch (SQLException e) {

            System.out.println("Falla en la conexion a la DB \n");
        }
        return conexion;//objeto que nos permite identificar la conexion a la BD

    }
}

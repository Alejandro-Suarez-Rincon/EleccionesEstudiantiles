import control.UsuarioDAO;
import test.TestUsuario;

import java.sql.SQLException;

public class Run {
    /*public static void main(String[] args) throws ClassNotFoundException {
        UsuarioDAO es = new UsuarioDAO();

    }*/

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        TestUsuario ts = new TestUsuario();
        ts.registrar();
    }
}

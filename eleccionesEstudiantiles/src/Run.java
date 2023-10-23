import control.UsuarioDAO;
import test.TestCarrera;
import test.TestFacultad;
import test.TestUsuario;

import java.sql.SQLException;

public class Run {
    /*public static void main(String[] args) throws ClassNotFoundException {
        UsuarioDAO es = new UsuarioDAO();

    }*/

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        TestCarrera tc = new TestCarrera();
        tc.estadoTest();
    }
}

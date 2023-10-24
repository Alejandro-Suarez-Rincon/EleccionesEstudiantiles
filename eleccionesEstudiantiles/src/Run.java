import test.TestReportes;
import test.TestVotacion;

import java.sql.SQLException;

public class Run {
    /*public static void main(String[] args) throws ClassNotFoundException {
        UsuarioDAO es = new UsuarioDAO();

    }*/

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        TestReportes tc = new TestReportes();
        tc.crear();
    }
}

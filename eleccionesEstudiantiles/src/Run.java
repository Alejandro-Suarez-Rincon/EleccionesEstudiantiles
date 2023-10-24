import test.TestProcesoElectoral;

import java.sql.SQLException;

public class Run {
    /*public static void main(String[] args) throws ClassNotFoundException {
        UsuarioDAO es = new UsuarioDAO();

    }*/

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        TestProcesoElectoral tc = new TestProcesoElectoral();
        tc.consultar();
    }
}

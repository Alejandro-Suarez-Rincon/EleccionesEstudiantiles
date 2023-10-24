import test.TestVotacion;

import java.sql.SQLException;

public class Run {
    /*public static void main(String[] args) throws ClassNotFoundException {
        UsuarioDAO es = new UsuarioDAO();

    }*/

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        TestVotacion tc = new TestVotacion();
        tc.buscarVoto();
    }
}

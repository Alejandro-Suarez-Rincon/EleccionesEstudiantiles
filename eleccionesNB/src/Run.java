import control.Controlador;
import java.sql.SQLException;
import test.TestCarrera;
import test.TestReportes;

public class Run {
    /*public static void main(String[] args) throws ClassNotFoundException {
        UsuarioDAO es = new UsuarioDAO();

    }*/
    
    /*public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.Inicio();
    }*/
    
    public static void main(String[] args) throws ClassNotFoundException {
        TestCarrera tc = new TestCarrera();
        tc.consultar();
    }
}

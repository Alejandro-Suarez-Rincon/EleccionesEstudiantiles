package test;

import model.UsuarioDTO;

import java.sql.SQLException;

public class TestUsuario {
    // Variables
    private int numeroIdentificacion = 1;
    private String nombre = "administrador";
    private String apellido = "apellido";
    private String correo = "administrador@correo";
    private int numeroTelefonico = 300000000;
    private String sexo = "M";
    private String estado = "ACTIVO";
    private int idCarrera = 0;
    private int idMunicipio = 0;
    private String rol = "ADMINISTRADOR";

    UsuarioDTO usuario = new UsuarioDTO(numeroIdentificacion, nombre, apellido, correo, numeroTelefonico,
            sexo, estado, idCarrera, idMunicipio, rol);
    // Constructor
    public TestUsuario(){

    }

    // metodos de test
    public void descartivar() throws ClassNotFoundException {
        usuario.desactivarEstudiante();
    } // pass

    public void actualizar() throws ClassNotFoundException {
        usuario.actrualizar();
    } // pass

    public void login() throws SQLException, ClassNotFoundException {
        usuario.logeo();
    }// pass

    public void registrar() throws ClassNotFoundException {
        // se va a registrar un ADMIN
        usuario.registrarAdministrador();
    }// pass
}

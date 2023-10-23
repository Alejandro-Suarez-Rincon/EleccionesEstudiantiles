package model;

import control.UsuarioDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDTO {
    // Variables
    private int numeroIdentificacion;
    private String nombre;
    private String apellido;
    private String correo;
    private int numeroTelefonico;
    private String sexo;
    private String estado;
    private int idCarrera;
    private int idMunicipio;
    private String rol;
    UsuarioDAO usuario = new UsuarioDAO();

    // Metodo Constructor
    public UsuarioDTO(int numeroIdentificacion, String nombre, String apellido, String correo, int numeroTelefonico,
                      String sexo, String estado, int idCarrera, int idMunicipio, String rol) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroTelefonico = numeroTelefonico;
        this.sexo = sexo;
        this.estado = estado;
        this.idCarrera = idCarrera;
        this.idMunicipio = idMunicipio;
        this.rol = rol;
    }

    // Metodos Propios
    public void registrarEstudiante() throws ClassNotFoundException {
        // <<rol>> tiene que ser <<ESTUDIANTE>>

        boolean usr = usuario.crearEstudiante(numeroIdentificacion, nombre, apellido, correo, numeroTelefonico, sexo, idCarrera, idMunicipio,
                estado, rol);

        if(usr){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }

        System.out.println(usr);
    }

    public void registrarAdministrador() throws ClassNotFoundException {
        // <<rol>> tiene que ser <<ADMIN>>
        // <<carrera>> tiene que se <<0>>

        boolean usr = usuario.crearEstudiante(numeroIdentificacion, nombre, apellido, correo, numeroTelefonico, sexo, idCarrera, idMunicipio,
                estado, rol);
        if(usr){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }

        System.out.println(usr);
    }

    public void logeo() throws ClassNotFoundException, SQLException {
        List lista = new ArrayList<>();
        lista = usuario.consultarUsuario(numeroIdentificacion, correo);

        if (lista.size() == 0){
            // mensaje no se encontro el usuario
            System.out.println("No se encuentra");

        } else if(lista.get(6).equals("ESTUDIANTE")){
            // ir a vista Estudiante
            System.out.println("ESTUDIANTE");

        }else if (lista.get(6).equals("ADMIN")){
            // ir a vista ADMIN
            System.out.println("ADMIN");
        }

    }

    public void desactivarEstudiante() throws ClassNotFoundException {
        boolean desactivar;
        desactivar = usuario.desactivarEstudiante(numeroIdentificacion, estado);
        if (desactivar == true) {
            // ir a vista de que si
            System.out.println("Si");
        } else {
            // ir a vista de que no
            System.out.println("NO");
        }
    }

    public void actrualizar() throws ClassNotFoundException {
        boolean actualizar;
        actualizar = usuario.actualizarEstudiante(numeroIdentificacion, nombre, apellido, correo, numeroTelefonico, sexo,
                idCarrera, idMunicipio, estado, rol);

        if (actualizar == true) {
            // ir a vista de que si
            System.out.println("Si");
        } else {
            // ir a vista de que no
            System.out.println("NO");
        }
    }

}

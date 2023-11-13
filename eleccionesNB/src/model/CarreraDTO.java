package model;

import control.CarreraDAO;
import control.FacultadDAO;

import java.util.ArrayList;
import java.util.List;

public class CarreraDTO {
    // Variables
    int idCarrera;
    int idFacultad;
    String nombre;
    String estado;
    CarreraDAO carrera = new CarreraDAO();

    // Constructor
    public CarreraDTO(int idCarrera, int idFacultad, String nombre, String estado) {
        this.idCarrera = idCarrera;
        this.idFacultad = idFacultad;
        this.nombre = nombre;
        this.estado = estado;
    }

    // Metodos
    public void crearCarrera() throws ClassNotFoundException {
        FacultadDAO facultad = new FacultadDAO();
        List consultar = new ArrayList<>();
        consultar = facultad.consultarFacultad(idFacultad);

        if (consultar.isEmpty()) {
            // vista no se encuentra la facultad
            System.out.println("no se encuentra la facultad");
        } else if (consultar.get(2).equals("ACTIVA")) {
            // se hace la creacion
            boolean crear = carrera.crearCarrera(idCarrera, idFacultad, nombre, estado);

            if (crear) {
                // vista creada
                System.out.println("Si");
            } else {
                // vista no creada
                System.out.println("No");
            }
        } else {
            // vista no se crea por no estar activada la facultad
            System.out.println("facultad no activa");
        }
    }

    public void actualizarCarrera() throws ClassNotFoundException {
        boolean actualizar = carrera.actualizarCarrera(idCarrera, idFacultad, nombre);

        if (actualizar) {
            // vista Actaulizada
            System.out.println("si");
        } else {
            // vista no creada
            System.out.println("no");
        }
    }

    public void consultarCarrera() throws ClassNotFoundException {
        List lista = new ArrayList();
        lista = carrera.consultarCarrera(idCarrera);

        if (lista.isEmpty()) {
            // vista no se encontro nada
            System.out.println("carrera no encontrada");
        } else {
            // vista carrera encontrada
            System.out.println(lista);
        }
    }

    public void estadoCarrera() throws ClassNotFoundException {
        boolean est = carrera.estadoCarrera(idCarrera, estado);

        if (est) {
            // vista estado si
            System.out.println("Si");
        } else {
            // vista estado no
            System.out.println("No");
        }
    }

}

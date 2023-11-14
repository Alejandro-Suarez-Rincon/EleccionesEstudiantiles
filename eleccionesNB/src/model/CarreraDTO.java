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
    public String crearCarrera() throws ClassNotFoundException {
        FacultadDAO facultad = new FacultadDAO();
        List consultar = new ArrayList<>();
        consultar = facultad.consultarFacultad(idFacultad);

        if (consultar.isEmpty()) {
            // vista no se encuentra la facultad
            return "no se encuentra la facultad";
        } else if (consultar.get(2).equals("ACTIVA")) {
            // se hace la creacion
            boolean crear = carrera.crearCarrera(idCarrera, idFacultad, nombre, estado);

            if (crear) {
                // vista creada
                return "Carrera Creada";
            } else {
                // vista no creada
                return "No se Creo la Carrera";
            }
        } else {
            // vista no se crea por no estar activada la facultad
            System.out.println("facultad no activa");
            return "Facultad no Activa";
        }
    }

    public String actualizarCarrera() throws ClassNotFoundException {
        boolean actualizar = carrera.actualizarCarrera(idCarrera, idFacultad, nombre);

        if (actualizar) {
            // vista Actaulizada
            return "Se actualizo Correctamente";
        } else {
            // vista no creada
            return "Carrera No Actualizo";
        }
    }

    public List consultarCarrera() throws ClassNotFoundException {
        List lista = new ArrayList();
        lista = carrera.consultarCarrera(idCarrera);
        
        return lista;
        
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

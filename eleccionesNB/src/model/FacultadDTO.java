package model;


import control.FacultadDAO;

import java.util.ArrayList;
import java.util.List;

public class FacultadDTO {
    // variables
    int idFacultad;
    String nombre;
    String estado;
    FacultadDAO facultad = new FacultadDAO();


    // constructor
    public FacultadDTO(int idFacultad, String nombre, String estado) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
        this.estado = estado;
    }

    // metodos
    public String crear() throws ClassNotFoundException {
        boolean crr = facultad.crearFacultad(idFacultad, nombre, estado);
        if (crr) {
            // vista creada si
            return "Se creo la facultad";
        } else {
            // vista creada no
            return "No se creo la facultad";
        }
    }

    public String actualizar() throws ClassNotFoundException {
        boolean actz = facultad.actualizarFacultad(idFacultad, nombre);
        if (actz) {
            // vista actualizada si
            return "La facultad se Actualizo";
        } else {
            // vista actualizada no
            return "La facultad no se Actualizo";
        }
    }

    public List consultar() throws ClassNotFoundException {
        List lista = new ArrayList<>();
        return lista = facultad.consultarFacultad(idFacultad);
    }

    public void estado() throws ClassNotFoundException {
        boolean est = facultad.estadoFacultad(idFacultad, estado);

        if (est) {
            // actualizado
            System.out.println("si");
        } else {
            // no actualizado
            System.out.println("no");
        }
    }
}

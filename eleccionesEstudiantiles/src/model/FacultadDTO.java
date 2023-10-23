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
    public void crear() throws ClassNotFoundException {
        boolean crr = facultad.crearFacultad(idFacultad, nombre, estado);
        if (crr) {
            // vista creada si
            System.out.println("Si");
        } else {
            // vista creada no
            System.out.println("No");
        }
    }

    public void actualizar() throws ClassNotFoundException {
        boolean actz = facultad.actualizarFacultad(idFacultad, nombre);
        if (actz) {
            // vista actualizada si
            System.out.println("Si");
        } else {
            // vista actualizada no
            System.out.println("No");
        }
    }

    public void consultar() throws ClassNotFoundException {
        List lista = new ArrayList<>();
        lista = facultad.consultarFacultad(idFacultad);

        if (lista.isEmpty()) {
            // no se encuentra la facultad
            System.out.println("no se encuentra");
        } else {
            // facultad encontrada
            System.out.println(lista);
        }
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

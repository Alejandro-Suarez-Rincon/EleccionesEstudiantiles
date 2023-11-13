package test;

import model.FacultadDTO;

public class TestFacultad {
    // variables
    int idFacultad = 0;
    String nombre = "Derecho";
    String estado = "ACTIVA";
    FacultadDTO facultad = new FacultadDTO(idFacultad, nombre, estado);

    // constructor
    public TestFacultad() {

    }

    // metodos de test
    public void crear() throws ClassNotFoundException {
        facultad.crear();
    } // PASS

    public void actualizar() throws ClassNotFoundException {
        facultad.actualizar();
    }// PASS

    public void consultar() throws ClassNotFoundException {
        facultad.consultar();
    }// PASS

    public void estado() throws ClassNotFoundException {
        facultad.estado();
    }// PASS

}

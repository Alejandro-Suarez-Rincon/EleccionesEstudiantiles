package test;

import model.CarreraDTO;

public class TestCarrera {
    // variables
    int idCarrera = 0;
    int idFacultad = 0;
    String nombre = "Ingenieria de Sistemas";
    String estado = "ACTIVA";
    CarreraDTO carrera = new CarreraDTO(idCarrera, idFacultad, nombre, estado);

    // constructor
    public TestCarrera() {

    }

    // metodos test
    public void crear() throws ClassNotFoundException {
        carrera.crearCarrera();
    }// PASS

    public void actualizar() throws ClassNotFoundException {
        carrera.actualizarCarrera();
    }// PASS

    public void consultar() throws ClassNotFoundException {
        carrera.consultarCarrera();
    }// PASS

    public void estadoTest() throws ClassNotFoundException {
        carrera.estadoCarrera();
    }// PASS
}

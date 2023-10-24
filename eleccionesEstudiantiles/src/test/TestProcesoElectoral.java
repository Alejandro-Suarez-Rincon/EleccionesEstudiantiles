package test;

import model.ProcesoElectoralDTO;

import java.sql.Timestamp;

public class TestProcesoElectoral {
    // Variables
    int idProceso = 0;
    String descripcion = "Representante Facultad de Ingenieria y Ciencias Basicas";
    Timestamp fechaEleccion = Timestamp.valueOf("2023-10-23 20:03:01");
    String fechaCreacion;
    Timestamp fechaFinalizacion = Timestamp.valueOf("2023-11-30 20:03:01");

    ProcesoElectoralDTO proceso = new ProcesoElectoralDTO(idProceso, descripcion, fechaEleccion, fechaCreacion, fechaFinalizacion);

    // construcotr
    public TestProcesoElectoral() {

    }

    // metodos de test
    public void crear() throws ClassNotFoundException {
        proceso.crearProceso();
    } // PASS

    public void actualizar() throws ClassNotFoundException {
        proceso.actualizarProceso();
    } // PASS

    public void consultar() throws ClassNotFoundException {
        proceso.consultarProceso();
    } // PASS

}

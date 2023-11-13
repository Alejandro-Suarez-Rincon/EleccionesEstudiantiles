package test;

import model.ReportesDTO;

public class TestReportes {
    // variables
    int idProcesoElectoral = 0;
    int idVotacion = 1;

    ReportesDTO reportes = new ReportesDTO(idProcesoElectoral, idVotacion);

    // constructor
    public TestReportes() {

    }

    // metodos de test
    public void crear() throws ClassNotFoundException {
        reportes.crearReporte();
    } // PASS
}

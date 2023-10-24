package model;

import control.ReportesDAO;

public class ReportesDTO {
    // variables
    int idProcesoElectoral;
    int idVotacion;

    ReportesDAO reportes = new ReportesDAO();

    // constructor
    public ReportesDTO(int idProcesoElectoral, int idVotacion) {
        this.idProcesoElectoral = idProcesoElectoral;
        this.idVotacion = idVotacion;
    }

    // metodos
    public void crearReporte() throws ClassNotFoundException {
        boolean crear = reportes.crearReporte(idProcesoElectoral, idVotacion);

        if (crear) {
            // vista reporte creado
            System.out.println("SI");
        } else {
            // vista reporte no creado
            System.out.println("no creado");
        }
    }

}

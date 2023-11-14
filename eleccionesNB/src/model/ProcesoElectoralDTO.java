package model;

import control.ProcesoElectoralDAO;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ProcesoElectoralDTO {

    // variables
    int idProceso;
    String descripcion;
    Timestamp fechaEleccion;
    String fechaCreacion;
    Timestamp fechaFinalizacion;
    ProcesoElectoralDAO proceso = new ProcesoElectoralDAO();

    // constructor
    public ProcesoElectoralDTO(int idProceso, String descripcion, Timestamp fechaEleccion, String fechaCreacion, Timestamp fechaFinalizacion) {
        this.idProceso = idProceso;
        this.descripcion = descripcion;
        this.fechaEleccion = fechaEleccion;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    // metodos
    public String crearProceso() throws ClassNotFoundException {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        fechaCreacion = currentDateTime.format(formatter);

        boolean crear = proceso.crearProceso(idProceso, descripcion, fechaEleccion, fechaCreacion, fechaFinalizacion);
        if (crear) {
            // vista creado correcto
            return "Se creo el Proceso";
        } else {
            // vista no creado
            return "No se  pudo crear el proceso";
        }
    }

    public String actualizarProceso() throws ClassNotFoundException {
        boolean crear = proceso.actualizarProceso(idProceso, descripcion, fechaEleccion, fechaFinalizacion);
        if (crear) {
            // vista actualizada
            return "Se actualizo el Proceso electoral " + descripcion;
        } else {
            // vista no creado
            return "No se pudo actualizar el proceso";
        }
    }

    public List consultarProceso() throws ClassNotFoundException {
        List lista = new ArrayList();
        return lista = proceso.consultarProceso(idProceso);
    }
}

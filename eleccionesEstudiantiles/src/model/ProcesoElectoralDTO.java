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
    public void crearProceso() throws ClassNotFoundException {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        fechaCreacion = currentDateTime.format(formatter);

        boolean crear = proceso.crearProceso(idProceso, descripcion, fechaEleccion, fechaCreacion, fechaFinalizacion);
        if (crear) {
            // vista creado correcto
            System.out.println("Si");
        } else {
            // vista no creado
            System.out.println("No");
        }
    }

    public void actualizarProceso() throws ClassNotFoundException {
        boolean crear = proceso.actualizarProceso(idProceso, descripcion, fechaEleccion, fechaFinalizacion);
        if (crear) {
            // vista actualizada
            System.out.println("Si");
        } else {
            // vista no creado
            System.out.println("No");
        }
    }

    public void consultarProceso() throws ClassNotFoundException {
        List lista = new ArrayList();
        lista = proceso.consultarProceso(idProceso);
        if (lista.isEmpty()) {
            // no se exuentra el proceso
            System.out.println("No se encuentra");
        } else {
            // enseñar datos
            System.out.println(lista);
        }

    }


}

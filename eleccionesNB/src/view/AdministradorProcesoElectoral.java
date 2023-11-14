/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ProcesoElectoralDTO;



/**
 *
 * @author aleja
 */
public class AdministradorProcesoElectoral extends javax.swing.JFrame {

    public AdministradorProcesoElectoral() {

        initComponents();
        this.setLocationRelativeTo(null);// Centra la pantalla
        panelActualizar.setVisible(false);
        panelCrear.setVisible(false);
        panelConsultar.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        comboEstudiante = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboCarrera = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboFacultad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboProcesoElectoral = new javax.swing.JComboBox<>();
        panelCrear = new javax.swing.JPanel();
        textoDescripcion = new javax.swing.JTextField();
        textoFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonCrear = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        textoIDProceso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoFechaFinalizacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        panelConsultar = new javax.swing.JPanel();
        Consultar = new javax.swing.JLabel();
        idFacultadImprimir = new javax.swing.JTextField();
        DescripcionImprimir = new javax.swing.JTextField();
        fechaImprimir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        idProcesoConsulta = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        fechaFinalizacion = new javax.swing.JTextField();
        fechaCreacion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        panelActualizar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        textoDescripcionActualizar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textoFechaEleccionActualizar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        botonActualizar = new javax.swing.JButton();
        textoFechaFinalizacionActualizar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textoIDProcesoActualizar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        comboEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Registrar", "Actualizar", "Desactivar" }));
        comboEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstudianteActionPerformed(evt);
            }
        });

        jLabel1.setText("Estudiante");

        jLabel2.setText("Carrera");

        comboCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Crear", "Consultar", "Actualizar", "Estado" }));
        comboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCarreraActionPerformed(evt);
            }
        });

        jLabel3.setText("Facultad");

        comboFacultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Crear", "Actualizar", "Consultar", "Estado" }));
        comboFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFacultadActionPerformed(evt);
            }
        });

        jLabel4.setText("Proceso Electoral");

        comboProcesoElectoral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Crear", "Actualizar", "Consultar" }));
        comboProcesoElectoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProcesoElectoralActionPerformed(evt);
            }
        });

        jLabel6.setText("Descripcion");

        jLabel7.setText("Fecha Eleccion");

        botonCrear.setText("Crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        jLabel16.setText("Crear");

        jLabel5.setText("ID Proceso");

        jLabel10.setText("Fecha Finalizacion");

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrearLayout.createSequentialGroup()
                                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoIDProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)))
                            .addGroup(panelCrearLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel16))))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(botonCrear)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoIDProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCrear)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Consultar.setText("Consultar");

        jLabel12.setText("ID Proceso");

        jLabel14.setText("Descripcion");

        jLabel18.setText("Fecha Eleccion");

        jLabel19.setText("ID Proceso");

        idProcesoConsulta.setToolTipText("");

        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        jLabel20.setText("Fecha Creacion");

        jLabel21.setText("Fecha FInalizacion");

        javax.swing.GroupLayout panelConsultarLayout = new javax.swing.GroupLayout(panelConsultar);
        panelConsultar.setLayout(panelConsultarLayout);
        panelConsultarLayout.setHorizontalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Consultar)
                .addGap(280, 280, 280))
            .addGroup(panelConsultarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idFacultadImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultarLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                        .addComponent(idProcesoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(panelConsultarLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(114, 114, 114))
                    .addGroup(panelConsultarLayout.createSequentialGroup()
                        .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(panelConsultarLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(77, 77, 77)
                                .addComponent(botonConsultar))
                            .addComponent(jLabel21))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelConsultarLayout.setVerticalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Consultar)
                .addGap(18, 18, 18)
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idFacultadImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescripcionImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(idProcesoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(botonConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        jLabel8.setText("Actualizar");

        jLabel9.setText("Descripcion");

        textoFechaEleccionActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaEleccionActualizarActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha Eleccion");

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        textoFechaFinalizacionActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoFechaFinalizacionActualizarActionPerformed(evt);
            }
        });

        jLabel13.setText("Fecha Fin Eleccion");

        jLabel15.setText("ID Proceso");

        javax.swing.GroupLayout panelActualizarLayout = new javax.swing.GroupLayout(panelActualizar);
        panelActualizar.setLayout(panelActualizarLayout);
        panelActualizarLayout.setHorizontalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel8))
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoDescripcionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoFechaEleccionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(41, 41, 41)
                        .addComponent(textoIDProcesoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textoFechaFinalizacionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(botonActualizar)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelActualizarLayout.setVerticalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDescripcionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFechaEleccionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(textoIDProcesoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFechaFinalizacionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(botonActualizar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(comboFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(189, 189, 189)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comboProcesoElectoral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(panelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboProcesoElectoral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstudianteActionPerformed
        String seleccion = (String) comboEstudiante.getSelectedItem();
        AdministradorUsuario administradorUsuario = new AdministradorUsuario();
        if ("Registrar".equals(seleccion) || "Desactivar".equals(seleccion) || "Actualizar".equals(seleccion)) {
            administradorUsuario.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_comboEstudianteActionPerformed

    private void comboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCarreraActionPerformed
        String seleccion = (String) comboCarrera.getSelectedItem();
        AdministradorCarrera administradorCarrera = new AdministradorCarrera();
        if ("Crear".equals(seleccion) || "Consultar".equals(seleccion) || "Actualizar".equals(seleccion) || "Estado".equals(seleccion)) {
            administradorCarrera.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_comboCarreraActionPerformed

    private void comboFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFacultadActionPerformed
        String seleccion = (String) comboFacultad.getSelectedItem();
        AdministradorFacultad administradorFacultad = new AdministradorFacultad();
        if ("Registrar".equals(seleccion) || "Desactivar".equals(seleccion) || "Actualizar".equals(seleccion)) {
            administradorFacultad.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_comboFacultadActionPerformed

    private void comboProcesoElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProcesoElectoralActionPerformed
        String seleccion = (String) comboProcesoElectoral.getSelectedItem();
        if ("Crear".equals(seleccion)) {
            panelActualizar.setVisible(false);
            panelCrear.setVisible(true);
            panelConsultar.setVisible(false);

        } else if ("Consultar".equals(seleccion)) {
            panelActualizar.setVisible(false);
            panelCrear.setVisible(false);
            panelConsultar.setVisible(true);

        } else if ("Actualizar".equals(seleccion)) {
            panelActualizar.setVisible(true);
            panelCrear.setVisible(false);
            panelConsultar.setVisible(false);
        }
    }//GEN-LAST:event_comboProcesoElectoralActionPerformed

    private void textoFechaEleccionActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFechaEleccionActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFechaEleccionActualizarActionPerformed

    private void textoFechaFinalizacionActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoFechaFinalizacionActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoFechaFinalizacionActualizarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        try {
            actualizarProceso();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministradorProcesoElectoral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        consultarProceso();
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        try {
            crearProceso();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministradorProcesoElectoral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCrearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministradorProcesoElectoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorProcesoElectoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorProcesoElectoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorProcesoElectoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorProcesoElectoral().setVisible(true);
            }
        });
    }

    public void crearProceso() throws ClassNotFoundException {
        int idProceso = Integer.parseInt(textoIDProceso.getText());
        String descripcion = textoDescripcion.getText();
        java.sql.Timestamp fechaEleccion = java.sql.Timestamp.valueOf(textoFecha.getText());
        java.sql.Timestamp fechaFinalizacion = java.sql.Timestamp.valueOf(textoFechaFinalizacion.getText());

        ProcesoElectoralDTO procesoElectoralDTO = new ProcesoElectoralDTO(idProceso, descripcion, fechaEleccion, "", fechaFinalizacion);

        String mensaje;
        mensaje = procesoElectoralDTO.crearProceso();
        JOptionPane.showMessageDialog(null, mensaje);

    }

    public void actualizarProceso() throws ClassNotFoundException {
        int idProceso = Integer.parseInt(textoIDProcesoActualizar.getText());
        String descripcion = textoDescripcionActualizar.getText();
        java.sql.Timestamp fechaEleccion = java.sql.Timestamp.valueOf(textoFechaEleccionActualizar.getText());
        java.sql.Timestamp fechaFinalizacion = java.sql.Timestamp.valueOf(textoFechaFinalizacionActualizar.getText());

        ProcesoElectoralDTO procesoElectoralDTO = new ProcesoElectoralDTO(idProceso, descripcion, fechaEleccion, "", fechaFinalizacion);

        String mensaje;
        mensaje = procesoElectoralDTO.actualizarProceso();
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void consultarProceso(){
        int idProceso = Integer.valueOf(idProcesoConsulta.getText());
        ProcesoElectoralDTO procesoElectoralDTO = new ProcesoElectoralDTO(idProceso, "", null, "", null);

        List lista = new ArrayList();

        try {
            lista = procesoElectoralDTO.consultarProceso();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministradorProcesoElectoral.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (lista.isEmpty()) {
            // no se exuentra el proceso
            JOptionPane.showMessageDialog(null, "No se encuentra el proceso");
        } else {
            // enseñar datos
            
            JOptionPane.showMessageDialog(null, lista);
            
            /*int idProcesoLista = (int) lista.get(0);
            String nombre = (String) lista.get(1);
            Timestamp fechaEleccion = (Timestamp) lista.get(2);
            String fechaCreacionString = (String) lista.get(3);
            Timestamp fechaFinalizacionTS = (Timestamp) lista.get(4);
            
            String fechaEleccionString = convertirTimestampAString(fechaEleccion);
            String fechaFinalizacionString = convertirTimestampAString(fechaFinalizacionTS);
            String idProcesoString = String.valueOf(idProcesoLista);

            idFacultadImprimir.setText(idProcesoString);
            DescripcionImprimir.setText(nombre);
            fechaImprimir.setText(fechaEleccionString);
            fechaCreacion.setText(fechaCreacionString);
            fechaFinalizacion.setText(fechaFinalizacionString);*/
        }
    }
    
    // Método para convertir un Timestamp a String
    private static String convertirTimestampAString(Timestamp timestamp) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatoFecha.format(timestamp);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Consultar;
    private javax.swing.JTextField DescripcionImprimir;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonCrear;
    private javax.swing.JComboBox<String> comboCarrera;
    private javax.swing.JComboBox<String> comboEstudiante;
    private javax.swing.JComboBox<String> comboFacultad;
    private javax.swing.JComboBox<String> comboProcesoElectoral;
    private javax.swing.JTextField fechaCreacion;
    private javax.swing.JTextField fechaFinalizacion;
    private javax.swing.JTextField fechaImprimir;
    private javax.swing.JTextField idFacultadImprimir;
    private javax.swing.JTextField idProcesoConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelActualizar;
    private javax.swing.JPanel panelConsultar;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JTextField textoDescripcion;
    private javax.swing.JTextField textoDescripcionActualizar;
    private javax.swing.JTextField textoFecha;
    private javax.swing.JTextField textoFechaEleccionActualizar;
    private javax.swing.JTextField textoFechaFinalizacion;
    private javax.swing.JTextField textoFechaFinalizacionActualizar;
    private javax.swing.JTextField textoIDProceso;
    private javax.swing.JTextField textoIDProcesoActualizar;
    // End of variables declaration//GEN-END:variables
}

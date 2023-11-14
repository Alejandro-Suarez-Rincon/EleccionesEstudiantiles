/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.UsuarioDTO;

/**
 *
 * @author aleja
 */
public class AdministradorUsuario extends javax.swing.JFrame {

    ButtonGroup buttonGroupSexo = new ButtonGroup();
    ButtonGroup buttonGroupEstado = new ButtonGroup();
    ButtonGroup buttonGroupRol = new ButtonGroup();
    ButtonGroup buttonGroupEstadoAct = new ButtonGroup();

    public AdministradorUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);// Centra la pantalla
        panelEstudianteActualizar.setVisible(false);
        panelEstado.setVisible(false);
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
        panelEstudianteActualizar = new javax.swing.JPanel();
        textoCedula = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        textoCorreo = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JTextField();
        textoIdCarrera = new javax.swing.JTextField();
        textoIdMunicipio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        radioMasculino = new javax.swing.JRadioButton();
        radioFemenino = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        radioActivo = new javax.swing.JRadioButton();
        radioInactivo = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        radioEstudiante = new javax.swing.JRadioButton();
        radioAdministrador = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        botonActualizar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        panelEstado = new javax.swing.JPanel();
        radioActivo1 = new javax.swing.JRadioButton();
        radioInactivo1 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        botonEstado = new javax.swing.JButton();

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

        jLabel5.setText("Cedula");

        jLabel6.setText("Nombre");

        jLabel7.setText("Apellido");

        jLabel8.setText("Correo");

        jLabel9.setText("Telefono");

        jLabel10.setText("ID Carrera");

        jLabel11.setText("ID Municipio");

        radioMasculino.setText("Masculino");
        radioMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasculinoActionPerformed(evt);
            }
        });

        radioFemenino.setText("Femenino");
        radioFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemeninoActionPerformed(evt);
            }
        });

        jLabel12.setText("Sexo");

        radioActivo.setText("ACTIVO");
        radioActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActivoActionPerformed(evt);
            }
        });

        radioInactivo.setText("INACTIVO");
        radioInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInactivoActionPerformed(evt);
            }
        });

        jLabel13.setText("Estado");

        radioEstudiante.setText("ESTUDIANTE");

        radioAdministrador.setText("ADMINISTRADOR");

        jLabel14.setText("Rol");

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstudianteActualizarLayout = new javax.swing.GroupLayout(panelEstudianteActualizar);
        panelEstudianteActualizar.setLayout(panelEstudianteActualizarLayout);
        panelEstudianteActualizarLayout.setHorizontalGroup(
            panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstudianteActualizarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textoIdMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(radioMasculino)
                    .addComponent(radioFemenino)
                    .addComponent(jLabel12))
                .addGap(57, 57, 57)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addGroup(panelEstudianteActualizarLayout.createSequentialGroup()
                        .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioActivo)
                            .addComponent(radioInactivo)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(141, 141, 141)
                        .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonRegistrar)
                            .addComponent(botonActualizar)
                            .addComponent(jLabel14)
                            .addComponent(radioAdministrador)
                            .addComponent(radioEstudiante))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelEstudianteActualizarLayout.setVerticalGroup(
            panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstudianteActualizarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonActualizar))
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstudianteActualizarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(panelEstudianteActualizarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(botonRegistrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoIdCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoIdMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMasculino)
                    .addComponent(radioActivo)
                    .addComponent(radioEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEstudianteActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioFemenino)
                    .addComponent(radioInactivo)
                    .addComponent(radioAdministrador))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        radioActivo1.setText("ACTIVO");
        radioActivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActivo1ActionPerformed(evt);
            }
        });

        radioInactivo1.setText("INACTIVO");
        radioInactivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInactivo1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Estado");

        botonEstado.setText("Ok");
        botonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEstado)
                    .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(radioInactivo1)
                        .addComponent(radioActivo1)
                        .addGroup(panelEstadoLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jLabel15))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(radioActivo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioInactivo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEstado)
                .addGap(54, 54, 54))
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
                    .addComponent(comboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comboProcesoElectoral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEstudianteActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
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
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEstudianteActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstudianteActionPerformed
        String seleccion = (String) comboEstudiante.getSelectedItem();
        buttonGroupSexo.add(radioMasculino);
        buttonGroupSexo.add(radioFemenino);
        buttonGroupEstado.add(radioActivo);
        buttonGroupEstado.add(radioInactivo);
        buttonGroupRol.add(radioAdministrador);
        buttonGroupRol.add(radioEstudiante);
        buttonGroupEstadoAct.add(radioActivo1);
        buttonGroupEstadoAct.add(radioInactivo1);

        if ("Actualizar".equals(seleccion)) {
            panelEstudianteActualizar.setVisible(true);
            panelEstado.setVisible(false);
            botonActualizar.setVisible(true);
            botonRegistrar.setVisible(false);

        } else if ("Registrar".equals(seleccion)) {
            panelEstudianteActualizar.setVisible(true);
            panelEstado.setVisible(false);
            botonRegistrar.setVisible(true);
            botonActualizar.setVisible(false);
        } else if ("Desactivar".equals(seleccion)) {
            panelEstudianteActualizar.setVisible(false);
            panelEstado.setVisible(true);
        } else {
            panelEstudianteActualizar.setVisible(false);
            panelEstado.setVisible(false);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFacultadActionPerformed

    private void comboProcesoElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProcesoElectoralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProcesoElectoralActionPerformed

    private void radioMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMasculinoActionPerformed

    private void radioActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioActivoActionPerformed

    private void radioFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemeninoActionPerformed

    private void radioInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInactivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInactivoActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        int cedula = Integer.parseInt(textoCedula.getText());
        String nombre = textoNombre.getText();
        String apellido = textoApellido.getText();
        String correo = textoCorreo.getText();
        int numero = Integer.parseInt(textoTelefono.getText());
        String sexo = obtenerSeleccion(buttonGroupSexo);
        String estado = obtenerSeleccion(buttonGroupEstado);
        int idCarrera = Integer.parseInt(textoIdCarrera.getText());
        int idMunicipio = Integer.parseInt(textoIdMunicipio.getText());
        String rol = obtenerSeleccion(buttonGroupRol);

        UsuarioDTO usuarioDTO = new UsuarioDTO(cedula, nombre, apellido, correo, numero, sexo, estado, idCarrera, idMunicipio, rol);

        if ("ESTUDIANTE".equals(nombre)) {
            try {
                boolean usr = usuarioDTO.registrarEstudiante();
                if (usr) {
                    JOptionPane.showMessageDialog(null, "Estudiante Creado");
                } else {
                    JOptionPane.showMessageDialog(null, "Estudiante No Creado");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdministradorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                boolean usr = usuarioDTO.registrarAdministrador();
                if (usr) {
                    JOptionPane.showMessageDialog(null, "Administrador Creado");
                } else {
                    JOptionPane.showMessageDialog(null, "Administrador No Creado");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdministradorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        int cedula = Integer.parseInt(textoCedula.getText());
        String nombre = textoNombre.getText();
        String apellido = textoApellido.getText();
        String correo = textoCorreo.getText();
        int numero = Integer.parseInt(textoTelefono.getText());
        String sexo = obtenerSeleccion(buttonGroupSexo);
        String estado = obtenerSeleccion(buttonGroupEstado);
        int idCarrera = Integer.parseInt(textoIdCarrera.getText());
        int idMunicipio = Integer.parseInt(textoIdMunicipio.getText());
        String rol = obtenerSeleccion(buttonGroupRol);

        UsuarioDTO usuarioDTO = new UsuarioDTO(cedula, nombre, apellido, correo, numero, sexo, estado, idCarrera, idMunicipio, rol);
        try {

            boolean actualizar = usuarioDTO.actrualizar();
            if (actualizar) {
                // ir a vista de que si
                JOptionPane.showMessageDialog(null, "Actualizado");
            } else {
                // ir a vista de que no
                JOptionPane.showMessageDialog(null, "No Actualizado");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministradorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void radioActivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioActivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioActivo1ActionPerformed

    private void radioInactivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInactivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioInactivo1ActionPerformed

    private void botonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadoActionPerformed

        String estado = obtenerSeleccion(buttonGroupEstado);

        UsuarioDTO usuarioDTO = new UsuarioDTO(0, "", "", "", 0, "", estado, 0, 0, "");
        boolean desactivar;
        try {
            desactivar = usuarioDTO.desactivarEstudiante();
            if (desactivar) {
                // ir a vista de que si
                JOptionPane.showMessageDialog(null, "Actualizado");
            } else {
                // ir a vista de que no
                JOptionPane.showMessageDialog(null, "No se cambio el Estado");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministradorUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botonEstadoActionPerformed

    // Metodos
    private static String obtenerSeleccion(ButtonGroup group) {
        Enumeration<AbstractButton> buttons = group.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton radioButton = buttons.nextElement();
            if (radioButton.isSelected()) {
                return radioButton.getText();
            }
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonEstado;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JComboBox<String> comboCarrera;
    private javax.swing.JComboBox<String> comboEstudiante;
    private javax.swing.JComboBox<String> comboFacultad;
    private javax.swing.JComboBox<String> comboProcesoElectoral;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelEstudianteActualizar;
    private javax.swing.JRadioButton radioActivo;
    private javax.swing.JRadioButton radioActivo1;
    private javax.swing.JRadioButton radioAdministrador;
    private javax.swing.JRadioButton radioEstudiante;
    private javax.swing.JRadioButton radioFemenino;
    private javax.swing.JRadioButton radioInactivo;
    private javax.swing.JRadioButton radioInactivo1;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoCedula;
    private javax.swing.JTextField textoCorreo;
    private javax.swing.JTextField textoIdCarrera;
    private javax.swing.JTextField textoIdMunicipio;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}

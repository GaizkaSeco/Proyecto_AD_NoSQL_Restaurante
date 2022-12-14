/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import clases.ConexionExist;
import clases.Empleado;
import clases.Usuario;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author omega
 */
public class PanelEditarEmpleado extends javax.swing.JPanel {
    JPanel content;
    int id;
    Usuario user;
    ConexionExist conexion = new ConexionExist();
    /**
     * Creates new form PanelEditarEmpleado
     */
    public PanelEditarEmpleado(JPanel content, List<Empleado> empleados, int id, Usuario user) {
        initComponents();
        this.content = content;
        this.id = id;
        this.user = user;

        //carga los datos en los campos para editar
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                nombreField.setText(empleado.getNombre());
                salarioField.setText(String.valueOf(empleado.getSalario()));
                fechaField.setText(empleado.getFechaCon());
                telefonoField.setText(String.valueOf(empleado.getTelefono()));
                emailField.setText(empleado.getEmail());
            }
        }
        if (nombreField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ha surgido un problema al cargar los datos.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        salarioField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        fechaField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        editarBoton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefonoField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        cancelarBoton2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(830, 550));
        setPreferredSize(new java.awt.Dimension(830, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDITAR EMPLEADO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 260, 20));

        nombreField.setBackground(new java.awt.Color(204, 204, 204));
        nombreField.setBorder(null);
        add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 300, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 300, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Salario:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));

        salarioField.setBackground(new java.awt.Color(204, 204, 204));
        salarioField.setBorder(null);
        add(salarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 300, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 300, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha de contrato:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 20));

        fechaField.setBackground(new java.awt.Color(204, 204, 204));
        fechaField.setBorder(null);
        add(fechaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 300, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 300, -1));

        editarBoton.setBackground(new java.awt.Color(57, 57, 58));
        editarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editarBotonMousePressed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(219, 219, 219));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar Empleado");

        javax.swing.GroupLayout editarBotonLayout = new javax.swing.GroupLayout(editarBoton);
        editarBoton.setLayout(editarBotonLayout);
        editarBotonLayout.setHorizontalGroup(
            editarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        editarBotonLayout.setVerticalGroup(
            editarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(editarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 160, 50));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telefono:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 20));

        telefonoField.setBackground(new java.awt.Color(204, 204, 204));
        telefonoField.setBorder(null);
        add(telefonoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 300, 20));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 300, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Email:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 20));

        emailField.setBackground(new java.awt.Color(204, 204, 204));
        emailField.setBorder(null);
        add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 300, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 300, -1));

        cancelarBoton2.setBackground(new java.awt.Color(57, 57, 58));
        cancelarBoton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarBoton2MousePressed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(219, 219, 219));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cancelar");

        javax.swing.GroupLayout cancelarBoton2Layout = new javax.swing.GroupLayout(cancelarBoton2);
        cancelarBoton2.setLayout(cancelarBoton2Layout);
        cancelarBoton2Layout.setHorizontalGroup(
            cancelarBoton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        cancelarBoton2Layout.setVerticalGroup(
            cancelarBoton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(cancelarBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 160, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBoton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBoton2MousePressed
        //carga la ventana anterior
        PanelEmpleados frame = new PanelEmpleados(content, user);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_cancelarBoton2MousePressed

    private void editarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBotonMousePressed
        //comprueba que los datos esten bien
        try {
            double salario = Double.parseDouble(salarioField.getText());
            int telefono = Integer.parseInt(telefonoField.getText());
            if (nombreField.getText().isBlank() || fechaField.getText().isBlank() || emailField.getText().isBlank() || String.valueOf(telefono).length() != 9){
                JOptionPane.showMessageDialog(null, "Compruebe que los datos son correctos");
            } else {
                //anade el empleado
                Empleado updateEmp = new Empleado(id, nombreField.getText(),  salario, fechaField.getText(), telefono, emailField.getText());
                conexion.editarEmpleado(updateEmp, user);
                JOptionPane.showMessageDialog(null, "El empleado se ha editado corectamente.");
                //carga la ventana anterior
                PanelEmpleados frame = new PanelEmpleados(content, user);
                frame.setSize(830,550);
                frame.setLocation(0,0);
                content.removeAll();
                content.add(frame, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introduce valores correctos o comprueba el numero de telefono.");
        }
    }//GEN-LAST:event_editarBotonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancelarBoton2;
    private javax.swing.JPanel editarBoton;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fechaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField salarioField;
    private javax.swing.JTextField telefonoField;
    // End of variables declaration//GEN-END:variables
}

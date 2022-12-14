/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import clases.Cliente;
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
public class PanelAnadirCliente extends javax.swing.JPanel {
    JPanel content;
    List<Cliente> clientes;
    ConexionExist conexion = new ConexionExist();
    Usuario user;
    /**
     * Creates new form PanelAnadirCliente
     */
    public PanelAnadirCliente(JPanel content, Usuario user) {
        initComponents();
        this.content = content;
        this.user = user;
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
        telefonoField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        botonAnadir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cancelarBoton1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVO CLIENTE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 830, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 20));

        nombreField.setBackground(new java.awt.Color(204, 204, 204));
        nombreField.setBorder(null);
        add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 300, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 300, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Telefono:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 20));

        telefonoField.setBackground(new java.awt.Color(204, 204, 204));
        telefonoField.setBorder(null);
        add(telefonoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 300, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 300, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 20));

        emailField.setBackground(new java.awt.Color(204, 204, 204));
        emailField.setBorder(null);
        add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 300, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 300, -1));

        botonAnadir.setBackground(new java.awt.Color(57, 57, 58));
        botonAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnadirMousePressed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(219, 219, 219));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("A??adir Cliente");

        javax.swing.GroupLayout botonAnadirLayout = new javax.swing.GroupLayout(botonAnadir);
        botonAnadir.setLayout(botonAnadirLayout);
        botonAnadirLayout.setHorizontalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        botonAnadirLayout.setVerticalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(botonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 160, 50));

        cancelarBoton1.setBackground(new java.awt.Color(57, 57, 58));
        cancelarBoton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarBoton1MousePressed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(219, 219, 219));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cancelar");

        javax.swing.GroupLayout cancelarBoton1Layout = new javax.swing.GroupLayout(cancelarBoton1);
        cancelarBoton1.setLayout(cancelarBoton1Layout);
        cancelarBoton1Layout.setHorizontalGroup(
            cancelarBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        cancelarBoton1Layout.setVerticalGroup(
            cancelarBoton1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(cancelarBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 160, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBoton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBoton1MousePressed
        //nos envia a la ventana anterior
        PanelClientes frame = new PanelClientes(content, user);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_cancelarBoton1MousePressed

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        try {
            //comprobamos que los datos esten bien.
            int telefono = Integer.parseInt(telefonoField.getText());
            if (nombreField.getText().isBlank() || emailField.getText().isBlank() || String.valueOf(telefono).length() != 9){
                JOptionPane.showMessageDialog(null, "Compruebe que los datos son correctos");
            } else {
                int id;
                clientes = conexion.cargarClientes();
                if (clientes.size() == 0) {
                    id = 1;
                } else {
                    id = clientes.get(clientes.size() - 1).getId() + 1;
                }
                //a??ade el cliente y carga la ventana de los clientes
                Cliente cliNuevo = new Cliente(id, nombreField.getText(), telefono, emailField.getText());
                conexion.anadirCliente(cliNuevo, user);
                JOptionPane.showMessageDialog(null, "El cliente se ha a??adido corectamente.");
                PanelClientes frame = new PanelClientes(content, user);
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
    }//GEN-LAST:event_botonAnadirMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JPanel cancelarBoton1;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField telefonoField;
    // End of variables declaration//GEN-END:variables
}

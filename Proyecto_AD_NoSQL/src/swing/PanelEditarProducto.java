/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import clases.ConexionExist;
import clases.Producto;
import clases.Usuario;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.*;


/**
 *
 * @author omega
 */
public class PanelEditarProducto extends javax.swing.JPanel {
    JPanel content;
    int id;
    ConexionExist conexion = new ConexionExist();
    Usuario user;
    /**
     * Creates new form PanelEditarProducto
     */
    public PanelEditarProducto(JPanel content, List<Producto> productos, int id, Usuario user) {
        initComponents();
        this.content = content;
        this.id = id;
        this.user = user;

        for (Producto producto : productos) {
            if (producto.getId() == id) {
                nombreField.setText(producto.getProducto());
                cantidadField.setText(String.valueOf(producto.getCantidad()));
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
        cantidadField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        editarBoton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cancelarBoton = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDITAR PRODUCTO");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Producto:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 20));

        nombreField.setBackground(new java.awt.Color(204, 204, 204));
        nombreField.setBorder(null);
        add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 300, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 300, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 260, 20));

        cantidadField.setBackground(new java.awt.Color(204, 204, 204));
        cantidadField.setBorder(null);
        add(cantidadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 300, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 300, -1));

        editarBoton.setBackground(new java.awt.Color(57, 57, 58));
        editarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editarBotonMousePressed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(219, 219, 219));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar Producto");

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

        add(editarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 160, 50));

        cancelarBoton.setBackground(new java.awt.Color(57, 57, 58));
        cancelarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarBotonMousePressed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(219, 219, 219));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cancelar");

        javax.swing.GroupLayout cancelarBotonLayout = new javax.swing.GroupLayout(cancelarBoton);
        cancelarBoton.setLayout(cancelarBotonLayout);
        cancelarBotonLayout.setHorizontalGroup(
            cancelarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        cancelarBotonLayout.setVerticalGroup(
            cancelarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(cancelarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 160, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarBotonMousePressed
        PanelAlmacen frame = new PanelAlmacen(content, user);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_cancelarBotonMousePressed

    private void editarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBotonMousePressed
        try {
            int cantidad = Integer.parseInt(cantidadField.getText());
            if (nombreField.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "Compruebe que los datos son correctos");
            } else {
                Producto updatePro = new Producto(id, nombreField.getText(), cantidad);
                conexion.editarProducto(updatePro);
                JOptionPane.showMessageDialog(null, "El producto se ha editado corectamente.");
                PanelAlmacen frame = new PanelAlmacen(content, user);
                frame.setSize(830,550);
                frame.setLocation(0,0);
                content.removeAll();
                content.add(frame, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Introduce valores correctos");
        }
    }//GEN-LAST:event_editarBotonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancelarBoton;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JPanel editarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 9FDAM09
 */
public class PaguinaPrincipal extends javax.swing.JFrame {
    public PaguinaPrincipal() {
        initComponents();
        
        VentanaPrincipal frame = new VentanaPrincipal();
        frame.setSize(830,550);
        frame.setLocation(0,0);
        
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        botonSalir = new javax.swing.JPanel();
        bordeSalir = new javax.swing.JPanel();
        labelBoton1 = new javax.swing.JLabel();
        botonProveedores = new javax.swing.JPanel();
        labelBoton6 = new javax.swing.JLabel();
        bordeProveedor = new javax.swing.JPanel();
        botonPiezas = new javax.swing.JPanel();
        bordePiezas = new javax.swing.JPanel();
        labelBoton2 = new javax.swing.JLabel();
        botonAyuda = new javax.swing.JPanel();
        bordeAyuda = new javax.swing.JPanel();
        labelBoton3 = new javax.swing.JLabel();
        botonGestion = new javax.swing.JPanel();
        bordeGestion = new javax.swing.JPanel();
        labelBoton4 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(40, 40, 40));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setBackground(new java.awt.Color(114, 70, 124));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSalirMousePressed(evt);
            }
        });

        bordeSalir.setBackground(new java.awt.Color(114, 70, 124));
        bordeSalir.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeSalirLayout = new javax.swing.GroupLayout(bordeSalir);
        bordeSalir.setLayout(bordeSalirLayout);
        bordeSalirLayout.setHorizontalGroup(
            bordeSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeSalirLayout.setVerticalGroup(
            bordeSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelBoton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelBoton1.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton1.setText("Salir");

        javax.swing.GroupLayout botonSalirLayout = new javax.swing.GroupLayout(botonSalir);
        botonSalir.setLayout(botonSalirLayout);
        botonSalirLayout.setHorizontalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addComponent(bordeSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelBoton1)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        botonSalirLayout.setVerticalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBoton1)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(bordeSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        panelMenu.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 170, -1));

        botonProveedores.setBackground(new java.awt.Color(198, 177, 201));
        botonProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonProveedoresMousePressed(evt);
            }
        });

        labelBoton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelBoton6.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton6.setText("Proveedores");

        bordeProveedor.setBackground(new java.awt.Color(255, 255, 255));
        bordeProveedor.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeProveedorLayout = new javax.swing.GroupLayout(bordeProveedor);
        bordeProveedor.setLayout(bordeProveedorLayout);
        bordeProveedorLayout.setHorizontalGroup(
            bordeProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeProveedorLayout.setVerticalGroup(
            bordeProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonProveedoresLayout = new javax.swing.GroupLayout(botonProveedores);
        botonProveedores.setLayout(botonProveedoresLayout);
        botonProveedoresLayout.setHorizontalGroup(
            botonProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonProveedoresLayout.createSequentialGroup()
                .addComponent(bordeProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelBoton6)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        botonProveedoresLayout.setVerticalGroup(
            botonProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonProveedoresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBoton6)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(bordeProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        panelMenu.add(botonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, -1));

        botonPiezas.setBackground(new java.awt.Color(114, 70, 124));
        botonPiezas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPiezasMousePressed(evt);
            }
        });

        bordePiezas.setBackground(new java.awt.Color(114, 70, 124));
        bordePiezas.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordePiezasLayout = new javax.swing.GroupLayout(bordePiezas);
        bordePiezas.setLayout(bordePiezasLayout);
        bordePiezasLayout.setHorizontalGroup(
            bordePiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordePiezasLayout.setVerticalGroup(
            bordePiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        labelBoton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelBoton2.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton2.setText("Piezas");

        javax.swing.GroupLayout botonPiezasLayout = new javax.swing.GroupLayout(botonPiezas);
        botonPiezas.setLayout(botonPiezasLayout);
        botonPiezasLayout.setHorizontalGroup(
            botonPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPiezasLayout.createSequentialGroup()
                .addComponent(bordePiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelBoton2)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        botonPiezasLayout.setVerticalGroup(
            botonPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordePiezas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(botonPiezasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelBoton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(botonPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, -1));

        botonAyuda.setBackground(new java.awt.Color(114, 70, 124));
        botonAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAyudaMousePressed(evt);
            }
        });

        bordeAyuda.setBackground(new java.awt.Color(114, 70, 124));
        bordeAyuda.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeAyudaLayout = new javax.swing.GroupLayout(bordeAyuda);
        bordeAyuda.setLayout(bordeAyudaLayout);
        bordeAyudaLayout.setHorizontalGroup(
            bordeAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeAyudaLayout.setVerticalGroup(
            bordeAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        labelBoton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelBoton3.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton3.setText("Ayuda");

        javax.swing.GroupLayout botonAyudaLayout = new javax.swing.GroupLayout(botonAyuda);
        botonAyuda.setLayout(botonAyudaLayout);
        botonAyudaLayout.setHorizontalGroup(
            botonAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAyudaLayout.createSequentialGroup()
                .addComponent(bordeAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelBoton3)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        botonAyudaLayout.setVerticalGroup(
            botonAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordeAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonAyudaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelBoton3)
                .addGap(16, 16, 16))
        );

        panelMenu.add(botonAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, -1));

        botonGestion.setBackground(new java.awt.Color(114, 70, 124));
        botonGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGestionMousePressed(evt);
            }
        });

        bordeGestion.setBackground(new java.awt.Color(114, 70, 124));
        bordeGestion.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeGestionLayout = new javax.swing.GroupLayout(bordeGestion);
        bordeGestion.setLayout(bordeGestionLayout);
        bordeGestionLayout.setHorizontalGroup(
            bordeGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeGestionLayout.setVerticalGroup(
            bordeGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        labelBoton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelBoton4.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton4.setText("Gestion Global");

        javax.swing.GroupLayout botonGestionLayout = new javax.swing.GroupLayout(botonGestion);
        botonGestion.setLayout(botonGestionLayout);
        botonGestionLayout.setHorizontalGroup(
            botonGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonGestionLayout.createSequentialGroup()
                .addComponent(bordeGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelBoton4)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        botonGestionLayout.setVerticalGroup(
            botonGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordeGestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(botonGestionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelBoton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(botonGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, -1));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 550));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 830, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Accion de los botones para cambiar de color ar clickar etc
    private void botonProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProveedoresMousePressed
        setColor(botonProveedores, bordeProveedor);
        resetColor(botonPiezas, bordePiezas);
        resetColor(botonAyuda, bordeAyuda);
        resetColor(botonSalir, bordeSalir);
        resetColor(botonGestion, bordeGestion);
        
        VentanaPrincipal frame = new VentanaPrincipal();
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonProveedoresMousePressed

    private void botonPiezasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPiezasMousePressed
        setColor(botonPiezas, bordePiezas);
        resetColor(botonProveedores, bordeProveedor);
        resetColor(botonAyuda, bordeAyuda);
        resetColor(botonSalir, bordeSalir);
        resetColor(botonGestion, bordeGestion);
        
        VentanaPiezas frame = new VentanaPiezas();
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonPiezasMousePressed

    private void botonAyudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAyudaMousePressed
        setColor(botonAyuda, bordeAyuda);
        resetColor(botonPiezas,bordePiezas);
        resetColor(botonProveedores, bordeProveedor);
        resetColor(botonSalir, bordeSalir);
        resetColor(botonGestion, bordeGestion);
    }//GEN-LAST:event_botonAyudaMousePressed

    private void botonSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMousePressed
        setColor(botonSalir, bordeSalir);
        resetColor(botonPiezas, bordePiezas);
        resetColor(botonAyuda, bordeAyuda);
        resetColor(botonProveedores, bordeProveedor);
        resetColor(botonGestion, bordeGestion);
    }//GEN-LAST:event_botonSalirMousePressed

    private void botonGestionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGestionMousePressed
        setColor(botonGestion, bordeGestion);
        resetColor(botonPiezas, bordePiezas);
        resetColor(botonAyuda, bordeAyuda);
        resetColor(botonProveedores, bordeProveedor);
        resetColor(botonSalir, bordeSalir);
        
        VentanaGestionGlobal frame = new VentanaGestionGlobal();
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonGestionMousePressed

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
            java.util.logging.Logger.getLogger(PaguinaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaguinaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaguinaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaguinaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaguinaPrincipal().setVisible(true);
            }
        });
    }

    public PaguinaPrincipal(JPanel boton1, JPanel boton2, JPanel boton3, JPanel boton4, JPanel boton5, JLabel labelBoton1, JLabel labelBoton2, JLabel labelBoton3, JLabel labelBoton4, JLabel labelBoton5, JPanel panelMenu) throws HeadlessException {
        this.botonSalir = boton1;
        this.botonProveedores = boton2;
        this.botonPiezas = boton3;
        this.botonAyuda = boton4;
        this.labelBoton1 = labelBoton1;
        this.labelBoton2 = labelBoton2;
        this.labelBoton3 = labelBoton3;
        this.panelMenu = panelMenu;
    }
    
    private void setColor(JPanel pane, JPanel borde) {
        pane.setBackground(new Color(198,177,201));
        borde.setBackground(new Color(255,255,255));
    }
    
    private void resetColor(JPanel pane, JPanel borde) {
        pane.setBackground(new Color(114,70,124));
        borde.setBackground(new Color(114,70,124));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bordeAyuda;
    private javax.swing.JPanel bordeGestion;
    private javax.swing.JPanel bordePiezas;
    private javax.swing.JPanel bordeProveedor;
    private javax.swing.JPanel bordeSalir;
    private javax.swing.JPanel botonAyuda;
    private javax.swing.JPanel botonGestion;
    private javax.swing.JPanel botonPiezas;
    private javax.swing.JPanel botonProveedores;
    private javax.swing.JPanel botonSalir;
    private javax.swing.JPanel content;
    private javax.swing.JLabel labelBoton1;
    private javax.swing.JLabel labelBoton2;
    private javax.swing.JLabel labelBoton3;
    private javax.swing.JLabel labelBoton4;
    private javax.swing.JLabel labelBoton6;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}

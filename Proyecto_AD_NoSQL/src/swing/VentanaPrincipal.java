/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import clases.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 9FDAM09
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    Usuario user;
    public VentanaPrincipal(Usuario user) {
        initComponents();
        this.user = user;
        
        PanelHome frame = new PanelHome();
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
        labelSalir = new javax.swing.JLabel();
        botonHome = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        bordeHome = new javax.swing.JPanel();
        botonEmpleados = new javax.swing.JPanel();
        bordePiezas = new javax.swing.JPanel();
        labelPiezas = new javax.swing.JLabel();
        botonLogs = new javax.swing.JPanel();
        bordeAyuda = new javax.swing.JPanel();
        labelAyuda = new javax.swing.JLabel();
        botonAlmacen = new javax.swing.JPanel();
        bordeGestion = new javax.swing.JPanel();
        labelGestion = new javax.swing.JLabel();
        botonClientes = new javax.swing.JPanel();
        bordeProyectos = new javax.swing.JPanel();
        labelProyectos = new javax.swing.JLabel();
        botonPlatos1 = new javax.swing.JPanel();
        labelPlatos = new javax.swing.JLabel();
        bordePlatos1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(57, 57, 58));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setBackground(new java.awt.Color(57, 57, 58));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSalirMousePressed(evt);
            }
        });

        bordeSalir.setBackground(new java.awt.Color(57, 57, 58));
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

        labelSalir.setBackground(new java.awt.Color(219, 219, 219));
        labelSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(219, 219, 219));
        labelSalir.setText("Salir");

        javax.swing.GroupLayout botonSalirLayout = new javax.swing.GroupLayout(botonSalir);
        botonSalir.setLayout(botonSalirLayout);
        botonSalirLayout.setHorizontalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addComponent(bordeSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelSalir)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        botonSalirLayout.setVerticalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelSalir)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(bordeSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        panelMenu.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 170, -1));

        botonHome.setBackground(new java.awt.Color(184, 184, 184));
        botonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonHomeMousePressed(evt);
            }
        });

        labelHome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelHome.setForeground(new java.awt.Color(0, 0, 0));
        labelHome.setText("Home");

        bordeHome.setBackground(new java.awt.Color(255, 255, 255));
        bordeHome.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeHomeLayout = new javax.swing.GroupLayout(bordeHome);
        bordeHome.setLayout(bordeHomeLayout);
        bordeHomeLayout.setHorizontalGroup(
            bordeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeHomeLayout.setVerticalGroup(
            bordeHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonHomeLayout = new javax.swing.GroupLayout(botonHome);
        botonHome.setLayout(botonHomeLayout);
        botonHomeLayout.setHorizontalGroup(
            botonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonHomeLayout.createSequentialGroup()
                .addComponent(bordeHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelHome)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        botonHomeLayout.setVerticalGroup(
            botonHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonHomeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelHome)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(bordeHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        panelMenu.add(botonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        botonEmpleados.setBackground(new java.awt.Color(57, 57, 58));
        botonEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEmpleadosMousePressed(evt);
            }
        });

        bordePiezas.setBackground(new java.awt.Color(57, 57, 58));
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

        labelPiezas.setBackground(new java.awt.Color(219, 219, 219));
        labelPiezas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelPiezas.setForeground(new java.awt.Color(219, 219, 219));
        labelPiezas.setText("Empleados");

        javax.swing.GroupLayout botonEmpleadosLayout = new javax.swing.GroupLayout(botonEmpleados);
        botonEmpleados.setLayout(botonEmpleadosLayout);
        botonEmpleadosLayout.setHorizontalGroup(
            botonEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonEmpleadosLayout.createSequentialGroup()
                .addComponent(bordePiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPiezas)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        botonEmpleadosLayout.setVerticalGroup(
            botonEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordePiezas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(botonEmpleadosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelPiezas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(botonEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, -1));

        botonLogs.setBackground(new java.awt.Color(57, 57, 58));
        botonLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonLogsMousePressed(evt);
            }
        });

        bordeAyuda.setBackground(new java.awt.Color(57, 57, 58));
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

        labelAyuda.setBackground(new java.awt.Color(219, 219, 219));
        labelAyuda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelAyuda.setForeground(new java.awt.Color(219, 219, 219));
        labelAyuda.setText("Logs");

        javax.swing.GroupLayout botonLogsLayout = new javax.swing.GroupLayout(botonLogs);
        botonLogs.setLayout(botonLogsLayout);
        botonLogsLayout.setHorizontalGroup(
            botonLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonLogsLayout.createSequentialGroup()
                .addComponent(bordeAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAyuda)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        botonLogsLayout.setVerticalGroup(
            botonLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordeAyuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonLogsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAyuda)
                .addGap(16, 16, 16))
        );

        panelMenu.add(botonLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, -1));

        botonAlmacen.setBackground(new java.awt.Color(57, 57, 58));
        botonAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAlmacenMousePressed(evt);
            }
        });

        bordeGestion.setBackground(new java.awt.Color(57, 57, 58));
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

        labelGestion.setBackground(new java.awt.Color(219, 219, 219));
        labelGestion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelGestion.setForeground(new java.awt.Color(219, 219, 219));
        labelGestion.setText("Almacen");

        javax.swing.GroupLayout botonAlmacenLayout = new javax.swing.GroupLayout(botonAlmacen);
        botonAlmacen.setLayout(botonAlmacenLayout);
        botonAlmacenLayout.setHorizontalGroup(
            botonAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAlmacenLayout.createSequentialGroup()
                .addComponent(bordeGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelGestion)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        botonAlmacenLayout.setVerticalGroup(
            botonAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordeGestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(botonAlmacenLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelGestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(botonAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 170, -1));

        botonClientes.setBackground(new java.awt.Color(57, 57, 58));
        botonClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonClientesMousePressed(evt);
            }
        });

        bordeProyectos.setBackground(new java.awt.Color(57, 57, 58));
        bordeProyectos.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordeProyectosLayout = new javax.swing.GroupLayout(bordeProyectos);
        bordeProyectos.setLayout(bordeProyectosLayout);
        bordeProyectosLayout.setHorizontalGroup(
            bordeProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordeProyectosLayout.setVerticalGroup(
            bordeProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        labelProyectos.setBackground(new java.awt.Color(219, 219, 219));
        labelProyectos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelProyectos.setForeground(new java.awt.Color(219, 219, 219));
        labelProyectos.setText("Clientes");

        javax.swing.GroupLayout botonClientesLayout = new javax.swing.GroupLayout(botonClientes);
        botonClientes.setLayout(botonClientesLayout);
        botonClientesLayout.setHorizontalGroup(
            botonClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonClientesLayout.createSequentialGroup()
                .addComponent(bordeProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelProyectos)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        botonClientesLayout.setVerticalGroup(
            botonClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bordeProyectos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(botonClientesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelProyectos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.add(botonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 50));

        botonPlatos1.setBackground(new java.awt.Color(57, 57, 58));
        botonPlatos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPlatos1MousePressed(evt);
            }
        });

        labelPlatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelPlatos.setForeground(new java.awt.Color(219, 219, 219));
        labelPlatos.setText("Platos");

        bordePlatos1.setBackground(new java.awt.Color(57, 57, 58));
        bordePlatos1.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout bordePlatos1Layout = new javax.swing.GroupLayout(bordePlatos1);
        bordePlatos1.setLayout(bordePlatos1Layout);
        bordePlatos1Layout.setHorizontalGroup(
            bordePlatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        bordePlatos1Layout.setVerticalGroup(
            bordePlatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout botonPlatos1Layout = new javax.swing.GroupLayout(botonPlatos1);
        botonPlatos1.setLayout(botonPlatos1Layout);
        botonPlatos1Layout.setHorizontalGroup(
            botonPlatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPlatos1Layout.createSequentialGroup()
                .addComponent(bordePlatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPlatos)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        botonPlatos1Layout.setVerticalGroup(
            botonPlatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPlatos1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelPlatos)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(bordePlatos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        panelMenu.add(botonPlatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, -1));

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
    private void botonHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHomeMousePressed
        setColor(botonHome, bordeHome, labelHome);
        resetColor(botonEmpleados, bordePiezas, labelPiezas);
        resetColor(botonLogs, bordeAyuda, labelAyuda);
        resetColor(botonSalir, bordeSalir, labelSalir);
        resetColor(botonAlmacen, bordeGestion, labelGestion);
        resetColor(botonClientes, bordeProyectos, labelProyectos); 
        resetColor(botonPlatos1, bordePlatos1, labelPlatos);
        
        PanelHome frame = new PanelHome();
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonHomeMousePressed

    private void botonEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEmpleadosMousePressed
        setColor(botonEmpleados, bordePiezas, labelPiezas);
        resetColor(botonHome, bordeHome, labelHome);
        resetColor(botonLogs, bordeAyuda, labelAyuda);
        resetColor(botonSalir, bordeSalir, labelSalir);
        resetColor(botonAlmacen, bordeGestion, labelGestion);
        resetColor(botonClientes, bordeProyectos, labelProyectos); 
        resetColor(botonPlatos1, bordePlatos1, labelPlatos);
        
        PanelEmpleados frame = new PanelEmpleados(this.content, user);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonEmpleadosMousePressed

    private void botonLogsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLogsMousePressed
        setColor(botonLogs, bordeAyuda, labelAyuda);
        resetColor(botonEmpleados,bordePiezas, labelPiezas);
        resetColor(botonHome, bordeHome, labelHome);
        resetColor(botonSalir, bordeSalir, labelSalir);
        resetColor(botonAlmacen, bordeGestion, labelGestion);
        resetColor(botonClientes, bordeProyectos, labelProyectos);
        resetColor(botonPlatos1, bordePlatos1, labelPlatos);
        
        PanelLogs frame = new PanelLogs();
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonLogsMousePressed

    private void botonSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMousePressed
        setColor(botonSalir, bordeSalir,labelSalir );
        resetColor(botonEmpleados, bordePiezas, labelPiezas);
        resetColor(botonLogs, bordeAyuda, labelAyuda);
        resetColor(botonHome, bordeHome, labelHome);
        resetColor(botonAlmacen, bordeGestion, labelGestion);
        resetColor(botonClientes, bordeProyectos, labelProyectos); 
        resetColor(botonPlatos1, bordePlatos1, labelPlatos);
        
        this.dispose();
    }//GEN-LAST:event_botonSalirMousePressed

    private void botonAlmacenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAlmacenMousePressed
        setColor(botonAlmacen, bordeGestion, labelGestion);
        resetColor(botonEmpleados, bordePiezas, labelPiezas);
        resetColor(botonLogs, bordeAyuda, labelAyuda);
        resetColor(botonHome, bordeHome, labelHome);
        resetColor(botonSalir, bordeSalir, labelSalir);
        resetColor(botonClientes, bordeProyectos, labelProyectos); 
        resetColor(botonPlatos1, bordePlatos1, labelPlatos);
        
        PanelAlmacen frame = new PanelAlmacen(this.content, user);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonAlmacenMousePressed

    private void botonClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonClientesMousePressed
        setColor(botonClientes, bordeProyectos, labelProyectos);
        resetColor(botonAlmacen, bordeGestion, labelGestion);
        resetColor(botonEmpleados, bordePiezas, labelPiezas);
        resetColor(botonLogs, bordeAyuda, labelAyuda);
        resetColor(botonHome, bordeHome, labelHome);
        resetColor(botonSalir, bordeSalir, labelSalir);
        resetColor(botonPlatos1, bordePlatos1, labelPlatos);
        
        PanelClientes frame = new PanelClientes(this.content, user);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonClientesMousePressed

    private void botonPlatos1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPlatos1MousePressed
        setColor(botonPlatos1, bordePlatos1, labelPlatos);
        resetColor(botonAlmacen, bordeGestion, labelGestion);
        resetColor(botonEmpleados, bordePiezas, labelPiezas);
        resetColor(botonLogs, bordeAyuda, labelAyuda);
        resetColor(botonHome, bordeHome, labelHome);
        resetColor(botonSalir, bordeSalir, labelSalir);
        resetColor(botonClientes, bordeProyectos, labelProyectos);
        
        PanelPlatos frame = new PanelPlatos(this.content, user);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonPlatos1MousePressed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(new Usuario(1, "Prueba", true)).setVisible(true);
            }
        });
    }

    public VentanaPrincipal(JPanel boton1, JPanel boton2, JPanel boton3, JPanel boton4, JPanel boton5, JLabel labelBoton1, JLabel labelBoton2, JLabel labelBoton3, JLabel labelBoton4, JLabel labelBoton5, JPanel panelMenu) throws HeadlessException {
        this.botonSalir = boton1;
        this.botonHome = boton2;
        this.botonEmpleados = boton3;
        this.botonLogs = boton4;
        this.labelSalir = labelBoton1;
        this.labelPiezas = labelBoton2;
        this.labelAyuda = labelBoton3;
        this.panelMenu = panelMenu;
    }
    
    private void setColor(JPanel pane, JPanel borde, JLabel texto) {
        pane.setBackground(new Color(184,184,184));
        borde.setBackground(new Color(255,255,255));
        texto.setForeground(new Color(0,0,0));
    }
    
    private void resetColor(JPanel pane, JPanel borde, JLabel texto) {
        pane.setBackground(new Color(57,57,58));
        borde.setBackground(new Color(57,57,58));
        texto.setForeground(new Color(219,219,219));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bordeAyuda;
    private javax.swing.JPanel bordeGestion;
    private javax.swing.JPanel bordeHome;
    private javax.swing.JPanel bordePiezas;
    private javax.swing.JPanel bordePlatos1;
    private javax.swing.JPanel bordeProyectos;
    private javax.swing.JPanel bordeSalir;
    private javax.swing.JPanel botonAlmacen;
    private javax.swing.JPanel botonClientes;
    private javax.swing.JPanel botonEmpleados;
    private javax.swing.JPanel botonHome;
    private javax.swing.JPanel botonLogs;
    private javax.swing.JPanel botonPlatos1;
    private javax.swing.JPanel botonSalir;
    private javax.swing.JPanel content;
    private javax.swing.JLabel labelAyuda;
    private javax.swing.JLabel labelGestion;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelPiezas;
    private javax.swing.JLabel labelPlatos;
    private javax.swing.JLabel labelProyectos;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}

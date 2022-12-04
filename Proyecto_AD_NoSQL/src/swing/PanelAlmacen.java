/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 *
 * @author omega
 */
public class PanelAlmacen extends javax.swing.JPanel {
    String[] nombreColumnas = {"id", "Nombre", "Cantidad"};
    JPanel content;
    /**
     * Creates new form PanelAlmacen
     */
    public PanelAlmacen(JPanel content) {
        initComponents();
        this.content = content;
        
        table1.setShowHorizontalLines(true);
        table1.setGridColor(new Color(230, 230, 230));
        table1.setRowHeight(30);
        table1.getTableHeader().setReorderingAllowed(true);
        table1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnas.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane1);
    }
    
     public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        anadirBoton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        eliminarBoton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        editarBoton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 690, 540));

        anadirBoton.setBackground(new java.awt.Color(57, 57, 58));
        anadirBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anadirBotonMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 219, 219));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("+");

        javax.swing.GroupLayout anadirBotonLayout = new javax.swing.GroupLayout(anadirBoton);
        anadirBoton.setLayout(anadirBotonLayout);
        anadirBotonLayout.setHorizontalGroup(
            anadirBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        anadirBotonLayout.setVerticalGroup(
            anadirBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(anadirBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, 40));

        eliminarBoton.setBackground(new java.awt.Color(57, 57, 58));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 219, 219));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");

        javax.swing.GroupLayout eliminarBotonLayout = new javax.swing.GroupLayout(eliminarBoton);
        eliminarBoton.setLayout(eliminarBotonLayout);
        eliminarBotonLayout.setHorizontalGroup(
            eliminarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        eliminarBotonLayout.setVerticalGroup(
            eliminarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarBotonLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(eliminarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, 40));

        editarBoton.setBackground(new java.awt.Color(57, 57, 58));
        editarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editarBotonMousePressed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(219, 219, 219));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Editar");

        javax.swing.GroupLayout editarBotonLayout = new javax.swing.GroupLayout(editarBoton);
        editarBoton.setLayout(editarBotonLayout);
        editarBotonLayout.setHorizontalGroup(
            editarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        editarBotonLayout.setVerticalGroup(
            editarBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        add(editarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void anadirBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anadirBotonMousePressed
        PanelAnadirProducto frame = new PanelAnadirProducto(content);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_anadirBotonMousePressed

    private void editarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBotonMousePressed
        PanelEditarProducto frame = new PanelEditarProducto(content);
        frame.setSize(830,550);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_editarBotonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anadirBoton;
    private javax.swing.JPanel editarBoton;
    private javax.swing.JPanel eliminarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}

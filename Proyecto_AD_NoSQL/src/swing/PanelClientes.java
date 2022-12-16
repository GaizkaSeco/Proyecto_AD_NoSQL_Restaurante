/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import clases.Cliente;
import clases.ConexionExist;
import clases.Empleado;
import clases.Usuario;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 * @author omega
 */
public class PanelClientes extends javax.swing.JPanel {
    String[] nombreColumnas = {"id", "Nombre", "Telefono", "Email"};
    JPanel content;
    ConexionExist conexion = new ConexionExist();
    List<Cliente> clientes = new ArrayList<Cliente>();
    TableRowSorter<DefaultTableModel> sorter;
    Usuario user;

    /**
     * Creates new form PanelClientes
     */
    public PanelClientes(JPanel content, Usuario user) {
        initComponents();
        this.content = content;
        this.user = user;

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
        modificarTabla();
    }

    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    public void cargarDatos() {
        clientes.clear();
        clientes = conexion.cargarClientes();
    }

    public void modificarTabla() {
        cargarDatos();
        //Nombre de las columnas y cargamos los datos al array que se le van a enviar al la tabla para cargar los datos
        int cantidad = clientes.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < clientes.size(); i++) {
            d[i][0] = String.valueOf(clientes.get(i).getId());
            d[i][1] = String.valueOf(clientes.get(i).getNombre());
            d[i][2] = String.valueOf(clientes.get(i).getTelefono());
            d[i][3] = String.valueOf(clientes.get(i).getEmail());
        }
        //se carga el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(d, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(modelo);
        table1.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelo);
        table1.setRowSorter(sorter);
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
        jLabel4 = new javax.swing.JLabel();
        buscadorField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

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
        )
    );
    jScrollPane1.setViewportView(table1);

    add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, 690, 450));

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

    add(anadirBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, -1, 40));

    eliminarBoton.setBackground(new java.awt.Color(57, 57, 58));
    eliminarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            eliminarBotonMousePressed(evt);
        }
    });

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

    add(eliminarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, -1, 40));

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

    add(editarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, -1, 40));

    jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("GESTION DE LOS CLIENTES");
    add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 830, 30));

    buscadorField.setBackground(new java.awt.Color(204, 204, 204));
    buscadorField.setBorder(null);
    buscadorField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            buscadorFieldKeyReleased(evt);
        }
    });
    add(buscadorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, 20));

    jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 0, 0));
    jLabel5.setText("Buscar:");
    add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 20));
    add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void anadirBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anadirBotonMousePressed
        cargarDatos();
        PanelAnadirCliente frame = new PanelAnadirCliente(content, user);
        frame.setSize(830, 550);
        frame.setLocation(0, 0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_anadirBotonMousePressed

    private void editarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarBotonMousePressed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para editar debes seleccionar en la tabla.");
        } else {
            int id = Integer.parseInt(table1.getValueAt(table1.getSelectedRow(), 0).toString());
            clientes.clear();
            clientes = conexion.cargarClientes();
            PanelEditarCliente frame = new PanelEditarCliente(content, clientes, id, user);
            frame.setSize(830,550);
            frame.setLocation(0,0);
            content.removeAll();
            content.add(frame, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }//GEN-LAST:event_editarBotonMousePressed

    private void eliminarBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBotonMousePressed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para eliminar debes seleccionar en la tabla.");
        } else {
            //Obtencion del id del objeto seleccionaod en la tabla
            int id = Integer.parseInt(table1.getValueAt(table1.getSelectedRow(), 0).toString());
            conexion.eliminarCliente(id);
        }
        modificarTabla();
    }//GEN-LAST:event_eliminarBotonMousePressed

    private void buscadorFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorFieldKeyReleased
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+buscadorField.getText()));
    }//GEN-LAST:event_buscadorFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anadirBoton;
    private javax.swing.JTextField buscadorField;
    private javax.swing.JPanel editarBoton;
    private javax.swing.JPanel eliminarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import clases.ConexionExist;
import clases.ControlConsulta;
import clases.InicioSesion;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 *
 * @author omega
 */
public class PanelLogs extends javax.swing.JPanel {
    String[] nombreColumnasSesion = {"id", "id Usuario", "Usuario", "Fecha"};
    String[] nombreColumnasConsultas = {"Usuario", "Fecha", "Sentencia"};
    List<InicioSesion> sesiones = new ArrayList<InicioSesion>();
    List<ControlConsulta> consultas = new ArrayList<ControlConsulta>();
    ConexionExist conexion = new ConexionExist();

    /**
     * Creates new form PanelLogs
     */
    public PanelLogs() {
        initComponents();
        
        //diseño tabla ed inicio de sesion
        tableSesion.setShowHorizontalLines(true);
        tableSesion.setGridColor(new Color(230, 230, 230));
        tableSesion.setRowHeight(30);
        tableSesion.getTableHeader().setReorderingAllowed(true);
        tableSesion.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnasSesion.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        
        //diseño de tabla de consultas
        tableConsultas.setShowHorizontalLines(true);
        tableConsultas.setGridColor(new Color(230, 230, 230));
        tableConsultas.setRowHeight(30);
        tableConsultas.getTableHeader().setReorderingAllowed(true);
        tableConsultas.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnasConsultas.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        modificarTablaSesion();
        modificarTablaConsultas();
    }

    public void cargarDatosSesiones() {
        sesiones.clear();
        sesiones = conexion.cargarInicioSesiones();
    }

    public void cargarDatosConsultas() {
        consultas.clear();
        cargarControlConsultas();
    }

    public void modificarTablaSesion() {
        cargarDatosSesiones();
        //Nombre de las columnas y cargamos los datos al array que se le van a enviar al la tabla para cargar los datos
        int cantidad = sesiones.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < sesiones.size(); i++) {
            d[i][0] = String.valueOf(sesiones.get(i).getId());
            d[i][1] = String.valueOf(sesiones.get(i).getIdUsuario());
            d[i][2] = String.valueOf(sesiones.get(i).getNombreUsuario());
            d[i][3] = String.valueOf(sesiones.get(i).getFecha());
        }
        //se carga el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(d, nombreColumnasSesion) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };;
        tableSesion.setModel(modelo);
    }

    public void modificarTablaConsultas() {
        cargarDatosConsultas();
        //Nombre de las columnas y cargamos los datos al array que se le van a enviar al la tabla para cargar los datos
        int cantidad = consultas.size();
        String[][] d = new String[cantidad][3];
        for (int i = 0; i < consultas.size(); i++) {
            d[i][0] = String.valueOf(consultas.get(i).getUsuario());
            d[i][1] = String.valueOf(consultas.get(i).getFecha());
            d[i][2] = String.valueOf(consultas.get(i).getSentecia());
        }
        //se carga el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel(d, nombreColumnasConsultas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };;
        tableConsultas.setModel(modelo);
    }

    public void cargarControlConsultas() {
        //cargamos las consultas que hay en el dat
        try {
            File file = new File(".\\src\\dats\\consultas.dat");
            FileInputStream filein = new FileInputStream(file);
            ObjectInputStream fileobj = new ObjectInputStream(filein);
            ControlConsulta control;
            while ((control = (ControlConsulta) fileobj.readObject()) != null) {
                consultas.add(control);
            }
            filein.close();
            fileobj.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo de consultas.");
        } catch (EOFException e) {

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR inesperado intentalo mas tarde.");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido encontrar la clase paara crear el objeto.");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSesion = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INICIO DE SESION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tableConsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableConsultas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 800, 200));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("REGISTRO DE CONSULTAS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        tableSesion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableSesion);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 800, 200));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableConsultas;
    private javax.swing.JTable tableSesion;
    // End of variables declaration//GEN-END:variables
}

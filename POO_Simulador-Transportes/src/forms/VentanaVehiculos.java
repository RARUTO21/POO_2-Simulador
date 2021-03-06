/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import clases.Empresa;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anthony
 */
public class VentanaVehiculos extends javax.swing.JDialog {

    private Empresa empresa = Empresa.getInstance();

    /**
     * Creates new form VentanaVehiculos
     */
    public VentanaVehiculos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tblVehiculos.setDefaultEditor(Object.class, null);
        actualizarValoresTablaVehiculos();
    }

    private void actualizarValoresTablaVehiculos() {
        btnDarMantenimiento.setEnabled(false);
        btnRepararVehiculo.setEnabled(false);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(3);

        modelo.setColumnIdentifiers(new Object[]{"ID", "Capacidad Maxima", "Vida Util"});

        empresa.getVehiculos().stream().forEach((vehiculo) -> {
            modelo.addRow(new Object[]{vehiculo.getID(), vehiculo.getCapacidadCargaDisponibles(), vehiculo.getVidaUtil()});
        });
        tblVehiculos.setModel(modelo);
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
        tblVehiculos = new javax.swing.JTable();
        btnComprarVehiculo = new javax.swing.JButton();
        btnRepararVehiculo = new javax.swing.JButton();
        btnDarMantenimiento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Vehiculos");

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Capacidad Max", "Vida Util"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehiculosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblVehiculosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehiculos);
        if (tblVehiculos.getColumnModel().getColumnCount() > 0) {
            tblVehiculos.getColumnModel().getColumn(0).setResizable(false);
            tblVehiculos.getColumnModel().getColumn(1).setResizable(false);
            tblVehiculos.getColumnModel().getColumn(2).setResizable(false);
        }

        btnComprarVehiculo.setText("Comprar Vehiculo");
        btnComprarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarVehiculoActionPerformed(evt);
            }
        });

        btnRepararVehiculo.setText("Reparar Vehiculo");
        btnRepararVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepararVehiculoActionPerformed(evt);
            }
        });

        btnDarMantenimiento.setText("Dar mantenimiento ");
        btnDarMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarMantenimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRepararVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnComprarVehiculo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnDarMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnComprarVehiculo)
                        .addGap(47, 47, 47)
                        .addComponent(btnRepararVehiculo)
                        .addGap(48, 48, 48)
                        .addComponent(btnDarMantenimiento)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarVehiculoActionPerformed
        // TODO add your handling code here:
        if (empresa.getFondos() != 0) {
            new ComprarVehiculo(null, true).setVisible(true);
            actualizarValoresTablaVehiculos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No tiene fondos en la empresa");
        }
    }//GEN-LAST:event_btnComprarVehiculoActionPerformed

    private void btnRepararVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepararVehiculoActionPerformed
        // TODO add your handling code here:
        double costoReparacion = Double.parseDouble(JOptionPane.showInputDialog(rootPane, "Ingrese el monto de reparacion", null, 1));
        if (costoReparacion < empresa.getFondos()) {
            empresa.repararVehiculo(costoReparacion);
        } else {
            JOptionPane.showMessageDialog(rootPane, "No tiene suficientes fondos en la empresa");
        }
    }//GEN-LAST:event_btnRepararVehiculoActionPerformed

    private void btnDarMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarMantenimientoActionPerformed
        // TODO add your handling code here:
        if(empresa.getVehiculos().get(tblVehiculos.getSelectedRow()).vidautilIsMax() == false){
            double costoMantenimiento = Double.parseDouble(JOptionPane.showInputDialog(rootPane, "Ingrese el monto de reparacion", null, 1));
            if(costoMantenimiento<empresa.getFondos()){
                try {
                    empresa.darMantenimientoAVehiculo(tblVehiculos.getSelectedRow(), costoMantenimiento);
                } catch (Exception ex) {
                    Logger.getLogger(VentanaVehiculos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "No tiene suficientes fondos en la empresa");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "La vida util del vehiculo esta al maximo");
        }
            
            
            
            

    }//GEN-LAST:event_btnDarMantenimientoActionPerformed

    private void tblVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculosMouseClicked
        // TODO add your handling code here:
        btnDarMantenimiento.setEnabled(true);
        btnRepararVehiculo.setEnabled(true);
    }//GEN-LAST:event_tblVehiculosMouseClicked

    private void tblVehiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculosMousePressed
        // TODO add your handling code here:
        btnDarMantenimiento.setEnabled(true);
        btnRepararVehiculo.setEnabled(true);
    }//GEN-LAST:event_tblVehiculosMousePressed

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
            java.util.logging.Logger.getLogger(VentanaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaVehiculos dialog = new VentanaVehiculos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarVehiculo;
    private javax.swing.JButton btnDarMantenimiento;
    private javax.swing.JButton btnRepararVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehiculos;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import clases.Empresa;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anthony
 */

public class VentanaChoferes extends javax.swing.JDialog {
private Empresa empresa = Empresa.getInstance();
    /**
     * Creates new form VentanaChoferes
     */
    public VentanaChoferes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        licenciasTable.setDefaultEditor(Object.class, null);
        actualizarValoresTablaLicencias();
        
       
        
        
        
    }
    
    private void actualizarValoresTablaLicencias(){
    DefaultTableModel modeloLicencias = (DefaultTableModel)licenciasTable.getModel();
        //modeloLicencias.setColumnCount(7);
        
        //modeloLicencias.setColumnIdentifiers(new Object[]{"Nombre","Moto", "Carro", "Avion","Helicoptero","Ferry","Barco"});
        modeloLicencias.setRowCount(0);
        empresa.getChoferes().stream().forEach((chofer)->{
            modeloLicencias.addRow(new Object[]{chofer.getNombre(), chofer.obtenerLicencias().get(0), chofer.obtenerLicencias().get(1), chofer.obtenerLicencias().get(2), chofer.obtenerLicencias().get(3), chofer.obtenerLicencias().get(4), chofer.obtenerLicencias().get(5)});
        });
        licenciasTable.setModel(modeloLicencias);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labChoferes = new javax.swing.JLabel();
        btnContratarChofer = new javax.swing.JButton();
        btnCapacitarChofer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        licenciasTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labChoferes.setText("Administración de Choferes");

        btnContratarChofer.setText("Contratar Chofer");
        btnContratarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarChoferActionPerformed(evt);
            }
        });

        btnCapacitarChofer.setText("Capacitar Chofer");
        btnCapacitarChofer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapacitarChoferActionPerformed(evt);
            }
        });

        licenciasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Moto", "Carro", "Avion", "Helicoptero", "Ferry", "Barco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(licenciasTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCapacitarChofer)
                    .addComponent(btnContratarChofer, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labChoferes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labChoferes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnContratarChofer)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapacitarChofer))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContratarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarChoferActionPerformed
       new ContratarChofer(null, true).setVisible(true);
       actualizarValoresTablaLicencias();
    }//GEN-LAST:event_btnContratarChoferActionPerformed

    private void btnCapacitarChoferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapacitarChoferActionPerformed
        new CapacitarChofer(null, true).setVisible(true);
    }//GEN-LAST:event_btnCapacitarChoferActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaChoferes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaChoferes dialog = new VentanaChoferes(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCapacitarChofer;
    private javax.swing.JButton btnContratarChofer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labChoferes;
    private javax.swing.JTable licenciasTable;
    // End of variables declaration//GEN-END:variables
}


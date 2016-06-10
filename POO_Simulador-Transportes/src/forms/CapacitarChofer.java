/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import clases.Empresa;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author CAMILA
 */
public class CapacitarChofer extends javax.swing.JDialog {

    Empresa empresa = Empresa.getInstance();

    /**
     * Creates new form CapacitarChofer
     */
    public CapacitarChofer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        actualizarLabel(boxTipoLicencia.getSelectedIndex());

        DefaultComboBoxModel boxChofer = new DefaultComboBoxModel();
        boxChoferesCapacitar.setModel(boxChofer);
        for (int i = 0; i < empresa.getChoferes().size(); i++) {
            String choferC = empresa.getChoferes().get(i).getNombre();
            boxChofer.addElement(choferC);
        }
    }

   
    public void actualizarLabel(int indice) {
        labCostoCapacitacion.setText(""+empresa.getCostoCapacitacion().get(indice));
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabCapacitacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boxChoferesCapacitar = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        boxTipoLicencia = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labCostoCapacitacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabCapacitacion.setText("Capacitacion de choferes");

        jLabel1.setText("Seleccione un chofer");

        boxChoferesCapacitar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxChoferesCapacitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxChoferesCapacitarActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione tipo de licencia");

        boxTipoLicencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Moto", "Carro", "Avion", "Helicoptero", "Ferry", "Barco" }));
        boxTipoLicencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boxTipoLicenciaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boxTipoLicenciaMousePressed(evt);
            }
        });
        boxTipoLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoLicenciaActionPerformed(evt);
            }
        });
        boxTipoLicencia.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                boxTipoLicenciaPropertyChange(evt);
            }
        });

        jButton1.setText("Capacitar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Costo Capacitacion ");

        labCostoCapacitacion.setText("000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(boxChoferesCapacitar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2)
                            .addComponent(boxTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labCostoCapacitacion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(LabCapacitacion)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabCapacitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxChoferesCapacitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labCostoCapacitacion)
                .addGap(62, 62, 62)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxChoferesCapacitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxChoferesCapacitarActionPerformed


    }//GEN-LAST:event_boxChoferesCapacitarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        empresa.capacitarChofer(boxChoferesCapacitar.getSelectedIndex(), boxTipoLicencia.getSelectedIndex(),empresa.getCostoCapacitacion().get(boxTipoLicencia.getSelectedIndex()));
        JOptionPane.showMessageDialog(null, "Se capacitó el chofer exitosamente");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxTipoLicenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoLicenciaMouseClicked
        // TODO add your handling code here:
        actualizarLabel(boxTipoLicencia.getSelectedIndex());

    }//GEN-LAST:event_boxTipoLicenciaMouseClicked

    private void boxTipoLicenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boxTipoLicenciaMousePressed
        actualizarLabel(boxTipoLicencia.getSelectedIndex());
    }//GEN-LAST:event_boxTipoLicenciaMousePressed

    private void boxTipoLicenciaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_boxTipoLicenciaPropertyChange
        actualizarLabel(boxTipoLicencia.getSelectedIndex());
    }//GEN-LAST:event_boxTipoLicenciaPropertyChange

    private void boxTipoLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoLicenciaActionPerformed
        actualizarLabel(boxTipoLicencia.getSelectedIndex());
    }//GEN-LAST:event_boxTipoLicenciaActionPerformed

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
            java.util.logging.Logger.getLogger(CapacitarChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapacitarChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapacitarChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapacitarChofer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CapacitarChofer dialog = new CapacitarChofer(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel LabCapacitacion;
    private javax.swing.JComboBox boxChoferesCapacitar;
    private javax.swing.JComboBox boxTipoLicencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labCostoCapacitacion;
    // End of variables declaration//GEN-END:variables
}

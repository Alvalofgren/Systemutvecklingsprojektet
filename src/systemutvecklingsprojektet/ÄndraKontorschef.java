/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author almahedengren
 */
public class �ndraKontorschef extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form �ndraKontorschef
     */
    public �ndraKontorschef(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllIListaAgenter();
        fyllIListaKontor();
        LabelKontorChef�ndrats.setVisible(false);
    }

    private void fyllIListaAgenter()
    {
        try {
            ComboBoxV�ljAgent.removeAllItems();
            ComboBoxV�ljAgent.addItem("V�lj");
            String fraga = "select namn from agent";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String v�rde : svar)
        {
            ComboBoxV�ljAgent.addItem(v�rde);
        }
        }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    private void fyllIListaKontor()
    {
        try {
            ComboBoxV�ljKontor.removeAllItems();
            ComboBoxV�ljKontor.addItem("V�lj");
            String fraga = "select Kontorsbeteckning from kontorschef";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String v�rde : svar)
        {
            ComboBoxV�ljKontor.addItem(v�rde);
        }
        }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Error");
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

        Rubrik�ndraKontorschef = new javax.swing.JLabel();
        LabelV�ljAgent = new javax.swing.JLabel();
        ComboBoxV�ljAgent = new javax.swing.JComboBox<>();
        LabelTillKontor = new javax.swing.JLabel();
        ComboBoxV�ljKontor = new javax.swing.JComboBox<>();
        Button�ndra = new javax.swing.JButton();
        LabelKontorChef�ndrats = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Rubrik�ndraKontorschef.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Rubrik�ndraKontorschef.setText("�ndra kontorschef");

        LabelV�ljAgent.setText("V�lj Agent:");

        ComboBoxV�ljAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelTillKontor.setText("Till kontor:");

        ComboBoxV�ljKontor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxV�ljKontor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxV�ljKontorActionPerformed(evt);
            }
        });

        Button�ndra.setText("�ndra");
        Button�ndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button�ndraActionPerformed(evt);
            }
        });

        LabelKontorChef�ndrats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelKontorChef�ndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelKontorChef�ndrats.setText("Kontorschef har �ndrats!");

        jButton1.setText("<--Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelV�ljAgent)
                                .addComponent(LabelTillKontor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBoxV�ljAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxV�ljKontor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(Rubrik�ndraKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(160, 160, 160)
                                    .addComponent(Button�ndra)))
                            .addGap(15, 15, 15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(LabelKontorChef�ndrats))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rubrik�ndraKontorschef)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelV�ljAgent)
                    .addComponent(ComboBoxV�ljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTillKontor)
                    .addComponent(ComboBoxV�ljKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button�ndra)
                .addGap(18, 18, 18)
                .addComponent(LabelKontorChef�ndrats)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxV�ljKontorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxV�ljKontorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxV�ljKontorActionPerformed

    private void Button�ndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button�ndraActionPerformed
        try
       {
            
          String �ndring = ("UPDATE kontorschef SET Namn = '" + ComboBoxV�ljAgent.getSelectedItem() + "'" + " WHERE Kontorsbeteckning = '" + ComboBoxV�ljKontor.getSelectedItem() + "'");
            idb.update(�ndring);
            LabelKontorChef�ndrats.setVisible(true);

       }
       catch(InfException undantag)
       {
           JOptionPane.showMessageDialog(null, "FEEEEEEEEL");
       }
    }//GEN-LAST:event_Button�ndraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (HejAdministrator.getAdminStatus()) {
            new �ndraKontorschef(idb).setVisible(true);
            dispose();
        } else {
            new HejAdministrator(idb).setVisible(true);
            dispose();
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(�ndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(�ndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(�ndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(�ndraKontorschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new �ndraKontorschef(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button�ndra;
    private javax.swing.JComboBox<String> ComboBoxV�ljAgent;
    private javax.swing.JComboBox<String> ComboBoxV�ljKontor;
    private javax.swing.JLabel LabelKontorChef�ndrats;
    private javax.swing.JLabel LabelTillKontor;
    private javax.swing.JLabel LabelV�ljAgent;
    private javax.swing.JLabel Rubrik�ndraKontorschef;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

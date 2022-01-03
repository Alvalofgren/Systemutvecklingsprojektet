/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author almahedengren
 */
public class TaBortUtrustning extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form TaBortUtrustning
     */
    public TaBortUtrustning(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllILista();
        LabelUtrustningBorttagen.setVisible(false);
    }

    private void fyllILista()
    {
        try {
            ComboBoxVäljUtrustning.removeAllItems();
            ComboBoxVäljUtrustning.addItem("Välj");
            String fraga = "select Utrustnings_ID from Utrustning";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxVäljUtrustning.addItem(värde);
        }
        }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikTaBortUtrustning = new javax.swing.JLabel();
        LabelVäljUtrustning = new javax.swing.JLabel();
        ComboBoxVäljUtrustning = new javax.swing.JComboBox<>();
        ButtonTaBort = new javax.swing.JButton();
        LabelUtrustningBorttagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikTaBortUtrustning.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikTaBortUtrustning.setText("Ta bort utrustning");

        LabelVäljUtrustning.setText("Välj utrusning");

        ComboBoxVäljUtrustning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonTaBort.setText("Ta bort");
        ButtonTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTaBortActionPerformed(evt);
            }
        });

        LabelUtrustningBorttagen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelUtrustningBorttagen.setText("Utrustningen är borttagen!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(RubrikTaBortUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(LabelVäljUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxVäljUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ButtonTaBort))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(LabelUtrustningBorttagen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(RubrikTaBortUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVäljUtrustning)
                    .addComponent(ComboBoxVäljUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTaBort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(LabelUtrustningBorttagen)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTaBortActionPerformed
        try
        {
            String kommunikation = "delete from Kommunikation where Utrustnings_ID = " + ComboBoxVäljUtrustning.getSelectedItem();
            idb.delete(kommunikation);
            String vapen = "delete from Vapen where Utrustnings_ID = " + ComboBoxVäljUtrustning.getSelectedItem(); 
            idb.delete(vapen);
            String teknik = "delete from Teknik where Utrustnings_ID = " + ComboBoxVäljUtrustning.getSelectedItem();
            idb.delete(teknik);
            String innehar = "delete from innehar_utrustning where Utrustnings_ID = " + ComboBoxVäljUtrustning.getSelectedItem();
            idb.delete(innehar);
            String utrustning = "delete from Utrustning where Utrustnings_ID = " + ComboBoxVäljUtrustning.getSelectedItem();
            idb.delete(utrustning);
            
            LabelUtrustningBorttagen.setVisible(true);
            
        }
        
        catch(InfException undantag)
                    {
                    JOptionPane.showMessageDialog(null, "Error");
                    System.out.println("Error" + undantag.getMessage());
                    }
    }//GEN-LAST:event_ButtonTaBortActionPerformed

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
//            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TaBortUtrustning(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTaBort;
    private javax.swing.JComboBox<String> ComboBoxVäljUtrustning;
    private javax.swing.JLabel LabelUtrustningBorttagen;
    private javax.swing.JLabel LabelVäljUtrustning;
    private javax.swing.JLabel RubrikTaBortUtrustning;
    // End of variables declaration//GEN-END:variables
}

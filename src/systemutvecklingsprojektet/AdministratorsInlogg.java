/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Julius
 */
public class AdministratorsInlogg extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form AdministratorsInlogg
     */
    public AdministratorsInlogg() {
        initComponents();
        this.idb=idb;
    }

    

   

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikAdministatör = new javax.swing.JLabel();
        TextFieldAnvändarnamn = new javax.swing.JTextField();
        TextFieldLösenord = new javax.swing.JTextField();
        LabelAnvändarnamn = new javax.swing.JLabel();
        LabelLösenord = new javax.swing.JLabel();
        ButtonLoggaIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikAdministatör.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikAdministatör.setText("Administratör");

        TextFieldAnvändarnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAnvändarnamnActionPerformed(evt);
            }
        });

        TextFieldLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldLösenordActionPerformed(evt);
            }
        });

        LabelAnvändarnamn.setText("Användarnamn");

        LabelLösenord.setText("Lösenord");

        ButtonLoggaIn.setText("Logga in");
        ButtonLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoggaInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RubrikAdministatör, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelLösenord)
                    .addComponent(LabelAnvändarnamn))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(RubrikAdministatör, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(LabelAnvändarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonLoggaIn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldAnvändarnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAnvändarnamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAnvändarnamnActionPerformed

    private void TextFieldLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldLösenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldLösenordActionPerformed

    private void ButtonLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoggaInActionPerformed
        new HejAdministrator(idb).setVisible(true);
    }//GEN-LAST:event_ButtonLoggaInActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorsInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorsInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorsInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorsInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorsInlogg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLoggaIn;
    private javax.swing.JLabel LabelAnvändarnamn;
    private javax.swing.JLabel LabelLösenord;
    private javax.swing.JLabel RubrikAdministatör;
    private javax.swing.JTextField TextFieldAnvändarnamn;
    private javax.swing.JTextField TextFieldLösenord;
    // End of variables declaration//GEN-END:variables
}

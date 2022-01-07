/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Julius
 */
public class ÄndraLösenordAlien extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form ÄndraLösenordAlien
     */
    public ÄndraLösenordAlien(InfDB idb) {
        initComponents();
        this.idb=idb;
        LabelLösenHarÄndrats.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikÄndraLösenord = new javax.swing.JLabel();
        KnappÄndraLösenord = new javax.swing.JToggleButton();
        LabelNyttLösenord = new javax.swing.JLabel();
        LabelBekräftaLösenord = new javax.swing.JLabel();
        PasswordFieldNyttLösen = new javax.swing.JPasswordField();
        PasswordFieldBekräftaLösen = new javax.swing.JPasswordField();
        LabelLösenHarÄndrats = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikÄndraLösenord.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikÄndraLösenord.setForeground(new java.awt.Color(0, 204, 255));
        RubrikÄndraLösenord.setText("Ändra lösenord");

        KnappÄndraLösenord.setText("Ändra lösenord");
        KnappÄndraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappÄndraLösenordActionPerformed(evt);
            }
        });

        LabelNyttLösenord.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelNyttLösenord.setText("Nytt lösenord ");

        LabelBekräftaLösenord.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelBekräftaLösenord.setText("Bekräfta lösenord:");

        PasswordFieldBekräftaLösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldBekräftaLösenActionPerformed(evt);
            }
        });

        LabelLösenHarÄndrats.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelLösenHarÄndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelLösenHarÄndrats.setText("Lösenordet har ändrats!");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(LabelNyttLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordFieldBekräftaLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordFieldNyttLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(RubrikÄndraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLösenHarÄndrats)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LabelBekräftaLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(125, 125, 125))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(KnappÄndraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(118, 118, 118)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(RubrikÄndraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addComponent(LabelNyttLösenord)
                .addGap(8, 8, 8)
                .addComponent(PasswordFieldNyttLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelBekräftaLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordFieldBekräftaLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KnappÄndraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelLösenHarÄndrats)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Denna metod ändrar lösenordet för alien. Först kontrolleras att textfälten inte är tomma och att båda textfält matchar med varandra.
//Sedan när valideringarna kontrolleras så uppdateras databasen med det nya lösenordet. 
    private void KnappÄndraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappÄndraLösenordActionPerformed
        try
       {
        if (Validering.rutornaMatchar(PasswordFieldNyttLösen, PasswordFieldBekräftaLösen) && Validering.kontrollTextFältVärde(PasswordFieldNyttLösen) && Validering.kontrollTextFältVärde(PasswordFieldBekräftaLösen)) {
            
          String ändring = ("UPDATE alien SET LOSENORD = '" + PasswordFieldNyttLösen.getText() + "'" + " WHERE NAMN = '" + AlienInlogg.getNamn() + "'");
            idb.update(ändring);
            LabelLösenHarÄndrats.setVisible(true);
    
         }
       }
       catch(InfException undantag)
       {
           JOptionPane.showMessageDialog(null, "Error");
       }         
    }//GEN-LAST:event_KnappÄndraLösenordActionPerformed

    private void PasswordFieldBekräftaLösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldBekräftaLösenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldBekräftaLösenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (HejAlien.getTillbakaKnapp()) {
            new ÄndraLösenordAlien(idb).setVisible(true);
            dispose();
        } else {
            new HejAlien(idb).setVisible(true);
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
//            java.util.logging.Logger.getLogger(ÄndraLösenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ÄndraLösenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ÄndraLösenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ÄndraLösenordAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ÄndraLösenordAlien(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton KnappÄndraLösenord;
    private javax.swing.JLabel LabelBekräftaLösenord;
    private javax.swing.JLabel LabelLösenHarÄndrats;
    private javax.swing.JLabel LabelNyttLösenord;
    private javax.swing.JPasswordField PasswordFieldBekräftaLösen;
    private javax.swing.JPasswordField PasswordFieldNyttLösen;
    private javax.swing.JLabel RubrikÄndraLösenord;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

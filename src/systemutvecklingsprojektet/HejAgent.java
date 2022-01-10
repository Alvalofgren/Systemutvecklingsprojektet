/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import javax.swing.JFrame;
import oru.inf.InfDB;

/**
 *
 * @author Julius
 */
public class HejAgent extends javax.swing.JFrame {
    private InfDB idb;
    private static boolean arAgent;
    private static boolean arAdmin;
    
    /**
     * Creates new form HejAgent
     */
    public HejAgent(InfDB idb) {
        initComponents();
        this.idb = idb;

    }
    
    public static boolean getTillbakaKnapp(){
     return arAdmin;
 } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelHejAgent = new javax.swing.JLabel();
        LabelInfoAlien = new javax.swing.JLabel();
        ButtonRas = new javax.swing.JButton();
        ButtonÄndraLösenord = new javax.swing.JButton();
        ButtonPlats = new javax.swing.JButton();
        ButtonDatum = new javax.swing.JButton();
        LabelSorteraEfter = new javax.swing.JLabel();
        javax.swing.JButton ButtonAllInfoOmEnAlien = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ButtonRegistreraUtrustning = new javax.swing.JButton();
        ButtonRegistreraAlien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelHejAgent.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        LabelHejAgent.setForeground(new java.awt.Color(0, 204, 255));
        LabelHejAgent.setText("Hej Agent");

        LabelInfoAlien.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        LabelInfoAlien.setForeground(new java.awt.Color(0, 0, 0));
        LabelInfoAlien.setText("Information om alien");

        ButtonRas.setText("Ras");
        ButtonRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRasActionPerformed(evt);
            }
        });

        ButtonÄndraLösenord.setText("Ändra lösenord");
        ButtonÄndraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraLösenordActionPerformed(evt);
            }
        });

        ButtonPlats.setText("Plats");
        ButtonPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlatsActionPerformed(evt);
            }
        });

        ButtonDatum.setText("Datum");
        ButtonDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDatumActionPerformed(evt);
            }
        });

        LabelSorteraEfter.setText("Sortera efter:");

        ButtonAllInfoOmEnAlien.setText("All information om en alien ");
        ButtonAllInfoOmEnAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAllInfoOmEnAlienActionPerformed(evt);
            }
        });

        jButton1.setText("Ändra information om alien");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ändra information");

        jLabel2.setText("Registrera");

        ButtonRegistreraUtrustning.setText("Registrera ny utrustning");
        ButtonRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistreraUtrustningActionPerformed(evt);
            }
        });

        ButtonRegistreraAlien.setText("Registrera ny alien");
        ButtonRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistreraAlienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelHejAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(482, 482, 482))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(LabelSorteraEfter, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ButtonAllInfoOmEnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonRas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 383, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LabelInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(ButtonÄndraLösenord, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonRegistreraUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonRegistreraAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(LabelHejAgent)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonAllInfoOmEnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(LabelSorteraEfter, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonÄndraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(ButtonRas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonRegistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonRegistreraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(390, 390, 390))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ButtonRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRasActionPerformed
        new ListaAliensRas(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonRasActionPerformed

    private void ButtonPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlatsActionPerformed
        new ListaAliensPlats(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonPlatsActionPerformed

    private void ButtonDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDatumActionPerformed
        new ListaAliensDatum(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonDatumActionPerformed

    private void ButtonÄndraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraLösenordActionPerformed
        new ÄndraLosenordAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonÄndraLösenordActionPerformed

    private void ButtonAllInfoOmEnAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAllInfoOmEnAlienActionPerformed
        new AllInformationEnAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonAllInfoOmEnAlienActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ÄndraInfoAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistreraUtrustningActionPerformed
        new RegistreraUtrustning(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonRegistreraUtrustningActionPerformed

    private void ButtonRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistreraAlienActionPerformed
        new NyregistreraAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonRegistreraAlienActionPerformed

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
//            java.util.logging.Logger.getLogger(HejAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HejAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HejAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HejAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HejAgent().setVisible(true);
//            }
//        });
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDatum;
    private javax.swing.JButton ButtonPlats;
    private javax.swing.JButton ButtonRas;
    private javax.swing.JButton ButtonRegistreraAlien;
    private javax.swing.JButton ButtonRegistreraUtrustning;
    private javax.swing.JButton ButtonÄndraLösenord;
    private javax.swing.JLabel LabelHejAgent;
    private javax.swing.JLabel LabelInfoAlien;
    private javax.swing.JLabel LabelSorteraEfter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

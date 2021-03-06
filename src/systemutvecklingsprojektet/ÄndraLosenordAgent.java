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
public class ÄndraLosenordAgent extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form AndraLosenord
     */
    public ÄndraLosenordAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
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

        jPasswordField1 = new javax.swing.JPasswordField();
        rubrikÄndraLösenord = new javax.swing.JLabel();
        ButtonÄndraLösenord = new javax.swing.JButton();
        LabelNyttLösenord = new javax.swing.JLabel();
        LabelBekräftaLösenord = new javax.swing.JLabel();
        PFNyttLösen = new javax.swing.JPasswordField();
        PFBekräftaLösen = new javax.swing.JPasswordField();
        LabelLösenHarÄndrats = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rubrikÄndraLösenord.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        rubrikÄndraLösenord.setForeground(new java.awt.Color(0, 204, 255));
        rubrikÄndraLösenord.setText("Ändra lösenord");

        ButtonÄndraLösenord.setText("Ändra lösenord");
        ButtonÄndraLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraLösenordActionPerformed(evt);
            }
        });

        LabelNyttLösenord.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelNyttLösenord.setText("Nytt lösenord");

        LabelBekräftaLösenord.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelBekräftaLösenord.setText("Bekräfta lösenord:");

        PFNyttLösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFNyttLösenActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rubrikÄndraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(LabelBekräftaLösenord))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LabelNyttLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PFNyttLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PFBekräftaLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelLösenHarÄndrats))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonÄndraLösenord)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(rubrikÄndraLösenord))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelNyttLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PFNyttLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelBekräftaLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PFBekräftaLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonÄndraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelLösenHarÄndrats)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Denna metod ändrar lösenordet för alien. Först kontrolleras att textfälten inte är tomma och att båda textfält matchar med varandra.
//Sedan när valideringarna kontrolleras så uppdateras databasen med det nya lösenordet. 
    
    private void ButtonÄndraLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraLösenordActionPerformed
    
       try
       {
           
           if (Validering.rutornaMatchar(PFNyttLösen, PFBekräftaLösen) && Validering.kontrollTextFältVärde(PFNyttLösen) && Validering.kontrollTextFältVärde(PFBekräftaLösen)) {
            
          String ändring = ("UPDATE AGENT SET LOSENORD = '" + PFNyttLösen.getText() + "'" + " WHERE NAMN = '" + AgentInlogg.getNamn() + "'");
            idb.update(ändring);
            LabelLösenHarÄndrats.setVisible(true);
    
         }
       }
       catch(InfException undantag)
       {
           JOptionPane.showMessageDialog(null, "Error");
       }
    }//GEN-LAST:event_ButtonÄndraLösenordActionPerformed

    private void PFNyttLösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFNyttLösenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PFNyttLösenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new HejAgent(idb).setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
       
       
       
       
       
       
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
            java.util.logging.Logger.getLogger(ÄndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÄndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÄndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÄndraLosenordAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ÄndraLosenordAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonÄndraLösenord;
    private javax.swing.JLabel LabelBekräftaLösenord;
    private javax.swing.JLabel LabelLösenHarÄndrats;
    private javax.swing.JLabel LabelNyttLösenord;
    private javax.swing.JPasswordField PFBekräftaLösen;
    private javax.swing.JPasswordField PFNyttLösen;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel rubrikÄndraLösenord;
    // End of variables declaration//GEN-END:variables
}

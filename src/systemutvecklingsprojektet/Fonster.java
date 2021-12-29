/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;
import oru.inf.InfDB;

/**
 * @author Julius
 */

public class Fonster extends javax.swing.JFrame {

   private InfDB idb;

   
    public Fonster(InfDB idb) 
    {
        initComponents();
        this.idb = idb;
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikForFonster = new javax.swing.JLabel();
        ButtonAgent = new javax.swing.JButton();
        ButtonAlien = new javax.swing.JButton();
        ButtonAdministratör = new javax.swing.JButton();
        LabelLoggaIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikForFonster.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikForFonster.setText("    Välkommen till Men in Black");

        ButtonAgent.setText("Agent");
        ButtonAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgentActionPerformed(evt);
            }
        });

        ButtonAlien.setText("Alien");
        ButtonAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlienActionPerformed(evt);
            }
        });

        ButtonAdministratör.setText("Administratör");
        ButtonAdministratör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdministratörActionPerformed(evt);
            }
        });

        LabelLoggaIn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LabelLoggaIn.setText("Logga in");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(ButtonAlien, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(ButtonAdministratör, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(RubrikForFonster, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(LabelLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RubrikForFonster, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ButtonAlien, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ButtonAdministratör, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        ButtonAgent.getAccessibleContext().setAccessibleName("");
        ButtonAlien.getAccessibleContext().setAccessibleName("");
        ButtonAdministratör.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgentActionPerformed
         new AgentInlogg(idb).setVisible(true);
    }//GEN-LAST:event_ButtonAgentActionPerformed

    private void ButtonAdministratörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdministratörActionPerformed
        new AdministratorsInlogg(idb).setVisible(true);
    }//GEN-LAST:event_ButtonAdministratörActionPerformed

    private void ButtonAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlienActionPerformed
        new AlienInlogg().setVisible(true);
    }//GEN-LAST:event_ButtonAlienActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdministratör;
    private javax.swing.JButton ButtonAgent;
    private javax.swing.JButton ButtonAlien;
    private javax.swing.JLabel LabelLoggaIn;
    private javax.swing.JLabel RubrikForFonster;
    // End of variables declaration//GEN-END:variables
}
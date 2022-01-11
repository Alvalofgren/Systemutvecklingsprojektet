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
        LabelLoggaIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikForFonster.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikForFonster.setForeground(new java.awt.Color(0, 204, 255));
        RubrikForFonster.setText("    V�lkommen till Men in Black");

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

        LabelLoggaIn.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        LabelLoggaIn.setForeground(new java.awt.Color(0, 204, 255));
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
                .addGap(50, 50, 50)
                .addComponent(ButtonAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(ButtonAlien, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addGap(99, 99, 99))
        );

        ButtonAgent.getAccessibleContext().setAccessibleName("");
        ButtonAlien.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgentActionPerformed
         new AgentInlogg(idb).setVisible(true);
         dispose();
    }//GEN-LAST:event_ButtonAgentActionPerformed

    private void ButtonAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlienActionPerformed
        new AlienInlogg(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonAlienActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgent;
    private javax.swing.JButton ButtonAlien;
    private javax.swing.JLabel LabelLoggaIn;
    private javax.swing.JLabel RubrikForFonster;
    // End of variables declaration//GEN-END:variables
}
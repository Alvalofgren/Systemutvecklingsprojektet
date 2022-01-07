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
 * @author Julius
 */
public class TaBortAlien extends javax.swing.JFrame {

    private InfDB idb;
    private static boolean arAdmin;
    /**
     * Creates new form TaBortAlien
     */
    public TaBortAlien(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllILista();
        LabelAgentBorttagen.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikTaBortAlien = new javax.swing.JLabel();
        LabelVäljAlienID = new javax.swing.JLabel();
        ComboBoxVäljAlien = new javax.swing.JComboBox<>();
        ButtonTaBort = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LabelAgentBorttagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikTaBortAlien.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikTaBortAlien.setForeground(new java.awt.Color(0, 204, 255));
        RubrikTaBortAlien.setText("Ta bort alien");

        LabelVäljAlienID.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelVäljAlienID.setText("Välj Alien:");

        ComboBoxVäljAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonTaBort.setText("Ta bort");
        ButtonTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTaBortActionPerformed(evt);
            }
        });

        jButton1.setText("<-- Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LabelAgentBorttagen.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelAgentBorttagen.setForeground(new java.awt.Color(0, 204, 51));
        LabelAgentBorttagen.setText("Alien har tagits bort!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(LabelVäljAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxVäljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RubrikTaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(ButtonTaBort)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelAgentBorttagen, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(RubrikTaBortAlien))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVäljAlienID)
                    .addComponent(ComboBoxVäljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTaBort))
                .addGap(18, 18, 18)
                .addComponent(LabelAgentBorttagen)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTaBortActionPerformed
        try
        {
            // Olika SQL-frågor som vi använder för att ta bort en alien ur respektive tabell. I å med att att aliens inte har
            // ras som attribut måste vi ta bort en aliens ID ur respektive ras-tabell. 
            
            String alienID = "select Alien_ID from alien where namn = '" + ComboBoxVäljAlien.getSelectedItem() + "'";
            String svar = idb.fetchSingle(alienID);
            
            String boglodite = "delete from boglodite where Alien_ID =" + svar; 
            idb.delete(boglodite);
            
            String squid = "delete from squid where Alien_ID =" + svar; 
            idb.delete(squid);
            
            String worm = "delete from worm where Alien_ID =" + svar;
            idb.delete(worm);
            
            String alien = "delete from alien where namn = '" + ComboBoxVäljAlien.getSelectedItem() + "'";
            idb.delete(alien);
            
            LabelAgentBorttagen.setVisible(true);
        }
        
        catch(InfException undantag)
                    {
                    JOptionPane.showMessageDialog(null, "Error");
                    }
    }//GEN-LAST:event_ButtonTaBortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (HejAdministrator.getTillbakaKnapp()) {
            new HejAdministrator(idb).setVisible(true);
            dispose();
        } else {
            new HejAdministrator(idb).setVisible(true);
            dispose();
          }
    
                                           
    }//GEN-LAST:event_jButton1ActionPerformed

     private void fyllILista(){ //Fyller comboboxen med aliens från databasen
        try {
            ComboBoxVäljAlien.removeAllItems();
            ComboBoxVäljAlien.addItem("Välj");
            String fraga = "select namn from alien";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxVäljAlien.addItem(värde);
        }
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTaBort;
    private javax.swing.JComboBox<String> ComboBoxVäljAlien;
    private javax.swing.JLabel LabelAgentBorttagen;
    private javax.swing.JLabel LabelVäljAlienID;
    private javax.swing.JLabel RubrikTaBortAlien;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

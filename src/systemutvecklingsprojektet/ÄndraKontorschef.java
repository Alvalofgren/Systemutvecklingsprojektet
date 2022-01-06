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
public class ÄndraKontorschef extends javax.swing.JFrame {
    
    //Klassen låter användaren byta chef för ett valt område
    
    private InfDB idb;
    
    public ÄndraKontorschef(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllIListaAgenter();
        fyllIListaKontor();
        LabelKontorChefÄndrats.setVisible(false);
    }

    private void fyllIListaAgenter()
    {
        try {
            ComboBoxVäljAgent.removeAllItems();
            ComboBoxVäljAgent.addItem("Välj");
            String fraga = "select namn from agent";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxVäljAgent.addItem(värde);
        }
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    private void fyllIListaKontor()
    {
        try {
            ComboBoxVäljKontor.removeAllItems();
            ComboBoxVäljKontor.addItem("Välj");
            String fraga = "select Kontorsbeteckning from kontorschef";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxVäljKontor.addItem(värde);
        }
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikÄndraKontorschef = new javax.swing.JLabel();
        LabelVäljAgent = new javax.swing.JLabel();
        ComboBoxVäljAgent = new javax.swing.JComboBox<>();
        LabelTillKontor = new javax.swing.JLabel();
        ComboBoxVäljKontor = new javax.swing.JComboBox<>();
        ButtonÄndra = new javax.swing.JButton();
        LabelKontorChefÄndrats = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikÄndraKontorschef.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikÄndraKontorschef.setText("Ändra kontorschef");

        LabelVäljAgent.setText("Välj Agent:");

        ComboBoxVäljAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelTillKontor.setText("Till kontor:");

        ComboBoxVäljKontor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxVäljKontor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxVäljKontorActionPerformed(evt);
            }
        });

        ButtonÄndra.setText("Ändra");
        ButtonÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraActionPerformed(evt);
            }
        });

        LabelKontorChefÄndrats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelKontorChefÄndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelKontorChefÄndrats.setText("Kontorschef har ändrats!");

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
                                .addComponent(LabelVäljAgent)
                                .addComponent(LabelTillKontor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBoxVäljAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxVäljKontor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(RubrikÄndraKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(160, 160, 160)
                                    .addComponent(ButtonÄndra)))
                            .addGap(15, 15, 15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(LabelKontorChefÄndrats))
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
                .addComponent(RubrikÄndraKontorschef)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVäljAgent)
                    .addComponent(ComboBoxVäljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTillKontor)
                    .addComponent(ComboBoxVäljKontor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonÄndra)
                .addGap(18, 18, 18)
                .addComponent(LabelKontorChefÄndrats)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxVäljKontorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxVäljKontorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxVäljKontorActionPerformed

    private void ButtonÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraActionPerformed
        try
       {
        String id = "select Agent_ID from agent where namn= '"+ ComboBoxVäljAgent.getSelectedItem()+"'";
        String agentid = idb.fetchSingle(id); 
        
        
          String ändring = ("UPDATE kontorschef SET Agent_ID = '" + agentid + "'" + " WHERE Kontorsbeteckning = '" + ComboBoxVäljKontor.getSelectedItem() + "'");
            idb.update(ändring);
            LabelKontorChefÄndrats.setVisible(true);

       }
       catch(InfException undantag)
       {
           JOptionPane.showMessageDialog(null, "FEEEEEEEEL");
       }
    }//GEN-LAST:event_ButtonÄndraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (HejAdministrator.getTillbakaKnapp()) {
            new ÄndraKontorschef(idb).setVisible(true);
            dispose();
        } else {
            new HejAdministrator(idb).setVisible(true);
            dispose();
          }
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonÄndra;
    private javax.swing.JComboBox<String> ComboBoxVäljAgent;
    private javax.swing.JComboBox<String> ComboBoxVäljKontor;
    private javax.swing.JLabel LabelKontorChefÄndrats;
    private javax.swing.JLabel LabelTillKontor;
    private javax.swing.JLabel LabelVäljAgent;
    private javax.swing.JLabel RubrikÄndraKontorschef;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

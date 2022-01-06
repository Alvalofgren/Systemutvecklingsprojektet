/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfException;
import oru.inf.InfDB;

/**
 *
 * @author almahedengren  //Klassen används för att ta bort agenter ur databasen
 */
public class TaBortAgent extends javax.swing.JFrame { 
        
    private InfDB idb;
    /**
     * Creates new form TaBortAgent
     */
    public TaBortAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllILista();
        LabelAgentBorttagen.setVisible(false); 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikTaBortAgent = new javax.swing.JLabel();
        LabelVäljAgentID = new javax.swing.JLabel();
        ComboBoxVäljAgent = new javax.swing.JComboBox<>();
        ButtonTaBort = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LabelAgentBorttagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikTaBortAgent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikTaBortAgent.setText("Ta bort Agent");

        LabelVäljAgentID.setText("Välj Agentnamn:");

        ComboBoxVäljAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonTaBort.setText("Ta bort");
        ButtonTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTaBortActionPerformed(evt);
            }
        });

        jButton1.setText("<--Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LabelAgentBorttagen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelAgentBorttagen.setForeground(new java.awt.Color(0, 204, 51));
        LabelAgentBorttagen.setText("Agenten har tagits bort!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(LabelVäljAgentID)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxVäljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonTaBort)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(RubrikTaBortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelAgentBorttagen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(RubrikTaBortAgent))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVäljAgentID)
                    .addComponent(ComboBoxVäljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTaBort))
                .addGap(18, 18, 18)
                .addComponent(LabelAgentBorttagen)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTaBortActionPerformed
        try
        {
            // Olika SQL-frågor som vi använder för att ta bort agenten ur respektive tabell. I å med att att agent-tabellen
            // har en constraint  som gör att man inte kan radera agenten direkt måste vi ta bort agenten ur alla andra tabeller
            // innan vi tar bort ur agent-tabellen.
            
            String agentID = "select Agent_ID from agent where namn = '" + ComboBoxVäljAgent.getSelectedItem() + "'";
            
            String svar = idb.fetchSingle(agentID);
            
            String inneharFordon = "delete from Innehar_Fordon where Agent_ID = " + svar ;
            idb.delete(inneharFordon);
            
            String fältAgent = "delete from Faltagent where Agent_ID = " + svar;
            idb.delete(fältAgent);
            
            String inneharUtrustning = "delete from Innehar_Utrustning where Agent_ID = " + svar ;
            idb.delete(inneharUtrustning);
            
            String Kontorschef = "delete from kontorschef where Agent_ID = " + svar ;
            idb.delete(Kontorschef);
            
            String omradeschef = "delete from omradeschef where Agent_ID = " + svar  ;
            idb.delete(omradeschef);
            
            String query = "delete from agent where Agent_ID = " + svar ;
            idb.delete(query);
           
            LabelAgentBorttagen.setVisible(true);
        }
        
        catch(InfException undantag)
                {
                    JOptionPane.showMessageDialog(null, "Error");
                    System.out.println("Error" + undantag.getMessage());
                }
    }//GEN-LAST:event_ButtonTaBortActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (HejAdministrator.getTillbakaKnapp()) {
            new TaBortAgent(idb).setVisible(true);
            dispose();
        } else {
            new HejAdministrator(idb).setVisible(true);
            dispose();
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fyllILista(){ //Denna metod fyller comboboxen med alla namn från agent-tabellen i databasen.
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
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTaBort;
    private javax.swing.JComboBox<String> ComboBoxVäljAgent;
    private javax.swing.JLabel LabelAgentBorttagen;
    private javax.swing.JLabel LabelVäljAgentID;
    private javax.swing.JLabel RubrikTaBortAgent;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

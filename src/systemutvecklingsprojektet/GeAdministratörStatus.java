/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfException;
/**
 *
 * @author almahedengren
 */
public class GeAdministratörStatus extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form GeAdministratörStatus
     */
    public GeAdministratörStatus(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllILista();
        LabelGodkänd.setVisible(false);

    }
    
    public void fyllILista()
    {
            try {
            ComboBoxVäljAgent.removeAllItems();
            ComboBoxVäljAgent.addItem("välj");
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelVäljAgent = new javax.swing.JLabel();
        ComboBoxVäljAgent = new javax.swing.JComboBox<>();
        RubrikGeAdministratörstatus = new javax.swing.JLabel();
        ButtonOK = new javax.swing.JButton();
        LabelGodkänd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelVäljAgent.setText("Välj Agent:");

        ComboBoxVäljAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        RubrikGeAdministratörstatus.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikGeAdministratörstatus.setText("Ge administratörstatus");

        ButtonOK.setText("OK");
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });

        LabelGodkänd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelGodkänd.setText("Agenten har blivit administratör!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RubrikGeAdministratörstatus)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelVäljAgent)
                        .addGap(47, 47, 47)
                        .addComponent(ComboBoxVäljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(ButtonOK)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelGodkänd, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(RubrikGeAdministratörstatus)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVäljAgent)
                    .addComponent(ComboBoxVäljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelGodkänd)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed
        try{ 
        String query = "update agent set administrator = 'J' where namn = '" + ComboBoxVäljAgent.getSelectedItem() + "'";
        idb.update(query);
        LabelGodkänd.setVisible(true);
        }
        
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Error!!");
        }
    }//GEN-LAST:event_ButtonOKActionPerformed

    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonOK;
    private javax.swing.JComboBox<String> ComboBoxVäljAgent;
    private javax.swing.JLabel LabelGodkänd;
    private javax.swing.JLabel LabelVäljAgent;
    private javax.swing.JLabel RubrikGeAdministratörstatus;
    // End of variables declaration//GEN-END:variables
}

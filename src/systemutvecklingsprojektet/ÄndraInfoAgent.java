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
 * @author almahedengren
 */
public class ÄndraInfoAgent extends javax.swing.JFrame { 
    
    //Denna klass ändrar ett valt attribut till ett av användaren valt nytt värde

    private InfDB idb;
    /**
     * Creates new form ÄndraInfoAgent
     */
    public ÄndraInfoAgent(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllIListaAgent();
        fyllIListaAttribut();
        LabelInfoÄndrats.setVisible(false);
    }

    private void fyllIListaAgent(){
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
        catch (InfException undantaget){
            JOptionPane.showMessageDialog(null, "Error");
        }
    } 
    
    private void fyllIListaAttribut(){
        
            ComboBoxVäljAttribut.removeAllItems();
            ComboBoxVäljAttribut.addItem("välj");
            ComboBoxVäljAttribut.addItem("Agent_ID");
            ComboBoxVäljAttribut.addItem("Namn");
            ComboBoxVäljAttribut.addItem("Telefon");
            ComboBoxVäljAttribut.addItem("Administrator");
            ComboBoxVäljAttribut.addItem("Lösenord");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikÄndraInfoAgent = new javax.swing.JLabel();
        ComboBoxVäljAttribut = new javax.swing.JComboBox<>();
        LabelVäljÄndra = new javax.swing.JLabel();
        TextFältNyttVärde = new javax.swing.JTextField();
        ComboBoxVäljAgent = new javax.swing.JComboBox<>();
        LabelFörAgent = new javax.swing.JLabel();
        LabelNyttVärde = new javax.swing.JLabel();
        KnappÄndraVärde = new javax.swing.JButton();
        LabelInfoÄndrats = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikÄndraInfoAgent.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikÄndraInfoAgent.setForeground(new java.awt.Color(0, 204, 255));
        RubrikÄndraInfoAgent.setText("Ändra information om agent");

        ComboBoxVäljAttribut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelVäljÄndra.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelVäljÄndra.setText("Välj att ändra:");

        TextFältNyttVärde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFältNyttVärdeActionPerformed(evt);
            }
        });

        ComboBoxVäljAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelFörAgent.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelFörAgent.setText("För agent:");

        LabelNyttVärde.setText("Nytt värde:");

        KnappÄndraVärde.setText("Ändra värde");
        KnappÄndraVärde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappÄndraVärdeActionPerformed(evt);
            }
        });

        LabelInfoÄndrats.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelInfoÄndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelInfoÄndrats.setText("Informationen har ändrats!");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelInfoÄndrats, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelVäljÄndra)
                                        .addGap(3, 3, 3)
                                        .addComponent(ComboBoxVäljAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LabelFörAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxVäljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(LabelNyttVärde, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextFältNyttVärde, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(KnappÄndraVärde)
                                .addGap(153, 153, 153))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(RubrikÄndraInfoAgent)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(1, 1, 1)
                .addComponent(RubrikÄndraInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxVäljAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelVäljÄndra)
                    .addComponent(ComboBoxVäljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFörAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNyttVärde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFältNyttVärde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KnappÄndraVärde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelInfoÄndrats)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFältNyttVärdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFältNyttVärdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFältNyttVärdeActionPerformed

    private void KnappÄndraVärdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappÄndraVärdeActionPerformed
        
        //Ändrar värdet till det nya värde användaren valt
        
        try
        {    
        if(Validering.kontrollTextFältVärde(TextFältNyttVärde))
        { 
            String query = "UPDATE AGENT SET " + ComboBoxVäljAttribut.getSelectedItem() + " = '" + TextFältNyttVärde.getText() + "'" + "WHERE NAMN = '" + ComboBoxVäljAgent.getSelectedItem()+"'";
            idb.update(query);
            LabelInfoÄndrats.setVisible(true);       
        }
        }
        catch(InfException undantaget)
        {
            JOptionPane.showMessageDialog(null, "Ange ett giltigt nytt värde");
                        System.out.println("Error" + undantaget.getMessage());
                        
        }
                   
    }//GEN-LAST:event_KnappÄndraVärdeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (HejAdministrator.getTillbakaKnapp()) {
            new ÄndraInfoAgent(idb).setVisible(true);
            dispose();
        } else {
            new HejAdministrator(idb).setVisible(true);
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
//            java.util.logging.Logger.getLogger(ÄndraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ÄndraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ÄndraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ÄndraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ÄndraInfoAgent(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxVäljAgent;
    private javax.swing.JComboBox<String> ComboBoxVäljAttribut;
    private javax.swing.JButton KnappÄndraVärde;
    private javax.swing.JLabel LabelFörAgent;
    private javax.swing.JLabel LabelInfoÄndrats;
    private javax.swing.JLabel LabelNyttVärde;
    private javax.swing.JLabel LabelVäljÄndra;
    private javax.swing.JLabel RubrikÄndraInfoAgent;
    private javax.swing.JTextField TextFältNyttVärde;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

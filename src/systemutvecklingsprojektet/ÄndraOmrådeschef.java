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
 * @author almahedengren
 */
public class ÄndraOmrådeschef extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form ÄndraOmrådeschef
     * @param idb
     */
    public ÄndraOmrådeschef(InfDB idb) {
        this.idb = idb;
        initComponents();
        fyllIListaAgent();
        fyllIListaOmråde();
        LabelOmrådeChefHarÄndrats.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikÄndraOmrådeschef = new javax.swing.JLabel();
        LabelVäljAgentID = new javax.swing.JLabel();
        ComboBoxVäljAgent = new javax.swing.JComboBox<>();
        LabelTillOmråde = new javax.swing.JLabel();
        ComboBoxVäljOmråde = new javax.swing.JComboBox<>();
        ButtonÄndra = new javax.swing.JButton();
        LabelOmrådeChefHarÄndrats = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikÄndraOmrådeschef.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikÄndraOmrådeschef.setForeground(new java.awt.Color(0, 204, 255));
        RubrikÄndraOmrådeschef.setText("Ändra områdeschef");

        LabelVäljAgentID.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelVäljAgentID.setText("Välj Agent:");

        ComboBoxVäljAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelTillOmråde.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelTillOmråde.setText("Till område:");

        ComboBoxVäljOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ButtonÄndra.setText("Ändra");
        ButtonÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraActionPerformed(evt);
            }
        });

        LabelOmrådeChefHarÄndrats.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelOmrådeChefHarÄndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelOmrådeChefHarÄndrats.setText("Områdeschefen har ändrats!");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelVäljAgentID)
                    .addComponent(LabelTillOmråde))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBoxVäljAgent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBoxVäljOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RubrikÄndraOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(ButtonÄndra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(LabelOmrådeChefHarÄndrats)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(RubrikÄndraOmrådeschef))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelVäljAgentID)
                    .addComponent(ComboBoxVäljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTillOmråde)
                    .addComponent(ComboBoxVäljOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ButtonÄndra)
                .addGap(18, 18, 18)
                .addComponent(LabelOmrådeChefHarÄndrats)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Denna metod ändrar områdeschefen. Den uppdaterar tabellen områdeschef och sätter agent-id från det valda agentnamnet man valt ska bli ny områdeschef. 
    //Eftersom man väljer ett agentnamn i comboboxen men det är ett agent id som ska in i områdeschef tabellen så har vi med sql-frågor hämtat ut agent-id för det valda namnet och lagrat det i variabler.
    
    private void ButtonÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraActionPerformed
        try
       {
           String query = "SELECT AGENT_ID FROM OMRADESCHEF";
           ArrayList<String> svar = idb.fetchColumn(query);
          
            String id = "select Agent_ID from agent where namn= '"+ ComboBoxVäljAgent.getSelectedItem()+"'";
            String idagent = idb.fetchSingle(id);
            
            int finnsID = Integer.parseInt(idagent);
            
            for(String varjeID : svar)
            {
                int agentID = Integer.parseInt(varjeID);
            
                if(agentID != finnsID)
                {
            String område = "select Omrades_ID from Omrade where Benamning ='"+ ComboBoxVäljOmråde.getSelectedItem()+ "'";
            String idområde = idb.fetchSingle(område);
        
            String ändring = ("UPDATE Omradeschef SET Agent_ID = '" +idagent + "'" + " WHERE Omrade = '" + idområde + "'");
            idb.update(ändring);
            LabelOmrådeChefHarÄndrats.setVisible(true);
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Agenten är redan omradeschef!");
                }
            }
       }
       catch(InfException undantag)
       {
           JOptionPane.showMessageDialog(null, "Något blev fel, ");
           System.out.println("Error" + undantag.getMessage());
       }
    }//GEN-LAST:event_ButtonÄndraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         new HejAdministrator(idb).setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void fyllIListaAgent(){
        try {
            ComboBoxVäljAgent.removeAllItems();
            ComboBoxVäljAgent.addItem("Välj");
            String query = "select namn from agent";
            ArrayList<String> svar = idb.fetchColumn(query);
        
        for(String värde : svar)
        {
            ComboBoxVäljAgent.addItem(värde);
        }
        }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    private void fyllIListaOmråde(){
        try{
            ComboBoxVäljOmråde.removeAllItems();
            ComboBoxVäljOmråde.addItem("Välj");
            String query = "select Benamning from Omrade";
            ArrayList<String> svar = idb.fetchColumn(query);
            
        for(String värde : svar)
        {
            ComboBoxVäljOmråde.addItem(värde);
        }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
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
//            java.util.logging.Logger.getLogger(ÄndraOmrådeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ÄndraOmrådeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ÄndraOmrådeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ÄndraOmrådeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ÄndraOmrådeschef(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonÄndra;
    private javax.swing.JComboBox<String> ComboBoxVäljAgent;
    private javax.swing.JComboBox<String> ComboBoxVäljOmråde;
    private javax.swing.JLabel LabelOmrådeChefHarÄndrats;
    private javax.swing.JLabel LabelTillOmråde;
    private javax.swing.JLabel LabelVäljAgentID;
    private javax.swing.JLabel RubrikÄndraOmrådeschef;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

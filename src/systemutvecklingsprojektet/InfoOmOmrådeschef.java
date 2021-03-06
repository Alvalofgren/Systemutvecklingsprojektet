/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author almahedengren
 */
public class InfoOmOmrådeschef extends javax.swing.JFrame {

    private InfDB idb;
    private ArrayList<String> allaOmrådeschefer;
    /**
     * Creates new form InfoOmOmrådeschef
     */
    public InfoOmOmrådeschef(InfDB idb) {
        initComponents();
        this.idb=idb;
        allaOmrådeschefer = new ArrayList<>();
        fyllILista();
    }
    
    private void fyllILista(){
        try {
            ComboBoxVäljOmrådeschef.removeAllItems();
            ComboBoxVäljOmrådeschef.addItem("Välj");
            String fraga = "select Benamning from Omrade";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxVäljOmrådeschef.addItem(värde);
        }
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxVäljOmrådeschef = new javax.swing.JComboBox<>();
        LabelVäljOmråde = new javax.swing.JLabel();
        RubrikInfoOmrådeschef = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaResultat = new javax.swing.JTextArea();
        ButtonVisaInfo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBoxVäljOmrådeschef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxVäljOmrådeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxVäljOmrådeschefActionPerformed(evt);
            }
        });

        LabelVäljOmråde.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelVäljOmråde.setText("Välj område:");

        RubrikInfoOmrådeschef.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikInfoOmrådeschef.setForeground(new java.awt.Color(0, 204, 255));
        RubrikInfoOmrådeschef.setText("Information om områdeschef");

        TextAreaResultat.setColumns(20);
        TextAreaResultat.setRows(5);
        jScrollPane1.setViewportView(TextAreaResultat);

        ButtonVisaInfo.setText("Visa info");
        ButtonVisaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVisaInfoActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(RubrikInfoOmrådeschef)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabelVäljOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBoxVäljOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ButtonVisaInfo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RubrikInfoOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxVäljOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelVäljOmråde)
                    .addComponent(ButtonVisaInfo))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxVäljOmrådeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxVäljOmrådeschefActionPerformed
        
    }//GEN-LAST:event_ComboBoxVäljOmrådeschefActionPerformed

    private void ButtonVisaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVisaInfoActionPerformed
        try
        {
               
                String fråga = "select agent.Agent_ID, agent.Namn from agent join omradeschef on omradeschef.Agent_ID = agent.Agent_ID join omrade on omrade.Omrades_ID = omradeschef.Omrade where omrade.Benamning ='" + ComboBoxVäljOmrådeschef.getSelectedItem().toString() + "'";
                ArrayList<HashMap<String,String>> lista = idb.fetchRows(fråga);
                TextAreaResultat.setText(null);
                
                TextAreaResultat.append(("Namn") + "\t");
                TextAreaResultat.append(("Agent_ID") + "\n");
            for(HashMap kolumn : lista)
            {
                
                TextAreaResultat.append(kolumn.get("Namn") + "\t");
                TextAreaResultat.append(" " + kolumn.get("Agent_ID") + "\n");
            }
            }
        catch(InfException undantag)
                {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                    System.out.println(undantag.getMessage());
                }
            
          
    
    }//GEN-LAST:event_ButtonVisaInfoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(AgentInlogg.getNamn() == null)
        {
        new HejAlien(idb).setVisible(true);
        dispose();
        }
        
        else{
                new HejAgent(idb).setVisible(true);
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
//            java.util.logging.Logger.getLogger(InfoOmOmrådeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InfoOmOmrådeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InfoOmOmrådeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InfoOmOmrådeschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InfoOmOmrådeschef(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonVisaInfo;
    private javax.swing.JComboBox<String> ComboBoxVäljOmrådeschef;
    private javax.swing.JLabel LabelVäljOmråde;
    private javax.swing.JLabel RubrikInfoOmrådeschef;
    private javax.swing.JTextArea TextAreaResultat;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

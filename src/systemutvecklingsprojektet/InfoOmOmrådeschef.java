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
public class InfoOmOmr�deschef extends javax.swing.JFrame {

    private InfDB idb;
    private ArrayList<String> allaOmr�deschefer;
    /**
     * Creates new form InfoOmOmr�deschef
     */
    public InfoOmOmr�deschef(InfDB idb) {
        initComponents();
        this.idb=idb;
        allaOmr�deschefer = new ArrayList<>();
        fyllILista();
    }
    
    private void fyllILista(){
        try {
            ComboBoxV�ljOmr�deschef.removeAllItems();
            String fraga = "select Benamning from Omrade";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String v�rde : svar)
        {
            ComboBoxV�ljOmr�deschef.addItem(v�rde);
        }
        }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxV�ljOmr�deschef = new javax.swing.JComboBox<>();
        LabelV�ljOmr�de = new javax.swing.JLabel();
        RubrikInfoOmr�deschef = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaResultat = new javax.swing.JTextArea();
        ButtonVisaInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBoxV�ljOmr�deschef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxV�ljOmr�deschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxV�ljOmr�deschefActionPerformed(evt);
            }
        });

        LabelV�ljOmr�de.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LabelV�ljOmr�de.setText("V�lj omr�de:");

        RubrikInfoOmr�deschef.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikInfoOmr�deschef.setText("Information om omr�deschef");

        TextAreaResultat.setColumns(20);
        TextAreaResultat.setRows(5);
        jScrollPane1.setViewportView(TextAreaResultat);

        ButtonVisaInfo.setText("Visa info");
        ButtonVisaInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVisaInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(RubrikInfoOmr�deschef)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(LabelV�ljOmr�de, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboBoxV�ljOmr�deschef, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ButtonVisaInfo))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(RubrikInfoOmr�deschef, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxV�ljOmr�deschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelV�ljOmr�de)
                    .addComponent(ButtonVisaInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxV�ljOmr�deschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxV�ljOmr�deschefActionPerformed
        
    }//GEN-LAST:event_ComboBoxV�ljOmr�deschefActionPerformed

    private void ButtonVisaInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVisaInfoActionPerformed
        try
        {
               TextAreaResultat.replaceSelection(" ");
                String fr�ga = "Select Agent.Namn, Agent.Agent_ID, Omrade.Benamning from Agent join Omradeschef on Agent.Omrade = Omradeschef.Omrade join Omrade on Agent.Omrade = Omrade.Omrades_ID where Omrade.Benamning = '" + ComboBoxV�ljOmr�deschef.getSelectedItem().toString() + "' ";
                ArrayList<HashMap<String,String>> lista = idb.fetchRows(fr�ga);
                TextAreaResultat.setText(null);
                
            for(HashMap kolumn : lista)
            {
               
                TextAreaResultat.append(kolumn.get("Namn") + "\t");
                TextAreaResultat.append(" " + kolumn.get("Agent_ID") + "\t");
                TextAreaResultat.append(" " + kolumn.get("Benamning") + "\n");
            }
            }
        catch(InfException undantag)
                {
                JOptionPane.showMessageDialog(null, "N�got gick fel");
                    System.out.println(undantag.getMessage());
                }
            
          
    
    }//GEN-LAST:event_ButtonVisaInfoActionPerformed

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
//            java.util.logging.Logger.getLogger(InfoOmOmr�deschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InfoOmOmr�deschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InfoOmOmr�deschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InfoOmOmr�deschef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InfoOmOmr�deschef(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonVisaInfo;
    private javax.swing.JComboBox<String> ComboBoxV�ljOmr�deschef;
    private javax.swing.JLabel LabelV�ljOmr�de;
    private javax.swing.JLabel RubrikInfoOmr�deschef;
    private javax.swing.JTextArea TextAreaResultat;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

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
public class S?kInfoOmAgent extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form S?kInfoOmAgent
     */
    public S?kInfoOmAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllILista();
    }

    public void fyllILista(){
        try {
            ComboBoxV?ljAgent.removeAllItems();
            ComboBoxV?ljAgent.addItem("V?lj");
            String fraga = "select namn from agent";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String v?rde : svar)
        {
            ComboBoxV?ljAgent.addItem(v?rde);
        }
        }
        catch (InfException undantag){
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

        RubrikS?kInfoAgent = new javax.swing.JLabel();
        ComboBoxV?ljAgent = new javax.swing.JComboBox<>();
        LabelV?ljNamn = new javax.swing.JLabel();
        ButtonS?k = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaF?nster = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikS?kInfoAgent.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikS?kInfoAgent.setForeground(new java.awt.Color(0, 204, 255));
        RubrikS?kInfoAgent.setText("S?k information om agent");

        ComboBoxV?ljAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelV?ljNamn.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelV?ljNamn.setText("V?lj namn p? agent");

        ButtonS?k.setText("S?k");
        ButtonS?k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonS?kActionPerformed(evt);
            }
        });

        TextAreaF?nster.setColumns(20);
        TextAreaF?nster.setRows(5);
        jScrollPane1.setViewportView(TextAreaF?nster);

        jButton1.setText("<-Tillbaka");
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
                        .addGap(38, 38, 38)
                        .addComponent(LabelV?ljNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxV?ljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(ButtonS?k))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addGap(81, 81, 81)
                        .addComponent(RubrikS?kInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(RubrikS?kInfoAgent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxV?ljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelV?ljNamn)
                    .addComponent(ButtonS?k))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonS?kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonS?kActionPerformed
        TextAreaF?nster.setText(null);
        try
        {
            String query = "Select * from agent where Namn = '" + ComboBoxV?ljAgent.getSelectedItem().toString() + "'"; 
            ArrayList<HashMap<String, String>> rad = idb.fetchRows(query);
            
            for(HashMap kolumn : rad)
            {
                
                   TextAreaF?nster.append(("Agent_ID") + "\t");
                   TextAreaF?nster.append(("Namn") + "\t");
                   TextAreaF?nster.append(("Telefon") + "\t");
                   TextAreaF?nster.append(("Anstallningsdatum") + "\t");
                   TextAreaF?nster.append(("Administrator") + "\t");
                   TextAreaF?nster.append(("Losenord") + "\t");
                   TextAreaF?nster.append(("Omrade") + "\n");   
                
                   TextAreaF?nster.append(kolumn.get("Agent_ID") + "\t");
                   TextAreaF?nster.append(kolumn.get("Namn") + "\t");
                   TextAreaF?nster.append(kolumn.get("Telefon") + "\t");
                   TextAreaF?nster.append(kolumn.get("Anstallningsdatum") + "\t\t");
                   TextAreaF?nster.append(kolumn.get("Administrator") + "\t");
                   TextAreaF?nster.append(kolumn.get("Losenord") + "\t");
                   TextAreaF?nster.append(kolumn.get("Omrade") + "\n");

                }
        } 
        catch(InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_ButtonS?kActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HejAdministrator(idb).setVisible(true);
        dispose();
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
//            java.util.logging.Logger.getLogger(S?kInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(S?kInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(S?kInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(S?kInfoOmAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new S?kInfoOmAgent(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonS?k;
    private javax.swing.JComboBox<String> ComboBoxV?ljAgent;
    private javax.swing.JLabel LabelV?ljNamn;
    private javax.swing.JLabel RubrikS?kInfoAgent;
    private javax.swing.JTextArea TextAreaF?nster;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

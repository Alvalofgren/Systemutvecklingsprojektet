 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;


// *
// * @author almahedengren
// */

import javax.swing.JOptionPane;
public class AllInformationEnAlien extends javax.swing.JFrame {

    private InfDB idb;
    private ArrayList<String> allaAliens;
    /**
     * Creates new form AllInformationEnAlien
     */
    public AllInformationEnAlien(InfDB idb) {
        initComponents();
        this.idb=idb;
        allaAliens = new ArrayList<>();
        fyllILista();
        TextAreaF?nster.setEditable(false);

    }

    /**
     * FyllILista metoden fyller v?r comboBox med v?rden. V?rdena ?r fr?n den databas som vi ska anv?nda oss av dessa f?r vi 
     * tag p? genom att anv?nda oss av sql fr?gor i v?r javakod. 
     */
    
    private void fyllILista()
    {
        
        try {
        String fraga = "select Namn from alien";
        ArrayList<String> svar = idb.fetchColumn(fraga);
        ComboBoxV?ljAlien.removeAllItems();
        ComboBoxV?ljAlien.addItem("V?lj");
        
        for(String v?rde: svar)
        {
            ComboBoxV?ljAlien.addItem(v?rde);
        }
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RubrikVisaAllInfoAlien = new javax.swing.JLabel();
        LabelV?ljAlien = new javax.swing.JLabel();
        ComboBoxV?ljAlien = new javax.swing.JComboBox<>();
        KnappV?lj = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaF?nster = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikVisaAllInfoAlien.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikVisaAllInfoAlien.setForeground(new java.awt.Color(0, 204, 255));
        RubrikVisaAllInfoAlien.setText("Lista all information om en alien");

        LabelV?ljAlien.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelV?ljAlien.setText("V?lj alien:");

        ComboBoxV?ljAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxV?ljAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxV?ljAlienActionPerformed(evt);
            }
        });

        KnappV?lj.setText("V?lj");
        KnappV?lj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappV?ljActionPerformed(evt);
            }
        });

        TextAreaF?nster.setColumns(20);
        TextAreaF?nster.setRows(5);
        jScrollPane2.setViewportView(TextAreaF?nster);

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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(LabelV?ljAlien)
                        .addGap(46, 46, 46)
                        .addComponent(ComboBoxV?ljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(KnappV?lj, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(105, 105, 105)
                        .addComponent(RubrikVisaAllInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RubrikVisaAllInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KnappV?lj, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelV?ljAlien)
                    .addComponent(ComboBoxV?ljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxV?ljAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxV?ljAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxV?ljAlienActionPerformed

    /**
     * Metoden l?gger in v?rden i v?r textarea utifr?n en alien som man v?ljer
     * @param evt 
     */
    
    private void KnappV?ljActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappV?ljActionPerformed
        TextAreaF?nster.setText("");
        try
        {
            String query = "Select * from alien where Namn = '" + ComboBoxV?ljAlien.getSelectedItem().toString() + "'"; 
            ArrayList<HashMap<String, String>> rad = idb.fetchRows(query);
            
            TextAreaF?nster.append(("Alien_ID") + "\t");
            TextAreaF?nster.append(("Registreringsdatum") + "\t");
            TextAreaF?nster.append(("Losenord") + "\t");
            TextAreaF?nster.append(("Namn") + "\t");
            TextAreaF?nster.append(("Telefon") + "\t");
            TextAreaF?nster.append(("Plats") + "\t");
            TextAreaF?nster.append(("Ansvarig_Agent") + "\n");
            TextAreaF?nster.setEditable(false);
            
            for(HashMap kolumn : rad)
            {
             
                   TextAreaF?nster.append(kolumn.get("Alien_ID") + "\t");
                   TextAreaF?nster.append(kolumn.get("Registreringsdatum") + "\t\t");
                   TextAreaF?nster.append(kolumn.get("Losenord") + "\t");
                   TextAreaF?nster.append(kolumn.get("Namn") + "\t");
                   TextAreaF?nster.append(kolumn.get("Telefon") + "\t");
                   TextAreaF?nster.append(kolumn.get("Plats") + "\t");
                   TextAreaF?nster.append(kolumn.get("Ansvarig_Agent") + "\n");
                   TextAreaF?nster.setEditable(false);

                }
            }
        
        
        catch(InfException undantag)
        {
            JOptionPane.showMessageDialog(null, "Ange ett giltigt namn");
            System.out.println("Error" + undantag.getMessage());
        }
    }//GEN-LAST:event_KnappV?ljActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 new HejAgent(idb).setVisible(true);
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
//            java.util.logging.Logger.getLogger(AllInformationEnAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AllInformationEnAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AllInformationEnAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AllInformationEnAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AllInformationEnAlien().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxV?ljAlien;
    private javax.swing.JButton KnappV?lj;
    private javax.swing.JLabel LabelV?ljAlien;
    private javax.swing.JLabel RubrikVisaAllInfoAlien;
    private javax.swing.JTextArea TextAreaF?nster;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

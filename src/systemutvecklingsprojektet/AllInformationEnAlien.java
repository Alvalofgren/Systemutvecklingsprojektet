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
        
        
        
    }

    private void fyllILista()
    {
        
        try {
            String fraga = "select Namn from alien";
        ArrayList<String> svar = idb.fetchColumn(fraga);
        ComboBoxVäljAlien.removeAllItems();
        ComboBoxVäljAlien.addItem("Välj");
        
        for(String värde: svar)
        {
            ComboBoxVäljAlien.addItem(värde);
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RubrikVisaAllInfoAlien = new javax.swing.JLabel();
        LabelVäljAlien = new javax.swing.JLabel();
        ComboBoxVäljAlien = new javax.swing.JComboBox<>();
        KnappVälj = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaFönster = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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

        RubrikVisaAllInfoAlien.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikVisaAllInfoAlien.setText("Lista all information om en alien");

        LabelVäljAlien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelVäljAlien.setText("Välj alien:");

        ComboBoxVäljAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxVäljAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxVäljAlienActionPerformed(evt);
            }
        });

        KnappVälj.setText("Välj");
        KnappVälj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappVäljActionPerformed(evt);
            }
        });

        TextAreaFönster.setColumns(20);
        TextAreaFönster.setRows(5);
        jScrollPane2.setViewportView(TextAreaFönster);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Alien-ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Registreringsdatum");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Lösenord");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Namn");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Telefon");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Plats");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Ansvarig agent");

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
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(19, 19, 19))
                                    .addComponent(LabelVäljAlien))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel4)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel5)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(ComboBoxVäljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(KnappVälj, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(118, 118, 118)
                        .addComponent(RubrikVisaAllInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RubrikVisaAllInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KnappVälj, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelVäljAlien)
                    .addComponent(ComboBoxVäljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxVäljAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxVäljAlienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxVäljAlienActionPerformed

    private void KnappVäljActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappVäljActionPerformed
        TextAreaFönster.setText("");
        try
        {
            String query = "Select * from alien where Namn = '" + ComboBoxVäljAlien.getSelectedItem().toString() + "'"; 
            ArrayList<HashMap<String, String>> rad = idb.fetchRows(query);
            
            for(HashMap kolumn : rad)
            {
                
                   TextAreaFönster.append(kolumn.get("Alien_ID") + "\t");
                   TextAreaFönster.append(" " + kolumn.get("Registreringsdatum") + "\t");
                   TextAreaFönster.append(" " + kolumn.get("Losenord") + "\t");
                   TextAreaFönster.append(" " + kolumn.get("Namn") + "\t");
                   TextAreaFönster.append(" " + kolumn.get("Telefon") + "\t");
                   TextAreaFönster.append(" " + kolumn.get("Plats") + "\t");
                   TextAreaFönster.append(" " + kolumn.get("Ansvarig_Agent") + "\n");

                }
            }
        
        
        catch(InfException abc)
        {
            JOptionPane.showMessageDialog(null, "Ange ett giltigt namn");
            System.out.println("Error" + abc.getMessage());
        }
    }//GEN-LAST:event_KnappVäljActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (HejAgent.getAdminStatus() == true) {
            new AllInformationEnAlien(idb).setVisible(true);
            dispose();
        } else {
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
    private javax.swing.JComboBox<String> ComboBoxVäljAlien;
    private javax.swing.JButton KnappVälj;
    private javax.swing.JLabel LabelVäljAlien;
    private javax.swing.JLabel RubrikVisaAllInfoAlien;
    private javax.swing.JTextArea TextAreaFönster;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

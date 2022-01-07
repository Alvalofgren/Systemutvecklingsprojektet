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
public class �ndraRas extends javax.swing.JFrame {
    private InfDB idb;
        /**
     * Creates new form �ndraRas
     */
    public �ndraRas(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllIListaAlien();
        fyllIListaRas();
        LabelRasenHar�ndrats.setVisible(false);
    }
//Fyller combobox med de olika aliennamn som finns. 
    private void fyllIListaAlien(){
        try {
            ComboBoxV�ljAlien.removeAllItems();
            ComboBoxV�ljAlien.addItem("V�lj");
            String fraga = "select namn from alien";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String v�rde : svar)
        {
            ComboBoxV�ljAlien.addItem(v�rde);
        }
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
//Fyller combobox med de raser som finns.   
    private void fyllIListaRas(){
        ComboBoxV�ljNyRas.removeAllItems();
        ComboBoxV�ljNyRas.addItem("V�lj");
        ComboBoxV�ljNyRas.addItem("Boglodite");
        ComboBoxV�ljNyRas.addItem("Squid");
        ComboBoxV�ljNyRas.addItem("Worm");
        
        ComboBoxV�ljNuvarandeRas.removeAllItems();
        ComboBoxV�ljNuvarandeRas.addItem("V�lj");
        ComboBoxV�ljNuvarandeRas.addItem("Boglodite");
        ComboBoxV�ljNuvarandeRas.addItem("Squid");
        ComboBoxV�ljNuvarandeRas.addItem("Worm");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelRubrik = new javax.swing.JLabel();
        LabelV�ljAlien = new javax.swing.JLabel();
        ComboBoxV�ljAlien = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ComboBoxV�ljNyRas = new javax.swing.JComboBox<>();
        Button�ndra = new javax.swing.JButton();
        LabelRasenHar�ndrats = new javax.swing.JLabel();
        LabelNuvarandeRas = new javax.swing.JLabel();
        ComboBoxV�ljNuvarandeRas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelRubrik.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        LabelRubrik.setForeground(new java.awt.Color(0, 204, 255));
        LabelRubrik.setText("�ndra rastillh�righet");

        LabelV�ljAlien.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelV�ljAlien.setText("V�lj Alien:");

        ComboBoxV�ljAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        jLabel1.setText("Ny ras:");

        ComboBoxV�ljNyRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Button�ndra.setText("�ndra");
        Button�ndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button�ndraActionPerformed(evt);
            }
        });

        LabelRasenHar�ndrats.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelRasenHar�ndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelRasenHar�ndrats.setText("Rasen har �ndrats!");

        LabelNuvarandeRas.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelNuvarandeRas.setText("Nuvarande ras:");

        ComboBoxV�ljNuvarandeRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxV�ljNyRas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelV�ljAlien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxV�ljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNuvarandeRas)
                                .addGap(43, 43, 43)
                                .addComponent(ComboBoxV�ljNuvarandeRas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(LabelRasenHar�ndrats)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Button�ndra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(LabelRubrik)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(LabelRubrik)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNuvarandeRas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxV�ljNuvarandeRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelV�ljAlien)
                    .addComponent(ComboBoxV�ljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBoxV�ljNyRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(LabelRasenHar�ndrats)
                .addGap(18, 18, 18)
                .addComponent(Button�ndra)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//�ndrar ras p� den alien man valt. 
//F�rst kontrolleras med olika if-satser vilken ras alien tillh�r och d� raderas den valda alien fr�n den nuvarande rasen med hj�lp av en delete sql-fr�ga. 
//Sedan l�ggs alien-id till i tabellen f�r den nya rasen man valt.
    
    private void Button�ndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button�ndraActionPerformed
       try
       {
           String namn = "select Alien_ID from alien where namn ='" + ComboBoxV�ljAlien.getSelectedItem()+"'";
           String svar = idb.fetchSingle(namn);
           
       if(ComboBoxV�ljNuvarandeRas.getSelectedItem().equals("Boglodite")){
           String �ndring = "DELETE FROM Boglodite where Alien_ID = " + svar;           
           idb.delete(�ndring);
           
           
           String nyRas = "INSERT INTO " + ComboBoxV�ljNyRas.getSelectedItem()+ "(Alien_ID)" + "VALUES" + "(" +svar+ ")";
           idb.insert(nyRas);
       }
       if(ComboBoxV�ljNuvarandeRas.getSelectedItem().equals("Worm")){
          String �ndring = "DELETE FROM Worm where Alien_ID = '" + svar;
          idb.delete(�ndring);
         
          String nyRas = "INSERT INTO " + ComboBoxV�ljNyRas.getSelectedItem() + " (Alien_ID) " +  "VALUES" + "(" + svar+ ")";
          idb.insert(nyRas);
       }
       if(ComboBoxV�ljNuvarandeRas.getSelectedItem().equals("Squid")){
          String �ndring = "DELETE FROM Squid where Alien_ID = " + svar ;
          idb.delete(�ndring);
          
          String nyRas = "INSERT INTO " + ComboBoxV�ljNyRas.getSelectedItem()+ "(Alien_ID)" + "VALUES" + "(" + svar+ ")";
          idb.insert(nyRas);
          
       }
          
       LabelRasenHar�ndrats.setVisible(true);
       }
       catch(InfException undantag){
           JOptionPane.showMessageDialog(null, "Error");
       }
    }//GEN-LAST:event_Button�ndraActionPerformed

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
//            java.util.logging.Logger.getLogger(�ndraRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(�ndraRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(�ndraRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(�ndraRas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new �ndraRas(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button�ndra;
    private javax.swing.JComboBox<String> ComboBoxV�ljAlien;
    private javax.swing.JComboBox<String> ComboBoxV�ljNuvarandeRas;
    private javax.swing.JComboBox<String> ComboBoxV�ljNyRas;
    private javax.swing.JLabel LabelNuvarandeRas;
    private javax.swing.JLabel LabelRasenHar�ndrats;
    private javax.swing.JLabel LabelRubrik;
    private javax.swing.JLabel LabelV�ljAlien;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

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
public class �ndraInfoAgent extends javax.swing.JFrame { 
    
    //Denna klass �ndrar ett valt attribut till ett av anv�ndaren valt nytt v�rde

    private InfDB idb;
    /**
     * Creates new form �ndraInfoAgent
     */
    public �ndraInfoAgent(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllIListaAgent();
        fyllIListaAttribut();
        LabelInfo�ndrats.setVisible(false);
    }

    private void fyllIListaAgent(){
        try {
            ComboBoxV�ljAgent.removeAllItems();
            ComboBoxV�ljAgent.addItem("V�lj");
            String fraga = "select namn from agent";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String v�rde : svar)
        {
            ComboBoxV�ljAgent.addItem(v�rde);
        }
        }
        catch (InfException undantaget){
            JOptionPane.showMessageDialog(null, "Error");
        }
    } 
    
    private void fyllIListaAttribut(){
        
            ComboBoxV�ljAttribut.removeAllItems();
            ComboBoxV�ljAttribut.addItem("v�lj");
            ComboBoxV�ljAttribut.addItem("Telefon");
            ComboBoxV�ljAttribut.addItem("Administrator");
            ComboBoxV�ljAttribut.addItem("L�senord");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rubrik�ndraInfoAgent = new javax.swing.JLabel();
        ComboBoxV�ljAttribut = new javax.swing.JComboBox<>();
        LabelV�lj�ndra = new javax.swing.JLabel();
        TextF�ltNyttV�rde = new javax.swing.JTextField();
        ComboBoxV�ljAgent = new javax.swing.JComboBox<>();
        LabelF�rAgent = new javax.swing.JLabel();
        LabelNyttV�rde = new javax.swing.JLabel();
        Knapp�ndraV�rde = new javax.swing.JButton();
        LabelInfo�ndrats = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Rubrik�ndraInfoAgent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Rubrik�ndraInfoAgent.setText("�ndra information om agent");

        ComboBoxV�ljAttribut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelV�lj�ndra.setText("V�lj att �ndra:");

        TextF�ltNyttV�rde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextF�ltNyttV�rdeActionPerformed(evt);
            }
        });

        ComboBoxV�ljAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelF�rAgent.setText("F�r agent:");

        LabelNyttV�rde.setText("Nytt v�rde:");

        Knapp�ndraV�rde.setText("�ndra v�rde");
        Knapp�ndraV�rde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Knapp�ndraV�rdeActionPerformed(evt);
            }
        });

        LabelInfo�ndrats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelInfo�ndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelInfo�ndrats.setText("Informationen har �ndrats!");

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
                                    .addComponent(LabelInfo�ndrats, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelV�lj�ndra)
                                        .addGap(3, 3, 3)
                                        .addComponent(ComboBoxV�ljAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LabelF�rAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxV�ljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(LabelNyttV�rde, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextF�ltNyttV�rde, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(139, 139, 139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Knapp�ndraV�rde)
                                .addGap(153, 153, 153))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Rubrik�ndraInfoAgent)
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
                .addComponent(Rubrik�ndraInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxV�ljAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelV�lj�ndra)
                    .addComponent(ComboBoxV�ljAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelF�rAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNyttV�rde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextF�ltNyttV�rde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Knapp�ndraV�rde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelInfo�ndrats)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextF�ltNyttV�rdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextF�ltNyttV�rdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextF�ltNyttV�rdeActionPerformed

    private void Knapp�ndraV�rdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Knapp�ndraV�rdeActionPerformed
        
        //�ndrar v�rdet till det nya v�rde anv�ndaren valt
        
        try
        {    
        if(Validering.kontrollTextF�ltV�rde(TextF�ltNyttV�rde))
        {
            if(ComboBoxV�ljAttribut.getSelectedItem().equals("Telefon"))
            {
                if(Validering.telefon�rGiltig(TextF�ltNyttV�rde)) 
                {
                String telefon = "UPDATE AGENT SET TELEFON = '"+ TextF�ltNyttV�rde.getText() + "'" + "WHERE NAMN ='"+ ComboBoxV�ljAgent.getSelectedItem()+"'";
                idb.update(telefon);
                LabelInfo�ndrats.setVisible(true);
                }
            }
            else if(ComboBoxV�ljAttribut.getSelectedItem().equals("Administrator"))
            {
                if(TextF�ltNyttV�rde.getText().equals("Ja"))
                {
                String administrat�r = "UPDATE AGENT SET ADMINISTRATOR = 'J' WHERE NAMN='"+ ComboBoxV�ljAgent.getSelectedItem()+"'";
                idb.update(administrat�r);
                LabelInfo�ndrats.setVisible(true);
                }
                else if(TextF�ltNyttV�rde.getText().equals("Nej"))
                {
                String admin = "UPDATE AGENT SET ADMINISTRATOR = 'N' WHERE NAMN = '"+ ComboBoxV�ljAgent.getSelectedItem()+"'";
                idb.update(admin);
                LabelInfo�ndrats.setVisible(true);
                }
                else
                {
                JOptionPane.showMessageDialog(null,"Skriv in ja eller nej i rutan");
                }
                
            }
            else if(ComboBoxV�ljAttribut.getSelectedItem().equals("L�senord"))
            {
               String losen = "UPDATE AGENT SET L�SENORD ='"+TextF�ltNyttV�rde.getText() + "'" + "WHERE NAMN ='"+ ComboBoxV�ljAgent.getSelectedItem()+"'";
               idb.update(losen);
               LabelInfo�ndrats.setVisible(true);
            }
        }
        }
        catch(InfException undantaget)
        {
            JOptionPane.showMessageDialog(null, "Ange ett giltigt nytt v�rde");
                        System.out.println("Error" + undantaget.getMessage());
                        
        }
                   
    }//GEN-LAST:event_Knapp�ndraV�rdeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (HejAdministrator.getTillbakaKnapp()) {
            new �ndraInfoAgent(idb).setVisible(true);
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
//            java.util.logging.Logger.getLogger(�ndraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(�ndraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(�ndraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(�ndraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new �ndraInfoAgent(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxV�ljAgent;
    private javax.swing.JComboBox<String> ComboBoxV�ljAttribut;
    private javax.swing.JButton Knapp�ndraV�rde;
    private javax.swing.JLabel LabelF�rAgent;
    private javax.swing.JLabel LabelInfo�ndrats;
    private javax.swing.JLabel LabelNyttV�rde;
    private javax.swing.JLabel LabelV�lj�ndra;
    private javax.swing.JLabel Rubrik�ndraInfoAgent;
    private javax.swing.JTextField TextF�ltNyttV�rde;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

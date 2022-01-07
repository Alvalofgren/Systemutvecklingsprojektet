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
public class ÄndraInfoAlien extends javax.swing.JFrame {
    
    //Klassen är till för att ändra ett attribut som användaren anger till ett nytt värde

    private InfDB idb;
    /**
     * Creates new form ÄndraInfoAlien
     */
    public ÄndraInfoAlien(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllIListaAlien();
        fyllIListaAttribut();
        LabelInfoÄndrats.setVisible(false);
    }

    private void fyllIListaAlien(){
        try {
            ComboBoxVäljAlien.removeAllItems();
            ComboBoxVäljAlien.addItem("Välj");
            String fraga = "select namn from alien";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxVäljAlien.addItem(värde);
        }
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    private void fyllIListaAttribut(){
        ComboBoxVäljAttribut.removeAllItems();
            ComboBoxVäljAttribut.addItem("välj");
            ComboBoxVäljAttribut.addItem("Lösenord");
            ComboBoxVäljAttribut.addItem("Telefon");
            ComboBoxVäljAttribut.addItem("Plats");
            ComboBoxVäljAttribut.addItem("Ansvarig_Agent");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        RubrikÄndraInfoAlien = new javax.swing.JLabel();
        LabelÄndraEgenskapen = new javax.swing.JLabel();
        LabelFörAlien = new javax.swing.JLabel();
        KnappÄndra = new javax.swing.JButton();
        ComboBoxVäljAttribut = new javax.swing.JComboBox<>();
        ComboBoxVäljAlien = new javax.swing.JComboBox<>();
        TextFältNyttVärde = new javax.swing.JTextField();
        LabelNyttVärde = new javax.swing.JLabel();
        LabelInfoÄndrats = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikÄndraInfoAlien.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikÄndraInfoAlien.setForeground(new java.awt.Color(0, 204, 255));
        RubrikÄndraInfoAlien.setText("Ändra information om alien");

        LabelÄndraEgenskapen.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelÄndraEgenskapen.setText("Ändra egenskapen:");

        LabelFörAlien.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelFörAlien.setText("För alien:");

        KnappÄndra.setText("Ändra");
        KnappÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappÄndraActionPerformed(evt);
            }
        });

        ComboBoxVäljAttribut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBoxVäljAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelNyttVärde.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelNyttVärde.setText("Nytt värde:");

        LabelInfoÄndrats.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelInfoÄndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelInfoÄndrats.setText("Informationen har ändrats!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelNyttVärde, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelÄndraEgenskapen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboBoxVäljAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(LabelFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(KnappÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFältNyttVärde, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxVäljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(LabelInfoÄndrats, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(RubrikÄndraInfoAlien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(RubrikÄndraInfoAlien)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelÄndraEgenskapen)
                    .addComponent(LabelFörAlien)
                    .addComponent(ComboBoxVäljAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxVäljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNyttVärde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFältNyttVärde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KnappÄndra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(LabelInfoÄndrats)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KnappÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappÄndraActionPerformed
        
        //Här får användaren ange ett nytt värde som skickas in i tabellen
        
        try
        {    
        if(Validering.kontrollTextFältVärde(TextFältNyttVärde))
        {
            if(ComboBoxVäljAttribut.getSelectedItem().equals("Telefon"))
            {
                if(Validering.telefonÄrGiltig(TextFältNyttVärde)) 
                {
                String telefon = "UPDATE ALIEN SET TELEFON = '"+ TextFältNyttVärde.getText() + "'" + "WHERE NAMN ='"+ ComboBoxVäljAlien.getSelectedItem()+"'";
                idb.update(telefon);
                LabelInfoÄndrats.setVisible(true);
                }
            }
            else if(ComboBoxVäljAttribut.getSelectedItem().equals("Plats"))
            {
                
                String plats = "UPDATE ALIEN SET PLATS =" +TextFältNyttVärde.getText()+"" + " WHERE NAMN='"+ ComboBoxVäljAlien.getSelectedItem()+"'";
                idb.update(plats);
                LabelInfoÄndrats.setVisible(true);
                
            }
            else if(ComboBoxVäljAttribut.getSelectedItem().equals("Lösenord"))
            {
               String losen = "UPDATE ALIEN SET LOSENORD ='"+TextFältNyttVärde.getText() + "'" + "WHERE NAMN ='"+ ComboBoxVäljAlien.getSelectedItem()+"'";
               idb.update(losen);
               LabelInfoÄndrats.setVisible(true);
            }
            else if(ComboBoxVäljAttribut.getSelectedItem().equals("Ansvarig_Agent"))
            {
                String ansvarig = "UPDATE ALIEN SET ANSVARIG_AGENT = "+TextFältNyttVärde.getText()+"" + " WHERE NAMN = '"+ ComboBoxVäljAlien.getSelectedItem()+"'";
                idb.update(ansvarig);
                LabelInfoÄndrats.setVisible(true);
            }
        }
        }
        catch(InfException undantaget)
        {
            JOptionPane.showMessageDialog(null, "Ange ett giltigt nytt värde");
            System.out.println("Error" + undantaget.getMessage());
                                  
    }        
        
        
    }//GEN-LAST:event_KnappÄndraActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxVäljAlien;
    private javax.swing.JComboBox<String> ComboBoxVäljAttribut;
    private javax.swing.JButton KnappÄndra;
    private javax.swing.JLabel LabelFörAlien;
    private javax.swing.JLabel LabelInfoÄndrats;
    private javax.swing.JLabel LabelNyttVärde;
    private javax.swing.JLabel LabelÄndraEgenskapen;
    private javax.swing.JLabel RubrikÄndraInfoAlien;
    private javax.swing.JTextField TextFältNyttVärde;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables
}

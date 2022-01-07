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
public class �ndraInfoAlien extends javax.swing.JFrame {
    
    //Klassen �r till f�r att �ndra ett attribut som anv�ndaren anger till ett nytt v�rde

    private InfDB idb;
    /**
     * Creates new form �ndraInfoAlien
     */
    public �ndraInfoAlien(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllIListaAlien();
        fyllIListaAttribut();
        LabelInfo�ndrats.setVisible(false);
    }

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
    
    private void fyllIListaAttribut(){
        ComboBoxV�ljAttribut.removeAllItems();
            ComboBoxV�ljAttribut.addItem("v�lj");
            ComboBoxV�ljAttribut.addItem("L�senord");
            ComboBoxV�ljAttribut.addItem("Telefon");
            ComboBoxV�ljAttribut.addItem("Plats");
            ComboBoxV�ljAttribut.addItem("Ansvarig_Agent");
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        Rubrik�ndraInfoAlien = new javax.swing.JLabel();
        Label�ndraEgenskapen = new javax.swing.JLabel();
        LabelF�rAlien = new javax.swing.JLabel();
        Knapp�ndra = new javax.swing.JButton();
        ComboBoxV�ljAttribut = new javax.swing.JComboBox<>();
        ComboBoxV�ljAlien = new javax.swing.JComboBox<>();
        TextF�ltNyttV�rde = new javax.swing.JTextField();
        LabelNyttV�rde = new javax.swing.JLabel();
        LabelInfo�ndrats = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Rubrik�ndraInfoAlien.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        Rubrik�ndraInfoAlien.setForeground(new java.awt.Color(0, 204, 255));
        Rubrik�ndraInfoAlien.setText("�ndra information om alien");

        Label�ndraEgenskapen.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        Label�ndraEgenskapen.setText("�ndra egenskapen:");

        LabelF�rAlien.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelF�rAlien.setText("F�r alien:");

        Knapp�ndra.setText("�ndra");
        Knapp�ndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Knapp�ndraActionPerformed(evt);
            }
        });

        ComboBoxV�ljAttribut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBoxV�ljAlien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelNyttV�rde.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelNyttV�rde.setText("Nytt v�rde:");

        LabelInfo�ndrats.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelInfo�ndrats.setForeground(new java.awt.Color(0, 204, 51));
        LabelInfo�ndrats.setText("Informationen har �ndrats!");

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
                                    .addComponent(LabelNyttV�rde, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label�ndraEgenskapen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboBoxV�ljAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(LabelF�rAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Knapp�ndra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextF�ltNyttV�rde, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxV�ljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(LabelInfo�ndrats, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Rubrik�ndraInfoAlien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Rubrik�ndraInfoAlien)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label�ndraEgenskapen)
                    .addComponent(LabelF�rAlien)
                    .addComponent(ComboBoxV�ljAttribut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxV�ljAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNyttV�rde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextF�ltNyttV�rde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Knapp�ndra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(LabelInfo�ndrats)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Knapp�ndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Knapp�ndraActionPerformed
        
        //H�r f�r anv�ndaren ange ett nytt v�rde som skickas in i tabellen
        
        try
        {    
        if(Validering.kontrollTextF�ltV�rde(TextF�ltNyttV�rde))
        {
            if(ComboBoxV�ljAttribut.getSelectedItem().equals("Telefon"))
            {
                if(Validering.telefon�rGiltig(TextF�ltNyttV�rde)) 
                {
                String telefon = "UPDATE ALIEN SET TELEFON = '"+ TextF�ltNyttV�rde.getText() + "'" + "WHERE NAMN ='"+ ComboBoxV�ljAlien.getSelectedItem()+"'";
                idb.update(telefon);
                LabelInfo�ndrats.setVisible(true);
                }
            }
            else if(ComboBoxV�ljAttribut.getSelectedItem().equals("Plats"))
            {
                
                String plats = "UPDATE ALIEN SET PLATS =" +TextF�ltNyttV�rde.getText()+"" + " WHERE NAMN='"+ ComboBoxV�ljAlien.getSelectedItem()+"'";
                idb.update(plats);
                LabelInfo�ndrats.setVisible(true);
                
            }
            else if(ComboBoxV�ljAttribut.getSelectedItem().equals("L�senord"))
            {
               String losen = "UPDATE ALIEN SET LOSENORD ='"+TextF�ltNyttV�rde.getText() + "'" + "WHERE NAMN ='"+ ComboBoxV�ljAlien.getSelectedItem()+"'";
               idb.update(losen);
               LabelInfo�ndrats.setVisible(true);
            }
            else if(ComboBoxV�ljAttribut.getSelectedItem().equals("Ansvarig_Agent"))
            {
                String ansvarig = "UPDATE ALIEN SET ANSVARIG_AGENT = "+TextF�ltNyttV�rde.getText()+"" + " WHERE NAMN = '"+ ComboBoxV�ljAlien.getSelectedItem()+"'";
                idb.update(ansvarig);
                LabelInfo�ndrats.setVisible(true);
            }
        }
        }
        catch(InfException undantaget)
        {
            JOptionPane.showMessageDialog(null, "Ange ett giltigt nytt v�rde");
            System.out.println("Error" + undantaget.getMessage());
                                  
    }        
        
        
    }//GEN-LAST:event_Knapp�ndraActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxV�ljAlien;
    private javax.swing.JComboBox<String> ComboBoxV�ljAttribut;
    private javax.swing.JButton Knapp�ndra;
    private javax.swing.JLabel LabelF�rAlien;
    private javax.swing.JLabel LabelInfo�ndrats;
    private javax.swing.JLabel LabelNyttV�rde;
    private javax.swing.JLabel Label�ndraEgenskapen;
    private javax.swing.JLabel Rubrik�ndraInfoAlien;
    private javax.swing.JTextField TextF�ltNyttV�rde;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables
}

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
 * @author Julius
 */
public class NyregistreraAlien extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form NyRegistreraAlien
     */
    public NyregistreraAlien(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllILista();
        fyllIListaAgent();
        LabelAlienRegistrerad.setVisible(false);
    }
    
private void fyllILista(){
    try {
            ComboBoxPlats.removeAllItems();
            ComboBoxPlats.addItem("Välj");
            String fraga = "select plats_id from plats";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxPlats.addItem(värde);
        }
        }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
}

private void fyllIListaAgent(){
     try {
            ComboBoxAnsvarigAgent.removeAllItems();
            ComboBoxAnsvarigAgent.addItem("Välj");
            String fraga = "select agent_id from agent";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxAnsvarigAgent.addItem(värde);
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

        RubrikNyregistreraAlien = new javax.swing.JLabel();
        RegistreringKnappAlien = new javax.swing.JButton();
        TextRutaAlienID = new javax.swing.JTextField();
        TextRutaLösenordAlien = new javax.swing.JTextField();
        TextRutaNamnAlien = new javax.swing.JTextField();
        TextRutaTelefonAlien = new javax.swing.JTextField();
        UnderRubrikAlienID = new javax.swing.JLabel();
        UnderRubrikRegistreringsdatum = new javax.swing.JLabel();
        UnderRubrikLösenordFörAlien = new javax.swing.JLabel();
        UnderRubrikNamnFörAlien = new javax.swing.JLabel();
        UnderRubrikTelefonFörAlien = new javax.swing.JLabel();
        UnderRubrikPlats = new javax.swing.JLabel();
        UnderRubrikAnsvarigAgent = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ComboBoxPlats = new javax.swing.JComboBox<>();
        ComboBoxAnsvarigAgent = new javax.swing.JComboBox<>();
        LabelDatum = new javax.swing.JLabel();
        TextRutaRegistreringsdatum = new javax.swing.JFormattedTextField();
        LabelAlienRegistrerad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikNyregistreraAlien.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikNyregistreraAlien.setText("Nyregistrering av alien");

        RegistreringKnappAlien.setText("Registrera");
        RegistreringKnappAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreringKnappAlienActionPerformed(evt);
            }
        });

        TextRutaAlienID.setColumns(9);

        TextRutaNamnAlien.setColumns(9);

        TextRutaTelefonAlien.setColumns(9);

        UnderRubrikAlienID.setText("Alien-ID");

        UnderRubrikRegistreringsdatum.setText("Registreringsdatum");

        UnderRubrikLösenordFörAlien.setText("Lösenord");

        UnderRubrikNamnFörAlien.setText("Namn");

        UnderRubrikTelefonFörAlien.setText("Telefon");

        UnderRubrikPlats.setText("Plats");

        UnderRubrikAnsvarigAgent.setText("Ansvarig agent");

        jButton1.setText("<--Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ComboBoxPlats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBoxAnsvarigAgent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelDatum.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        LabelDatum.setText("YYYY-MM-DD");

        LabelAlienRegistrerad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelAlienRegistrerad.setForeground(new java.awt.Color(0, 204, 51));
        LabelAlienRegistrerad.setText("Alien är registrerad!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextRutaAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextRutaLösenordAlien, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextRutaTelefonAlien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(TextRutaNamnAlien, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboBoxPlats, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboBoxAnsvarigAgent, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextRutaRegistreringsdatum, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UnderRubrikAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikNamnFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikTelefonFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelDatum)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(UnderRubrikAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(UnderRubrikLösenordFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(RubrikNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelAlienRegistrerad)
                            .addComponent(RegistreringKnappAlien))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addComponent(RubrikNyregistreraAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UnderRubrikAlienID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelDatum)
                .addGap(1, 1, 1)
                .addComponent(UnderRubrikRegistreringsdatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnderRubrikLösenordFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaLösenordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnderRubrikTelefonFörAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextRutaTelefonAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnderRubrikNamnFörAlien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaNamnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnderRubrikPlats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(UnderRubrikAnsvarigAgent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegistreringKnappAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAlienRegistrerad)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistreringKnappAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreringKnappAlienActionPerformed

        try{
        
        if(Validering.kontrollTextFältVärde(TextRutaAlienID) && Validering.kontrollTextFältVärde(TextRutaRegistreringsdatum) && Validering.kontrollTextFältVärde(TextRutaLösenordAlien) && Validering.kontrollTextFältVärde(TextRutaNamnAlien) && Validering.kontrollTextFältVärde(TextRutaTelefonAlien)){
        String fråga = "select Alien_ID from alien";
        ArrayList<String> svar = idb.fetchColumn(fråga);
                
            
            int nyID = Integer.parseInt(TextRutaAlienID.getText());
            
                for (String värde : svar)
                {
               int finnsID =  Integer.parseInt(värde);
                
                    if(nyID == finnsID)
                    {
                        JOptionPane.showMessageDialog(null, "Alien-ID finns redan!");
                        break;
                    
                    }
                   else
                    {
                    if (Validering.harHeltal(TextRutaAlienID)) 
                        {
                            String fraga = "select namn from alien";
                            ArrayList<String> resultat = idb.fetchColumn(fraga);

                            for (String namn : resultat) 
                            {
                      
                                if(TextRutaNamnAlien.getText().equals(namn))
                                {  
                                    
                                    JOptionPane.showMessageDialog(null, "Aliennamnet finns redan!");
                                    break;
                                } 
                                else 
                                {
                                   if(!TextRutaTelefonAlien.getText().matches("[a-zA-Z]") && TextRutaTelefonAlien.getText().matches("[0-9]") || TextRutaTelefonAlien.getText().contains("-"))
                                                
                                        {
                                        String query = "INSERT INTO Alien(Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Plats, Ansvarig_Agent) "
                                        + "VALUES" + "("+ nyID+ ",'" + TextRutaRegistreringsdatum.getText()+ "','" 
                                        + TextRutaLösenordAlien.getText()+ "','" + TextRutaNamnAlien.getText()+ "','" + TextRutaTelefonAlien.getText()+ "','" + ComboBoxPlats.getSelectedItem()+ "','" + ComboBoxAnsvarigAgent.getSelectedItem()+ "')";
                                        idb.insert(query);
                                        
                                        LabelAlienRegistrerad.setVisible(true);
                                    }
                                    else 
                                    {
                                        JOptionPane.showMessageDialog(null, "Ange ett korrekt telefonnummer!");
                                    }
                                }

                            }
                        } 

                    }
//                        else 
//                        {
//                            JOptionPane.showMessageDialog(null, "Alien-ID måste vara ett heltal!");
//                        }
                        
                    } 
                }
        
                
               
    }//GEN-LAST:event_RegistreringKnappAlienActionPerformed
        catch(InfException undantag)
        {
            JOptionPane.showMessageDialog(null, "Error");
            System.out.println("Error" + undantag.getMessage());
        }
    }
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (HejAdministrator.getTillbakaKnapp() == true) {
            new NyregistreraAlien(idb).setVisible(true);
            dispose();
        } else {
            new HejAdministrator(idb).setVisible(true);
            dispose();
          }
    
                                           
                                  
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxAnsvarigAgent;
    private javax.swing.JComboBox<String> ComboBoxPlats;
    private javax.swing.JLabel LabelAlienRegistrerad;
    private javax.swing.JLabel LabelDatum;
    private javax.swing.JButton RegistreringKnappAlien;
    private javax.swing.JLabel RubrikNyregistreraAlien;
    private javax.swing.JTextField TextRutaAlienID;
    private javax.swing.JTextField TextRutaLösenordAlien;
    private javax.swing.JTextField TextRutaNamnAlien;
    private javax.swing.JFormattedTextField TextRutaRegistreringsdatum;
    private javax.swing.JTextField TextRutaTelefonAlien;
    private javax.swing.JLabel UnderRubrikAlienID;
    private javax.swing.JLabel UnderRubrikAnsvarigAgent;
    private javax.swing.JLabel UnderRubrikLösenordFörAlien;
    private javax.swing.JLabel UnderRubrikNamnFörAlien;
    private javax.swing.JLabel UnderRubrikPlats;
    private javax.swing.JLabel UnderRubrikRegistreringsdatum;
    private javax.swing.JLabel UnderRubrikTelefonFörAlien;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

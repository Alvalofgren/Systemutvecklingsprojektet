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
        TextRutaRegistreringsdatum = new javax.swing.JTextField();
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

        TextRutaRegistreringsdatum.setColumns(9);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnderRubrikAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextRutaAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnderRubrikRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextRutaRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextRutaTelefonAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnderRubrikTelefonFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnderRubrikPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextRutaLösenordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnderRubrikLösenordFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UnderRubrikNamnFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextRutaNamnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnderRubrikAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegistreringKnappAlien))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ComboBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RubrikNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(RubrikNyregistreraAlien))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UnderRubrikAlienID)
                            .addComponent(UnderRubrikTelefonFörAlien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextRutaAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextRutaTelefonAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UnderRubrikRegistreringsdatum)
                        .addComponent(UnderRubrikPlats)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextRutaRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnderRubrikAnsvarigAgent)
                    .addComponent(UnderRubrikLösenordFörAlien))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextRutaLösenordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(UnderRubrikNamnFörAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextRutaNamnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ComboBoxAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RegistreringKnappAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistreringKnappAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreringKnappAlienActionPerformed

        try{
            if(Validering.kontrollTextFältVärde(TextRutaAlienID) && Validering.kontrollTextFältVärde(TextRutaRegistreringsdatum) && Validering.kontrollTextFältVärde(TextRutaLösenordAlien) && Validering.kontrollTextFältVärde(TextRutaNamnAlien) && Validering.kontrollTextFältVärde(TextRutaTelefonAlien)){
            String fråga = "select Alien_ID from alien";
                ArrayList<String> svar = idb.fetchColumn(fråga);

                for (String värde : svar) 
                {
                    if (!TextRutaAlienID.getText().equals(värde)) 
                    {
                        if (Validering.harHeltal(TextRutaAlienID)) 
                        {
                            String fraga = "select namn from alien";
                            ArrayList<String> resultat = idb.fetchColumn(fraga);

                            for (String namn : resultat) 
                            {
                                if (!TextRutaNamnAlien.getText().equals(namn)) 
                                {
                                    if(TextRutaTelefonAlien.getText()){
                                        String query = "INSERT INTO Alien(Alien_ID, Registreringsdatum, Losenord, Namn, Telefon, Plats, Ansvarig_Agent) "
                                        + "VALUES" + "('"+ TextRutaAlienID.getText()+ "','" + TextRutaRegistreringsdatum.getText()+ "','" 
                                        + TextRutaLösenordAlien.getText()+ "','" + TextRutaNamnAlien.getText()+ "','" + TextRutaTelefonAlien.getText()+ "','" + ComboBoxPlats.getSelectedItem()+ "','" + ComboBoxAnsvarigAgent.getSelectedItem()+ "')";
                                        idb.insert(query);
                                    }
                                    else 
                                    {
                                        JOptionPane.showMessageDialog(null, "Ange ett korrekt telefonnummer!");
                                    }
                                } 
                                else 
                                {
                                    JOptionPane.showMessageDialog(null, "Aliennamnet finns redan!");
                                }

                            }
                        } 
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Alien-ID måste vara ett heltal!");
                        }
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Alien-ID finns redan!");

                    }
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
//         if (HejAdministrator.getAdminStatus() == true) {
//            new NyregistreraAlien(idb).setVisible(true);
//            dispose();
//        } else {
//            new HejAdministrator(idb).setVisible(true);
//            dispose();
//          }
    
                                           
                                  
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxAnsvarigAgent;
    private javax.swing.JComboBox<String> ComboBoxPlats;
    private javax.swing.JButton RegistreringKnappAlien;
    private javax.swing.JLabel RubrikNyregistreraAlien;
    private javax.swing.JTextField TextRutaAlienID;
    private javax.swing.JTextField TextRutaLösenordAlien;
    private javax.swing.JTextField TextRutaNamnAlien;
    private javax.swing.JTextField TextRutaRegistreringsdatum;
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

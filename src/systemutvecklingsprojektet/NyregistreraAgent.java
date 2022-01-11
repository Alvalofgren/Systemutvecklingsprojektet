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
public class NyregistreraAgent extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form NyregistreraAgentAlien
     */
    public NyregistreraAgent(InfDB idb) {
        initComponents();
        this.idb=idb;
        fyllIListaOmråde();
        fyllILista();
        LabelAgentRegistrerad.setVisible(false);
    }
//Hämtar ut områdes_id från område genom en sql-fråga och fyller comboboxen med den informationen. 
    private void fyllIListaOmråde()
    {
        try {
            ComboBoxOmråde.removeAllItems();
            String fraga = "select Omrades_ID from Omrade";
            ArrayList<String> svar = idb.fetchColumn(fraga);
        
        for(String värde : svar)
        {
            ComboBoxOmråde.addItem(värde);
        }
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
//Fyller i comboboxen med J och N.    
    private void fyllILista()
    {
            ComboBoxAdministratör.removeAllItems();
            ComboBoxAdministratör.addItem("J");
            ComboBoxAdministratör.addItem("N");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikNyregistreraAgent = new javax.swing.JLabel();
        KnappFörRegistrering = new javax.swing.JButton();
        TextRutaAgentID = new javax.swing.JTextField();
        TextRutaNamn = new javax.swing.JTextField();
        TextRutaTelefon = new javax.swing.JTextField();
        TextRutaLösenord = new javax.swing.JTextField();
        UnderRubrikAgentID = new javax.swing.JLabel();
        UnderRubrikTelefon = new javax.swing.JLabel();
        UnderRubrikAnställningsdatum = new javax.swing.JLabel();
        UnderRubrikNamn = new javax.swing.JLabel();
        UnderRubrikAdministratör = new javax.swing.JLabel();
        UnderRubrikLösenord = new javax.swing.JLabel();
        UnderRubrikOmråde = new javax.swing.JLabel();
        ComboBoxAdministratör = new javax.swing.JComboBox<>();
        ComboBoxOmråde = new javax.swing.JComboBox<>();
        LabelDatum = new javax.swing.JLabel();
        TextRutaAnställningsdatum = new javax.swing.JFormattedTextField();
        LabelAgentRegistrerad = new javax.swing.JLabel();
        ButtonTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikNyregistreraAgent.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikNyregistreraAgent.setForeground(new java.awt.Color(0, 204, 255));
        RubrikNyregistreraAgent.setText("Nyregistrering av agent");

        KnappFörRegistrering.setText("Registrera");
        KnappFörRegistrering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappFörRegistreringActionPerformed(evt);
            }
        });

        TextRutaAgentID.setColumns(9);
        TextRutaAgentID.setActionCommand("<Not Set>");

        TextRutaTelefon.setColumns(9);

        TextRutaLösenord.setColumns(9);

        UnderRubrikAgentID.setText("AgentID");

        UnderRubrikTelefon.setText("Telefon");

        UnderRubrikAnställningsdatum.setText("Anställningsdatum");

        UnderRubrikNamn.setText("Namn");

        UnderRubrikAdministratör.setText("Administratör");

        UnderRubrikLösenord.setText("Lösenord");

        UnderRubrikOmråde.setText("Område");

        ComboBoxAdministratör.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBoxOmråde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LabelDatum.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        LabelDatum.setText("(YYYY-MM-DD)");

        TextRutaAnställningsdatum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        LabelAgentRegistrerad.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelAgentRegistrerad.setForeground(new java.awt.Color(0, 204, 51));
        LabelAgentRegistrerad.setText("Agenten är registrerad!");

        ButtonTillbaka.setText("<--Tillbaka");
        ButtonTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextRutaLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextRutaNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextRutaTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextRutaAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextRutaAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(UnderRubrikAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UnderRubrikAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UnderRubrikTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UnderRubrikNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(UnderRubrikAnställningsdatum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LabelDatum))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(UnderRubrikOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(121, 121, 121)
                            .addComponent(UnderRubrikLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RubrikNyregistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(KnappFörRegistrering))
                            .addComponent(LabelAgentRegistrerad)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonTillbaka)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonTillbaka)
                .addGap(5, 5, 5)
                .addComponent(RubrikNyregistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UnderRubrikAgentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnderRubrikAnställningsdatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelDatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnderRubrikTelefon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(UnderRubrikNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UnderRubrikAdministratör)
                .addGap(2, 2, 2)
                .addComponent(ComboBoxAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(UnderRubrikLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextRutaLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(UnderRubrikOmråde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KnappFörRegistrering)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAgentRegistrerad)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//En metod för att nyregistrera en agent och lägga till de valda värdena i databasen. 
//Flera olika sorter valideringar för att kontrollera att de olika värdena man skriver in i fälten fungerar. 
    
    private void KnappFörRegistreringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappFörRegistreringActionPerformed
      try
      {
      if(Validering.kontrollTextFältVärde(TextRutaAgentID) && Validering.kontrollTextFältVärde(TextRutaNamn) && Validering.kontrollTextFältVärde(TextRutaTelefon) && Validering.kontrollTextFältVärde(TextRutaAnställningsdatum) && Validering.kontrollTextFältVärde(TextRutaLösenord)){
        String fråga = "select Agent_ID from agent";
        ArrayList<String> svar = idb.fetchColumn(fråga);
          
        int nyID = Integer.parseInt(TextRutaAgentID.getText());
        
        for (String värde : svar)
        {
            int finnsID = Integer.parseInt(värde);
            
            if(nyID == finnsID)
            {
                JOptionPane.showMessageDialog(null, "Agent-ID finns redan");
                break;
            }
        }
       
                if(Validering.harHeltal(TextRutaAgentID))
                {
                    String fraga = "select namn from agent";
                    ArrayList<String> svarNamn = idb.fetchColumn(fraga);
                    
                for(String namn : svarNamn)
                {
                    if(TextRutaNamn.getText().equals(namn))
                    {
                        JOptionPane.showMessageDialog(null, "Agentnamnet finns redan");
                        break;
                    }
                    else 
                    {
                        if(!TextRutaTelefon.getText().matches("[a-zA-Z]") && TextRutaTelefon.getText().matches("[0-9]") || TextRutaTelefon.getText().contains("-"))
                        {
                        String query = "INSERT INTO Agent(Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade) "
                        + "VALUES" + "("+ nyID+ ",'" + TextRutaNamn.getText()+ "','" 
                        + TextRutaTelefon.getText()+ "','" + TextRutaAnställningsdatum.getText()+ "','" + ComboBoxAdministratör.getSelectedItem()+ "','" + TextRutaLösenord.getText()+ "','" + ComboBoxOmråde.getSelectedItem()+ "')";
                        idb.insert(query);
                        
                        LabelAgentRegistrerad.setVisible(true);
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Ange ett korrekt telefonnummer, använd siffror och bindesstreck!");
                        }
                    }    
                }
                }
            
        
      }
    }//GEN-LAST:event_KnappFörRegistreringActionPerformed
catch (InfException undantag)
        {
//            JOptionPane.showMessageDialog(null, "Error");
            System.out.println("Error" + undantag.getMessage());
        }
    }
    private void ButtonTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTillbakaActionPerformed
        new HejAdministrator(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonTillbakaActionPerformed

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
//            java.util.logging.Logger.getLogger(NyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NyregistreraAgent(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonTillbaka;
    private javax.swing.JComboBox<String> ComboBoxAdministratör;
    private javax.swing.JComboBox<String> ComboBoxOmråde;
    private javax.swing.JButton KnappFörRegistrering;
    private javax.swing.JLabel LabelAgentRegistrerad;
    private javax.swing.JLabel LabelDatum;
    private javax.swing.JLabel RubrikNyregistreraAgent;
    private javax.swing.JTextField TextRutaAgentID;
    private javax.swing.JFormattedTextField TextRutaAnställningsdatum;
    private javax.swing.JTextField TextRutaLösenord;
    private javax.swing.JTextField TextRutaNamn;
    private javax.swing.JTextField TextRutaTelefon;
    private javax.swing.JLabel UnderRubrikAdministratör;
    private javax.swing.JLabel UnderRubrikAgentID;
    private javax.swing.JLabel UnderRubrikAnställningsdatum;
    private javax.swing.JLabel UnderRubrikLösenord;
    private javax.swing.JLabel UnderRubrikNamn;
    private javax.swing.JLabel UnderRubrikOmråde;
    private javax.swing.JLabel UnderRubrikTelefon;
    // End of variables declaration//GEN-END:variables
}

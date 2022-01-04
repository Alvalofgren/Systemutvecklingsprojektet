/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;
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
        TextrutaAgentID = new javax.swing.JTextField();
        TextRutaNamn = new javax.swing.JTextField();
        TextRutaTelefon = new javax.swing.JTextField();
        TextrutaAnställningsdatum = new javax.swing.JTextField();
        TextrutaAdministratör = new javax.swing.JTextField();
        TextrutaLösenord = new javax.swing.JTextField();
        TextrutaOmråde = new javax.swing.JTextField();
        UnderRubrikAgentID = new javax.swing.JLabel();
        UnderRubrikTelefon = new javax.swing.JLabel();
        UnderRubrikAnställningsdatum = new javax.swing.JLabel();
        UnderRubrikNamn = new javax.swing.JLabel();
        UnderRubrikAdministratör = new javax.swing.JLabel();
        UnderRubrikLösenord = new javax.swing.JLabel();
        UnderRubrikOmråde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikNyregistreraAgent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikNyregistreraAgent.setText("Nyregistrering av agent");

        KnappFörRegistrering.setText("Registrera");
        KnappFörRegistrering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappFörRegistreringActionPerformed(evt);
            }
        });

        TextrutaAgentID.setColumns(9);
        TextrutaAgentID.setActionCommand("<Not Set>");

        TextRutaTelefon.setColumns(9);

        TextrutaAdministratör.setColumns(9);

        TextrutaLösenord.setColumns(9);

        TextrutaOmråde.setColumns(9);

        UnderRubrikAgentID.setText("AgentID");

        UnderRubrikTelefon.setText("Telefon");

        UnderRubrikAnställningsdatum.setText("Anställningsdatum");

        UnderRubrikNamn.setText("Namn");

        UnderRubrikAdministratör.setText("Administratör");

        UnderRubrikLösenord.setText("Lösenord");

        UnderRubrikOmråde.setText("Område");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RubrikNyregistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextrutaAnställningsdatum)
                                .addComponent(TextRutaTelefon)
                                .addComponent(TextRutaNamn)
                                .addComponent(TextrutaAgentID))
                            .addComponent(UnderRubrikAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextrutaAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextrutaLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextrutaOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(KnappFörRegistrering)
                                .addGap(88, 88, 88))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UnderRubrikAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UnderRubrikTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UnderRubrikLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UnderRubrikNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(UnderRubrikAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93)
                                        .addComponent(UnderRubrikOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(RubrikNyregistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UnderRubrikAgentID)
                            .addComponent(UnderRubrikAdministratör))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextrutaAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextrutaAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnderRubrikTelefon)
                    .addComponent(UnderRubrikLösenord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextRutaTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextrutaLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnderRubrikAnställningsdatum)
                    .addComponent(UnderRubrikOmråde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextrutaAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextrutaOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UnderRubrikNamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextRutaNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KnappFörRegistrering))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KnappFörRegistreringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappFörRegistreringActionPerformed
      try
      {
      String query = "INSERT INTO Agent(Agent_ID, Namn, Telefon, Anstallningsdatum, Administrator, Losenord, Omrade) "
                    + "VALUES" + "('"+ TextrutaAgentID.getText()+ "','" + TextRutaNamn.getText()+ "','" 
                    + TextRutaTelefon.getText()+ "','" + TextrutaAnställningsdatum.getText()+ "','" + TextrutaAdministratör.getText()+ "','" + TextrutaLösenord.getText()+ "','" + TextrutaOmråde.getText()+ "')";
            idb.insert(query);
    }//GEN-LAST:event_KnappFörRegistreringActionPerformed
catch (InfException undantag)
        {
            JOptionPane.showMessageDialog(null, "Error");
            System.out.println("Error" + undantag.getMessage());
        }
    }
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
    private javax.swing.JButton KnappFörRegistrering;
    private javax.swing.JLabel RubrikNyregistreraAgent;
    private javax.swing.JTextField TextRutaNamn;
    private javax.swing.JTextField TextRutaTelefon;
    private javax.swing.JTextField TextrutaAdministratör;
    private javax.swing.JTextField TextrutaAgentID;
    private javax.swing.JTextField TextrutaAnställningsdatum;
    private javax.swing.JTextField TextrutaLösenord;
    private javax.swing.JTextField TextrutaOmråde;
    private javax.swing.JLabel UnderRubrikAdministratör;
    private javax.swing.JLabel UnderRubrikAgentID;
    private javax.swing.JLabel UnderRubrikAnställningsdatum;
    private javax.swing.JLabel UnderRubrikLösenord;
    private javax.swing.JLabel UnderRubrikNamn;
    private javax.swing.JLabel UnderRubrikOmråde;
    private javax.swing.JLabel UnderRubrikTelefon;
    // End of variables declaration//GEN-END:variables
}

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
public class NyregistreraAlien extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form NyRegistreraAlien
     */
    public NyregistreraAlien(InfDB idb) {
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

        RubrikNyregistreraAlien = new javax.swing.JLabel();
        RegistreringKnappAlien = new javax.swing.JButton();
        TextrutaAlienID = new javax.swing.JTextField();
        TextrutaRegistreringsdatum = new javax.swing.JTextField();
        TextrutaLösenordAlien = new javax.swing.JTextField();
        TextrutaNamnAlien = new javax.swing.JTextField();
        TextrutaTelefonAlien = new javax.swing.JTextField();
        TextrutaPlats = new javax.swing.JTextField();
        TextrutaAnsvarigAgent = new javax.swing.JTextField();
        UnderRubrikAlienID = new javax.swing.JLabel();
        UnderRubrikRegistreringsdatum = new javax.swing.JLabel();
        UnderRubrikLösenordFörAlien = new javax.swing.JLabel();
        UnderRubrikNamnFörAlien = new javax.swing.JLabel();
        UnderRubrikTelefonFörAlien = new javax.swing.JLabel();
        UnderRubrikPlats = new javax.swing.JLabel();
        UnderRubrikAnsvarigAgent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikNyregistreraAlien.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikNyregistreraAlien.setText("Nyregistrering av alien");

        RegistreringKnappAlien.setText("Registrera");
        RegistreringKnappAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistreringKnappAlienActionPerformed(evt);
            }
        });

        TextrutaAlienID.setColumns(9);

        TextrutaRegistreringsdatum.setColumns(9);

        TextrutaNamnAlien.setColumns(9);

        TextrutaTelefonAlien.setColumns(9);

        UnderRubrikAlienID.setText("Alien-ID");

        UnderRubrikRegistreringsdatum.setText("Registreringsdatum");

        UnderRubrikLösenordFörAlien.setText("Lösenord");

        UnderRubrikNamnFörAlien.setText("Namn");

        UnderRubrikTelefonFörAlien.setText("Telefon");

        UnderRubrikPlats.setText("Plats");

        UnderRubrikAnsvarigAgent.setText("Ansvarig agent");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UnderRubrikAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextrutaAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextrutaRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextrutaPlats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextrutaTelefonAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikTelefonFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextrutaLösenordAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikLösenordFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UnderRubrikNamnFörAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextrutaNamnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextrutaAnsvarigAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(RegistreringKnappAlien)
                                        .addGap(12, 12, 12))
                                    .addComponent(UnderRubrikAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RubrikNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(RubrikNyregistreraAlien)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UnderRubrikAlienID)
                            .addComponent(UnderRubrikTelefonFörAlien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextrutaAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextrutaTelefonAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UnderRubrikRegistreringsdatum)
                        .addComponent(UnderRubrikPlats)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextrutaPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextrutaRegistreringsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UnderRubrikAnsvarigAgent)
                    .addComponent(UnderRubrikLösenordFörAlien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextrutaAnsvarigAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextrutaLösenordAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(UnderRubrikNamnFörAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextrutaNamnAlien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(RegistreringKnappAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistreringKnappAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistreringKnappAlienActionPerformed
        try
        {
            if(TextrutaAlienID.getText().equals()){
                
            }
            else if(Validering.harHeltal(TextrutaAlienID)){
            String query = "INSERT INTO Alien(Alien_ID) VALUES" + "('" + TextrutaAlienID.getText()+ "')";
            idb.insert(query); 
            }
        
    }//GEN-LAST:event_RegistreringKnappAlienActionPerformed
        catch(InfException undantag)
        {
            JOptionPane.showMessageDialog(null, "Error");
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
//            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NyregistreraAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NyregistreraAlien(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegistreringKnappAlien;
    private javax.swing.JLabel RubrikNyregistreraAlien;
    private javax.swing.JTextField TextrutaAlienID;
    private javax.swing.JTextField TextrutaAnsvarigAgent;
    private javax.swing.JTextField TextrutaLösenordAlien;
    private javax.swing.JTextField TextrutaNamnAlien;
    private javax.swing.JTextField TextrutaPlats;
    private javax.swing.JTextField TextrutaRegistreringsdatum;
    private javax.swing.JTextField TextrutaTelefonAlien;
    private javax.swing.JLabel UnderRubrikAlienID;
    private javax.swing.JLabel UnderRubrikAnsvarigAgent;
    private javax.swing.JLabel UnderRubrikLösenordFörAlien;
    private javax.swing.JLabel UnderRubrikNamnFörAlien;
    private javax.swing.JLabel UnderRubrikPlats;
    private javax.swing.JLabel UnderRubrikRegistreringsdatum;
    private javax.swing.JLabel UnderRubrikTelefonFörAlien;
    // End of variables declaration//GEN-END:variables
}

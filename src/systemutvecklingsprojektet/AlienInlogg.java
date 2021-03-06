/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Julius // Första inloggningsrutan där man kan välja mellan agent, alien och administratör.
 */
public class AlienInlogg extends javax.swing.JFrame {
    private InfDB idb;
    private static String alienNamn;

    /**
     * Creates new form AlienInlogg
     */
    public AlienInlogg(InfDB idb) {
        initComponents();
        this.idb=idb;
        TextFieldAnvändarnamn.requestFocus();
    }
    
    public static String getNamn(){
        return alienNamn;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelLösenord = new javax.swing.JLabel();
        ButtonLoggaIn = new javax.swing.JButton();
        RubrikAlienLoggaIn = new javax.swing.JLabel();
        TextFieldAnvändarnamn = new javax.swing.JTextField();
        LabelAnvändarnamn = new javax.swing.JLabel();
        PasswordFieldLösenord = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelLösenord.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelLösenord.setText("Lösenord");

        ButtonLoggaIn.setText("Logga in");
        ButtonLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoggaInActionPerformed(evt);
            }
        });

        RubrikAlienLoggaIn.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikAlienLoggaIn.setForeground(new java.awt.Color(0, 204, 255));
        RubrikAlienLoggaIn.setText("Alien");

        TextFieldAnvändarnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAnvändarnamnActionPerformed(evt);
            }
        });

        LabelAnvändarnamn.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelAnvändarnamn.setText("Användarnamn");

        PasswordFieldLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldLösenordActionPerformed(evt);
            }
        });
        PasswordFieldLösenord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldLösenordKeyPressed(evt);
            }
        });

        jButton1.setText("<-- Tillbaka");
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
                        .addComponent(jButton1)
                        .addGap(91, 91, 91)
                        .addComponent(RubrikAlienLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextFieldAnvändarnamn, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addComponent(LabelLösenord)
                        .addComponent(LabelAnvändarnamn)
                        .addComponent(PasswordFieldLösenord)
                        .addComponent(ButtonLoggaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(RubrikAlienLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelAnvändarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordFieldLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonLoggaIn)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Metoden nedan kontrollerar så att rätt användarnamn och lösenord används när man loggar in i systemet
     * Det sker också en kontroll med ett felmeddelande om man loggar in i systemet och inte skriver in något i inmatningrutorna
     * @param evt 
     */
    
    private void ButtonLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoggaInActionPerformed
          
        try {
         
        String query = "SELECT Losenord FROM alien WHERE Namn = '" + TextFieldAnvändarnamn.getText()+"'";
        String losen = idb.fetchSingle(query);
        
        String fraga = "SELECT NAMN FROM ALIEN WHERE NAMN ='" + TextFieldAnvändarnamn.getText() + "'";
        String svar = idb.fetchSingle(fraga);
        
        if(!Validering.kontrollTextFältVärde(TextFieldAnvändarnamn)){
            
        }
        if(losen == null)
                {
                    JOptionPane.showMessageDialog(null, "Användarnamnet finns inte");
                }
        
        if(svar.equals(TextFieldAnvändarnamn.getText()))
        {
            if(losen.equals(PasswordFieldLösenord.getText()))
            {
                new HejAlien(idb).setVisible(true);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fel Lösenord");

            }
            
        alienNamn = TextFieldAnvändarnamn.getText();
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Fel användarnamn!");
        }
       
       }
            
       catch(InfException undantag){
                    JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
                        System.out.println("Error" + undantag.getMessage());
                    }
                                               
    }//GEN-LAST:event_ButtonLoggaInActionPerformed

    private void TextFieldAnvändarnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAnvändarnamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAnvändarnamnActionPerformed

    private void PasswordFieldLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldLösenordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldLösenordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Fonster(idb).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PasswordFieldLösenordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldLösenordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            ButtonLoggaIn.doClick();
        }
    }//GEN-LAST:event_PasswordFieldLösenordKeyPressed

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
//            java.util.logging.Logger.getLogger(AlienInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AlienInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AlienInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AlienInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AlienInlogg(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLoggaIn;
    private javax.swing.JLabel LabelAnvändarnamn;
    private javax.swing.JLabel LabelLösenord;
    private javax.swing.JPasswordField PasswordFieldLösenord;
    private javax.swing.JLabel RubrikAlienLoggaIn;
    private javax.swing.JTextField TextFieldAnvändarnamn;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

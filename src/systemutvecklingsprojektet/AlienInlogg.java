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
 * @author Julius // Första inmloggningsrutan där man kan välja mellan agent, alien och administratör.
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelLösenord.setText("Lösenord");

        ButtonLoggaIn.setText("Logga in");
        ButtonLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoggaInActionPerformed(evt);
            }
        });

        RubrikAlienLoggaIn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikAlienLoggaIn.setText("Alien");

        TextFieldAnvändarnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAnvändarnamnActionPerformed(evt);
            }
        });

        LabelAnvändarnamn.setText("Användarnamn");

        PasswordFieldLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldLösenordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(RubrikAlienLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldAnvändarnamn, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(LabelLösenord)
                            .addComponent(LabelAnvändarnamn)
                            .addComponent(PasswordFieldLösenord))))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(RubrikAlienLoggaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(LabelAnvändarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(LabelLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordFieldLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonLoggaIn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoggaInActionPerformed
          
        try {
         
        String query = "SELECT Losenord FROM alien WHERE Namn = '" + TextFieldAnvändarnamn.getText()+"'";
        String losen = idb.fetchSingle(query);
        
        if(losen == null)
                {
                    JOptionPane.showMessageDialog(null, "Användarnamnet finns inte");
                }
        
        else
        {
            if(losen.equals(PasswordFieldLösenord.getText()))
            {
                new HejAlien(idb).setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fel Lösenord");

            }
            
        alienNamn = TextFieldAnvändarnamn.getText();
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
    // End of variables declaration//GEN-END:variables
}

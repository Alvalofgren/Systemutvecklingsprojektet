package systemutvecklingsprojektet;


import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author alval
 */
public class AgentInlogg extends javax.swing.JFrame {

    private InfDB idb;
   
    private static String agentNamn;
    private static boolean arAdmin;
   
    
    /**
     * Creates new form AgentInlogg2
     */
    public AgentInlogg(InfDB idb) {
        initComponents();
        this.idb=idb;
    }

    public static String getNamn(){
        return agentNamn;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikAgent = new javax.swing.JLabel();
        TextFieldAnvändarnamn = new javax.swing.JTextField();
        ButtonLoggain = new javax.swing.JButton();
        LabelAnvändarnamn = new javax.swing.JLabel();
        LabelLösenord = new javax.swing.JLabel();
        PasswordFieldLösenord = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikAgent.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikAgent.setForeground(new java.awt.Color(0, 204, 255));
        RubrikAgent.setText("Agent");

        ButtonLoggain.setText("Logga in");
        ButtonLoggain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoggainActionPerformed(evt);
            }
        });

        LabelAnvändarnamn.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelAnvändarnamn.setText("Användarnamn");

        LabelLösenord.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        LabelLösenord.setText("Lösenord");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(RubrikAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonLoggain, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(TextFieldAnvändarnamn)
                            .addComponent(LabelLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordFieldLösenord)
                            .addComponent(LabelAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addComponent(RubrikAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(LabelAnvändarnamn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordFieldLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ButtonLoggain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoden nedanför är lik den som är i klassen AlienInlogg men en stor skillnad är att denna (AgentInlogg) kontrollerar
     * om du är Agent eller Administratör. Beroende på vilken av dessa titlar som man tillhör hamnar man i olika fönster
     * @param evt 
     */
    
    private void ButtonLoggainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoggainActionPerformed

        try {
         
        String query = "SELECT Losenord FROM agent WHERE Namn = '" + TextFieldAnvändarnamn.getText()+"'";
        String losen = idb.fetchSingle(query);
        
        String fråga = "SELECT administrator from agent WHERE Namn ='" + TextFieldAnvändarnamn.getText() + "'";
        String aStatus = idb.fetchSingle(fråga);
        
        String fraga = "SELECT NAMN FROM AGENT WHERE NAMN ='" + TextFieldAnvändarnamn.getText() + "'";
        String svar = idb.fetchSingle(fraga);
        
        
        if(!Validering.kontrollTextFältVärde(TextFieldAnvändarnamn)){
            
        }
        if(losen == null)
                {
                    JOptionPane.showMessageDialog(null, "Användarnamnet finns inte");
                }
        
        if(svar.equals(TextFieldAnvändarnamn.getText())){
            
            if (aStatus.equals("J"))
            {
               
                if(losen.equals(PasswordFieldLösenord.getText()))
                {
                    agentNamn = TextFieldAnvändarnamn.getText();
                    
                    new HejAdministrator(idb).setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Fel lösenord!");
                }
            }
            else
            {
                if(losen.equals(PasswordFieldLösenord.getText()))
                {
                new HejAgent(idb).setVisible(true);
                }
                else
                {
                JOptionPane.showMessageDialog(null,"Fel Lösenord");

                }
            
            }
            agentNamn = TextFieldAnvändarnamn.getText();
       }
        else 
        {
            JOptionPane.showMessageDialog(null, "Fel användarnamn!");
        }
       }    
       catch(InfException undantag){
                    JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
                        System.out.println("Error" + undantag.getMessage());
                    }
    }//GEN-LAST:event_ButtonLoggainActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Fonster(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgentInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentInlogg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AgentInlogg(idb).setVisible(true);
//            }
      //  });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLoggain;
    private javax.swing.JLabel LabelAnvändarnamn;
    private javax.swing.JLabel LabelLösenord;
    private javax.swing.JPasswordField PasswordFieldLösenord;
    private javax.swing.JLabel RubrikAgent;
    private javax.swing.JTextField TextFieldAnvändarnamn;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
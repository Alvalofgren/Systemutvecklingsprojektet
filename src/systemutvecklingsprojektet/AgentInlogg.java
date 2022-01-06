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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RubrikAgent = new javax.swing.JLabel();
        TextFieldAnvändarnamn = new javax.swing.JTextField();
        ButtonLoggain = new javax.swing.JButton();
        LabelAnvändarnamn = new javax.swing.JLabel();
        LabelLösenord = new javax.swing.JLabel();
        PasswordFieldLösenord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikAgent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RubrikAgent.setText("Agent");

        ButtonLoggain.setText("Logga in");
        ButtonLoggain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoggainActionPerformed(evt);
            }
        });

        LabelAnvändarnamn.setText("Användarnamn");

        LabelLösenord.setText("Lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(RubrikAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonLoggain, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(TextFieldAnvändarnamn)
                    .addComponent(LabelLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordFieldLösenord)
                    .addComponent(LabelAnvändarnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
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

    private void ButtonLoggainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoggainActionPerformed

        try {
         
        String query = "SELECT Losenord FROM agent WHERE Namn = '" + TextFieldAnvändarnamn.getText()+"'";
        String losen = idb.fetchSingle(query);
        
        String fråga = "SELECT administrator from agent WHERE Namn ='" + TextFieldAnvändarnamn.getText() + "'";
        String aStatus = idb.fetchSingle(fråga);
        
        if(!Validering.kontrollTextFältVärde(TextFieldAnvändarnamn)){
            
        }
        else if(losen == null)
                {
                    JOptionPane.showMessageDialog(null, "Användarnamnet finns inte");
                }
        
        else if (aStatus.equals("J"))
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
            
       catch(InfException undantag){
                    JOptionPane.showMessageDialog(null, "Fel användarnamn eller lösenord");
                        System.out.println("Error" + undantag.getMessage());
                    }
    }//GEN-LAST:event_ButtonLoggainActionPerformed
    
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
    // End of variables declaration//GEN-END:variables

}
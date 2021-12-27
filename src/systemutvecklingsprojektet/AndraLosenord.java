/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Julius
 */
public class AndraLosenord extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form AndraLosenord
     */
    public AndraLosenord() {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rubrikÄndraLösenord = new javax.swing.JLabel();
        fältNyttLösenord = new javax.swing.JTextField();
        fältBekräftaLösenord = new javax.swing.JTextField();
        knappBytLösenord = new javax.swing.JButton();
        rubrikNyttLösenord = new javax.swing.JLabel();
        rubrikBekräftaLösenord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rubrikÄndraLösenord.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rubrikÄndraLösenord.setText("Ändra lösenord");

        knappBytLösenord.setText("Byt lösenord");
        knappBytLösenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knappBytLösenordActionPerformed(evt);
            }
        });

        rubrikNyttLösenord.setText("Nytt lösenord");

        rubrikBekräftaLösenord.setText("Bekräfta lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rubrikÄndraLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rubrikNyttLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fältNyttLösenord, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fältBekräftaLösenord, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rubrikBekräftaLösenord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(knappBytLösenord))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(rubrikÄndraLösenord)
                .addGap(30, 30, 30)
                .addComponent(rubrikNyttLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fältNyttLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(rubrikBekräftaLösenord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fältBekräftaLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(knappBytLösenord)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void knappBytLösenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knappBytLösenordActionPerformed
     
        if (Validering.rutornaMatchar(fältNyttLösenord, fältBekräftaLösenord)) {
            
            String ändring = ("UPDATE AGENT SET LOSENORD = " + fältNyttLösenord.getText() + " WHERE NAMN = " + AgentInlogg2.Användarnamn.getText());
   
            new lösenordÄndrat().setVisible(true);
            //Ska bara ske om ändringen går igenom!!
      }
        else{
            JOptionPane.showMessageDialog(null, "Lösenorden matchar inte");
        }
         //Vi kanske måste göra en bytaLösenord för varje klass (agent, alien, administratörberoende på att man 
         //skriver tabellnamnet i SQL-frågan
       
        //Ska bara ske om ändringen går igenom!!
    }//GEN-LAST:event_knappBytLösenordActionPerformed

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
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraLosenord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraLosenord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fältBekräftaLösenord;
    private javax.swing.JTextField fältNyttLösenord;
    private javax.swing.JButton knappBytLösenord;
    private javax.swing.JLabel rubrikBekräftaLösenord;
    private javax.swing.JLabel rubrikNyttLösenord;
    private javax.swing.JLabel rubrikÄndraLösenord;
    // End of variables declaration//GEN-END:variables
}

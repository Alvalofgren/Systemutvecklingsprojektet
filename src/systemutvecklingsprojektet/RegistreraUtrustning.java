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
 * @author almahedengren
 */
public class RegistreraUtrustning extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form RegistreraUtrustning
     */
    public RegistreraUtrustning(InfDB idb) {
        initComponents();
        this.idb=idb;
        LabelUtrustningRegistrerats.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelRegistreraUtrustning = new javax.swing.JLabel();
        LabelUtrustningsID = new javax.swing.JLabel();
        LabelBenamning = new javax.swing.JLabel();
        TextFieldUtrustningsID = new javax.swing.JTextField();
        TextFieldBenamning = new javax.swing.JTextField();
        ButtonRegistrera = new javax.swing.JButton();
        LabelUtrustningRegistrerats = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelRegistreraUtrustning.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LabelRegistreraUtrustning.setText("Registrera ny utrustning");

        LabelUtrustningsID.setText("Utrustnings-ID:");

        LabelBenamning.setText("Ben�mning:");

        ButtonRegistrera.setText("Registrera");
        ButtonRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistreraActionPerformed(evt);
            }
        });

        LabelUtrustningRegistrerats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LabelUtrustningRegistrerats.setText("Utrustningen har registrerats!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelUtrustningsID)
                    .addComponent(LabelBenamning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextFieldUtrustningsID, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(TextFieldBenamning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonRegistrera)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(LabelRegistreraUtrustning))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(LabelUtrustningRegistrerats)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LabelRegistreraUtrustning)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelUtrustningsID)
                            .addComponent(TextFieldUtrustningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(ButtonRegistrera)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBenamning)
                    .addComponent(TextFieldBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(LabelUtrustningRegistrerats)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistreraActionPerformed
        try{
        
            String query = "INSERT INTO Utrustning(Utrustnings_ID, Benamning) VALUES" + "('"+ TextFieldUtrustningsID.getText()+ "','" + TextFieldBenamning.getText()+"')"; 
            idb.insert(query);
            LabelUtrustningRegistrerats.setVisible(true);
            
    }//GEN-LAST:event_ButtonRegistreraActionPerformed
        
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
//            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistreraUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegistreraUtrustning(idb).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonRegistrera;
    private javax.swing.JLabel LabelBenamning;
    private javax.swing.JLabel LabelRegistreraUtrustning;
    private javax.swing.JLabel LabelUtrustningRegistrerats;
    private javax.swing.JLabel LabelUtrustningsID;
    private javax.swing.JTextField TextFieldBenamning;
    private javax.swing.JTextField TextFieldUtrustningsID;
    // End of variables declaration//GEN-END:variables
}

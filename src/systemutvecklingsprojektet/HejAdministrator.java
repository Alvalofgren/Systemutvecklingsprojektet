/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;

/**
 *
 * @author almahedengren
 */
public class HejAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form HejAdministrator
     */
    public HejAdministrator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonNyregistreraAlien = new javax.swing.JButton();
        LabelHejAdministratör = new javax.swing.JLabel();
        ButtonTaBortAlien = new javax.swing.JButton();
        ButtonÄndraInfoAlien = new javax.swing.JButton();
        ButtonNyregistreraAgent = new javax.swing.JButton();
        ButtonSökaInfoAgent = new javax.swing.JButton();
        ButtonGeAdminStatus = new javax.swing.JButton();
        ButtonÄndraInfoAgent = new javax.swing.JButton();
        LabelAlien = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelAgent = new javax.swing.JLabel();
        ButtonTaBortAgent = new javax.swing.JButton();
        LabelChef = new javax.swing.JLabel();
        ButtonÄndraOmrådesChef = new javax.swing.JButton();
        ButtonÄndraKontorschef = new javax.swing.JButton();
        LabelUtrustning = new javax.swing.JLabel();
        ButtonTaBortUtrustning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonNyregistreraAlien.setText("Nyregistrera alien");
        ButtonNyregistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNyregistreraAlienActionPerformed(evt);
            }
        });

        LabelHejAdministratör.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelHejAdministratör.setText("Hej Administratör");

        ButtonTaBortAlien.setText("Ta bort alien");
        ButtonTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTaBortAlienActionPerformed(evt);
            }
        });

        ButtonÄndraInfoAlien.setText("Ändra information om alien");
        ButtonÄndraInfoAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraInfoAlienActionPerformed(evt);
            }
        });

        ButtonNyregistreraAgent.setText("Nyregistrera agent");
        ButtonNyregistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNyregistreraAgentActionPerformed(evt);
            }
        });

        ButtonSökaInfoAgent.setText("Söka information om agent");
        ButtonSökaInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSökaInfoAgentActionPerformed(evt);
            }
        });

        ButtonGeAdminStatus.setText("Ge administratörstatus");
        ButtonGeAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGeAdminStatusActionPerformed(evt);
            }
        });

        ButtonÄndraInfoAgent.setText("Ändra information om agent");
        ButtonÄndraInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraInfoAgentActionPerformed(evt);
            }
        });

        LabelAlien.setText("Alien");

        LabelAgent.setText("Agent");

        ButtonTaBortAgent.setText("Ta bort agent");
        ButtonTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTaBortAgentActionPerformed(evt);
            }
        });

        LabelChef.setText("Chef");

        ButtonÄndraOmrådesChef.setText("Ändra områdeschef");
        ButtonÄndraOmrådesChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraOmrådesChefActionPerformed(evt);
            }
        });

        ButtonÄndraKontorschef.setText("Ändra kontorschef");
        ButtonÄndraKontorschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraKontorschefActionPerformed(evt);
            }
        });

        LabelUtrustning.setText("Utrustning");

        ButtonTaBortUtrustning.setText("Ta bort utrustning");
        ButtonTaBortUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTaBortUtrustningActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonÄndraInfoAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(ButtonTaBortAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonTaBortUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonNyregistreraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonSökaInfoAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelHejAdministratör, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonGeAdminStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ButtonÄndraInfoAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonTaBortAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelChef, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonÄndraOmrådesChef, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(ButtonÄndraKontorschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LabelHejAdministratör)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelAgent)
                    .addComponent(LabelChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonÄndraOmrådesChef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonTaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonNyregistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonÄndraKontorschef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonÄndraInfoAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonSökaInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonGeAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(ButtonÄndraInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonTaBortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelUtrustning)
                        .addGap(30, 30, 30)
                        .addComponent(ButtonTaBortUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonNyregistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNyregistreraAlienActionPerformed
        new NyregistreraAlien().setVisible(true);
    }//GEN-LAST:event_ButtonNyregistreraAlienActionPerformed

    private void ButtonÄndraInfoAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraInfoAlienActionPerformed
        new ÄndraInfoAlien().setVisible(true);
    }//GEN-LAST:event_ButtonÄndraInfoAlienActionPerformed

    private void ButtonTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTaBortAgentActionPerformed
        new TaBortAgent().setVisible(true);
    }//GEN-LAST:event_ButtonTaBortAgentActionPerformed

    private void ButtonNyregistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNyregistreraAgentActionPerformed
        new NyregistreraAgent().setVisible(true);
    }//GEN-LAST:event_ButtonNyregistreraAgentActionPerformed

    private void ButtonTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTaBortAlienActionPerformed
        new TaBortAlien().setVisible(true);
    }//GEN-LAST:event_ButtonTaBortAlienActionPerformed

    private void ButtonTaBortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTaBortUtrustningActionPerformed
        new TaBortUtrustning().setVisible(true);
    }//GEN-LAST:event_ButtonTaBortUtrustningActionPerformed

    private void ButtonSökaInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSökaInfoAgentActionPerformed
        new SökInfoOmAgent().setVisible(true);
    }//GEN-LAST:event_ButtonSökaInfoAgentActionPerformed

    private void ButtonGeAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGeAdminStatusActionPerformed
        new GeAdministratörStatus().setVisible(true);
    }//GEN-LAST:event_ButtonGeAdminStatusActionPerformed

    private void ButtonÄndraInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraInfoAgentActionPerformed
        new ÄndraInfoAgent().setVisible(true);
    }//GEN-LAST:event_ButtonÄndraInfoAgentActionPerformed

    private void ButtonÄndraOmrådesChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraOmrådesChefActionPerformed
        new ÄndraOmrådeschef().setVisible(true);
    }//GEN-LAST:event_ButtonÄndraOmrådesChefActionPerformed

    private void ButtonÄndraKontorschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraKontorschefActionPerformed
        new ÄndraKontorschef().setVisible(true);
    }//GEN-LAST:event_ButtonÄndraKontorschefActionPerformed

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
            java.util.logging.Logger.getLogger(HejAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HejAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HejAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HejAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HejAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGeAdminStatus;
    private javax.swing.JButton ButtonNyregistreraAgent;
    private javax.swing.JButton ButtonNyregistreraAlien;
    private javax.swing.JButton ButtonSökaInfoAgent;
    private javax.swing.JButton ButtonTaBortAgent;
    private javax.swing.JButton ButtonTaBortAlien;
    private javax.swing.JButton ButtonTaBortUtrustning;
    private javax.swing.JButton ButtonÄndraInfoAgent;
    private javax.swing.JButton ButtonÄndraInfoAlien;
    private javax.swing.JButton ButtonÄndraKontorschef;
    private javax.swing.JButton ButtonÄndraOmrådesChef;
    private javax.swing.JLabel LabelAgent;
    private javax.swing.JLabel LabelAlien;
    private javax.swing.JLabel LabelChef;
    private javax.swing.JLabel LabelHejAdministratör;
    private javax.swing.JLabel LabelUtrustning;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

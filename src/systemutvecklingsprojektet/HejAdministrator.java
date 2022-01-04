/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package systemutvecklingsprojektet;
import oru.inf.InfDB;
/**
 *
 * @author almahedengren
 */
public class HejAdministrator extends javax.swing.JFrame {

    private static InfDB idb;
    private static String agentNamn;
    private static boolean arAdmin;
    
   
    /**
     * Creates new form HejAdministrator
     */
    public HejAdministrator(InfDB idb) {
        initComponents();
        this.idb=idb;
        agentNamn = AgentInlogg.getNamn();
        LabelAgentNamn.setText(agentNamn);
        //Fixa så att man ser namnet när man loggat in tex "Välkommen Agent O"

        LabelAgentNamn.setText(AgentInlogg.getNamn());
    }
    
   
public static boolean getAdminStatus() {
    return arAdmin;
}
    
   
    

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KnappNyregistreraAlien = new javax.swing.JButton();
        RubrikHejAdministratör = new javax.swing.JLabel();
        KnappTaBortAlien = new javax.swing.JButton();
        KnappÄndraInfoOmAlien = new javax.swing.JButton();
        KnappNyregistreraAgent = new javax.swing.JButton();
        KnappSökaInfoAgent = new javax.swing.JButton();
        KnappGeAdminStatus = new javax.swing.JButton();
        ButtonÄndraInfoAgent = new javax.swing.JButton();
        UnderRubrikAlien = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UnderRubrikAgent = new javax.swing.JLabel();
        KnappTaBortAgent = new javax.swing.JButton();
        UnderRubrikChef = new javax.swing.JLabel();
        KnappÄndraOmrådeschef = new javax.swing.JButton();
        KnappÄndraKontorschef = new javax.swing.JButton();
        UnderRubrikUtrustning = new javax.swing.JLabel();
        KnappTaBortUtrustning = new javax.swing.JButton();
        ButtonÄndraRas = new javax.swing.JButton();
        LabelAgentNamn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KnappNyregistreraAlien.setText("Nyregistrera alien");
        KnappNyregistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappNyregistreraAlienActionPerformed(evt);
            }
        });

        RubrikHejAdministratör.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RubrikHejAdministratör.setText("Välkommen");

        KnappTaBortAlien.setText("Ta bort alien");
        KnappTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappTaBortAlienActionPerformed(evt);
            }
        });

        KnappÄndraInfoOmAlien.setText("Ändra information om alien");
        KnappÄndraInfoOmAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappÄndraInfoOmAlienActionPerformed(evt);
            }
        });

        KnappNyregistreraAgent.setText("Nyregistrera agent");
        KnappNyregistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappNyregistreraAgentActionPerformed(evt);
            }
        });

        KnappSökaInfoAgent.setText("Söka information om agent");
        KnappSökaInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappSökaInfoAgentActionPerformed(evt);
            }
        });

        KnappGeAdminStatus.setText("Ge administratörstatus");
        KnappGeAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappGeAdminStatusActionPerformed(evt);
            }
        });

        ButtonÄndraInfoAgent.setText("Ändra information om agent");
        ButtonÄndraInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraInfoAgentActionPerformed(evt);
            }
        });

        UnderRubrikAlien.setText("Alien");

        UnderRubrikAgent.setText("Agent");

        KnappTaBortAgent.setText("Ta bort agent");
        KnappTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappTaBortAgentActionPerformed(evt);
            }
        });

        UnderRubrikChef.setText("Chef");

        KnappÄndraOmrådeschef.setText("Ändra områdeschef");
        KnappÄndraOmrådeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappÄndraOmrådeschefActionPerformed(evt);
            }
        });

        KnappÄndraKontorschef.setText("Ändra kontorschef");
        KnappÄndraKontorschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappÄndraKontorschefActionPerformed(evt);
            }
        });

        UnderRubrikUtrustning.setText("Utrustning");

        KnappTaBortUtrustning.setText("Ta bort utrustning");
        KnappTaBortUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappTaBortUtrustningActionPerformed(evt);
            }
        });

        ButtonÄndraRas.setText("Ändra ras");
        ButtonÄndraRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonÄndraRasActionPerformed(evt);
            }
        });

        LabelAgentNamn.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        LabelAgentNamn.setText("jLabel1");

        jButton1.setText("Byt till agentsidan");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KnappNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UnderRubrikUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ButtonÄndraRas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 530, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UnderRubrikAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KnappÄndraInfoOmAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(KnappTaBortAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KnappTaBortUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KnappNyregistreraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KnappSökaInfoAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KnappGeAdminStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonÄndraInfoAgent, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(KnappTaBortAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UnderRubrikAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UnderRubrikChef, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KnappÄndraOmrådeschef, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(KnappÄndraKontorschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(RubrikHejAdministratör, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RubrikHejAdministratör)
                    .addComponent(LabelAgentNamn)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnderRubrikAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnderRubrikAgent)
                    .addComponent(UnderRubrikChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KnappÄndraOmrådeschef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(KnappTaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KnappNyregistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KnappÄndraKontorschef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(KnappÄndraInfoOmAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KnappSökaInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KnappNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KnappGeAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonÄndraInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(ButtonÄndraRas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KnappTaBortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UnderRubrikUtrustning)
                        .addGap(30, 30, 30)
                        .addComponent(KnappTaBortUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KnappNyregistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappNyregistreraAlienActionPerformed
        new NyregistreraAlien(idb).setVisible(true);
    }//GEN-LAST:event_KnappNyregistreraAlienActionPerformed

    private void KnappÄndraInfoOmAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappÄndraInfoOmAlienActionPerformed
        new ÄndraInfoAlien(idb).setVisible(true);
    }//GEN-LAST:event_KnappÄndraInfoOmAlienActionPerformed

    private void KnappTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappTaBortAgentActionPerformed
        new TaBortAgent(idb).setVisible(true);
    }//GEN-LAST:event_KnappTaBortAgentActionPerformed

    private void KnappNyregistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappNyregistreraAgentActionPerformed
        new NyregistreraAgent(idb).setVisible(true);
    }//GEN-LAST:event_KnappNyregistreraAgentActionPerformed

    private void KnappTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappTaBortAlienActionPerformed
        new TaBortAlien(idb).setVisible(true);
    }//GEN-LAST:event_KnappTaBortAlienActionPerformed

    private void KnappTaBortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappTaBortUtrustningActionPerformed
        new TaBortUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_KnappTaBortUtrustningActionPerformed

    private void KnappSökaInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappSökaInfoAgentActionPerformed
        new SökInfoOmAgent(idb).setVisible(true);
    }//GEN-LAST:event_KnappSökaInfoAgentActionPerformed

    private void KnappGeAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappGeAdminStatusActionPerformed
        new GeAdministratörStatus(idb).setVisible(true);
    }//GEN-LAST:event_KnappGeAdminStatusActionPerformed

    private void ButtonÄndraInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraInfoAgentActionPerformed
        new ÄndraInfoAgent(idb).setVisible(true);
    }//GEN-LAST:event_ButtonÄndraInfoAgentActionPerformed

    private void KnappÄndraOmrådeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappÄndraOmrådeschefActionPerformed
        new ÄndraOmrådeschef(idb).setVisible(true);
    }//GEN-LAST:event_KnappÄndraOmrådeschefActionPerformed

    private void KnappÄndraKontorschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappÄndraKontorschefActionPerformed
        new ÄndraKontorschef(idb).setVisible(true);
    }//GEN-LAST:event_KnappÄndraKontorschefActionPerformed

    private void ButtonÄndraRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonÄndraRasActionPerformed
        new ÄndraRas(idb).setVisible(true);
    }//GEN-LAST:event_ButtonÄndraRasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HejAgent(idb).setVisible(true);
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
                new HejAdministrator(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonÄndraInfoAgent;
    private javax.swing.JButton ButtonÄndraRas;
    private javax.swing.JButton KnappGeAdminStatus;
    private javax.swing.JButton KnappNyregistreraAgent;
    private javax.swing.JButton KnappNyregistreraAlien;
    private javax.swing.JButton KnappSökaInfoAgent;
    private javax.swing.JButton KnappTaBortAgent;
    private javax.swing.JButton KnappTaBortAlien;
    private javax.swing.JButton KnappTaBortUtrustning;
    private javax.swing.JButton KnappÄndraInfoOmAlien;
    private javax.swing.JButton KnappÄndraKontorschef;
    private javax.swing.JButton KnappÄndraOmrådeschef;
    private javax.swing.JLabel LabelAgentNamn;
    private javax.swing.JLabel RubrikHejAdministratör;
    private javax.swing.JLabel UnderRubrikAgent;
    private javax.swing.JLabel UnderRubrikAlien;
    private javax.swing.JLabel UnderRubrikChef;
    private javax.swing.JLabel UnderRubrikUtrustning;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

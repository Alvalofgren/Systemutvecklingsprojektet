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
  
   
    /**
     * Creates new form HejAdministrator
     */
    public HejAdministrator(InfDB idb) {
        initComponents();
        this.idb=idb;
        agentNamn = AgentInlogg.getNamn();
        LabelAgentNamn.setText(agentNamn);
        

        LabelAgentNamn.setText(AgentInlogg.getNamn());
    }
    
    /**
     * Den h?r metoden ?r en get metod som vi anv?nder oss av i en annan metod som vi har i flera andra klasser. Den metoden
     * ?r kopplad till knappar som vi g?r f?r att kunna g? tillbaka till f?reg?ende sida. Den returnerar ett f?lt som ?r av 
     * typen boolean, det vill s?ga att den returnerar ett v?rde som antingen ?r true eller false. 
     * 
     * @return 
     */
    
 
    
   
    

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KnappNyregistreraAlien = new javax.swing.JButton();
        RubrikHejAdministrat?r = new javax.swing.JLabel();
        KnappTaBortAlien = new javax.swing.JButton();
        Knapp?ndraInfoOmAlien = new javax.swing.JButton();
        KnappNyregistreraAgent = new javax.swing.JButton();
        KnappS?kaInfoAgent = new javax.swing.JButton();
        KnappGeAdminStatus = new javax.swing.JButton();
        Button?ndraInfoAgent = new javax.swing.JButton();
        UnderRubrikAlien = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UnderRubrikAgent = new javax.swing.JLabel();
        KnappTaBortAgent = new javax.swing.JButton();
        UnderRubrikChef = new javax.swing.JLabel();
        Knapp?ndraOmr?deschef = new javax.swing.JButton();
        Knapp?ndraKontorschef = new javax.swing.JButton();
        UnderRubrikUtrustning = new javax.swing.JLabel();
        KnappTaBortUtrustning = new javax.swing.JButton();
        Button?ndraRas = new javax.swing.JButton();
        LabelAgentNamn = new javax.swing.JLabel();
        ButtonBytTillAgent = new javax.swing.JButton();
        ButtonLoggaUt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KnappNyregistreraAlien.setText("Nyregistrera alien");
        KnappNyregistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappNyregistreraAlienActionPerformed(evt);
            }
        });

        RubrikHejAdministrat?r.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikHejAdministrat?r.setForeground(new java.awt.Color(0, 204, 255));
        RubrikHejAdministrat?r.setText("V?lkommen");

        KnappTaBortAlien.setText("Ta bort alien");
        KnappTaBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappTaBortAlienActionPerformed(evt);
            }
        });

        Knapp?ndraInfoOmAlien.setText("?ndra information om alien");
        Knapp?ndraInfoOmAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Knapp?ndraInfoOmAlienActionPerformed(evt);
            }
        });

        KnappNyregistreraAgent.setText("Nyregistrera agent");
        KnappNyregistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappNyregistreraAgentActionPerformed(evt);
            }
        });

        KnappS?kaInfoAgent.setText("S?ka information om agent");
        KnappS?kaInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappS?kaInfoAgentActionPerformed(evt);
            }
        });

        KnappGeAdminStatus.setText("Ge administrat?rstatus");
        KnappGeAdminStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappGeAdminStatusActionPerformed(evt);
            }
        });

        Button?ndraInfoAgent.setText("?ndra information om agent");
        Button?ndraInfoAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button?ndraInfoAgentActionPerformed(evt);
            }
        });

        UnderRubrikAlien.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        UnderRubrikAlien.setText("Alien");

        UnderRubrikAgent.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        UnderRubrikAgent.setText("Agent");

        KnappTaBortAgent.setText("Ta bort agent");
        KnappTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappTaBortAgentActionPerformed(evt);
            }
        });

        UnderRubrikChef.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        UnderRubrikChef.setText("Chef");

        Knapp?ndraOmr?deschef.setText("?ndra omr?deschef");
        Knapp?ndraOmr?deschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Knapp?ndraOmr?deschefActionPerformed(evt);
            }
        });

        Knapp?ndraKontorschef.setText("?ndra kontorschef");
        Knapp?ndraKontorschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Knapp?ndraKontorschefActionPerformed(evt);
            }
        });

        UnderRubrikUtrustning.setText("Utrustning");

        KnappTaBortUtrustning.setText("Ta bort utrustning");
        KnappTaBortUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KnappTaBortUtrustningActionPerformed(evt);
            }
        });

        Button?ndraRas.setText("?ndra ras");
        Button?ndraRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button?ndraRasActionPerformed(evt);
            }
        });

        LabelAgentNamn.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        LabelAgentNamn.setForeground(new java.awt.Color(0, 204, 255));
        LabelAgentNamn.setText("jLabel1");

        ButtonBytTillAgent.setText("Byt till agentsidan");
        ButtonBytTillAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBytTillAgentActionPerformed(evt);
            }
        });

        ButtonLoggaUt.setText("Logga ut");
        ButtonLoggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoggaUtActionPerformed(evt);
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
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Button?ndraRas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 544, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UnderRubrikAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Knapp?ndraInfoOmAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(KnappTaBortAlien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KnappTaBortUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(UnderRubrikUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(KnappNyregistreraAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KnappS?kaInfoAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(KnappGeAdminStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Button?ndraInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(KnappTaBortAgent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UnderRubrikAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UnderRubrikChef, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Knapp?ndraOmr?deschef, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(Knapp?ndraKontorschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonLoggaUt)
                        .addGap(81, 81, 81)
                        .addComponent(RubrikHejAdministrat?r, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelAgentNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonBytTillAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RubrikHejAdministrat?r)
                            .addComponent(LabelAgentNamn)
                            .addComponent(ButtonBytTillAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonLoggaUt)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnderRubrikAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UnderRubrikAgent)
                    .addComponent(UnderRubrikChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Knapp?ndraOmr?deschef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(KnappTaBortAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KnappNyregistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Knapp?ndraKontorschef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Knapp?ndraInfoOmAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KnappS?kaInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KnappNyregistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KnappGeAdminStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button?ndraInfoAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(Button?ndraRas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(UnderRubrikUtrustning)
                        .addGap(18, 18, 18)
                        .addComponent(KnappTaBortUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KnappTaBortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KnappNyregistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappNyregistreraAlienActionPerformed
        new NyregistreraAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_KnappNyregistreraAlienActionPerformed

    private void Knapp?ndraInfoOmAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Knapp?ndraInfoOmAlienActionPerformed
        new ?ndraInfoAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_Knapp?ndraInfoOmAlienActionPerformed

    private void KnappTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappTaBortAgentActionPerformed
        new TaBortAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_KnappTaBortAgentActionPerformed

    private void KnappNyregistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappNyregistreraAgentActionPerformed
        new NyregistreraAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_KnappNyregistreraAgentActionPerformed

    private void KnappTaBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappTaBortAlienActionPerformed
        new TaBortAlien(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_KnappTaBortAlienActionPerformed

    private void KnappTaBortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappTaBortUtrustningActionPerformed
        new TaBortUtrustning(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_KnappTaBortUtrustningActionPerformed

    private void KnappS?kaInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappS?kaInfoAgentActionPerformed
        new S?kInfoOmAgent(idb).setVisible(true);
       dispose();
    }//GEN-LAST:event_KnappS?kaInfoAgentActionPerformed

    private void KnappGeAdminStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KnappGeAdminStatusActionPerformed
        new GeAdministrat?rStatus(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_KnappGeAdminStatusActionPerformed

    private void Button?ndraInfoAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button?ndraInfoAgentActionPerformed
        new ?ndraInfoAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_Button?ndraInfoAgentActionPerformed

    private void Knapp?ndraOmr?deschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Knapp?ndraOmr?deschefActionPerformed
        new ?ndraOmr?deschef(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_Knapp?ndraOmr?deschefActionPerformed

    private void Knapp?ndraKontorschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Knapp?ndraKontorschefActionPerformed
        new ?ndraKontorschef(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_Knapp?ndraKontorschefActionPerformed

    private void Button?ndraRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button?ndraRasActionPerformed
        new ?ndraRas(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_Button?ndraRasActionPerformed

    private void ButtonBytTillAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBytTillAgentActionPerformed
        new HejAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonBytTillAgentActionPerformed

    private void ButtonLoggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoggaUtActionPerformed
        new Fonster(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonLoggaUtActionPerformed

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
    private javax.swing.JButton ButtonBytTillAgent;
    private javax.swing.JButton ButtonLoggaUt;
    private javax.swing.JButton Button?ndraInfoAgent;
    private javax.swing.JButton Button?ndraRas;
    private javax.swing.JButton KnappGeAdminStatus;
    private javax.swing.JButton KnappNyregistreraAgent;
    private javax.swing.JButton KnappNyregistreraAlien;
    private javax.swing.JButton KnappS?kaInfoAgent;
    private javax.swing.JButton KnappTaBortAgent;
    private javax.swing.JButton KnappTaBortAlien;
    private javax.swing.JButton KnappTaBortUtrustning;
    private javax.swing.JButton Knapp?ndraInfoOmAlien;
    private javax.swing.JButton Knapp?ndraKontorschef;
    private javax.swing.JButton Knapp?ndraOmr?deschef;
    private javax.swing.JLabel LabelAgentNamn;
    private javax.swing.JLabel RubrikHejAdministrat?r;
    private javax.swing.JLabel UnderRubrikAgent;
    private javax.swing.JLabel UnderRubrikAlien;
    private javax.swing.JLabel UnderRubrikChef;
    private javax.swing.JLabel UnderRubrikUtrustning;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

package systemutvecklingsprojektet;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alval
 */
public class ListaAliensRas extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form ListaAliens
     */
    public ListaAliensRas(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllILista();
    }

//Comboboxen fylls med dessa värden, de olika raser som finns.   
    private void fyllILista() {

        ListaVäljRas.removeAllItems();
        ListaVäljRas.addItem("Välj");
        ListaVäljRas.addItem("Boglodite");
        ListaVäljRas.addItem("Squid");
        ListaVäljRas.addItem("Worm");

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        RubrikVisaRas = new javax.swing.JLabel();
        LabelVäljRas = new javax.swing.JLabel();
        ListaVäljRas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaFörRas = new javax.swing.JTextArea();
        ButtonVisa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikVisaRas.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikVisaRas.setForeground(new java.awt.Color(0, 204, 255));
        RubrikVisaRas.setText("Visa ras av alien");

        LabelVäljRas.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelVäljRas.setText("Välj ras:");

        ListaVäljRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListaVäljRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaVäljRasActionPerformed(evt);
            }
        });

        TextAreaFörRas.setEditable(false);
        TextAreaFörRas.setColumns(20);
        TextAreaFörRas.setRows(5);
        jScrollPane1.setViewportView(TextAreaFörRas);

        ButtonVisa.setText("Visa");
        ButtonVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVisaActionPerformed(evt);
            }
        });

        jButton1.setText("<--Tillbaka");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(RubrikVisaRas, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LabelVäljRas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListaVäljRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(ButtonVisa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RubrikVisaRas, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListaVäljRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelVäljRas)
                    .addComponent(ButtonVisa))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaVäljRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaVäljRasActionPerformed

    }//GEN-LAST:event_ListaVäljRasActionPerformed

//Denna metod hämtar ut information från tabellen alien beroende på vilken ras vi väljer i comboboxen.
//Sedan skriver den ut informationen i textArean om de alien som finns i den valda rasen.
    private void ButtonVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVisaActionPerformed

        try {
            switch (ListaVäljRas.getSelectedIndex()) {
                case 1: {
                    String query = "select alien.Namn, alien.Alien_ID  from alien join Boglodite on alien.alien_id = boglodite.Alien_ID";
                    ArrayList<HashMap<String, String>> rader = idb.fetchRows(query);
                    TextAreaFörRas.setText(null);
                    TextAreaFörRas.append(("Alien_ID") + "\t");
                    TextAreaFörRas.append(("Namn") + "\n");

                    for (HashMap<String, String> kolumn : rader) {

                        TextAreaFörRas.append(kolumn.get("Alien_ID") + "\t");
                        TextAreaFörRas.append(kolumn.get("Namn") + "\n");

                    }
                    break;
                }
                case 2: {
                    String query = "SELECT alien.Alien_ID, Namn FROM alien JOIN squid s on alien.Alien_ID = s.Alien_ID;";
                    ArrayList<HashMap<String, String>> rader = idb.fetchRows(query);
                    TextAreaFörRas.setText(null);
                    TextAreaFörRas.append(("Alien_ID") + "\t");
                    TextAreaFörRas.append(("Namn") + "\n");

                    for (HashMap<String, String> kolumn : rader) {

                        TextAreaFörRas.append(kolumn.get("Alien_ID") + "\t");
                        TextAreaFörRas.append(kolumn.get("Namn") + "\n");
                       

                    }
                    break;
                }
                case 3: {
                    String query = "select alien.Alien_ID, alien.Namn from alien join Worm on alien.Alien_ID = Worm.Alien_ID";
                    ArrayList<HashMap<String, String>> rader = idb.fetchRows(query);
                    TextAreaFörRas.setText(null);
                    TextAreaFörRas.append(("Alien_ID") + "\t");
                    TextAreaFörRas.append(("Namn") + "\n");

                    for (HashMap<String, String> kolumn : rader) {

                        TextAreaFörRas.append(kolumn.get("Alien_ID") + "\t");
                        TextAreaFörRas.append(kolumn.get("Namn") + "\n");
                    }
                    break;
                }
                default:
                    break;
            }
        } 
        catch (InfException undantag) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_ButtonVisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HejAgent(idb).setVisible(true);
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonVisa;
    private javax.swing.JLabel LabelVäljRas;
    private javax.swing.JComboBox<String> ListaVäljRas;
    private javax.swing.JLabel RubrikVisaRas;
    private javax.swing.JTextArea TextAreaFörRas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

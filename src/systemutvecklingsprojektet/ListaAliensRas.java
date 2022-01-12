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

//Comboboxen fylls med dessa v�rden, de olika raser som finns.   
    private void fyllILista() {

        ListaV�ljRas.removeAllItems();
        ListaV�ljRas.addItem("V�lj");
        ListaV�ljRas.addItem("Boglodite");
        ListaV�ljRas.addItem("Squid");
        ListaV�ljRas.addItem("Worm");

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        RubrikVisaRas = new javax.swing.JLabel();
        LabelV�ljRas = new javax.swing.JLabel();
        ListaV�ljRas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaF�rRas = new javax.swing.JTextArea();
        ButtonVisa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RubrikVisaRas.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        RubrikVisaRas.setForeground(new java.awt.Color(0, 204, 255));
        RubrikVisaRas.setText("Visa ras av alien");

        LabelV�ljRas.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        LabelV�ljRas.setText("V�lj ras:");

        ListaV�ljRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ListaV�ljRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaV�ljRasActionPerformed(evt);
            }
        });

        TextAreaF�rRas.setEditable(false);
        TextAreaF�rRas.setColumns(20);
        TextAreaF�rRas.setRows(5);
        jScrollPane1.setViewportView(TextAreaF�rRas);

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
                        .addComponent(LabelV�ljRas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListaV�ljRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(ListaV�ljRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelV�ljRas)
                    .addComponent(ButtonVisa))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaV�ljRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaV�ljRasActionPerformed

    }//GEN-LAST:event_ListaV�ljRasActionPerformed

//Denna metod h�mtar ut information fr�n tabellen alien beroende p� vilken ras vi v�ljer i comboboxen.
//Sedan skriver den ut informationen i textArean om de alien som finns i den valda rasen.
    private void ButtonVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVisaActionPerformed

        try {
            switch (ListaV�ljRas.getSelectedIndex()) {
                case 1: {
                    String query = "select alien.Namn, alien.Alien_ID  from alien join Boglodite on alien.alien_id = boglodite.Alien_ID";
                    ArrayList<HashMap<String, String>> rader = idb.fetchRows(query);
                    TextAreaF�rRas.setText(null);
                    TextAreaF�rRas.append(("Alien_ID") + "\t");
                    TextAreaF�rRas.append(("Namn") + "\n");

                    for (HashMap<String, String> kolumn : rader) {

                        TextAreaF�rRas.append(kolumn.get("Alien_ID") + "\t");
                        TextAreaF�rRas.append(kolumn.get("Namn") + "\n");

                    }
                    break;
                }
                case 2: {
                    String query = "SELECT alien.Alien_ID, Namn FROM alien JOIN squid s on alien.Alien_ID = s.Alien_ID;";
                    ArrayList<HashMap<String, String>> rader = idb.fetchRows(query);
                    TextAreaF�rRas.setText(null);
                    TextAreaF�rRas.append(("Alien_ID") + "\t");
                    TextAreaF�rRas.append(("Namn") + "\n");

                    for (HashMap<String, String> kolumn : rader) {

                        TextAreaF�rRas.append(kolumn.get("Alien_ID") + "\t");
                        TextAreaF�rRas.append(kolumn.get("Namn") + "\n");
                       

                    }
                    break;
                }
                case 3: {
                    String query = "select alien.Alien_ID, alien.Namn from alien join Worm on alien.Alien_ID = Worm.Alien_ID";
                    ArrayList<HashMap<String, String>> rader = idb.fetchRows(query);
                    TextAreaF�rRas.setText(null);
                    TextAreaF�rRas.append(("Alien_ID") + "\t");
                    TextAreaF�rRas.append(("Namn") + "\n");

                    for (HashMap<String, String> kolumn : rader) {

                        TextAreaF�rRas.append(kolumn.get("Alien_ID") + "\t");
                        TextAreaF�rRas.append(kolumn.get("Namn") + "\n");
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
    private javax.swing.JLabel LabelV�ljRas;
    private javax.swing.JComboBox<String> ListaV�ljRas;
    private javax.swing.JLabel RubrikVisaRas;
    private javax.swing.JTextArea TextAreaF�rRas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

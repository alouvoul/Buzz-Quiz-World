/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import buzz.Configurations;
import buzz.scores;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 * Class to implement score GUI object. This class used to show saved scores that
 * takes from score object class.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class scoreGUI extends javax.swing.JFrame {
    /**
     * Variable to get scores from file and preview on frame.
     */
    scores score;
    /**
     * Creates new form scoreGUI
     */
    public scoreGUI() {
        initComponents();
        score = new scores();
        //Sets for one player score table
        jLabel1.setText(Configurations.label1);
        jLabel2.setText(Configurations.label2);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn(Configurations.table1);
        model.addColumn(Configurations.scoreMessage);
        table1.setModel(model);
        //Sets for two players score table
        DefaultTableModel model2 = new DefaultTableModel();
        model2.addColumn(Configurations.table1);
        model2.addColumn(Configurations.scoreMessage);
        model2.addColumn(Configurations.scoreMessage);
        model2.addColumn(Configurations.table1);
        table2.setModel(model2);
        initTables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        jLabel1.setText("One PlayerGame");

        jLabel2.setText("Two player game");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(table1);
        table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player 1", "Score", "Score", "Player2"
            }
        ));
        jScrollPane2.setViewportView(table2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables

    /**
     * Initialize tables with name and scres in columns. In the form there are
     * two tables one for singleplayer and one for multiplayer.
     */
    private void initTables() {
        ArrayList<String[]> t1 = score.readOnePlayerScores();
        ArrayList<String[]> t2 = score.readTwoPlayersScores();
        //Sets score for singleplayer
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        for(String[] str :t1){
            Vector row = new Vector();
            row.add(str[0]);
            row.add(str[1]);
            model.addRow(row);
        }
        //Sets score for two player
        DefaultTableModel model2 = (DefaultTableModel) table2.getModel();
        for(String[] str: t2){
            Vector row = new Vector();
            row.add(str[0]);
            row.add(str[1]);
            row.add(str[2]);
            row.add(str[3]);
            model2.addRow(row);
        }
    }
}

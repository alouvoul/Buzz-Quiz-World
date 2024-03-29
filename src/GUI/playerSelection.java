/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import buzz.Configurations;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 * Class that implements GUI of player selection. Has choice for u\number of players
 * and textfields to set the names. There is a button to show scores of the game.
 * Control settings can be accessed only by this frame.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class playerSelection extends MainGUI {
    /**
     * Next frame.
     */
    private categoryChooseGUI cg;
    /**
     * Creates new form playerSelection
     */
    public playerSelection() {
        super();
        try {
            this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./images/background/playerChoose.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(playerSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        jLabel1.setText(Configurations.playersSum);
        onePlayerRadioButton.setText(Configurations.player1);
        twoPlayerRadioButton.setText(Configurations.player2);
        scoreButton.setText(Configurations.scoreMessage);
        //nameTextField2.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nameTextField1 = new javax.swing.JTextField();
        nameTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        onePlayerRadioButton = new javax.swing.JRadioButton();
        twoPlayerRadioButton = new javax.swing.JRadioButton();
        scoreButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);

        nameTextField2.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(12, 0, 255));
        jLabel1.setForeground(new java.awt.Color(0, 255, 62));
        jLabel1.setText("How many players?");

        OKButton.setBackground(new java.awt.Color(0, 0, 0));
        OKButton.setForeground(new java.awt.Color(255, 255, 255));
        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(onePlayerRadioButton);
        onePlayerRadioButton.setForeground(new java.awt.Color(0, 255, 92));
        onePlayerRadioButton.setSelected(true);
        onePlayerRadioButton.setText("1 Player");
        onePlayerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePlayerRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(twoPlayerRadioButton);
        twoPlayerRadioButton.setForeground(new java.awt.Color(0, 255, 105));
        twoPlayerRadioButton.setText("2 Players");
        twoPlayerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPlayerRadioButtonActionPerformed(evt);
            }
        });

        scoreButton.setBackground(new java.awt.Color(0, 0, 0));
        scoreButton.setForeground(new java.awt.Color(255, 255, 255));
        scoreButton.setText("scores");
        scoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Control Settings");
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
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(nameTextField1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OKButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twoPlayerRadioButton)
                    .addComponent(onePlayerRadioButton))
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onePlayerRadioButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoPlayerRadioButton)
                        .addGap(25, 25, 25)
                        .addComponent(nameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OKButton)
                        .addGap(29, 187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scoreButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        String name1 = nameTextField1.getText();
        String name2 = nameTextField2.getText();
        if(twoPlayerRadioButton.isSelected() && name2.equals(""))   //Needs name for player
            JOptionPane.showMessageDialog(this,Configurations.playerError);
        else if(name1.equals("") || name1.equals(name2))        //Needs different names for players
            JOptionPane.showMessageDialog(this,Configurations.playerError);
        else{
            String names[];
            if(twoPlayerRadioButton.isSelected()){
                names = new String[2];
                names[0] = nameTextField1.getText();
                names[1] = nameTextField2.getText();
            }
            else{
                names = new String[1];
                names[0] = nameTextField1.getText();
            }
            //System.out.println(""+names[0]);
            game.setPlayers(names);
            try {
                cg = new categoryChooseGUI();
                cg.setEnabled(true);
                cg.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.dispose();
        }
    }//GEN-LAST:event_OKButtonActionPerformed

    private void onePlayerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePlayerRadioButtonActionPerformed
        nameTextField2.setVisible(false);
    }//GEN-LAST:event_onePlayerRadioButtonActionPerformed

    private void twoPlayerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayerRadioButtonActionPerformed
        nameTextField2.setVisible(true);
    }//GEN-LAST:event_twoPlayerRadioButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controlSettings cs = new controlSettings(this);
        cs.setEnabled(true);
        cs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void scoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreButtonActionPerformed
        scoreGUI sg = new scoreGUI();
        sg.setEnabled(true);
        sg.setVisible(true);
    }//GEN-LAST:event_scoreButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameTextField1;
    private javax.swing.JTextField nameTextField2;
    private javax.swing.JRadioButton onePlayerRadioButton;
    private javax.swing.JButton scoreButton;
    private javax.swing.JRadioButton twoPlayerRadioButton;
    // End of variables declaration//GEN-END:variables
}

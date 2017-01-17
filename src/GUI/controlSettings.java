/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import buzz.Configurations;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * This class is used to change buttons that players play the game. A click on a
 * textfield focus the object and if a button pressed changes the game control.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class controlSettings extends MainGUI {
    /**
     * Stores the previos frame to open again when the players finish with the
     * control settings.
     */
    private playerSelection temp;
    /**
     * Creates new form controlSettings
     * @param ps
     */
    public controlSettings(playerSelection ps) {
        temp = ps;
        try {
            this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./images/background/buzz-quiz-world.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(generalGUIOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        Answer1Label.setText(Configurations.answer1Label);
        Answer2Label.setText(Configurations.answer2Label);
        Answer3Label.setText(Configurations.answer3Label);
        Answer4Label.setText(Configurations.answer4Label);
        player1Label.setText(Configurations.player1Label);
        player2Label.setText(Configurations.player2Label);
        saveButton.setText(Configurations.saveButton);
        updateTextFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player1Label = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        p1Text1 = new javax.swing.JTextField();
        p2Text1 = new javax.swing.JTextField();
        answersLabel = new javax.swing.JLabel();
        Answer1Label = new javax.swing.JLabel();
        p1Text2 = new javax.swing.JTextField();
        p2Text2 = new javax.swing.JTextField();
        p1Text3 = new javax.swing.JTextField();
        p2Text3 = new javax.swing.JTextField();
        p1Text4 = new javax.swing.JTextField();
        p2Text4 = new javax.swing.JTextField();
        Answer2Label = new javax.swing.JLabel();
        Answer3Label = new javax.swing.JLabel();
        Answer4Label = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));

        player1Label.setText("Player1");

        player2Label.setText("Player2");

        p1Text1.setEditable(false);
        p1Text1.setText("jTextField1");
        p1Text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1Text1KeyPressed(evt);
            }
        });

        p2Text1.setEditable(false);
        p2Text1.setText("jTextField2");
        p2Text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p2Text1KeyPressed(evt);
            }
        });

        answersLabel.setText("Answers");

        Answer1Label.setText("Answer 1");

        p1Text2.setEditable(false);
        p1Text2.setText("jTextField3");
        p1Text2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1Text2KeyPressed(evt);
            }
        });

        p2Text2.setEditable(false);
        p2Text2.setText("jTextField4");
        p2Text2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p2Text2KeyPressed(evt);
            }
        });

        p1Text3.setEditable(false);
        p1Text3.setText("jTextField5");
        p1Text3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1Text3KeyPressed(evt);
            }
        });

        p2Text3.setEditable(false);
        p2Text3.setText("jTextField6");
        p2Text3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p2Text3KeyPressed(evt);
            }
        });

        p1Text4.setEditable(false);
        p1Text4.setText("jTextField7");
        p1Text4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1Text4KeyPressed(evt);
            }
        });

        p2Text4.setEditable(false);
        p2Text4.setText("jTextField8");
        p2Text4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p2Text4KeyPressed(evt);
            }
        });

        Answer2Label.setText("Answer2");

        Answer3Label.setText("Answer3");

        Answer4Label.setText("Answer4");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Answer4Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Answer3Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Answer1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(Answer2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p1Text4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(p1Text3)
                    .addComponent(p1Text2)
                    .addComponent(p1Text1)
                    .addComponent(player1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p2Text4, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(player2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p2Text1)
                    .addComponent(p2Text2)
                    .addComponent(p2Text3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1Label)
                    .addComponent(player2Label)
                    .addComponent(answersLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2Text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Answer1Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2Text2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Answer2Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2Text3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Answer3Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2Text4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Answer4Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1Text1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1Text1KeyPressed
        Configurations.p1a1 = evt.getKeyCode();
        updateTextFields();
    }//GEN-LAST:event_p1Text1KeyPressed

    private void p1Text2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1Text2KeyPressed
        Configurations.p1a2 = evt.getKeyCode();
        updateTextFields();
    }//GEN-LAST:event_p1Text2KeyPressed

    private void p1Text3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1Text3KeyPressed
        Configurations.p1a3 = evt.getKeyCode();
        updateTextFields();
    }//GEN-LAST:event_p1Text3KeyPressed

    private void p1Text4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1Text4KeyPressed
        Configurations.p1a4 = evt.getKeyCode();
        updateTextFields();
    }//GEN-LAST:event_p1Text4KeyPressed

    private void p2Text1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2Text1KeyPressed
        Configurations.p2a1 = evt.getKeyCode();
        updateTextFields();
    }//GEN-LAST:event_p2Text1KeyPressed

    private void p2Text2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2Text2KeyPressed
        Configurations.p2a2 = evt.getKeyCode();
        updateTextFields();
    }//GEN-LAST:event_p2Text2KeyPressed

    private void p2Text3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2Text3KeyPressed
        Configurations.p2a3 = evt.getKeyCode();
        updateTextFields();
    }//GEN-LAST:event_p2Text3KeyPressed

    private void p2Text4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p2Text4KeyPressed
        Configurations.p2a4 = evt.getKeyCode();
        updateTextFields();
    }//GEN-LAST:event_p2Text4KeyPressed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        temp.setEnabled(true);
        temp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * Method that refresh the textfields.
     */
    protected void updateTextFields(){
        p1Text1.setText(KeyEvent.getKeyText(Configurations.p1a1));
        p1Text2.setText(KeyEvent.getKeyText(Configurations.p1a2));
        p1Text3.setText(KeyEvent.getKeyText(Configurations.p1a3));
        p1Text4.setText(KeyEvent.getKeyText(Configurations.p1a4));
        p2Text1.setText(KeyEvent.getKeyText(Configurations.p2a1));
        p2Text2.setText(KeyEvent.getKeyText(Configurations.p2a2));
        p2Text3.setText(KeyEvent.getKeyText(Configurations.p2a3));
        p2Text4.setText(KeyEvent.getKeyText(Configurations.p2a4));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Answer1Label;
    private javax.swing.JLabel Answer2Label;
    private javax.swing.JLabel Answer3Label;
    private javax.swing.JLabel Answer4Label;
    private javax.swing.JLabel answersLabel;
    private javax.swing.JTextField p1Text1;
    private javax.swing.JTextField p1Text2;
    private javax.swing.JTextField p1Text3;
    private javax.swing.JTextField p1Text4;
    private javax.swing.JTextField p2Text1;
    private javax.swing.JTextField p2Text2;
    private javax.swing.JTextField p2Text3;
    private javax.swing.JTextField p2Text4;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player2Label;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}

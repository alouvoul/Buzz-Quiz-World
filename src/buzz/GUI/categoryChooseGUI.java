/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz.GUI;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author alouvoul
 */
public class categoryChooseGUI extends MainGUI {

    /**
     * Creates new form categoryChooseGUI
     */
    public categoryChooseGUI() {
        super();
        try {
            this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./images/background/Buzz.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(playerSelection.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        initialCode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerTurnToChooseLabel = new javax.swing.JTextField();
        categoryButton2 = new javax.swing.JButton();
        categoryButton1 = new javax.swing.JButton();
        categoryButton4 = new javax.swing.JButton();
        categoryButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(600, 450));

        playerTurnToChooseLabel.setEditable(false);

        categoryButton2.setText("category2");
        categoryButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButton2ActionPerformed(evt);
            }
        });

        categoryButton1.setText("category1");
        categoryButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButton1ActionPerformed(evt);
            }
        });

        categoryButton4.setText("category4");
        categoryButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButton4ActionPerformed(evt);
            }
        });

        categoryButton3.setText("category3");
        categoryButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(categoryButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(categoryButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(categoryButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(categoryButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(playerTurnToChooseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(playerTurnToChooseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButton1ActionPerformed
        game.chooseCategory(categoryButton1.getText());
        HandleGame();
    }//GEN-LAST:event_categoryButton1ActionPerformed

    private void categoryButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButton2ActionPerformed
        game.chooseCategory(categoryButton2.getText());
        HandleGame();
    }//GEN-LAST:event_categoryButton2ActionPerformed

    private void categoryButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButton3ActionPerformed
        game.chooseCategory(categoryButton3.getText());
        HandleGame();
    }//GEN-LAST:event_categoryButton3ActionPerformed

    private void categoryButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButton4ActionPerformed
        game.chooseCategory(categoryButton4.getText());
        HandleGame();
    }//GEN-LAST:event_categoryButton4ActionPerformed

    /**
     * Method to handle game, set type game, then ask questions to the user.
     */
    public void HandleGame(){
        String type = game.getType();
        MainGUI mg;
        if(type.equals("Bet")){
            mg = new betGUI();
        }
        else if(type.equals("CorrectAnswer")){
            mg = new correctAnswerGUI();
        }
        else if(type.equals("Thermometer")){
            //-----TODO 
        }
        
        
    }
            
    private void initialCode(){
        try {
            game.InitializeQuestions();
        } catch (IOException ex) {
            Logger.getLogger(categoryChooseGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] categories = game.getQuestionCategories();
        categoryButton1.setText(categories[0]);
        categoryButton2.setText(categories[1]);
        categoryButton3.setText(categories[2]);
        categoryButton4.setText(categories[3]);
        
        playerTurnToChooseLabel.setText("Is your turn to choose category:");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoryButton1;
    private javax.swing.JButton categoryButton2;
    private javax.swing.JButton categoryButton3;
    private javax.swing.JButton categoryButton4;
    private javax.swing.JTextField playerTurnToChooseLabel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz.GUI;

import buzz.Player;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alouvoul
 */
public class betGUI extends roundsGeneralGUI{
    int bet;
    int i=0;
    //int players = 0;
    /**
     * Creates new form betGUI
     */
    public betGUI() {
        super();
        initComponents();
        name1.setText(game.getPlayers().get(0).GetName()+": "+game.getPlayers().get(0).GetScore());
        if(game.getPlayers().size()>1){
            name2.setEnabled(true);
            name2.setVisible(true);
            name2.setText(game.getPlayers().get(1).GetName()+": "+game.getPlayers().get(1).GetScore());
        }
        iteration();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        answerButton1 = new javax.swing.JButton();
        answerButton3 = new javax.swing.JButton();
        answerButton4 = new javax.swing.JButton();
        answerButton2 = new javax.swing.JButton();
        questionLabel = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        answerButton1.setText("answer");
        answerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton1ActionPerformed(evt);
            }
        });
        answerButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerButton1KeyPressed(evt);
            }
        });

        answerButton3.setText("answer");
        answerButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton3ActionPerformed(evt);
            }
        });
        answerButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerButton3KeyPressed(evt);
            }
        });

        answerButton4.setText("answer");
        answerButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton4ActionPerformed(evt);
            }
        });
        answerButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerButton4KeyPressed(evt);
            }
        });

        answerButton2.setText("answer");
        answerButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton2ActionPerformed(evt);
            }
        });
        answerButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerButton2KeyPressed(evt);
            }
        });

        questionLabel.setText("jLabel1");

        name1.setEditable(false);
        name1.setText("name1:score1");

        name2.setEditable(false);
        name2.setText("name1:score2");
        name2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(answerButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(answerButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(answerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answerButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answerButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answerButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton1ActionPerformed
        if(game.getPlayers().size()==1){
            update(answerButton1.getText());
            iteration();
        }
        
    }//GEN-LAST:event_answerButton1ActionPerformed

    private void answerButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton3ActionPerformed
        if(game.getPlayers().size()==1){
            update(answerButton2.getText());
            iteration();
        }
    }//GEN-LAST:event_answerButton3ActionPerformed

    private void answerButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton4ActionPerformed
        if(game.getPlayers().size()==1){
            update(answerButton3.getText());
            iteration();
        }
    }//GEN-LAST:event_answerButton4ActionPerformed

    private void answerButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton2ActionPerformed
        if(game.getPlayers().size()==1){
            update(answerButton4.getText());
            iteration();
        }
    }//GEN-LAST:event_answerButton2ActionPerformed

    private void answerButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerButton1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_1){
            update(answerButton1.getText());
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD1){
            update(answerButton1.getText());
        }
        iteration();
    }//GEN-LAST:event_answerButton1KeyPressed

    private void answerButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerButton2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_2){
            update(answerButton2.getText());
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD2){
            update(answerButton2.getText());
        }
        iteration();
    }//GEN-LAST:event_answerButton2KeyPressed

    private void answerButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerButton3KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_3){
            update(answerButton3.getText());
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD3){
            update(answerButton3.getText());
        }
        iteration();
    }//GEN-LAST:event_answerButton3KeyPressed

    private void answerButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerButton4KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_4){
            update(answerButton4.getText());
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD4){
            update(answerButton4.getText());
        }
        iteration();
    }//GEN-LAST:event_answerButton4KeyPressed

    private void iteration(){
        
        if(i<buzz.BuzzApp.QUESTIONS_PER_ROUNDS){
            bet = bettingMethod();
            setQuestions(bet);
        }
        else
            return ;
        i++;
    }
    private void update(String answer){
        game.playerAnswer(answer, game.getCurrentPlayer(), bet);
        ArrayList<Player> pl = game.getPlayers();
        name1.setText(pl.get(0).GetName()+": "+pl.get(0).GetScore());
        if(pl.size()==2){
            name2.setText(pl.get(1).GetName()+": "+pl.get(1).GetScore());
        }
        //this.dispose();
    }
    
    public void setQuestions(int bet){
        setCurrentPlayer();
        //int bet = bettingMethod();
        if(bet>0){
            q = game.play();
            String[] temp = q.getAnswers();
            System.out.println("setQuestions");
            questionLabel.setText(q.getQuestion());
            answerButton1.setText(temp[0]);
            answerButton2.setText(temp[1]);
            answerButton3.setText(temp[2]);
            answerButton4.setText(temp[3]);
        }
    }

    private int bettingMethod() {
        Object[] possibilities = {"250", "500", "750","1000"};
        this.setVisible(false);
        String s = (String)JOptionPane.showInputDialog(this,game.getCurrentPlayer().GetName()+" how many points would you like to bet?",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    possibilities,
                    "ham");
        this.setVisible(true);
        //If a string was returned, say so.
        if ((s != null) && (s.length() > 0)) {
            int bet = Integer.parseInt(s);
            return bet;
        }
        
        return 0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton1;
    private javax.swing.JButton answerButton2;
    private javax.swing.JButton answerButton3;
    private javax.swing.JButton answerButton4;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JLabel questionLabel;
    // End of variables declaration//GEN-END:variables


}

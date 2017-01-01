/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.MainGUI.game;
import buzz.Player;
import buzz.Question;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author alouvoul
 */
public class timerGUI extends MainGUI implements ActionListener{
    private categoryChooseGUI previous;
    Timer timer;
    boolean answered[] = new boolean[2];
    Question q;
    int iterations = 0;
    /**
     * Creates new form timerGUI
     * @param previous
     */
    public timerGUI(categoryChooseGUI previous) {
        super();
        initComponents();
        this.previous = previous;
        setQuestions();
        answered[0] = false;
        answered[1] = false;
        timer = new Timer(5000, this);
        timer.start();
        this.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionLabel = new javax.swing.JLabel();
        answerButton1 = new javax.swing.JButton();
        answerButton2 = new javax.swing.JButton();
        answerButton3 = new javax.swing.JButton();
        answerButton4 = new javax.swing.JButton();
        name2 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        questionLabel.setText("jLabel1");

        answerButton1.setText("answer1");
        answerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton1ActionPerformed(evt);
            }
        });

        answerButton2.setText("answer2");
        answerButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton2ActionPerformed(evt);
            }
        });

        answerButton3.setText("answer3");
        answerButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton3ActionPerformed(evt);
            }
        });

        answerButton4.setText("answer4");
        answerButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButton4ActionPerformed(evt);
            }
        });

        name2.setEditable(false);
        name2.setText("name1:score1");

        name1.setEditable(false);
        name1.setText("name1:score1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(answerButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(answerButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(answerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answerButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answerButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answerButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_1 && !answered[PLAYER1]){
            update(answerButton1.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD1 && !answered[PLAYER2]){
            update(answerButton1.getText(),PLAYER2);
        }
        if(evt.getKeyCode() == KeyEvent.VK_2 && !answered[PLAYER1]){
            update(answerButton2.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD2 && !answered[PLAYER2]){
            update(answerButton2.getText(),PLAYER2);
        }
        if(evt.getKeyCode() == KeyEvent.VK_3 && !answered[PLAYER1]){
            update(answerButton3.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD3 && !answered[PLAYER2]){
            update(answerButton3.getText(),PLAYER2);
        }
        if(evt.getKeyCode() == KeyEvent.VK_4 && !answered[PLAYER1]){
            update(answerButton4.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD4 && !answered[PLAYER2]){
            update(answerButton4.getText(),PLAYER2);
        }
        System.out.println("asd");
    }//GEN-LAST:event_formKeyPressed

    private void answerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton1ActionPerformed
        if(game.getPlayers().size()==1){
            update(answerButton1.getText(),0);
        }
    }//GEN-LAST:event_answerButton1ActionPerformed

    private void answerButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton2ActionPerformed
        if(game.getPlayers().size()==1){
            update(answerButton2.getText(),0);
        }
    }//GEN-LAST:event_answerButton2ActionPerformed

    private void answerButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton3ActionPerformed
        if(game.getPlayers().size()==1){
            update(answerButton3.getText(),0);
        }
    }//GEN-LAST:event_answerButton3ActionPerformed

    private void answerButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButton4ActionPerformed
        if(game.getPlayers().size()==1){
            update(answerButton4.getText(),0);
        }
    }//GEN-LAST:event_answerButton4ActionPerformed

    @Override
    public void actionPerformed(ActionEvent e) {
        iterations++;
        if(iterations>6){
            previous.setEnabled(true);
            previous.setVisible(true);
            timer.stop();
            this.dispose();
        }
        setQuestions();
    }

    public void setQuestions(){
        
        q = game.getNextQuestion();
        String[] temp = q.getAnswers();
        questionLabel.setText(q.getQuestion());
        answerButton3.setText(temp[0]);
        answerButton1.setText(temp[1]);
        answerButton2.setText(temp[2]);
        answerButton4.setText(temp[3]);
        answered[0] = false;
        answered[1] = false;
    }
    private void update(String answer, int i) {
        boolean flagAnswer = false;
        if(answer.equals(q.getCorrectAnswer()))
            flagAnswer = true;
        game.playerAnswer(flagAnswer, i);
        answered[i] = true;
        ArrayList<Player> pl = game.getPlayers();
        name1.setText(pl.get(0).GetName()+": "+pl.get(0).GetScore());
        if(pl.size()==2){
            name2.setText(pl.get(1).GetName()+": "+pl.get(1).GetScore());
        }
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
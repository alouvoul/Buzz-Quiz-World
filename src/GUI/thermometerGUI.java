/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.MainGUI.PLAYER1;
import static GUI.MainGUI.PLAYER2;
import static GUI.MainGUI.game;
import buzz.Configurations;
import buzz.Player;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author alouvoul
 */
public class thermometerGUI extends generalGUIOptions {
    Timer timer;
    int[] playerWin;
    int iterations = 0;
    /**
     * Creates new form thermometerGUI
     * @param previous
     */
    public thermometerGUI(categoryChooseGUI previous) {
        super();
        playerWin = new int[2];
        playerWin[0] = 0;
        playerWin[1] = 0;
        this.previous = previous;
        initComponents();
        setQuestions();
        this.setFocusable(true);
        name1.setText(game.getPlayers().get(0).GetName()+": "+game.getPlayers().get(0).GetScore());
        if(game.getPlayers().size()>1){
            name2.setEnabled(true);
            name2.setVisible(true);
            name2.setText(game.getPlayers().get(1).GetName()+": "+game.getPlayers().get(1).GetScore());
        }
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
        questionLabel = new javax.swing.JLabel();
        answerButton2 = new javax.swing.JButton();
        answerButton3 = new javax.swing.JButton();
        answerButton4 = new javax.swing.JButton();
        name1 = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        answerButton1.setText("answer1");

        questionLabel.setText("jLabel1");

        answerButton2.setText("answer2");

        answerButton3.setText("answer3");

        answerButton4.setText("answer4");

        name1.setEditable(false);
        name1.setText("name1:score1");

        name2.setEditable(false);
        name2.setText("name1:score1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(answerButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(answerButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGap(338, 338, 338))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(answerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answerButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answerButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answerButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
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
        if(Configurations.DEBUG)
            System.out.println("Keypressed: "+evt.getKeyChar());
    }//GEN-LAST:event_formKeyPressed

    private void update(String answer,int i){
        if(answer.equals(q.getCorrectAnswer()) && !answered[i]){
            playerWin[i]++;
            answered[i] = true;
        }
        
        if(answered[0] &&  answered[1])
            iteration();
    }
    
    @Override
    protected void iteration(){
        
        if(playerWin[0]< 5 && playerWin[1] < 5){
            setQuestions();
        }
        else{
            ArrayList<Player> pl = game.getPlayers();
            name1.setText(pl.get(0).GetName()+": "+pl.get(0).GetScore());
            //if(pl.size()==2){
            name2.setText(pl.get(1).GetName()+": "+pl.get(1).GetScore());
            
            previous.setEnabled(true);
            previous.setVisible(true);
            this.dispose();
        }
        iterations++;
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

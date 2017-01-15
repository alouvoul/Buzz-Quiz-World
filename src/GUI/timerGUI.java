/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.MainGUI.game;
import buzz.Configurations;
import buzz.Player;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author alouvoul
 */
public class timerGUI extends generalGUIOptions implements ActionListener{
    Timer timer;
    int iterations = 0;
    private long start;
    private long end;
    /**
     * Creates new form timerGUI
     * @param previous
     */
    public timerGUI(categoryChooseGUI previous) {
        super();
        initComponents();
        this.setFocusable(true);
        this.previous = previous;
        setQuestions();
        timer = new Timer(5000, this);
        timer.start();
        start = System.currentTimeMillis();
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == Configurations.p1a1 && game.getPlayers().size()==1){
            update(answerButton1.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == Configurations.p1a2 && game.getPlayers().size()==1){
            update(answerButton2.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == Configurations.p1a3 && game.getPlayers().size()==1){
            update(answerButton3.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == Configurations.p1a4 && game.getPlayers().size()==1){
            update(answerButton4.getText(),PLAYER1);
        }
        
        
        if(evt.getKeyCode() == Configurations.p1a1 && !answered[0]){
            update(answerButton1.getText(),0);
        }
        else if(evt.getKeyCode() == Configurations.p2a1 && !answered[1]){
            update(answerButton1.getText(),1);
        }
        if(evt.getKeyCode() == Configurations.p1a2 && !answered[0]){
            update(answerButton2.getText(),0);
        }
        else if(evt.getKeyCode() == Configurations.p2a2 && !answered[1]){
            update(answerButton2.getText(),1);
        }
        if(evt.getKeyCode() == Configurations.p1a3 && !answered[0]){
            update(answerButton3.getText(),0);
        }
        else if(evt.getKeyCode() == Configurations.p2a3 && !answered[1]){
            update(answerButton3.getText(),1);
        }
        if(evt.getKeyCode() == Configurations.p1a4 && !answered[0]){
            update(answerButton4.getText(),0);
        }
        else if(evt.getKeyCode() == Configurations.p2a4 && !answered[1]){
            update(answerButton4.getText(),1);
        }
        if(Configurations.DEBUG)
            System.out.println("Keypressed: "+evt.getKeyChar());
    }//GEN-LAST:event_formKeyPressed

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
        // Update score labels
        ArrayList<Player> pl = game.getPlayers();
        if(game.getPlayers().size()==2){
            iteration();
            name1.setText(pl.get(0).GetName()+": "+pl.get(0).GetScore());
            name2.setText(pl.get(1).GetName()+": "+pl.get(1).GetScore());
        }
        else if(game.getPlayers().size()==1){
            iteration();
            name1.setText(pl.get(0).GetName()+": "+pl.get(0).GetScore());
        }
        start = System.currentTimeMillis();
    }

    private void update(String answer, int player) {
        end = System.currentTimeMillis();
        int points = (int) (end-start);
        if(Configurations.DEBUG)
            System.out.println(points);
        game.playerAnswer(answer, player, points);
        answered[player] = false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


}

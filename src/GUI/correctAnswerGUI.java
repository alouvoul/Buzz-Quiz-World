/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.MainGUI.game;
import buzz.Configurations;
import java.awt.event.KeyEvent;

/**
 * Class that implements correct answer game round. Takes as parameter previous
 * frame that will enable again after the end of the round. This round played only
 * with button from keyboard and NOT clicks with mouse.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class correctAnswerGUI extends generalGUIOptions {
    
    /**
     * Creates new form correctAnswerGUI
     * @param previous Set enable after the end of the round
     */
    public correctAnswerGUI(categoryChooseGUI previous) {
        super();
        this.previous = previous;
        initComponents();
        this.setFocusable(true);
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
            .addGap(0, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == Configurations.p1a1 && game.getPlayers().size()==1){
            updateUI(answerButton1.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == Configurations.p1a2 && game.getPlayers().size()==1){
            updateUI(answerButton2.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == Configurations.p1a3 && game.getPlayers().size()==1){
            updateUI(answerButton3.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == Configurations.p1a4 && game.getPlayers().size()==1){
            updateUI(answerButton4.getText(),PLAYER1);
        }
        
        
        if(evt.getKeyCode() == Configurations.p1a1 && !answered[0]){
            updateUI(answerButton1.getText(),0);
        }
        else if(evt.getKeyCode() == Configurations.p2a1 && !answered[1]){
            updateUI(answerButton1.getText(),1);
        }
        if(evt.getKeyCode() == Configurations.p1a2 && !answered[0]){
            updateUI(answerButton2.getText(),0);
        }
        else if(evt.getKeyCode() == Configurations.p2a2 && !answered[1]){
            updateUI(answerButton2.getText(),1);
        }
        if(evt.getKeyCode() == Configurations.p1a3 && !answered[0]){
            updateUI(answerButton3.getText(),0);
        }
        else if(evt.getKeyCode() == Configurations.p2a3 && !answered[1]){
            updateUI(answerButton3.getText(),1);
        }
        if(evt.getKeyCode() == Configurations.p1a4 && !answered[0]){
            updateUI(answerButton4.getText(),0);
        }
        else if(evt.getKeyCode() == Configurations.p2a4 && !answered[1]){
            updateUI(answerButton4.getText(),1);
        }
    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

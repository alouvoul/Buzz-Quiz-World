/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import buzz.Configurations;
import buzz.Player;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author alouvoul
 */
public class betGUI extends generalGUIOptions{
    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    int bet;
    int i=0;
    Player tempPlayer;
    
    /**
     * Creates new form betGUI
     */
    public betGUI(categoryChooseGUI cc) {
        super();
        previous = cc;
        initComponents();
        name1.setText(game.getPlayers().get(0).GetName()+": "+game.getPlayers().get(0).GetScore());
        if(game.getPlayers().size()>1){
            name2.setEnabled(true);
            name2.setVisible(true);
            name2.setText(game.getPlayers().get(1).GetName()+": "+game.getPlayers().get(1).GetScore());
        }
        iteration();
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
        if(evt.getKeyCode() == KeyEvent.VK_1 && game.getPlayers().size()==1){
            updateUI(answerButton1.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_1 && game.getPlayers().size()==1){
            updateUI(answerButton2.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_1 && game.getPlayers().size()==1){
            updateUI(answerButton3.getText(),PLAYER1);
        }
        else if(evt.getKeyCode() == KeyEvent.VK_1 && game.getPlayers().size()==1){
            updateUI(answerButton4.getText(),PLAYER1);
        }        
        
        if(evt.getKeyCode() == KeyEvent.VK_1 ){
            update(answerButton1.getText(),PLAYER1);
            iteration();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD1 && game.getPlayers().size()>1){
            update(answerButton1.getText(),PLAYER2);
            iteration();
        }
        if(evt.getKeyCode() == KeyEvent.VK_2){
            update(answerButton2.getText(), PLAYER1);
            iteration();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD2 && game.getPlayers().size()>1){
            update(answerButton2.getText(),PLAYER2);
            iteration();
        }
        if(evt.getKeyCode() == KeyEvent.VK_3){
            update(answerButton3.getText(),PLAYER1);
            iteration();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD3 && game.getPlayers().size()>1){
            update(answerButton3.getText(),PLAYER2);
            iteration();
        }
        if(evt.getKeyCode() == KeyEvent.VK_4){
            update(answerButton4.getText(),PLAYER1);
            iteration();
        }
        else if(evt.getKeyCode() == KeyEvent.VK_NUMPAD4 && game.getPlayers().size()>1){
            update(answerButton4.getText(),PLAYER2);
            iteration();
        }
    }//GEN-LAST:event_formKeyPressed

    protected void iteration(){
        
        if(i<buzz.BuzzApp.QUESTIONS_PER_ROUNDS){
            setCurrentPlayer();
            bet = bettingMethod();
            setQuestions();
        }
        else{
            previous.setEnabled(true);
            previous.setVisible(true);
            this.dispose();
        }
        i++;
    }
    
    private void update(String answer, int player){
        game.playerAnswer(answer, game.getCurrentPlayer() , bet);
        ArrayList<Player> pl = game.getPlayers();
        name1.setText(pl.get(0).GetName()+": "+pl.get(0).GetScore());
        if(pl.size()==2){
            name2.setText(pl.get(1).GetName()+": "+pl.get(1).GetScore());
        }
    }
    
/*    public void setQuestions(int bet){
        
        if(bet>0){
            q = game.getNextQuestion();
            String[] temp = q.getAnswers();
            System.out.println("setQuestions");
            questionLabel.setText(q.getQuestion());
            answerButton1.setText(temp[0]);
            answerButton2.setText(temp[1]);
            answerButton3.setText(temp[2]);
            answerButton4.setText(temp[3]);
            if(q.getHasImage()!=null){
                try {
                    BufferedImage myPicture = ImageIO.read(new File(Configurations.PATH_TO_IMAGES+q.getHasImage()));
                    JLabel picLabel = new JLabel(new ImageIcon(myPicture));
                    imagePanel.add(picLabel);
                    imagePanel.setEnabled(true);
                    imagePanel.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(betGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }*/

    private int bettingMethod() {
        Object[] possibilities = {"250", "500", "750","1000"};
        this.setVisible(false);
        while(true){
            String s = (String)JOptionPane.showInputDialog(this,tempPlayer.GetName()+Configurations.betMessage,
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
        }
    }
    
    private void setCurrentPlayer() {
        tempPlayer = game.getPlayers().get(i%game.getPlayers().size());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}

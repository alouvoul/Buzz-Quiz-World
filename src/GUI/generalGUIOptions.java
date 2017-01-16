/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.MainGUI.game;
import buzz.Configurations;
import buzz.Player;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Class used by game rounds as parent to implement basic methods and gui components
 * that all cholds use. Also used to iterate the questions for a category.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class generalGUIOptions extends MainGUI {
    /**
     * Variable that used for image preview. Used by all subclasses.
     */
    ImageIcon defaultImage;
    /**
     * Store tha game players used to set scores and the check for number of players.
     */
    ArrayList<Player> pl = game.getPlayers();
    /**
     * Variable for iterations limit.
     */
    protected int iterations = 0;
    
    /**
     * Creates new form generalGUIOptions
     */
    public generalGUIOptions(){
        try {
            this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./images/background/temp.jpg")))));
        } catch (IOException ex) {
            Logger.getLogger(generalGUIOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        JOptionPane.showMessageDialog(this,game.getType());
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
        answerButton2 = new javax.swing.JButton();
        answerButton3 = new javax.swing.JButton();
        answerButton4 = new javax.swing.JButton();
        questionLabel = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        answerButton1.setText("answer");
        answerButton1.setFocusable(false);

        answerButton2.setText("answer");
        answerButton2.setFocusable(false);

        answerButton3.setText("answer");
        answerButton3.setFocusable(false);

        answerButton4.setText("answer");
        answerButton4.setFocusable(false);

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(name2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(answerButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(answerButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(answerButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(imageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answerButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answerButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answerButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(answerButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Checks if answer is correct and call method to calculate points to add. 
     * Update scores for players if both of them answer and call iteration mathod
     * to change questions.
     * 
     * @param answer Player's answer to check if this is correct.
     * @param i Player number 0 or 1 for 2 players
     */
    protected void updateUI(String answer,int i){
        boolean flagAnswer = false;
        if(!answered[i]){
            if(answer.equals(q.getCorrectAnswer()))
                flagAnswer = true;

            game.playerAnswer(flagAnswer, i);
            answered[i] = true;    
        }
        
        
        if(game.getPlayers().size()>1 && answered[0] &&  answered[1]){  //Sets only if both players answered
            iteration();
            name1.setText(pl.get(0).GetName()+": "+pl.get(0).GetScore());
            
            if(pl.size()==2){
                name2.setText(pl.get(1).GetName()+": "+pl.get(1).GetScore());
            }
        }
        else if(game.getPlayers().size()==1){   //if there is one player 
            iteration();
            name1.setText(pl.get(0).GetName()+": "+pl.get(0).GetScore());
        }
    }
    
    /**
     * Method to change question and answers in every turn.
     */
    protected void setQuestions(){
        
        q = game.getNextQuestion();
        String[] temp = q.getAnswers();
        questionLabel.setText(q.getQuestion());
        answerButton3.setText(temp[0]);
        answerButton1.setText(temp[1]);
        answerButton2.setText(temp[2]);
        answerButton4.setText(temp[3]);
        answered[0] = false;
        answered[1] = false;
        imageLabel.setVisible(false);
                //random path
        if(q.getHasImage()!=null){
            imageLabel.setVisible(true);
            String path=q.getHasImage();
            try {
                //creating image
                defaultImage=new ImageIcon(ImageIO.read(new File(Configurations.PATH_TO_IMAGES+path)));
            } catch (IOException ex) {
                System.err.println("could not create image from path : "+path);
            }
            //scaling image to labels size
            Image finalImage= defaultImage.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
            //saving image
            defaultImage=new ImageIcon(finalImage);
            //seting
            imageLabel.setIcon(defaultImage);
        }
    }

    /**
     * Check for iteration limit for rounds. Refresh the questions by calling setQuestions
     * method. if limit reached enable previous frame (categoryChoose object).
     */
    protected void iteration(){
        
        if(iterations < buzz.Configurations.QUESTIONS_PER_ROUNDS){
            setQuestions();
        }
        else{
            previous.setEnabled(true);
            previous.setVisible(true);
            this.dispose();
        }
        iterations++;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton answerButton1;
    protected javax.swing.JButton answerButton2;
    protected javax.swing.JButton answerButton3;
    protected javax.swing.JButton answerButton4;
    private javax.swing.JLabel imageLabel;
    protected javax.swing.JTextField name1;
    protected javax.swing.JTextField name2;
    private javax.swing.JLabel questionLabel;
    // End of variables declaration//GEN-END:variables
}

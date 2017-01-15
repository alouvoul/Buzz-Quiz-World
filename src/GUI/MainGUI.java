/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import buzz.BuzzApp;
import buzz.Configurations;
import buzz.Question;
import java.io.IOException;

/**
 * This class used only as inheritance component to keep all jframe similar.
 * Variables that needed to all jframes declared in this class. InitializaGame method
 * initial game object and configurations for the game.
 * 
 * @author alouvoul
 */
public class MainGUI extends javax.swing.JFrame {
    /**
     * Initial variable for game logic. GUI interacts with this object to start
     * the game.
     */
    protected static BuzzApp game;
    public static final int PLAYER1 = 0;
    public static final int PLAYER2 = 1;
    
    /**
     * Array that checks if a player answer the current question. Every iteration
     * in questions these values set to false.
     */
    protected boolean answered[] = new boolean[2];
    
    /**
     * Temp variable to get next question to preview in GUI.
     */
    protected Question q ;
    
    /**
     * All jframe needs a variable categoryChoose as parameter that needed to
     * show the previous frame at the end of round.
     */
    protected categoryChooseGUI previous;
    /**
     * Creates new form MainGUI
     */
    public MainGUI(){
        initComponents();
    }
    
    /**
     * Initialize game and configuration object at the beggining of the game.
     * @throws IOException 
     */
    protected static void InitializeGame() throws IOException{
        game = new BuzzApp();
        Configurations.init();
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
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 450));

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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

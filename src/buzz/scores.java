/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class used by UI to read /write score record for previous games. Score saved
 * in txt files for one player and two players.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class scores {
    /**
     * Variable for read the files
     */
    private BufferedReader in;
    /**
     * Variable to write to a file
     */
    private BufferedWriter out;
    
    /**
     * Constructor
     */
    public scores() {
        
    }
    
    /**
     * Method that append score for one player in the text file.
     * @param name Name of the player to save
     * @param score Player's score at the end of the game
     */
    public void writeOnePlayerScore(String name,int score){
        try {
            out = new BufferedWriter(new FileWriter("scores_one",true));
            out.append(name+"-"+Integer.toString(score)+"\n");
        } catch (IOException ex) {
            Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * Method that append score for two players in the text file.
     * 
     * @param names Array with names of player
     * @param scores Array with scores of the player
     */
    public void writeTwoPlayersScore(String[] names, int[] scores){
        try {
            out = new BufferedWriter(new FileWriter("scores_two",true));
            out.append(names[0]+"-"+Integer.toString(scores[0])+"-"+Integer.toString(scores[1])+"-"+names[1]+"\n");
        } catch (IOException ex) {
            Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * Method to read text file with saved scores. All the file return as an array.
     * 
     * @return Arraylist with the names and scores
     */
    public ArrayList<String[]> readOnePlayerScores(){
        ArrayList<String[]> scores = new ArrayList<>();
        try {
            in = new BufferedReader(new FileReader("scores_one"));
            String temp;
            temp=in.readLine();
            while(temp!=null){
                String[] converted = temp.split("-");
                scores.add(converted);
                temp=in.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return scores;
    }
    
    /**
     * Method to read text file with saved scores. All the file return as an array.
     * 
     * @return Arraylist with the names and scores
     */
    public ArrayList<String[]> readTwoPlayersScores(){
        ArrayList<String[]> scores = new ArrayList<>();
        try {
            in = new BufferedReader(new FileReader("scores_two"));
            String temp;
            temp=in.readLine();
            while(temp!=null){
                String[] converted = temp.split("-");
                scores.add(converted);
                temp=in.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(scores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return scores;
    }
    
}

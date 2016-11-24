/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

/**
 * Class that declares the player object with its name and score
 * 
 * @author alouvoul
 */
public class Player {
    
    private String name;
    private int score;
    
    /**
     * Constructor of player to initialize the player data
     * @param name 
     */
    public Player(String name) {
        this.name = name;
        score = 0;
    }
    
    /**
     * Setter of player name
     * @param name of the player
     */
    public void SetName(String name){
        this.name = name;
    }
    
    /**
     * Getter of player name
     * @return the player name
     */
    public String GetName(){
        return name;
    }
    
    /**
     * Setter of player score
     * @param score of the player
     */
    public void SetScore(int score){
        this.score += score;
    }
    
    /** 
     * Getter of player score
     * @return the player score
     */
    public int GetScore(){
        return score;
    }   
}
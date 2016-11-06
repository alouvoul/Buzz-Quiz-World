/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

/**
 *
 * @author alouvoul
 */
public class Player {
    
    private String name;
    private int score;
    
    public Player(String name) {
        this.name = name;
        score = 0;
    }
    
    public void SetName(String name){
        this.name = name;
    }
    
    public String GetName(){
        return name;
    }
    
    public void SetScore(int score){
        this.score += score;
    }
    
    public int GetScore(){
        return score;
    }
    
    
}

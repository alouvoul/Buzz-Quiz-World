/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

/**
 * Class that declares the bet object 
 * 
 * @author alouvoul
 */
public class Bet extends Round{
    /**
     * Constructor of bet
     */
    public Bet() {
        
    }
    
    /**
     * Calculate the points of user based on the answer that he/she gives
     * @param answer of the user
     * @return the points of the user
     */
    @Override
    public int calculate(boolean answer) {
        int temp;
        if(answer)
            temp = points;
        else
            temp=-points;
        
        return temp;
    }
    
}
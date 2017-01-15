/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

/**
 * Class that declares the bet object. Abstract or add the bet points of the player.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class Bet extends Round{
    /**
     * Constructor of bet.
     */
    public Bet() {
        
    }
    
    /**
     * Calculate and return the points of user based on the answer that they give.
     * @param answer of the user
     * @return the points of the user
     */
    @Override
    public int calculate(boolean answer) {
        int temp;
        if(answer)
            temp = (int)points;
        else
            temp=-(int)points;
        
        return temp;
    }
}

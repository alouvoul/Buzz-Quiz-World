/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

/**
 * Class to implement logic for thermometer roud type game. If the player answers
 * times corect this class called to set the points to the player.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class thermometer extends Round{
    /**
     * Points that every player wins if answer correct.
     */
    public static final int POINTS_BET = 5000;
    
    /**
     * Constructor that initialize the points of the game round.
     */
    public thermometer() {
        points = POINTS_BET;
    }
    
    @Override
    public int calculate(boolean answer) {
        return 5000;
    }
    
}

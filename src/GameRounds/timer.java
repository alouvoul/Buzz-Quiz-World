/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

/**
 * Class - child of class Round, one of the categories of the game, contains
 * the basic functions of this category. Needs the milliseconds that he player 
 * answered the question to calculate the points.
 *
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class timer extends Round{
    /**
     * The value that multiplies miliseconds inorder to calculate the points that
     * a player wins.
     */
    public static final float BET_MULTIPLY = (float) 0.2;
    
    @Override
    public int calculate(boolean answer) {
        if(answer)
            return (int)(BET_MULTIPLY*points);
        return 0;
    }
    
    
}

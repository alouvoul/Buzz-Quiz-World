/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameRounds;

/**
 *
 * @author alouvoul
 */
public class timer extends Round{
    public static final float BET_MULTIPLY = (float) 0.2;
    @Override
    public int calculate(boolean answer) {
        if(answer)
            return (int)(BET_MULTIPLY*points);
        return 0;
    }
    
    
}

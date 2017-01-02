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
public class thermometer extends Round{
    public static final int POINTS_BET = 5000;
    public thermometer() {
        points = POINTS_BET;
    }

    
    @Override
    public int calculate(boolean answer) {
        return 5000;
    }
    
}

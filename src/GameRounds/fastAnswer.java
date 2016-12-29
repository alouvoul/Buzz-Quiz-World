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
public class fastAnswer extends Round{
    private short position;

    public fastAnswer() {
        position = 1;
    }
    
    @Override
    public int calculate(boolean answer) {
        int points = 0;
        if(answer){
            points = 1000;
            position++;
            if(position>=2){
                position = 1;
            }
        }
            
        return points;
    }
    
}

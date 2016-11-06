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
public class Round {
    private Question question;
    int points;
    int round;

    public Round() {
    }

    
    public void setQuestions(Question questions) {
        this.question = questions;
    }
    
    public int getPoints(String answer){
        if(question.getCorrectAnswer().equals(answer)){
            return points;
        }
        
        return 0;
    }
    
    public int calculate(boolean answer){
        if(answer){
            return points;
        }
        return 0;
    }
}

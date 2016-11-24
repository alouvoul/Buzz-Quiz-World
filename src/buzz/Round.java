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
public abstract class Round {
    private Question question;
    int points;
    int round;

    public Round() {
    }

    /**
     * Setter of points
     * @param points 
     */
    public void setPoints(int points) {
        this.points = points;
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
    
    abstract public int calculate(boolean answer);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alouvoul
 */
public class Buzz {
    BuzzApp game;
    
    Scanner sc ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Buzz buzz = new Buzz();
    }


    /**
     * 
     */
    public Buzz() throws IOException {
        sc = new Scanner(System.in);
        game = new BuzzApp();
        PlayerSetup();
        for (int i = 0; i < 6; i++) {
            InitializeGame();
            for (int j = 0; j < 6; j++) {
                HandleGame();
            }
            
        }
        
    }
    
    
    public void HandleGame(){
        
        Question q = game.play();
        System.out.println("##########################################");
        
        String[] temp = q.getAnswers();
        int answer = 0;
        if(game.getType().equals("Bet")){
            System.out.println("How many points would you like to bet 250, 500 ,750 , 1000?");
            int pointsToPoint = sc.nextInt();
            System.out.println(q.getQuestion());
            for (int i = 0; i < BuzzApp.NUMBER_OF_ANSWERS; i++) {
                System.out.println(i+". "+temp[i]);
            }
            answer = sc.nextInt();
            game.playerAnswer(q.getAnswers()[answer], 0, pointsToPoint);


        }
        else if(game.getType().equals("CorrectAnswer")){
            System.out.println(q.getQuestion());
            for (int i = 0; i < BuzzApp.NUMBER_OF_ANSWERS; i++) {
                System.out.println((i)+". "+temp[i]);
            }
            answer = sc.nextInt();
            game.playerAnswer(q.getAnswers()[answer], 0);
        }
        

        System.out.println("Points of "+game.getPlayers()[0].GetName()+" :"+game.getPlayers()[0].GetScore());
    }
    
    
    public void InitializeGame(){
        
        String category = ChooseQuestions();
        game.chooseCategory(category);
        System.out.println("================ Round type =====>"+game.getType()+"<========================================");
        //System.out.println("Type of game is "+game.getType());
        System.out.println("");
        System.out.println("##########################################");
    }
    
    
    public void PlayerSetup(){
        
        Scanner reader = new Scanner(System.in);
        //System.out.println("How many players?");
        int numberOfPlayers = 1;
        String players[] = new String[numberOfPlayers];
        //reader.nextLine();                  //This needs to pick up the new line
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Name of player: "+(i+1));
            players[i] = reader.nextLine();
        }
        game.setPlayers(players);
        //return players;
    }
    
    public String ChooseQuestions(){
        Scanner reader = new Scanner(System.in);
        Random r1 = new Random();
        int playerTurn = r1.nextInt(game.getPlayers().length);
        
        System.out.println(game.getPlayers()[playerTurn].GetName()+" which question would you like in the next round?");
        
        String [] questionCategories = game.getQuestionCategories();
        
        for (int i = 0; i < BuzzApp.NUMBER_OF_CATEGORY_QUESTIONS; i++) {
            System.out.println((i+1)+". "+questionCategories[i]);
        }
        int answer = reader.nextInt();
        while (answer<1 || answer>4) {
            System.out.println("Give a correct answer!");
            answer = reader.nextInt();
        }
        
        return questionCategories[answer-1];
    }
}

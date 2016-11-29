/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


/**
 * Class to create and declare the main objects that we will be used for the game.
 * 
 * @author alouvoul
 */
public class BuzzApp {
    public static final int NUMBER_OF_CATEGORY_QUESTIONS = 4;
    public static final int NUMBER_OF_ANSWERS = 4;
    
    public static final int NUMBER_ROUNDS = 5;
    public static final int QUESTIONS_PER_ROUNDS = 6;
    public static Locale language;
    RandomGenerate r = new RandomGenerate();

    enum RoundEnum{
        CORRECT_ANSWER,
        BET
    }
    
    private Player[] players;
    
    private int currentCategory;
    private ArrayList<QuestionCategory> questions;
    private boolean categoriesUsed[];
    private int roundNumber = 0;
    private Round type;
    private Question tempQuestion;

    /**
     * Constructor of the class, initialize variables that will be used
     * in the game.
     */
    public BuzzApp() throws IOException {
        questions = new ArrayList<>();
        setLocale();
        InitializeQuestions();
        categoriesUsed = new boolean[questions.size()];
    }
   
    /**
     * Choose random question that returned to the ui.
     * 
     * @return random question
     */
    public Question play(){
        Random r = new Random();
        int question = r.nextInt(questions.get(currentCategory).getQuestions().size());
        tempQuestion = questions.get(currentCategory).getQuestions().get(question);
        
        return tempQuestion;
    }
    
    /**
     * Check if player's answer is correct.
     * 
     * @param playerAnswer the answer of the player
     * @param i number of the player
     * @return if answer is correct or not
     */
    public boolean playerAnswer(String playerAnswer, int i){
        boolean flag = false;
        if(playerAnswer.equals(tempQuestion.getCorrectAnswer())){
            flag = true;
        }
        int tempScore = type.calculate(flag);
        players[i].SetScore(tempScore);
        return flag;
    }
    
    /**
     * Check if player's answer is correct and is about bet round.
     * 
     * @param playerAnswer the answer of the player
     * @param i player number in the array
     * @param pointsToBet set how many points to bet
     * @return if answer is correct or not
     */
    public boolean playerAnswer(String playerAnswer, int i, int pointsToBet){
        boolean flag = false;
        int tempScore=-1;
        if(playerAnswer.equals(tempQuestion.getCorrectAnswer())){
            flag = true;
            System.out.println("Debug1");
        }
        type.setPoints(pointsToBet);
        tempScore = type.calculate(flag);
        players[i].SetScore(tempScore);
        return flag;
    }
    
    /**
     * Set values for the new round.
     */
    private void setCurrentRound() {
        Random random = new Random();
        RoundEnum round = RoundEnum.values()[random.nextInt(2)];
        
        /*if(players.length>1){
          //  /=============================================TODO===============================
        }
        else{
            
        }*/
        
        if(round == RoundEnum.CORRECT_ANSWER){
            type = new CorrectAnswer();
        }
        else if(round == RoundEnum.BET)
        {
            type = new Bet();
        }
        
    }
    
    /**
     * Set category question that a random player choose, also sets this
     * category as used to not choose it again in the game.
     * 
     * @param category the category of questions that will be used in the current round. 
     */
    public void chooseCategory(String category){
        int temp;
        for (int i = 0; i < questions.size(); i++) {
            if(questions.get(i).getQuestionCategory().equals(category)){
                currentCategory = i;
                questions.get(i).setUsed(); // sets that the category is used
            }
        }
        setCurrentRound();
    }
    
    /**
     * Return question categories in random order.
     * 
     * @return only 4 question as the real game.
     */
    public String[] getQuestionCategories() {
        // Random r = new Random();
        String[] randomQuestions = new String[BuzzApp.NUMBER_OF_CATEGORY_QUESTIONS]; // Default if 4 categories to choose
        int[] random = r.generateRandoms(0,questions.size());

        try {
        for (int i = 0; i < randomQuestions.length; i++) {
            randomQuestions[i] = questions.get(random[i]).getQuestionCategory();
        }
        } catch(Exception e)
        {System.out.println("OLEOLEOLE");}
        return randomQuestions;
    }
    
    /**
     * Method to initialize questionCategory object with their names, will be used to 
     * choose player from this list.
     */
    private void InitializeQuestions() throws IOException{
        File folder = new File("./questions/"+language.getLanguage());

        System.out.println(" DEBUG InitilizeQuestions method"+ folder.getPath());
        
        if (folder==null) {
            System.out.println("Couldn't find the file!");
            exit(0);
        }
        else{
            File[] listOfFiles = folder.listFiles();
            try {
                for (int i = 0; i < listOfFiles.length; i++) {
                QuestionCategory c = new QuestionCategory(listOfFiles[i].getName());
                if (listOfFiles[i].isDirectory()) {
                    System.out.println("Directory " + listOfFiles[i].getName());
                    
                    c.setQuestionCategory(listOfFiles[i].getName());
                    questions.add(c);
                }
                }
            } catch(Exception e)
            { System.out.println("Initialize Question Problem");
            }
        }        
    }
    
    /**
     * Setter for player names.
     * 
     * @param playerNames Names of the players
     */
    public void setPlayers(String[] playerNames ){

        this.players = new Player[playerNames.length];
        for (int i = 0; i < playerNames.length; i++) {
            this.players[i] = new Player(playerNames[i]);
        }
    }
    
    /**
     * Getter for player names.
     * 
     * @return player names
     */
    public Player[] getPlayers(){
        return players;
    }

    /**
     * Getter for type of game.
     * 
     * @return type Bet or type Correct Answer
     */
    public String getType() {
        
        if (type instanceof Bet)
            return "Bet";
        else if(type instanceof CorrectAnswer)
            return "CorrectAnswer";
        
        return null;
    }
    
    /**
     * Set game language.
     */
    public void setLocale(){
        language = new Locale("el-GR");
    }
   
}

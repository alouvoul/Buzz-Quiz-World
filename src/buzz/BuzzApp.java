/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import GameRounds.Bet;
import GameRounds.CorrectAnswer;
import GameRounds.Round;
import GameRounds.fastAnswer;
import GameRounds.thermometer;
import GameRounds.timer;
import java.io.File;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;


/**
 * Class to create and declare the main objects that we will be used for the game.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class BuzzApp {
    public static final int NUMBER_OF_CATEGORY_QUESTIONS = 4;
    public static final int NUMBER_OF_ANSWERS = 4;
    
    public static final int NUMBER_ROUNDS = 5;
    public static final int QUESTIONS_PER_ROUNDS = 6;
    public static Locale language;
    RandomGenerate r = new RandomGenerate();

    public static final boolean notSupported = false;
    
    enum RoundEnum{
        CORRECT_ANSWER,
        BET,
        TIMER,
        THERMOMETER,
        FAST_ANSWER
    }
    
    private final ArrayList<Player> players;
    private Player currentPlayer;
    private int currentCategory;
    private final ArrayList<QuestionCategory> questions;
    private boolean categoriesUsed[];
    private int roundNumber = 0;
    private Round type;
    private Question tempQuestion;

    /**
     * Constructor of the class, initialize variables that will be used
     * in the game.
     */
    public BuzzApp() throws IOException {
        questions = new ArrayList();
        players = new ArrayList();
    }
   
    /**
     * Choose random question that returned to the ui.
     * 
     * @return random question
     */
    public Question getNextQuestion(){
        Random r = new Random();
        if(Configurations.DEBUG)
            System.out.println("play() prints currentCategorynumber-->"+questions.size());
        int question = r.nextInt(questions.get(currentCategory).getQuestions().size());
        tempQuestion = questions.get(currentCategory).getQuestions().get(question);
        
        return tempQuestion;
    }
    
    /**
     * Check if player's answer is correct.
     * 
     * @param answer
     * @param temp
     * @return if answer is correct or not
     */
    public boolean playerAnswer(boolean answer, int temp){
//        boolean flag = false;
//        if(playerAnswer.equals(tempQuestion.getCorrectAnswer())){
//            flag = true;
//        }
        int tempScore = type.calculate(answer);
        players.get(temp).SetScore(tempScore);
        return answer;
    }
    
    /**
     * Check if player's answer is correct and is about bet round.
     * 
     * @param playerAnswer the answer of the player
     * @param temp
     * @param pointsToBet set how many points to bet
     * @return if answer is correct or not
     */
    public boolean playerAnswer(String playerAnswer, Player temp, int pointsToBet){
        boolean flag = false;
        int tempScore;
        if(playerAnswer.equals(tempQuestion.getCorrectAnswer())){
            flag = true;
            if(Configurations.DEBUG)
                System.out.println("Debug1");
        }
        type.setPoints(pointsToBet);
        tempScore = type.calculate(flag);
        temp.SetScore(tempScore);
        return flag;
    }
    
    /**
     * Set values for the new round.
     */
    private void setCurrentRound() {
        Random random = new Random();
        if(Configurations.DEBUG)
            System.out.println("setCurrentRound()-->");
        if(notSupported){
            System.out.println("setCurrentRound() needs some more CODE!!!");
        }
        int player = getPlayers().size();
        if(Configurations.DEBUG)
            System.out.println("setCurrentRound()-->2");
        RoundEnum round = RoundEnum.values()[random.nextInt(RoundEnum.values().length)];
        
            if(round == RoundEnum.CORRECT_ANSWER){
                type = new CorrectAnswer();
            }
            else if(round == RoundEnum.BET){
                type = new Bet();
            }
            else if(round == RoundEnum.FAST_ANSWER ){
                type = new fastAnswer();
            }
            else if(round == RoundEnum.THERMOMETER && (player > 1)){ // Sets the game if there are 2 players
                type = new thermometer();
            }
            else if (round == RoundEnum.TIMER && (player > 1)) { // Sets the game if there are 2 players
                type = new timer();
            }
            
    }
    
    /**
     * Set category question that a random player choose, also sets this
     * category as used to not choose it again in the game.
     * 
     * @param category the category of questions that will be used in the current round. 
     */
    public void chooseCategory(String category){
        
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
        {
            System.out.println("Problem BuzzApp-->getQuestionCategories");
        }
        return randomQuestions;
    }
    
    /**
     * Method to initialize questionCategory object with their names, will be used to 
     * choose player from this list.
     */
    public void InitializeQuestions() throws IOException{
        File folder = new File(Configurations.pathToCategories);
        if(Configurations.DEBUG)
            System.out.println("InitilizeQuestions() method="+ folder.getPath()+"Language-->"+language.getLanguage());
        
        if (folder==null) {
            System.out.println("Couldn't find the file!");
            exit(0);
        }
        else{
            File[] listOfFiles = folder.listFiles();
            try {
                QuestionCategory c;
                for (int i = 0; i < listOfFiles.length; i++) {
                    c = new QuestionCategory(listOfFiles[i].getName());
                    if (listOfFiles[i].isDirectory()) {
                        questions.add(c);
                    }
                }
            } catch(Exception e){ 
                System.out.println("Initialize Question Problem");
            }
        }        
    }
    
    /**
     * Setter for player names.
     * 
     * @param playerNames Names of the players
     */
    public void setPlayers(String[] playerNames){

        for (int i = 0; i < playerNames.length; i++) {
            Player temp = new Player(playerNames[i]);
            players.add(temp);
            if(Configurations.DEBUG)
                System.out.println("setPlayers-->BuzzApp = "+ playerNames[i]);
            if(Configurations.DEBUG)
                System.out.println("setPlayers()-->"+players.get(i).GetName());
        }
    }
    
    /**
     * Getter for player names.
     * 
     * @return player names
     */
    public ArrayList<Player> getPlayers(){
        
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
        else if(type instanceof fastAnswer)
            return "Fast Answer";
        else if(type instanceof timer)
            return "Timer";
        else if(type instanceof thermometer)
            return "Thermometer";
        return null;
    }
    
    /**
     * Set game language.
     * @param lang
     */
    public void setLocale(String lang){
        language = new Locale(lang);
    }
    
    public void setCurrentPlayer(Player pl){
        currentPlayer = pl;
    }
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
   
}

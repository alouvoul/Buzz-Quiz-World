/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.util.Locale;

/**
 *
 * @author alouvoul
 */
public class Configurations {
    public static final int NUMBER_OF_CATEGORY_QUESTIONS = 4;
    public static final int NUMBER_OF_ANSWERS = 4;
    public static final boolean DEBUG = true;
    
    public static final int NUMBER_ROUNDS = 5;
    public static final int QUESTIONS_PER_ROUNDS = 6;
    public static Locale language;
    
    //Language selection window
    public static String chooseLanguage = "Select your language:";
    
    /*
     *  player selection window   
    */
    public static String playersSum = " How many players?";
    public static String playerError = "You have to choose a name!";
    public static String player1 = "1 player";
    public static String player2 = "2 players";
    public static String scoreMessage = "Scores";
    
    
    /*
     *  Category choose messages  
    */
    public static String categoryChoose = " choose category for next round:";
    
    /*
    **  Bet window messages
    */
    public static String playerTurn = " is your turn to play";
    public static String betMessage = " How many points would you like to bet?";
    
    
    public static String pathToCategories;
    public static String PATH_TO_IMAGES = "./questions/"+"images/";
    
    
            
    public Configurations() {
        
    }
    
    public static void init(){
        if(language.getLanguage().equals("el-gr")){
            playerTurn = " είναι η σειρά σου να παίξεις";
            betMessage = " πόσους πόντους θα ήθελες να στοιχιματίσεις?";
            playersSum = "Πόσοι παίκτες θα παίξουν?";
            player1 = "1 παίκτης";
            player2 = "2 παίκτες";
            categoryChoose = " διάλεξε κατηγρία για τον επόμενο γύρο";
            scoreMessage = "Σκορ";
        }
        pathToCategories = "./questions/"+language.getLanguage();
        
    }
    
    public static void setLanguage(String lang){
        language = new Locale(lang);
    }
    
}

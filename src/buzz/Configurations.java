/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.awt.event.KeyEvent;
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
    
    // Configs for control Settings
    public static String saveButton = "Save";
    public static String answer1Label = "Answer1";
    public static String answer2Label = "Answer2";
    public static String answer3Label = "Answer3";
    public static String answer4Label = "Answer4";
    public static String player1Label = "Player 1";
    public static String player2Label = "Player 2";
    
    public static int p1a1 = KeyEvent.VK_1;
    public static int p1a2 = KeyEvent.VK_2;
    public static int p1a3 = KeyEvent.VK_3;
    public static int p1a4 = KeyEvent.VK_4;
    
    public static int p2a1 = KeyEvent.VK_NUMPAD1;
    public static int p2a2 = KeyEvent.VK_NUMPAD2;
    public static int p2a3 = KeyEvent.VK_NUMPAD3;
    public static int p2a4 = KeyEvent.VK_NUMPAD4;
    // End
    
    //Score configs
    public static String label1 = "One Player game";
    public static String label2 = "Two Players game";
    public static String table1 = "Name";
            
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
            saveButton = "Αποθήκευση";
            answer1Label = "Απάντηση1";
            answer2Label = "Απάντηση2";
            answer3Label = "Απάντηση3";
            answer4Label = "Απάντηση4";
            player1Label = "Παίκτης 1";
            player2Label = "Παίκτης 2";
            label1 = "1 παίκτης";
            label2 = "2 παίκτες";
            table1 = "όνομα";
        }
        pathToCategories = "./questions/"+language.getLanguage();
        
    }
    
    public static void setLanguage(String lang){
        language = new Locale(lang);
    }
    
    
}

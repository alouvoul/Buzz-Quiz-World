/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.awt.event.KeyEvent;
import java.util.Locale;

/**
 * Class that contains all configurations and translatios for easy use from the
 * programmer.
 * 
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 * @since 1.0
 * @version 1.0
 */
public class Configurations {

    /**
     * ****************  Game configuration for round  *************************
     * *************************************************************************
     */
    /**
     * Number of question categories for a player to choose
     */
    public static final int NUMBER_OF_CATEGORY_QUESTIONS = 4;
    /**
     * Number of answer that a question has.
     */
    public static final int NUMBER_OF_ANSWERS = 4;
    /**
     * Used for debugging messages. If true a lot of message will be displayed in
     * terminal.
     */
    public static final boolean DEBUG = false;
    /**
     * Iterations of the round games
     */
    public static final int NUMBER_ROUNDS = 5;
    /**
     * Number of questions that selected from a category
     */
    public static final int QUESTIONS_PER_ROUNDS = 6;
    /**
     * System language
     */
    public static Locale language;
    
    /**
     * Language selection window
     */
    public static String chooseLanguage = "Select your language:";
    
    //******************Translations for GUI************************************
    
    /**
     * ****************  player selection Frame  ******************************* 
     * *************************************************************************
     */
    public static String playersSum = " How many players?";
    /**
     * Message 
     */
    public static String playerError = "You have to choose a name!";
    /**
     * Variable for number choose of players
     */
    public static String player1 = "1 player";
    /**
     * Variable for number choose of players
     */
    public static String player2 = "2 players";
    /**
     * Translation for score button
     */
    public static String scoreMessage = "Scores";
    
    
    /**
     * ****************  Category choose messages ******************************
     * *************************************************************************
     */
    public static String categoryChoose = " choose category for next round:";
    
    
    /**
     * *********************  Bet Frame messages *******************************
     * *************************************************************************
     */
    public static String playerTurn = " is your turn to play";
    /**
     * Message for popup window
     */
    public static String betMessage = " How many points would you like to bet?";
    
    
    /**
     * *********************  Path to files  ***********************************
     * *************************************************************************
     */
    public static String pathToCategories;
    /**
     * Path to image questions
     */
    public static String PATH_TO_IMAGES = "./questions/"+"images/";
    
    /*
        Configs for control Settings
    */
    /**
     * **************  Configs for control Settings  ***************************
     * *************************************************************************
     */
    public static String saveButton = "Save";
    /**
     * Label message
     */
    public static String answer1Label = "Answer1";
    /**
     * Label message
     */
    public static String answer2Label = "Answer2";
    /**
     * Label message
     */
    public static String answer3Label = "Answer3";
    /**
     * Label message
     */
    public static String answer4Label = "Answer4";
    /**
     * Label message for player 1
     */
    public static String player1Label = "Player 1";
    /**
     * Label message for player 2
     */
    public static String player2Label = "Player 2";
    
    /**
     * ***************   Configs for control Settings  *************************
     * *************************************************************************
     */
    /**
     * 1st key for player 1
     */
    public static int p1a1 = KeyEvent.VK_1;
    /**
     * 2nd key for player 1
     */
    public static int p1a2 = KeyEvent.VK_2;
    /**
     * 3rd key for player 1
     */
    public static int p1a3 = KeyEvent.VK_3;
    /**
     * 4th key for player 1
     */
    public static int p1a4 = KeyEvent.VK_4;
    
    /**
     * 1st key for player 2
     */
    public static int p2a1 = KeyEvent.VK_NUMPAD1;
    /**
     * 2nd key for player 2
     */
    public static int p2a2 = KeyEvent.VK_NUMPAD2;
    /**
     * 3rd key for player 3
     */
    public static int p2a3 = KeyEvent.VK_NUMPAD3;
    /**
     * 4th key for player 4
     */
    public static int p2a4 = KeyEvent.VK_NUMPAD4;
    // End
    
    /**
     * *******************   Score Configs   ***********************************
     * *************************************************************************
     */
    public static String label1 = "One Player game";
    /**
     * Message for label
     */
    public static String label2 = "Two Players game";
    /**
     * Message for table
     */
    public static String table1 = "Name";
    
    /**
     * Constructor
     */
    public Configurations() {
        
    }
    
    /**
     * Method that used in the beggining and checks if the language is in greek so has
     * to change translations.
     */
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
    
    /**
     * Initialize the game localization.
     * @param lang 
     */
    public static void setLanguage(String lang){
        language = new Locale(lang);
    }
    
    
}

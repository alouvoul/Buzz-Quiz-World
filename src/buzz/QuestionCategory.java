/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


/**
 * Class for setting the questions of the game and choosing the questions to
 * show to the user.
 * 
 * @author Iordanidis Georgios AEM: 2353
 * @author Louvoulinas Anastasios AEM: 2447
 */
public class QuestionCategory {
    private String questionCategory;
    private ArrayList<Question> questions;
    private boolean used;
    
    /**
     * Constructor of the class,
     * initialize variables that will be used in the game.
     * @param questionCategory Set the category
     * @throws IOException 
     */
    public QuestionCategory(String questionCategory) throws IOException {
        used = false;
        questions = new ArrayList<>();
        this.questionCategory = questionCategory;
        setQuestions();
    }
    
    /**
     * Setter of question category.
     * @param questionCategory Set the category
     */
    public void setQuestionCategory(String questionCategory) {
        this.questionCategory = questionCategory;
    }

    /**
     * Getter of question category.
     * @return The category
     */
    public String getQuestionCategory() {
        return questionCategory;
    }
    /**
     * Sign category as used in order not to read it again.
     */
    public void setUsed() {
        this.used = true;
    }
    
    /**
     * Check category status.
     * @return if used or not
     */
    public boolean getUsed(){
        return used;
    }
    
    /**
     * Find the path and load and show the questions from the text files.
     * @throws IOException 
     */
    public void setQuestions() throws IOException{
        RandomGenerate random = new RandomGenerate();
        File folder = new File("./questions/"+BuzzApp.language.getLanguage()+"/"+questionCategory);
        File[] listOfFiles = folder.listFiles();
        int[] swappedQuestion = random.generateRandoms(0, listOfFiles.length);
        for(int i=0; i<BuzzApp.QUESTIONS_PER_ROUNDS;i++){

            Question tempQuestion = new Question();
            BufferedReader in = new BufferedReader(new FileReader("./questions/"+BuzzApp.language.getLanguage()+"/"+questionCategory+"/"+(swappedQuestion[i]+1)+".txt"));
            String[] line = new String[BuzzApp.NUMBER_OF_ANSWERS+3];
            int j=0;
            line[j] = in.readLine();
            while(line[j] != null)
            {
                //System.out.println(line[j]);
                j++;
                line[j] = in.readLine();
            }
            in.close();
            
            /*
                Set questions and answers for Question object.
            */
            tempQuestion.setQuestion(line[0]);
            String []answerOrder = random.generateRandoms(0, BuzzApp.NUMBER_OF_ANSWERS, Arrays.copyOfRange(line, 1, BuzzApp.NUMBER_OF_ANSWERS+1));
            tempQuestion.setAnswers(answerOrder);
            tempQuestion.setCorrectAnswer(line[5]);
            // if(!line[6].equals(""))
            // tempQuestion.setHasImage(line[6]);

            questions.add(tempQuestion);
        }

    }
   
    /**
     * Getter of questions.
     * @return Arraylist questions
     */
    public ArrayList<Question> getQuestions(){
        return questions;
    }
}

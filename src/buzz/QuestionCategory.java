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
 *
 * @author alouvoul
 */
public class QuestionCategory {
    private String questionCategory;
    private ArrayList<Question> questions;
    private boolean used;
    
    public QuestionCategory(String questionCategory) throws IOException {
        used = false;
        questions = new ArrayList<>();
        this.questionCategory = questionCategory;
        setQuestions();
    }
    
    public void setQuestionCategory(String questionCategory) {
        this.questionCategory = questionCategory;
    }

    public String getQuestionCategory() {
        return questionCategory;
    }

    public void setUsed() {
        this.used = true;
    }
    
    public boolean getUsed(){
        return used;
    }
    
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
                System.out.println(line[j]);
                j++;
                line[j] = in.readLine();
            }
            in.close();
            
            /*
                Set questions and answers for Question object
            */
            tempQuestion.setQuestion(line[0]);
            String []answerOrder = random.generateRandoms(0, BuzzApp.NUMBER_OF_ANSWERS, Arrays.copyOfRange(line, 1, BuzzApp.NUMBER_OF_ANSWERS+1));
            tempQuestion.setAnswers(answerOrder);
            tempQuestion.setCorrectAnswer(line[5]);
            //if(!line[6].equals(""))
            //    tempQuestion.setHasImage(line[6]);

            questions.add(tempQuestion);
        }

    }
   
    public ArrayList<Question> getQuestions(){
        return questions;
    }
}

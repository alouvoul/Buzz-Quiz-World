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
        File folder = new File("./"+BuzzApp.TEMP_LOCALE+"/"+questionCategory);
        
        File[] listOfFiles = folder.listFiles();
        Random random = new Random();
        boolean []used = new boolean[listOfFiles.length];
        int i=0;
        do{
            int next = random.nextInt(listOfFiles.length);
            if(used[next] == false){
                Question tempQuestion = new Question();
                BufferedReader in = new BufferedReader(new FileReader("./"+BuzzApp.TEMP_LOCALE+"/"+questionCategory+"/"+(next+1)+".txt"));
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
                used[next]=true;
                i++;
                tempQuestion.setQuestion(line[0]);
                tempQuestion.setAnswers(Arrays.copyOfRange(line, 1, BuzzApp.NUMBER_OF_ANSWERS+1));
                tempQuestion.setCorrectAnswer(line[5]);
                //if(!line[6].equals(""))
                //    tempQuestion.setHasImage(line[6]);


                //    System.out.println("Couldn't open file with the question "+next);
                
                
                questions.add(tempQuestion);
            }
        }while(i<BuzzApp.QUESTIONS_PER_ROUNDS);

    }
   
    public ArrayList<Question> getQuestions(){
        return questions;
    }
}

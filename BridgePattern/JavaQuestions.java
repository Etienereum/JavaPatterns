import java.util.ArrayList;  
import java.util.List;  

public class JavaQuestions implements Question {
    
    private List <String> questions = new ArrayList<String>();  
    private int current = 0;  
    
    public JavaQuestions(){ 
        questions.add("What is class? ");  
        questions.add("What is interface? ");  
        questions.add("What is abstraction? ");  
        questions.add("How multiple polymorphism is achieved in java? ");  
        questions.add("How many types of exception handling are there in java? ");  
        questions.add("Define the keyword final for variable, method, and class in java? ");  
        questions.add("What is abstract class? ");  
        questions.add("What is multi-threading? ");  
    }
    
    public void nextQuest() {
        if ( current <= questions.size()-1 )  
        current++;  
        System.out.print(current);  
    }
  
    public void prevQuest() {
        if( current > 0 )  
        current--;  
    }  
    
    public void newQuest(String quest) {
        questions.add(quest);  
    }  
    
    public void deleteQuest(String quest) {
        questions.remove(quest);
    }  
    
    public void displayQuest() {
        System.out.println( questions.get(current) );  
    }  
    
    public void displayAllQuest() {  
        for (String quest : questions) {  
        System.out.println(quest);  
        }  
    }  
}
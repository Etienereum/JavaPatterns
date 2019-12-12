public class QuestionManager {
    
    protected Question q;
    public String catalog;
    
    public QuestionManager(String catalog){
        this.catalog = catalog;
    }

    public void nest(){
        q.nextQuest();
    }
    public void prev(){
        q.prevQuest();
    }

    public void newOne(String quest){
       q.newQuest(quest);
    }

    public void delete(String quest){
        q.deleteQuest(quest);
    }

    public void display(){
        q.displayQuest();
    }

    public void displayAll(){
        System.out.println("Question Paper: "  + catalog);
        q.displayAllQuest();
    }


}
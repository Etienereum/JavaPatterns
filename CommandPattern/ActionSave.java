public class ActionSave implements ActionListenerCommand{  
    
    private Document doc;
    
    public ActionSave(Document doc) {
        this.doc = doc;
    }
    
    public void execute() {
        doc.save();
    }  
 }  
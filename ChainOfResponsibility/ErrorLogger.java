public class ErrorLogger extends Logger {  
    
    public ErrorLogger(int levels) {  
        this.levels=levels;  
    } 
    
    protected void displayLogInfo (String msg) {  
        System.out.println("ERROR LOGGER INFO: " + msg);  
    }  
}
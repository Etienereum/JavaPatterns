public class DebugLogger extends Logger {  
    
    public DebugLogger(int levels) {  
        this.levels=levels;  
    }
    
    protected void displayLogInfo(String msg) {  
        System.out.println("DEBUG LOGGER INFO: " + msg);  
    }  
}
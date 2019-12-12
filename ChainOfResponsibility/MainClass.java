public class MainClass {

    private static Logger doChain(){
        
        Logger consoleLogger = new ConsoleLogger(Logger.OUTPUTINFO);

        Logger errorLogger = new ErrorLogger(Logger.ERRORINFO);  
        consoleLogger.setNextLevelLogger(errorLogger);  
            
        Logger debugLogger = new DebugLogger(Logger.DEBUGINFO);  
        errorLogger.setNextLevelLogger(debugLogger);
        
        return consoleLogger;
    }

    public static void main(String [] args) {

        Logger chainLogger= doChain();  

        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
    }
}
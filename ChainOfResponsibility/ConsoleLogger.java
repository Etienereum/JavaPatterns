public class ConsoleLogger extends Logger{

    public ConsoleLogger(int levels){
        this.levels = levels;
    }

    protected void displayLogInfo (String msg){
        System.out.print("CONSOLE LOGGER INFO: " + msg);
    }
}
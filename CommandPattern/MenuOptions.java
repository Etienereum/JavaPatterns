public class MenuOptions{

    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;

    public MenuOptions(ActionListenerCommand a1, ActionListenerCommand a2){
        this.openCommand = a1;
        this.saveCommand = a2;
    }
    
    public void clickOpen(){
        openCommand.execute();
    }

    public void clickSave(){
        saveCommand.execute();
    }

}
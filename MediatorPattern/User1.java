public class User1 extends Participant 
{        
    private String name;  
    private ChatRoom chat;  
      
    @Override  
    public void sendMsg(String msg) {  
    chat.showMsg(msg,this);  
          
    }  
  
    @Override  
    public void setname(String name) {  
        this.name=name;  
    }  
  
    @Override  
    public String getName() {  
        return name;  
    }  
      
    public User1(ChatRoom chat){  
        this.chat=chat;  
    }     
      
}
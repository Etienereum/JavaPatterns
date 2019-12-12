public class MainClass
{
    public static void main(String args[])
    {
        ChatRoom chat = new ChatRoomImpl();
        User1 u1=new User1(chat);
        User2 u2=new User2(chat);

        u1.setname("Ashwani Rajput");
        u1.sendMsg("Hi Ashwani! how are you?");
        
        u2.setname("Soono Jaiswal");
        u2.sendMsg("I am Fine ! You tell?");
    } 
}
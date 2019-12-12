public class ProxyAccess implements InternetAccess{

    private String name;
    private RealAccess realAccess;

    public ProxyAccess(String name){
        this.name = name;
    }

    public void grantAccess(){
        if ( getRole(name) > 4){
            realAccess = new RealAccess(name);
            realAccess.grantAccess();  
        } else {
            System.out.print("No Internet Access granted for you, " + name);
        }
    }

    public int getRole (String name){
        // check from the database to return the persons permission level
        return 3;
    }
}
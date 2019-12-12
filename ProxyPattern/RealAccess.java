public class RealAccess implements InternetAccess{

    private String name;

    public RealAccess(String eName){
        this.name = eName;
    }

    public void grantAccess(){
        System.out.print("Internet Access Granted to " + name);
    }
}
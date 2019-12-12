public class Accountant implements Employee{  
    /* 
    In this class,there are many methods which are not applicable to 
    the Accountant because it is a leaf node. 
    */  
    private int ID;  
    private String name;  
    private double salary;  
    
    public Accountant(int ID,String name,double salary)  {  
        this.ID=ID;  
        this.name = name;  
        this.salary = salary;  
    }  
    
    @Override  
    public void add(Employee employee) {  
       //this is leaf node so this method is not applicable to this class.  
   }  

   @Override  
    public Employee getChild(int i) {  
       //this is leaf node so this method is not applicable to this class.  
       return null;  
    }  
    
    @Override  
    public int getID() { 
        return ID;  
   }  
    
    @Override  
    public String getName() {
        return name;  
    }  
    
    @Override  
    public double getSalary() {  
       return salary;  
    }  

    @Override  
    public void print() {  
        System.out.println("===============================");  
        System.out.println("Accountant Id ="+getID());  
        System.out.println("Accountant Name ="+getName());  
        System.out.println("Accountant Salary ="+getSalary());  
        System.out.println("===============================");  
    }  
    
    @Override  
    public void remove(Employee employee) {  
    }  
}  
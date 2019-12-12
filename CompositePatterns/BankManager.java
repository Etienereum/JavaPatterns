import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;  

public class BankManager implements Employee {  
    
    private int ID;  
    private String name;  
    private double salary;  
  
    public BankManager(int ID,String name,double salary) {
        this.ID=ID;      
        this.name = name;  
        this.salary = salary;  
    }  
    
    List<Employee> employees = new ArrayList<Employee>();  
    
    @Override  
    public void add(Employee employee) {  
        employees.add(employee);  
    }  
    
    @Override  
    public Employee getChild(int i) {  
        return employees.get(i);  
     }  
     
    @Override  
    public void remove(Employee employee) {  
        employees.remove(employee);  
    }    
    
    @Override  
    public int getID()  {  
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
        System.out.println("===================================");  
        System.out.println("BankManager Id = " + getID());  
        System.out.println("BankManager Name = " + getName());  
        System.out.println("BankManager Salary = " + getSalary());  
        System.out.println("===================================");  
        
    Iterator<Employee> it = employees.iterator();  
        
        while(it.hasNext())  {  
            Employee employee = it.next();  
            employee.print();  
        }  
    }  
}
class EmployeeRecordModel implements Prototype{

    private int ID;
    private String name, designation, address;
    private double salary;

    public EmployeeRecordModel(){
        System.out.println(" *** Employee's Records of Orason-Investment *** ");
        System.out.println("-------------------------------------------------");
        System.out.println("Employee ID" + "\t\t" + 
                        "Employee Name" + "\t\t" + 
                        "Employee Designation" + "\t\t" + 
                        "Employee Salary" + "\t\t" + 
                        "Employee Address");
    }
    public EmployeeRecordModel (int ID, String name, String designation, double salary, String address) {  
        //super();
        this.ID = ID;  
        this.name = name;  
        this.designation = designation;  
        this.salary = salary;  
        this.address = address;  
    }

    public void showRecord(){
        System.out.println(ID + "\t\t" + name + "\t\t" + 
                                designation + "\t\t" + salary + "\t\t" + address);
    }

    @Override
    public Prototype getCloneOf(){    
        return new EmployeeRecordModel(ID, name, designation, salary, address);
    }

}
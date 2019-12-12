import java.io.BufferedReader;  
import java.io.InputStreamReader;  

public class BankCustomer extends BankDetails implements CreditCard {
    
    public void giveBankDetails(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("\n");
            System.out.print("  **** WELCOME **** ");
            System.out.print("\n"); 

            System.out.print("Enter the name of the account holder:");
            String customerName=br.readLine();
            System.out.print(" *** NICE *** ");
            System.out.println("\n");
            
            System.out.print("Enter the account number:");  
            long accNum=Long.parseLong(br.readLine());
            System.out.print(" *** OKAY *** ");
            System.out.println("\n");  
      
            System.out.print("Enter the name pf the bank:");  
            String bankName=br.readLine();
            System.out.println("\n\n");  
 
                
            setCustomerName(customerName);  
            setCustomerAcNum(accNum);  
            setBankName(bankName);  
        
        }catch(Exception e){  
                e.printStackTrace();  
        }  
    }

  @Override  
    public String getCreditCard() {  
        
        long accNum = getCustomerAcNum();  
        String accholdername = getCustomerName();  
        String bname = getBankName();  
                
        return ("The Account Number "+accNum+" of "+accholdername+" with " + bname +
                                " bank is valid and authenticated for issuing a credit card. ");  
        }  
}
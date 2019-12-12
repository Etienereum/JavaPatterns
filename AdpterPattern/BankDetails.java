public class BankDetails{
    
    private String bankName;
    private String customerName;
    private long customerAcNum;

    public String getBankName(){
        return bankName;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public long getCustomerAcNum(){
        return customerAcNum;
    }
    public void setCustomerAcNum (long customerAcNum){
        this.customerAcNum = customerAcNum;
    }
}
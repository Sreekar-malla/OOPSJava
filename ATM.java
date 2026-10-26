package OOP;

class Account{
    private double balance;
    private String username;
    private String passkey;
    Account(String username,String passkey,double balance){
        this.username = username;
        this.passkey = passkey;
        this.balance = balance;
    }
    public void CreateAccount(String username,String passkey){
        this.username = username;
        this.passkey = passkey;
    }
    public double getBalance(String username,String passkey){
        if(validate(username,passkey)){
            return balance;
        }
        else{
            System.out.println("Invalid Credentials");
            return 0.0;
        }
    }
    private boolean validate(String username,String passkey){
        return (this.username.equals(username) && this.passkey.equals(passkey));
    }
    public void WithDraw(String username,String passkey,int amount){
        if(validate(username,passkey)){
            System.out.println("Logged In succesfully..");
            if(amount<=balance){
                balance -=amount;
                System.out.println("₹"+amount+" is Debited Successfully");
            }
            else{
                System.out.println("Invalid withdraw amount request");
            }
        }
        else {
            System.out.println("Invlaid Credentials...");
        }
    }
    public void AddBalance(String username,String passkey,int balance){
        if(validate(username,passkey)){
            this.balance+=balance;
            System.out.println("Amount Credited Successfully!...");
        }
        else{
            System.out.println("Invalid Credentials..");
        }
    }
}
public class ATM {
    public static void main(String[] args) {
        Account a = new Account("Sreekar malla","Sreekar123",1000000);
        double n = a.getBalance("Sreekar malla","Sreekar123");
        System.out.println("Account Balance :: "+n);
    }
}

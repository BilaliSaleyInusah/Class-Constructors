public class Bank {

    private String account_number;
    private int balance;
    private String customer_name;
    private String email;
    private String phone;

    public Bank(){
        this("0342ab", 234, "Bilai", "game@gmail.com", "023204143");
        System.out.println("Constrate activated");
    }

    public Bank(String account_number, int balance, String name, String email , String phone){
       System.out.println("Data entered");
        this.account_number = account_number;
        this.balance =balance;
        this.customer_name = name;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("You have successfully deposit " + amount + " into your account");
        System.out.println("You current balance is : " + this.balance);
    }

    public void withdraw(int amount) {
        if (this.balance > amount ) {
            this.balance -= amount;
            System.out.println("You have successfully " + amount + " from your account");
            System.out.println("You current balance is : " + this.balance);
        } else {
            System.out.println("You have insufficient founds");
        }
    }

    public void setAccountNumber(String number){
        this.account_number = number;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.customer_name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String number){
        this.phone = number;
    }

    public String getAccountNumber(){
        return this.account_number;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.customer_name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phone;
    }

    

}

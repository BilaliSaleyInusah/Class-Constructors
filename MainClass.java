public class MainClass {
    public static void main(String[] args) {
        Car posh = new Car();
        posh.setModel("Carrera");
        // System.out.println("Model is : " + posh.getModel());

        // Bank account = new Bank();
        // System.out.println(account.getName());
        // System.out.println(account.getEmail());
        // account.setBalance(20000);
        // account.deposit(2000);
        // account.deposit(2000);
        // account.withdraw(3000);

        VipCustomer vip = new VipCustomer("ali",12);
        System.out.println(vip.getName());
        System.out.println(vip.getCreditLimit());
        System.out.println(vip.getEmailAddress());
    }
}

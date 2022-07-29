public class VipCustomer {
    
    private String name;
    private int creadit_limite;
    private String email_address;

    public VipCustomer(){
        this("Bilal", 1324 , "game13@gmail.com");
        System.out.println("constructor 1");

    };
    public VipCustomer(String name, int creadit_limite){
        this(name , creadit_limite , "game13@gmail.com");
        System.out.println("constructor 2");
        
    }
    public VipCustomer(String name, int creadit_limite, String email_address){
        System.out.println("constructor 3");
        this.name = name ;
        this.creadit_limite = creadit_limite;
        this.email_address = email_address;
    }

    public String getName(){
        return this.name;
    }
    public int getCreditLimit(){
        return this.creadit_limite;
    }
    public String getEmailAddress(){
        return this.email_address;
    }
    

}

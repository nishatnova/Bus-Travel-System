package project2;

public class User extends UserInfo{
    private String name;
   private  String pass;

    public User(String name ,String pass, String phoneNumber, String homeAddress) {
        super(phoneNumber, homeAddress);
        this.name=name;
        this.pass=pass;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public void display() {
        System.out.println("Abstracted");
    }
   
    
    
}

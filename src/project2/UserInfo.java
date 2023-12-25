
package project2;

public abstract class UserInfo {
   private  String phoneNumber;
   private  String homeAddress;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public UserInfo(String phoneNumber, String homeAddress) {
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }
    public abstract void display();
    
    
}

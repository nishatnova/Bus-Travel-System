
package Logininfo;

import java.util.ArrayList;
import project2.User;

public class UserList {
    
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<User> getuserlist(){
    
        userList.add(new User("Nishat","1234","017*****","Mirpur"));
        userList.add(new User("Nahid","2468","017*******","Gulshan"));
        userList.add(new User("Sumi","1357","017******","Farmgate"));
        return userList;
    
    }
    
    
}

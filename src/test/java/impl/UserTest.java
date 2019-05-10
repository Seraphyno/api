package impl;

import api.IUser;
import org.junit.Test;

public class UserTest {
    IUser user = new User();
    
    @Test
    public void getUsername() {
        assert "Dan".equals(user.getUsername());
    }
    
    @Test
    public void getPassword() {
        "101".equals(user.getPassword());
    }
}
package impl;

import java.time.LocalDate;

import api.IUser;

public class User implements IUser {
    private LocalDate dataInscriere;
    
    public LocalDate getDataInscriere() {
        return dataInscriere;
    }
    
    public String getUsername() {
        return "Dan";
    }
    
    public String getPassword() {
        return "101";
    }
}

package myapp.core;

import java.util.UUID;

public class BankAccount {
    private String accountID = UUID.randomUUID().toString().substring(0, 8);
    private String name;

    public BankAccount(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

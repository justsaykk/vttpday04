package myapp.core;

// import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * MapMain
 */
public class MapMain {

    public static void main(String[] args) {

        // Legacy Code
        // BankAccount bobby = new BankAccount("Bobby");
        // BankAccount fred = new BankAccount("Fred");
        // BankAccount mansamusa = new BankAccount("MansaMusa");
        // accts.put(fred.getAccountID(), fred);
        // accts.put(bobby.getAccountID(), bobby);
        // accts.put(mansamusa.getAccountID(), mansamusa);

        // Create a simple map via a for-each loop
        Map<String, BankAccount> accts = new HashMap<>();
        List<String> accountList = new LinkedList<>();
        accountList.add("Bobby");
        accountList.add("Fred");
        accountList.add("MansaMusa");
        for (String el : accountList) {
            BankAccount acct = new BankAccount(el.toLowerCase());
            accts.put(acct.getAccountID(), acct);
        }

        System.out.printf("Number of accounts is %d \n", accts.size());
        // System.out.printf("has bobby: %b \n",
        // accts.containsKey(bobby.getAccountID()));
        // System.out.printf("has fred: %b \n", accts.containsKey(fred.getAccountID()));
        // System.out.printf("has Mansa Musa: %b \n",
        // accts.containsKey(mansamusa.getAccountID()));

        // Extracting keys and values
        Set<String> keySet = accts.keySet();
        // Collection<BankAccount> values = accts.values();

        // Using a "for-each"
        BankAccount acct;
        for (String el : keySet) {
            acct = accts.get(el);
            // System.out.printf("acct = %s \n", acct);
            System.out.printf("Name: %s  Account ID: %s \n", acct.getName(), el);
        }
    }
}

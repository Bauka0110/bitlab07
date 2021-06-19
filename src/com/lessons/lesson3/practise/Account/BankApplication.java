package com.lessons.lesson3.practise.Account;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public void addAccount(Account a) {
        accounts.add(a);
    }
    public void removeAccount(int i) {
        accounts.remove(i);
    }
    public Account getMaxAccount() {
        return getMaxAccount();
    }

    public double getAverageBalance()
    {
        return getAverageBalance();
    }

    public double getTotalBalance() {
        return getTotalBalance();
    }

    public int totalAccounts() {
        return totalAccounts();
    }

    public String getBankData() {
        return getBankData();
    }
}

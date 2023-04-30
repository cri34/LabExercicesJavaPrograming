package com.example;

import java.util.Date;

public class TimeDepositAccount extends Account{
    private final Date maturityDate;
    
    public TimeDepositAccount(double balance, Date maturityDate) {
       super(balance);
        this.maturityDate = maturityDate;
    }
    @Override
    public String toString() {
        return getDescription()+super.toString();
    }

    public boolean withdraw(double amount) {
        Date today = new Date();
        if(today.after(maturityDate)) {
            if(amount <= getBalance()) {
                substractBalance(amount);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    }
    
}
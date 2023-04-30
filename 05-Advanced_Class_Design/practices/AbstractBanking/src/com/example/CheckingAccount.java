package com.example;

public class CheckingAccount extends Account {
    private final double overDraftLimit;
    public CheckingAccount(double balance,double overDraftLimit) {
        super(balance);
        this.overDraftLimit= overDraftLimit;
    }
    public CheckingAccount(double balance) {
        this(balance,0);

    }

    @Override
    public boolean withdraw(double amount) {
            if(amount <= getBalance() + overDraftLimit) {
                substractBalance(amount);
                return true;
            }
                return false;
        }

    @Override
    public String getDescription() {
        return null;
    }
}

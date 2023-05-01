package com.example;

public enum DepositLength {
    three_months(90),
    six_months(180);
    private int days;
    private DepositLength(int days){
        this.days=days;
    }
    public int getDays(){
        return days;
    }
}

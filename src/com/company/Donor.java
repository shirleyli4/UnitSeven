package com.company;

public class Donor {
    private String name="";
    private double amount;

    public Donor(String n, double a){
        name=n;
        amount=a;
    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String ret=name+" "+amount;
        return ret;
    }

}

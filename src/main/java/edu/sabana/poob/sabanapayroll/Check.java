package edu.sabana.poob.sabanapayroll;

import java.time.LocalDate;

public class Check {

    private double amount;
    private LocalDate expirationDate;

    public Check(double amount, LocalDate expirationDate) {
        this.amount = amount;
        this.expirationDate = expirationDate;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}

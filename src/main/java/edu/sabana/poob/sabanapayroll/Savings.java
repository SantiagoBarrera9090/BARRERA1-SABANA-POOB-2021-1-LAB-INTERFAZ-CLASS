package edu.sabana.poob.sabanapayroll;

public class Savings extends BankAccount {
    public final double DEPOSIT_DISCOUNT = 2000;
    public final double ANNUAL_INTEREST_RATE = 0.01;

    @Override
    public double getDepositDiscount() {
        return DEPOSIT_DISCOUNT;
    }
    public double getANNUAL_INTEREST_RATE(){
        return ANNUAL_INTEREST_RATE;
    }

    /**
     * Calcula el porcentaje de intereses y los deposita en la cuenta sin ningun descuento.
     * <br><br>
     * @return el porcentaje depositado en la cuenta.
     */
    public double depositMontlyInterest()
    {
        return 0.01*(getBalance()+DEPOSIT_DISCOUNT);
    }

}

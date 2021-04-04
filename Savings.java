package edu.sabana.poob.sabanapayroll;

public class Savings extends BankAccount {

    public final static double DEPOSIT_DISCOUNT = 2000;
    public final static double ANNUAL_INTEREST_RATE = 0.01;

    @Override
    public double getDepositDiscount() {
        return DEPOSIT_DISCOUNT;
    }

    /**
     * Calcula el porcentaje de intereses y los deposita en la cuenta sin ningñun descuento.
     * <br><br>
     * @return el porcentaje depositado en la cuenta.
     */
    public double depositMontlyInterest(){
        double currentBalance = getBalance();
        double newBalance;
        double montlyInterest = ANNUAL_INTEREST_RATE/12;
        for(int m=0; m<12; m++){
            newBalance = currentBalance*montlyInterest;
            balance += newBalance;
        }

        return balance/currentBalance;
    }

}

package DesignPattern.Adaptor.ExternalBankApi;

public class ICICIBank {
    public double getBalance(long account_no){
        // internal logic to fetch balance of account.
        return Math.random() * 1000000;
    }

    public int withdraw(long account_no){
        // internal logic to withdraw money.
        return (int)Math.random()%2;
    }
}

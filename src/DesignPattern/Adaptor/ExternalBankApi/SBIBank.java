package DesignPattern.Adaptor.ExternalBankApi;

public class SBIBank {
   public double showBalance(long account_no){
        // internal logic to fetch balance of account.
        return Math.random() * 1000000;
    }

    public int withdrawMoney(long account_no){
        // internal logic to withdraw money.
        return (int)Math.random()%2;
    }
}

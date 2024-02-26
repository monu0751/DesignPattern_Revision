package DesignPattern.Adaptor;

import DesignPattern.Adaptor.ExternalBankApi.ICICIBank;

public class ICICIBankAPI implements IBankAdaptor{
    @Override
    public int fetchBalance(long account_no) {
        ICICIBank iciciBank = new ICICIBank();
        int bal = (int) iciciBank.getBalance(account_no);
        return bal;
    }

    @Override
    public boolean withdrawAmount(long account_no) {
        ICICIBank iciciBank = new ICICIBank();
        int res = iciciBank.withdraw(account_no);
        return res==1;
    }


}

package DesignPattern.Adaptor;

import DesignPattern.Adaptor.ExternalBankApi.SBIBank;

public class SBIBankAPI implements IBankAdaptor{
    @Override
    public int fetchBalance(long account_no) {
        SBIBank sbiBank = new SBIBank();
        int bal = (int) sbiBank.showBalance(account_no);
        return bal;
    }

    @Override
    public boolean withdrawAmount(long account_no) {
        SBIBank sbiBank = new SBIBank();
        int res = sbiBank.withdrawMoney(account_no);
        return res==1;
    }
}

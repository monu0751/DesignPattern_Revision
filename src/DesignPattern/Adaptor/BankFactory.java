package DesignPattern.Adaptor;

public class BankFactory {
    public static IBankAdaptor getBank(BankName bankName){
        return switch(bankName){
            case SBI -> new SBIBankAPI();
            case ICICI -> new ICICIBankAPI();
            default -> new SBIBankAPI();
        };
    }
}

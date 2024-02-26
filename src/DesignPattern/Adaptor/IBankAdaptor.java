package DesignPattern.Adaptor;

public interface IBankAdaptor {
    int fetchBalance(long account_no);
    boolean withdrawAmount(long account_no);
}

package DesignPattern.Adaptor;

public class Main {
    public static void main(String[] args) {
        long acc_no = 24279879;
        IBankAdaptor sbi = BankFactory.getBank(BankName.ICICI);

        System.out.println("Fetching balance for "+acc_no+": "+sbi.fetchBalance(acc_no));
        System.out.println("Widraw ammount from "+acc_no+": " + sbi.withdrawAmount(acc_no));

    }
}

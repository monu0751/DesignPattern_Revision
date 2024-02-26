package MachineCoding.Parking.Repository;

import MachineCoding.Parking.Exceptions.BillNotFoundException;
import MachineCoding.Parking.Models.Bill;

import java.util.HashMap;

public class BillRepository {
    private HashMap<Integer, Bill> billHashMap;

    public BillRepository() {
        this.billHashMap = new HashMap<>();
    }

    public Bill get(int id) throws BillNotFoundException {
        Bill bill = billHashMap.get(id);
        if(bill==null){
            throw new BillNotFoundException("Foor "+id+" not found.");
        }
        return bill;
    }

    public Bill put(Bill bill){
        billHashMap.put(bill.getId(),bill);
        return bill;
    }
}

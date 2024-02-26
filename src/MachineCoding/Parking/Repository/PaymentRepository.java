package MachineCoding.Parking.Repository;

import MachineCoding.Parking.Exceptions.PaymentNotFoundException;
import MachineCoding.Parking.Models.Payment;

import java.util.HashMap;

public class PaymentRepository {
    private HashMap<Integer, Payment> paymentHashMap;

    public PaymentRepository() {
        this.paymentHashMap = new HashMap<>();
    }



    public Payment get(int id) throws PaymentNotFoundException {
        Payment payment = paymentHashMap.get(id);
        if(payment==null){
            throw new PaymentNotFoundException("Foor "+id+" not found.");
        }
        return payment;
    }

    public Payment put(Payment payment){
        paymentHashMap.put(payment.getId(),payment);
        return payment;
    }
}

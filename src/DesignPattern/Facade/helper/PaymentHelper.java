package DesignPattern.Facade.helper;

import DesignPattern.Facade.PaymentService;

public class PaymentHelper {
    PaymentService paymentService = new PaymentService();
   public void doPayment(){
        paymentService.doPayment();
        paymentService.generateInvoice();
    }
}

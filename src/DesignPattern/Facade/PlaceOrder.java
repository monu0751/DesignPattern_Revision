package DesignPattern.Facade;

import DesignPattern.Facade.helper.InventoryHelper;
import DesignPattern.Facade.helper.NotificationHelper;
import DesignPattern.Facade.helper.PaymentHelper;
import DesignPattern.Facade.helper.UserHelper;

// Main method to checkout
public class PlaceOrder {
    public static void main(String[] args) {
        UserHelper userHelper = new UserHelper();
        InventoryHelper inventoryHelper = new InventoryHelper();
        PaymentHelper paymentHelper = new PaymentHelper();
        NotificationHelper notificationHelper = new NotificationHelper();

        userHelper.processUser();
        inventoryHelper.processInvetory();
        paymentHelper.doPayment();
        notificationHelper.sendNotification();

    }
}

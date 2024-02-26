package DesignPattern.Facade.helper;

import DesignPattern.Facade.InventoryService;

public class InventoryHelper {
    InventoryService inventoryService = new InventoryService();
   public void processInvetory(){
        inventoryService.checkStock();
        inventoryService.updateStock();
        inventoryService.processOrder();
    }
}

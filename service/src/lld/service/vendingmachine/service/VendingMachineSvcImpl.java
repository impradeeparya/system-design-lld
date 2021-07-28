package lld.service.vendingmachine.service;

import lld.model.vendingmachine.Item;
import lld.service.vendingmachine.constant.StateName;
import lld.service.vendingmachine.context.VendingMachine;
import lld.service.vendingmachine.factory.VendingMachineFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lld.service.vendingmachine.constant.StateMachineConstant.ITEMS;
import static lld.service.vendingmachine.constant.StateMachineConstant.ITEM_LOCATION;
import static lld.service.vendingmachine.constant.StateMachineConstant.ITEM_QUANTITY;

/**
 * @author Pradeep Arya
 */
public class VendingMachineSvcImpl implements VendingMachineSvc {

    private List<List<Item>> items;

    @Override
    public void loadInformation() {

        this.items = new ArrayList<>();
        items.add(Arrays.asList(new Item("snack", 10, 4), new Item("drink", 50, 4), new Item("sweet", 20, 4)));
    }

    @Override
    public void processItem() {
        String itemLocation = "A1";
        int quantity = 3;
        Map<String, Object> data = new HashMap<>();
        data.put(ITEMS, items);
        data.put(ITEM_LOCATION, itemLocation);
        data.put(ITEM_QUANTITY, quantity);
        VendingMachine vendingMachine = VendingMachineFactory.getVendingMachineContext(StateName.SELECTION, data);
        vendingMachine.process();
    }
}

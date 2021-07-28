package lld.service.vendingmachine.state;

import lld.model.vendingmachine.Item;
import lld.service.vendingmachine.constant.StateMachineConstant;
import lld.service.vendingmachine.context.VendingMachine;

import java.util.List;
import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class DispatchState implements VendingMachineState {

    private VendingMachine vendingMachine;

    public DispatchState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void process(Map<String, Object> data) {
        String itemLocation = (String) data.get(StateMachineConstant.ITEM_LOCATION);
        int row = itemLocation.charAt(0) - 65;
        int column = itemLocation.charAt(1) - 48;
        int requestedQuantity = (int) data.get(StateMachineConstant.ITEM_QUANTITY);
        List<List<Item>> items = (List<List<Item>>) data.get(StateMachineConstant.ITEMS);

        Item requestedItem = items.get(row).get(column);
        requestedItem.setQuantity(requestedItem.getQuantity() - requestedQuantity);
        System.out.println("items : " + items);
    }

    @Override
    public void doNext() {

    }
}

package lld.service.vendingmachine.state;

import lld.model.vendingmachine.Item;
import lld.service.vendingmachine.constant.StateMachineConstant;
import lld.service.vendingmachine.constant.StateName;
import lld.service.vendingmachine.context.VendingMachine;
import lld.service.vendingmachine.factory.StateFactory;

import java.util.List;
import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class ItemSelectionState implements VendingMachineState {

    private VendingMachine vendingMachine;

    public ItemSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void process(Map<String, Object> data) {
        String itemLocation = (String) data.get(StateMachineConstant.ITEM_LOCATION);
        int row = itemLocation.charAt(0) - 65;
        int column = itemLocation.charAt(1) - 48;
        int requestedQuantity = (int) data.get(StateMachineConstant.ITEM_QUANTITY);
        List<List<Item>> items = (List<List<Item>>) data.get(StateMachineConstant.ITEMS);

        Item requestItem = items.get(row).get(column);

        if (requestItem.getQuantity() < requestedQuantity) {
            System.out.println("quantity not available");
        }
        System.out.println("items : " + items);
    }

    @Override
    public void doNext() {
        vendingMachine.setState(StateFactory.getState(StateName.PAYMENT, vendingMachine));
        vendingMachine.process();
    }
}

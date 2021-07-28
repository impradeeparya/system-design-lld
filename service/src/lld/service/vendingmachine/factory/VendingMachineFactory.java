package lld.service.vendingmachine.factory;

import lld.service.vendingmachine.constant.StateName;
import lld.service.vendingmachine.context.VendingMachine;
import lld.service.vendingmachine.context.VendingMachineContext;
import lld.service.vendingmachine.state.VendingMachineState;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class VendingMachineFactory {

    private static VendingMachine vendingMachine = new VendingMachineContext();

    public static VendingMachine getVendingMachineContext(StateName stateName, Map<String, Object> data) {

        vendingMachine.loadData(data);
        VendingMachineState vendingMachineState = StateFactory.getState(stateName, vendingMachine);
        vendingMachine.setState(vendingMachineState);
        return vendingMachine;
    }

}

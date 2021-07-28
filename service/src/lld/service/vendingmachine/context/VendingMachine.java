package lld.service.vendingmachine.context;

import lld.service.vendingmachine.state.VendingMachineState;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public interface VendingMachine {

    void process();

    void setState(VendingMachineState vendingMachineState);

    void loadData(Map<String, Object> data);
}

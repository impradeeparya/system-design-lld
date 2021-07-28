package lld.service.vendingmachine.context;

import lld.service.vendingmachine.state.VendingMachineState;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class VendingMachineContext implements VendingMachine {

    private VendingMachineState currentState;
    private Map<String, Object> data;

    @Override
    public void process() {
        currentState.start(data);
    }

    @Override
    public void setState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    @Override
    public void loadData(Map<String, Object> data) {
        this.data = data;
    }
}

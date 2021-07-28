package lld.service.vendingmachine.state;

import lld.service.vendingmachine.constant.StateName;
import lld.service.vendingmachine.context.VendingMachine;
import lld.service.vendingmachine.factory.StateFactory;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public class PaymentState implements VendingMachineState {

    private VendingMachine vendingMachine;

    public PaymentState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void process(Map<String, Object> data) {
        System.out.println("processing payment");
    }

    @Override
    public void doNext() {
        vendingMachine.setState(StateFactory.getState(StateName.DISPATCH, vendingMachine));
        vendingMachine.process();
    }
}

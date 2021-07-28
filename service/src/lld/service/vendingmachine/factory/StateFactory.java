package lld.service.vendingmachine.factory;

import lld.service.vendingmachine.constant.StateName;
import lld.service.vendingmachine.context.VendingMachine;
import lld.service.vendingmachine.state.DispatchState;
import lld.service.vendingmachine.state.ItemSelectionState;
import lld.service.vendingmachine.state.PaymentState;
import lld.service.vendingmachine.state.VendingMachineState;

/**
 * @author Pradeep Arya
 */
public class StateFactory {

    private static VendingMachineState itemSelectionState = null;
    private static VendingMachineState paymentState = null;
    private static VendingMachineState dispatchState = null;

    public static VendingMachineState getState(StateName stateName, VendingMachine vendingMachine) {
        VendingMachineState vendingMachineState = null;
        switch (stateName) {
            case SELECTION:
                itemSelectionState = itemSelectionState == null ? new ItemSelectionState(vendingMachine) : itemSelectionState;
                vendingMachineState = itemSelectionState;
                break;
            case PAYMENT:
                paymentState = paymentState == null ? new PaymentState(vendingMachine) : paymentState;
                vendingMachineState = paymentState;
                break;
            case DISPATCH:
                dispatchState = dispatchState == null ? new DispatchState(vendingMachine) : dispatchState;
                vendingMachineState = dispatchState;
                break;
        }
        return vendingMachineState;
    }
}

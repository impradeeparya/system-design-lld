package lld.runner.vendingmachine;

import lld.service.vendingmachine.service.VendingMachineSvc;
import lld.service.vendingmachine.service.VendingMachineSvcImpl;

/**
 * @author Pradeep Arya
 */
public class VendingMachineRunner {
    public static void main(String[] args) {

        VendingMachineSvc vendingMachineSvc = new VendingMachineSvcImpl();
        vendingMachineSvc.loadInformation();
        vendingMachineSvc.processItem();
    }
}

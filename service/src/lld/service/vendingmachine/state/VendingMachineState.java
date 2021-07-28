package lld.service.vendingmachine.state;

import java.util.Map;

/**
 * @author Pradeep Arya
 */
public interface VendingMachineState {

    default void start(Map<String, Object> data) {
        process(data);
        doNext();
    }

    void process(Map<String, Object> data);

    void doNext();
}

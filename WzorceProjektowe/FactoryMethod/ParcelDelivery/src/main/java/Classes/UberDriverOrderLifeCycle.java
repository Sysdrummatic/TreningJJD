package Classes;

import Interfaces.DeliveryService;

public class UberDriverOrderLifeCycle extends OrderLifecycle{

    @Override
    protected DeliveryService deliveryService() {
        return new UberDriver();
    }
}

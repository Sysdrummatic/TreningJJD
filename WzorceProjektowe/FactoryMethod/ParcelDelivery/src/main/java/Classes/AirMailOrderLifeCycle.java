package Classes;

import Interfaces.DeliveryService;

public class AirMailOrderLifeCycle extends OrderLifecycle{
    @Override
    protected DeliveryService deliveryService() {
        return new AirMail();
    }
}

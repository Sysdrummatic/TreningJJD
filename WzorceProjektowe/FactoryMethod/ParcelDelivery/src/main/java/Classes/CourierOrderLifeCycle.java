package Classes;

import Interfaces.DeliveryService;

public class CourierOrderLifeCycle extends OrderLifecycle{

    @Override
    protected DeliveryService deliveryService(){
        return new Courier();
    }
}
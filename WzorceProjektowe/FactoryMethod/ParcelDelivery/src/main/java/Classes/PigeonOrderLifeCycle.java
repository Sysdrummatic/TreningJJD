package Classes;

import Interfaces.DeliveryService;

public class PigeonOrderLifeCycle extends OrderLifecycle{

    @Override
    protected DeliveryService deliveryService(){
        return new Pigeon();
    }
}
package Classes;

import Interfaces.DeliveryService;

public class UberDriver implements DeliveryService {

    @Override
    public void delivery(Parcel parcel) {
        System.out.printf("Parcel %s was delivered by UberDriver%n", parcel);
    }
}

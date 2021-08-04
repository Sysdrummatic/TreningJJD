package Classes;

import Interfaces.DeliveryService;

public class Pigeon implements DeliveryService {
    @Override
    public void delivery(Parcel parcel) {
        System.out.printf("Parcel %s was delivered by Pigeon%n", parcel);

    }
}

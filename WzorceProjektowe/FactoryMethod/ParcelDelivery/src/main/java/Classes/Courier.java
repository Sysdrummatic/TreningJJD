package Classes;

import Interfaces.DeliveryService;

public class Courier implements DeliveryService {
    @Override
    public void delivery(Parcel parcel) {
        System.out.printf("Parcel %s was delivered by Courier%n", parcel);
    }
}

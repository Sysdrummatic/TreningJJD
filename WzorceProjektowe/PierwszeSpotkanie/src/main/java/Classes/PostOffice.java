package Classes;

import Interfaces.DeliveryService;

public class PostOffice implements DeliveryService {

    @Override
    public void delivery(Parcel parcel) {
        System.out.printf("Parcel %s was delivered by PostOffice%n", parcel);
    }
}

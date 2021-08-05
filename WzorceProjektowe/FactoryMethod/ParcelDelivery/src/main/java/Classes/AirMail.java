package Classes;

import Interfaces.DeliveryService;

public class AirMail implements DeliveryService {
    @Override
    public void delivery(Parcel parcel) {
        System.out.printf("Parcel %s was delivered by AirMail%n", parcel);
    }
}

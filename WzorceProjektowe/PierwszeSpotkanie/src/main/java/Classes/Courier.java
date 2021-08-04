package Classes;

import Interfaces.DeliveryService;

public class Courier implements DeliveryService {
    @Override
    public void delivery(Parcel parcel) {
        System.out.println(String.format("Parcel %s was delivered by Courier", parcel));
    }
}

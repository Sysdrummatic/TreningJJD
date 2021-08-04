package Classes;

import Interfaces.DeliveryService;

public class PostOffice implements DeliveryService {

    @Override
    public void delivery(Parcel parcel) {
        System.out.println(String.format("Parcel %s was delivered by PostOffice", parcel));
    }
}

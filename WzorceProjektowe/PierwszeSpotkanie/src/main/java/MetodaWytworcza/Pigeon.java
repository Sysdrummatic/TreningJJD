package MetodaWytworcza;

public class Pigeon implements DeliveryService{
    @Override
    public void delivery(Parcel parcel) {
        System.out.println(String.format("Parcel %s was delivered by Pigeon", parcel));

    }
}

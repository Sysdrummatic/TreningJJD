package MetodaWytworcza;

public class OrderLifecycle {
    public void processOrder(String orderId){
        Parcel parcel = prepareParcel(orderId);
        DeliveryService deliveryService = deliveryService();
        deliveryService.delivery(parcel);
    }

    protected DeliveryService deliveryService(){
        return new PostOffice();
    }

    private Parcel prepareParcel(String orderId){
        Parcel parcel = new Parcel(orderId);
        System.out.println(String.format("Parcel %s was delivered by Pigeon", parcel));
        return parcel;
    }
}

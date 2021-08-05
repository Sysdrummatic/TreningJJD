package Classes;

public class Parcel {

    private String orderId;

    public Parcel(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString(){
        return String.format("[sampro:%s]", orderId);
    }
}


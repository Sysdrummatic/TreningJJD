import Classes.*;

public class Main {

    public static void main(String[] args) {


        OrderLifecycle postOfficeOrder = new OrderLifecycle();
        PigeonOrderLifeCycle pigeonOrder = new PigeonOrderLifeCycle();
        CourierOrderLifeCycle courierOrder = new CourierOrderLifeCycle();
        UberDriverOrderLifeCycle uberDriverOrder = new UberDriverOrderLifeCycle();
        AirMailOrderLifeCycle airMailOrder = new AirMailOrderLifeCycle();

        postOfficeOrder.processOrder("Order_1");
        pigeonOrder.processOrder("Order_2");
        courierOrder.processOrder("Order_3");
        uberDriverOrder.processOrder("Order_4");
        airMailOrder.processOrder("Order_5");

    }

}

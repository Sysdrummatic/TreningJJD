import Classes.CourierOrderLifeCycle;
import Classes.OrderLifecycle;
import Classes.PigeonOrderLifeCycle;
import Classes.UberDriverOrderLifeCycle;

public class Main {

    public static void main(String[] args) {


        OrderLifecycle postOfficeOrder = new OrderLifecycle();
        PigeonOrderLifeCycle pigeonOrder = new PigeonOrderLifeCycle();
        CourierOrderLifeCycle courierOrder = new CourierOrderLifeCycle();
        UberDriverOrderLifeCycle uberDriverOrder = new UberDriverOrderLifeCycle();

        postOfficeOrder.processOrder("Order_1");
        pigeonOrder.processOrder("Order_2");
        courierOrder.processOrder("Order_3");
        uberDriverOrder.processOrder("Order_4");

    }

}

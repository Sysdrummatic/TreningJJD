import Classes.Courier;
import Classes.CourierOrderLifeCycle;
import Classes.OrderLifecycle;
import Classes.PigeonOrderLifeCycle;

public class Main {

    public static void main(String[] args) {


        OrderLifecycle postOfficeOrder = new OrderLifecycle();
        PigeonOrderLifeCycle pigeonOrder = new PigeonOrderLifeCycle();
        CourierOrderLifeCycle courierOrder = new CourierOrderLifeCycle();

        postOfficeOrder.processOrder("Order_1");
        pigeonOrder.processOrder("Order_2");
        courierOrder.processOrder("Order_3");

    }

}

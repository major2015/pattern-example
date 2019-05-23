package com.iblog.pattern.observe;

public class MockTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.id = "1";
        order.status = Order.Status.RECEIVED;

        OrderUpdateManager manager = new OrderUpdateManager();
        Observer observer1 = new PaymentNotifyObserver();
        Observer observer2 = new PaidFinalsObserver();
        Observer observer3 = new ReceivedPaymentObserver();
        Observer observer4 = new DeliveredObserver();
        manager.register(observer1);
        manager.register(observer2);
        manager.register(observer3);
        manager.register(observer4);

        order.status = Order.Status.AWAIT_PAYMENT;
        manager.receivedOrder(order);
        order.status = Order.Status.PAYMENT_RECEIVED;
        manager.awaitPaidOrder(order);
        order.status = Order.Status.PROCESSING;
        manager.paidOrder(order);
        order.status = Order.Status.DELIVERED;
        manager.delivered(order);
    }
}

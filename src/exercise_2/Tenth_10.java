package exercise_2;

import java.util.Queue;

public class Tenth_10
{
        public static void main(String[] args) {

        }
}

    class Customer
    {
        private String name;
        private int orderId;
        private double payment;
    }

    class Cashier
    {
        private Queue<Integer> orderQueue;
        private double payemnt;

        void insertInOrderQueue(int orderId)
        {
            orderQueue.add(orderId);
        }
    }

    class Barista  {
        Queue<Integer> completeOrder;
        int currentOrder = completeOrder.peek();

        void sendNotification(int currentOrder) {
            System.out.println("Order is completed");

        }

    }






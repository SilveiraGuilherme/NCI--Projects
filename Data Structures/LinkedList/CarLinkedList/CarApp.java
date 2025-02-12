public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("19-D-21", "Keith Maycock", "The car only had 3 wheels");
        Car car2 = new Car("19-D-22", "Jane Maycock", "The car is broken");
        Car car3 = new Car("19-D-23", "Jhon Maycock", "The car does not have seats");
        Car car4 = new Car("19-D-24", "Kassia Maycock", "The car is ugly");
        Car car5 = new Car("19-D-25", "Billy Maycock", "The car is noisy");

        car1.setStatus(true);
        car3.setStatus(true);

        car1.setPrice(3000);
        car2.setPrice(546);
        car4.setPrice(2650);
        car5.setPrice(300);
        car3.setPrice(1000);

        CarLinkedList carList = new CarLinkedList();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        System.out.println(carList);

        carList.remove("19-D-21");
        System.out.println(carList);

        int numReady = carList.readySize();
        String notReady = carList.currentProblems();
        double avgCost = carList.getAverage();

        System.out.println(numReady);
        System.out.println(notReady);
        System.out.println(avgCost);

        // System.out.println(car1.regist);
        // System.out.println(car2.regist);
        // System.out.println(car3.regist);
        // System.out.println(car4.regist);
        // System.out.println(car5.regist);
    }
}

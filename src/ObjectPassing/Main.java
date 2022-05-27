package ObjectPassing;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car1 = new Car("Blue", "BMW");
        Car car2 = new Car("Red", "Mercedese");

        garage.park(car1);
        garage.park(car2);


    }
}

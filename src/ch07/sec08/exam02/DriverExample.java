package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Taxi v1 = new Taxi();
        Bus v2 = new Bus();
        Vehicle v3 = new Vehicle();

        Driver driver = new Driver();
        driver.drive(v1);
        driver.drive(v2);
        driver.drive(v3);

    }
}

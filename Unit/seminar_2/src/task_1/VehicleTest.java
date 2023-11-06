package GB.Unit.seminar_2.src.task_1;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("Volvo", "X5", 2020);
        motorcycle = new Motorcycle("Mercedes", "A1", 2018);
    }

    // Car является экземпляром Vehicle
    
    @Test
    public void testCarExtendVehicle() {
        boolean result = car instanceof Vehicle;

        assertTrue(result);

    }

    // Car создается с 4 колесами

    @Test
    public void CarNumWheels() {
        assertEquals(4, car.getNumWheels());

    }

    // Motorcycle создается с 2 колесами

    @Test
    public void MotorcycleNumWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    // Car развивает скорость 60 в режиме тестового вождения

    @Test
    public void CarTestDrive() {
        car.testDrive();

        assertEquals(60, car.getSpeed());
    }

    // Motorcycle развивает скорость 60 в режиме тестового вождения

    @Test
    public void MotorcycleTestDrive() {
        motorcycle.testDrive();

        assertEquals(75, motorcycle.getSpeed());
    }

    // В режиме парковки машина останавливается

    @Test
    public void CarTestDrivePark() {
        car.testDrive();
        car.park();

        assertEquals(0, car.getSpeed());
    }

    // В режиме парковки мотоцикл останавливается

    @Test
    public void MotorcycleTestDrivePark() {
        motorcycle.testDrive();
        motorcycle.park();

        assertEquals(0, motorcycle.getSpeed());
    }
}

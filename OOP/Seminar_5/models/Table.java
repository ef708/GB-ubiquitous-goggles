import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter = 100;

    private final Collection<Reservation> reservations = new ArrayList<>();
    private final int num;

    {
        num = ++counter;
    }

    public int getNum() {
        return num;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public Reservation getReservation(int reservationId) {
        for (Reservation reservation : reservations) {
            if (reservationId == reservation.getId()) {
                return reservation;
            }
        }
        System.out.println("Бронь не найдена");
        return null;
    }

    @Override
    public String toString() {
        return String.format("Стол №%d", num);
    }
}
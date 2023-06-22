import GB.OOP.Seminar_5.models.Table;
import GB.OOP.Seminar_5.presenters.View;
import GB.OOP.Seminar_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void updateTablesView(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void updateReservationTableResult(int reservationNum) {
        System.out.printf("Стол забронирован. Номер брони: %d\n", reservationNum);
    }

    public void newUpdateReservation() {
        System.out.println("Бронь изменена");
    }
    public void reservationTableEvent(Date reservationDate, int tableNo, String name) {
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}
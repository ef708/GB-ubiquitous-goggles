import GB.OOP.Seminar_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNum() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    public int onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {

        for (Table table : tables) {
            Reservation tempReservation = null;
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    tempReservation = reservation;
                }
            }
            if (tempReservation != null) {
                table.getReservations().remove(tempReservation);
            }
        }

        return reservationTable(reservationDate, tableNo, name);
    }
}
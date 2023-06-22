import GB.OOP.Seminar_5.models.TableModel;
import GB.OOP.Seminar_5.presenters.BookingPresenter;
import GB.OOP.Seminar_5.views.BookingView;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 13, "Виктор");

        bookingView.onChangeReservationTable(77, new Date(), 7, "Петр");
    }
}
package GB.Architecture.pt4;

public class Customer {
    int id;
    CashProvider cash;
    Ticket tickets[] = new Ticket[0];
    TransactionsDB db = new TransactionsDB();

    boolean buyTicket(Ticket ticket) {
        db.AddTransaction();
        return true;
    }

    boolean returnTicket(Ticket ticket) {
        db.RemoveTransaction();
        return false;
    }

    void searchTicket(int dateTime, int rootNumber) {
        Ticket ticket[] = new Ticket[0];
    };

}

/**
 * Created by matth on 10/28/2016.
 */
public class StudentAdvanceTicket extends AdvanceTicket {

    // Constructor accepts number, orgPrice, & days, calls parent constructor, then setPrice
    public StudentAdvanceTicket(int number, double orgPrice, int days) {
        super(number, orgPrice, days);
        setPrice();
    }

    // Constructor accepts number and days, calling parent constructor, then setPrice
    public StudentAdvanceTicket(int number, int days) {
        super(number, 50, days);
        setPrice();
    }

    // setPrice sets the price to half of what it was
    public void setPrice(){
        price = price * 0.5;
    }

    // Overrides parent toString, adding ticket type, number, price, and adding ID required
    @Override
    public String toString() {
        return "Ticket Type: Student Advanced, Number: " + number + ", Price: " + price + " (ID required)";
    }
}

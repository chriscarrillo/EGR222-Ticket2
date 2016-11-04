/**
 * Created by Christopher on 10/27/16.
 */
public class WalkupTicket extends Ticket {
    // Constructor takes int number and calls the parent constructor with number
    public WalkupTicket(int number) {
        super(number);
    }

    // Constructor takes int number & double orgPrice, then calls parent constructor with those parameters
    public WalkupTicket(int number, double orgPrice) {
        super(number, orgPrice);
    }

    // Overrides the parent toString, returns ticket type and calls parent toString
    @Override
    public String toString() {
        return "Ticket Type: Walk-up, Number: " + number + ", Price: " + price;

    }
}

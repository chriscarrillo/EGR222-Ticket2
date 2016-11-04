/**
 * Created by Christopher on 10/28/16.
 */
public class AdvanceTicket extends Ticket {

    // Protected setPrice method accepts days and sets price accordingly (40% or 20% discount)
    protected void setPrice(int days){
        if(days >= 10) {
            price = 0.6 * price;
        } else {
            price = 0.8 * price;
        }
    }

    // Constructor accepts number, orgPrice, & days, then calls parent constructor, then sets price
    public AdvanceTicket(int number, double orgPrice, int days) {
        super(number, orgPrice);
        setPrice(days);
    }

    // Constructor accepts number & days, then calls constructor, passing number, 50, and days
    public AdvanceTicket(int number, int days) {
        this(number, 50, days);
    }

    // Overrides parent toString, changing the ticket type, then calling parent toString
    @Override
    public String toString() {
        return "Ticket Type: Advanced, Number: " + number + ", Price: " + price;
    }
}

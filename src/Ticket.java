/**
 * Created by Christopher on 10/26/16.
 */
public abstract class Ticket {
    // Protected number and price variables
    protected int number;
    protected double price;

    // Constructor accepts number, calling other constructor with number and price
    public Ticket(int number){
        this(number, 50);
    }

    // Constructor accepts number and price, then sets number and price to the number and price
    public Ticket(int number, double price) {
        this.number = number;
        this.price = price;
    }

    // Default constructor sets number and price to -1
    public Ticket() {
        this.number = -1;
        this.price = -1;
    }

    // getNumber returns the ticket number
    public int getNumber(){
        return number;
    }

    // getPrice returns the ticket price
    public double getPrice(){
        return price;
    }

    // toString displays the ticket number and price
    public abstract String toString();
}

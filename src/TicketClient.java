public class TicketClient {
    public static void main(String[] args){
        double originalPrice = 50;

        // 3 Cases for WalkupTicket
        Ticket two = new WalkupTicket(4);
        System.out.println(two);

        Ticket twoTwo = new WalkupTicket(5);
        System.out.println(twoTwo);

        Ticket twoThree = new WalkupTicket(6);
        System.out.println(twoThree);

        // 3 Cases for AdvanceTicket
        Ticket three = new AdvanceTicket(7, originalPrice, 24);
        System.out.println(three);

        Ticket threeTwo = new AdvanceTicket(8, originalPrice, 20);
        System.out.println(threeTwo);

        Ticket threeThree = new AdvanceTicket(9, originalPrice, 7);
        System.out.println(threeThree);

        // 3 Cases for StudentAdvanceTicket
        Ticket four = new StudentAdvanceTicket(10, originalPrice, 24);
        System.out.println(four);

        Ticket fourTwo = new StudentAdvanceTicket(11, originalPrice, 20);
        System.out.println(fourTwo);

        Ticket fourThree = new StudentAdvanceTicket(12, originalPrice, 7);
        System.out.println(fourThree);
    }
}
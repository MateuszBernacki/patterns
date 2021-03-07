package visitor;

public class Turist implements Visitor{
        int account = 100_000;
    @Override
    public void visit(Museum museum) {
        final int price = 1000;
        museum.buyTicket(price);
        account-=price;
        museum.exhibitOne();
        museum.exhibitTwo();
    }

    @Override
    public void visit(Taxi taxi) {

    }
}

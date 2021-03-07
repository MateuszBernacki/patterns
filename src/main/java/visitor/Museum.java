package visitor;

public class Museum implements Visited{
    int amount;
    int countOne;
    int countTwo;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void buyTicket ( int price){
        amount+=price;
    }

    public void exhibitOne (){
        countOne+=1;
        System.out.println("you visit exhibit one");
    }

    public void exhibitTwo (){
        countTwo+=1;
        System.out.println("you visit exhibit two");
    }

    public int getAmount() {
        return amount;
    }
}

package visitor;

public class Child implements Visitor{

    @Override
    public void visit(Museum museum) {
        museum.exhibitOne();
    }

    @Override
    public void visit(Taxi taxi) {
    }
}

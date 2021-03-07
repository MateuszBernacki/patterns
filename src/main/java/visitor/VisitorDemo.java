package visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Museum  museum = new Museum();
        Turist turist = new Turist();
        Child child = new Child();
        museum.accept(turist);
        museum.accept(child);
        System.out.println(museum.getAmount());
    }
}

package solid.o;

public class OpenCirclePrincipleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Drowing drowing = new Drowing();
        drowing.add(r);
        drowing.add(c);
        drowing.add(new Section());
        OpenCloseDrowing  superDrawing = new OpenCloseDrowing();
        superDrawing.add(r);
        superDrawing.add(c);
        superDrawing.add(new Section());

    }


}

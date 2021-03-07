package solid.o;

import java.util.ArrayList;
import java.util.List;

public class Drowing  {

    List<Shape> shapes = new ArrayList<>();
    public void add(Shape shape){
        shapes.add(shape);
    }

    public void draw(Section section) {
        for (Shape shape: shapes){
            if (shape instanceof Rectangle){
                Rectangle r = (Rectangle) shape;
                System.out.println("Ryszuje prostokat o bokach: "+ r.getSideA() + r.getSideB()) ;
            }
            if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                System.out.println("Rysuje koło: " + circle);
            }
        }
    }


}

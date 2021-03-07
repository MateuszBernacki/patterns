package solid.o;

import java.util.Iterator;

public class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("rysuje prostokat");
    }
    public int getSideA(){
        return 5;
    }
    public int getSideB(){
        return 6;
    }
}

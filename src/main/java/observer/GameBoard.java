package observer;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Subject<String>{
    List<Observer<String>> observers=new ArrayList<>();
    public void makeMove(int x, int y){
        notifyAllObservers("X: " + x + " Y: "+ y);
    }
    @Override
    public void addObserver(Observer<String> observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObservers(String message) {
        observers.stream().forEach(o->o.update(message));
    }
}

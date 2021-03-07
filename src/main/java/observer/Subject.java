package observer;

public interface Subject<T>{
    void addObserver(Observer<T> observer);
    void notifyAllObservers(T message);
}

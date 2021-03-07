package observer;

public class Player implements Observer<String>{
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("player "+name+"-- wykonal ruch "+ message);
    }
}

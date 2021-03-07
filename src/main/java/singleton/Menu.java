package singleton;

public enum Menu {
    INSTANCE;
    public static Menu getInstance() {
        return INSTANCE;
    }
    public void print(){
        System.out.println("1.opcja 1");
        System.out.println("2.opcja 2");
        System.out.println("0.Wyjscie ");
    }
}

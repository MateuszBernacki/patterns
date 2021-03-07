package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Message textMessage = new TextMessage("Hello");
        System.out.println(textMessage.content());
        textMessage = new CenteredMessage(textMessage,80);
        //TODO zdefinjowac dekorator dodajac gwiazdki pdzed i za napisem content
        System.out.println(textMessage.content());
        System.out.println(((CenteredMessage)textMessage).getWidth());
    }
}

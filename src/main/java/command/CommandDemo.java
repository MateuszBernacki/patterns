package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandDemo {
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        commands.add(new PrintMessage(() ->"Podaj dwie liczby"));
        commands.add(new PrintMessage(() ->"Podaj pierwszy bok: "));
        ReadDouble readSideA = new ReadDouble(scanner);
        commands.add(readSideA);
        commands.add(new PrintMessage(() ->"Podaj drugi bok: "));
        ReadDouble readSideB = new ReadDouble(scanner);
        commands.add(readSideB);
        CalculateRectangleArea area =new  CalculateRectangleArea(readSideA,readSideB);
        commands.add(area);
        commands.add(new PrintMessage(() ->"pole prostokąta = " + area.getArea()));
        for (Command command : commands) {
            command.execiute();
        }
    }
}

package solid.s;

public class SolidPrincipleDemo {
    public static void main(String[] args) {
        //Klasa nie spelnia zasady bo metoda getUserName() zajmuje sie szczegułami budowy maila
        Employee employee = new Employee("ADAM", "nowak", "adam@op.pl");
        System.out.println(employee.getUserName());
        SolidEmployee solidEmployee = new SolidEmployee("ADAM",
                "nowak",
                new EmailAddress("adam@op.pl")
        );
        EmailAddress address = solidEmployee.getEmail();
    }
}

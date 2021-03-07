package builder;

import java.time.LocalDate;

public class BuilderDemo {
    public static void main(String[] args) {
        User user = User.builder().login("ADAM").email("adam@sda.pl").build();
        User.Builder builder = User.builder().login("EWA") ;
        builder.email("ewa@op.pl");
        User ewa = builder.build();
        builder.birthDate(LocalDate.now());
        User karol = builder.build();
        System.out.println(user);
        System.out.println(ewa);
        System.out.println(karol);

        user = User.builder().login("test").birthDate(LocalDate.now()).email("asd@we.pl").build();

        System.out.println( user);
        Car porsche = Car.builder().brand("porsche").model("911").power(240).build();
        System.out.println(porsche);
    }
}

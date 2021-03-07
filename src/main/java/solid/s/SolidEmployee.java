package solid.s;
//klasa zachowuje zasade pojedynczej ospowiedzialnsci nie wnika w szczwgóły budowy adresu
//klasa przechowuje informacje o pracowniku

public class SolidEmployee {
    final String firstName;
    final String lastName;
    final EmailAddress email;

    public SolidEmployee(String firstName, String lastName, EmailAddress email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public EmailAddress getEmail() {
        return email;
    }
}

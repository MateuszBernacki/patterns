package solid.s;
/*klasa zawiera logike i odpowiedzialnosc za sprawdzenie poprawnosci i uzyskiwac informacje*/
public class EmailAddress {
    final String email;

    public EmailAddress(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public String getUserName(){
        return  email.substring(0, email.indexOf('@'));
    }


}

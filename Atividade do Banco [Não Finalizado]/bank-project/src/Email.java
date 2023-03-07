import exceptions.BlankTextException;
import exceptions.InvalidDataException;

public class Email extends ContactInfo {
    private String user;
    private String provider;

    public Email () {}

    public Email (String user, String provider) throws InvalidDataException {
        this.setUser(user);
        this.setProvider(provider);
    }

    public String getUser () {
        return this.user;
    }

    public void setUser (String user) throws InvalidDataException {
        if (Services.isStringValid(user) && user.equals("[a-zA-Z0-9]*")) {
            this.user = user;
        } else {
            throw new BlankTextException();
        }
    }

    public String getProvider () {
        return this.provider;
    }

    public void setProvider (String provider) throws InvalidDataException {
        if (Services.isStringValid(provider) && provider.equals("[a-zA-Z0-9]*")) {
            this.provider = provider;
        } else {
            throw new BlankTextException();
        }
    }

    public String getEmail () {
        return this.user + "@" + this.provider;
    }
}

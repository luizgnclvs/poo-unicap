package pckg2;

public class Client {
    private String name;
    private String address;
    private ClientInfo info;

    public Client () {}

    public Client (String name, String address, ClientInfo info) {
        this.name = name;
        this.address = address;
        this.info = info;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAddress () {
        return this.address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public ClientInfo getInfo () {
        return this.info;
    }

    public void setInfo (ClientInfo info) {
        this.info = info;
    }
}

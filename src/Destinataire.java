import java.util.Scanner;

public class Destinataire {
    private String name;
    private String IP;

    Scanner scanner = new Scanner(System.in);

    public Destinataire(String name, String IP) {
        setName(name);
        setIP(IP);
    }

    public Destinataire(){
        String _name = scanner.nextLine();
        String _IP =scanner.nextLine();
        setName(_name);
        setIP(_IP);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIP() {
        return IP;
    }
    public void setIP(String IP) {
        if (IPAddressValidator.isValidIP(IP)){
            this.IP = IP;
        }
        else {
            System.out.println("IP adress is not valid!!");
            System.out.println("The IP adress will be set as 255.255.255.255 !!");
            this.IP= "255.255.255.255";
        }
    }
}

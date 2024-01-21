import java.math.BigDecimal;
import java.util.Date;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        String firstname = "Jiří";//Jméno
        String surname = "Loukota";//Přímení
        Date dateOfBirth = new Date(1974, 2, 16);//Datum narození
        int numberOfContracts = 10;//Počet smluv
        double weightInTons = 8.5;//Hmotnost mrkve
        String residence = "Praha";//Sídlo
        String spz = "3FG6023";//SPZ
        double consumption = 8.25;//Spořeba auta na 100km
        String ip4 = "123.45.678.9";//ip adresa v4

        System.out.println("Množství prodané mrkve na jednu smlouvu:" + weightInTons/numberOfContracts + "tun");

    }
}
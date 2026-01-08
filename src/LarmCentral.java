import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LarmCentral {

    public void hanteraLarmFranFil(String filnamn) {

        try (BufferedReader lasare = new BufferedReader(new FileReader(filnamn))) {

            String line;
            while ((line = lasare.readLine()) != null) {

                String[] delar =  line.split(";");
                LarmTyp typ = LarmTyp.valueOf(delar[0]);
                String scenario = delar[1];

                System.out.println("\n Larm mottaget");

                LarmEnhet enhet =
                        LarmEnhetFactory.skapaLarmEnhet(typ);

                enhet.hanteraLarm(scenario);

                System.out.println("Larm avslutat och loggat");
            }
        } catch (IOException e) {
            System.out.println("Fel vid filhantering: " + e.getMessage());
        }
    }
}

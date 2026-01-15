import java.io.*;

public class LarmCentral {

    public void hanteraLarmFranFil(String filnamn) {
        System.out.println("Larm mottaget");
        //enter
        //välj mellan 3 enheter = polis, ambulans och brandkår


        try (
                BufferedReader lasare = new BufferedReader(new FileReader(filnamn));
        ) {

            String line;
            while ((line = lasare.readLine()) != null) {

                String[] delar = line.split(";");
                LarmTyp typ = LarmTyp.valueOf(delar[0]);
                String scenario = delar[1];

                String start = " ";
                String info = "Typ: " + typ;
                String scen = "Scenario: " + scenario;

                System.out.println(start);
                System.out.println(info);
                System.out.println(scen);

                Logger.skriv(start);
                Logger.skriv(info);
                Logger.skriv(scen);

                LarmEnhet enhet = LarmEnhetFactory.skapaLarmEnhet(typ);
                enhet.hanteraLarm(scenario);

                String slut = "Larm avslutat och loggat";
                System.out.println(slut);

                Logger.skriv(slut);
                Logger.separator();
            }

        } catch (IOException e) {
            System.out.println("Fel vid filhantering: " + e.getMessage());
        }
    }
}
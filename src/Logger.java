import java.io.*;

public class Logger {
    public String loggfil = "src/Logg";
    public void skapaLarm (String filnamn) {

        try (
                BufferedReader lasare = new BufferedReader(new FileReader(filnamn));
                BufferedWriter logg = new BufferedWriter(new FileWriter(loggfil, true))
        ) {

            String line;
            while ((line = lasare.readLine()) != null) {

                String[] delar = line.split(";");
                LarmTyp typ = LarmTyp.valueOf(delar[0]);
                String scenario = delar[1];

                String start = "\nLarm mottaget";
                String info = "Typ: " + typ;
                String scen = "Scenario: " + scenario;

                System.out.println(start);
                System.out.println(info);
                System.out.println(scen);

                logg.write(start);
                logg.newLine();
                logg.write(info);
                logg.newLine();
                logg.write(scen);
                logg.newLine();

                LarmEnhet enhet = LarmEnhetFactory.skapaLarmEnhet(typ);
                enhet.hanteraLarm(scenario);

                String slut = "Larm avslutat och loggat";
                System.out.println(slut);

                logg.write(slut);
                logg.newLine();
                logg.write("----------------------------------");
                logg.newLine();
            }

        } catch (IOException e) {
            System.out.println("Fel vid filhantering: " + e.getMessage());
        }
    }
}



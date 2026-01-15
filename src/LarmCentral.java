import java.util.Scanner;

public class LarmCentral {

    public void startaProgram() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🚨 Behöver du hjälp?");
        System.out.println("1. Ja");
        System.out.println("2. Nej");

        if (scanner.nextInt() == 2) {
            System.out.println("Programmet avslutas.");
            return;
        }

        System.out.println("\nVälj en enhet:");
        System.out.println("1. Polis");
        System.out.println("2. Ambulans");
        System.out.println("3. Brandkår");

        int val = scanner.nextInt();

        LarmTyp typ;
        String scenario;

        switch (val) {
            case 1:
                typ = LarmTyp.POLIS;
                scenario = "Bråk på Medborgarplatsen";
                break;

            case 2:
                typ = LarmTyp.AMBULANS;
                scenario = "Skadad person i park";
                break;

            case 3:
                typ = LarmTyp.BRANDKÅR;
                scenario = "Brand i köpcentrum";
                break;

            default:
                System.out.println("Felaktigt val.");
                return;
        }

        hanteraLarm(typ, scenario);
    }

    private void hanteraLarm(LarmTyp typ, String scenario) throws InterruptedException {

        System.out.println("\n📞 Larm mottaget");
        System.out.println("Typ: " + typ);
        System.out.println("Scenario: " + scenario);
        System.out.println("Status: Pågår");

        Logger.skriv("Larm mottaget");
        Logger.skriv("Typ: " + typ);
        Logger.skriv("Scenario: " + scenario);

        LarmEnhet enhet = LarmEnhetFactory.skapaLarmEnhet(typ);
        enhet.hanteraLarm(scenario);

        Thread.sleep(10_000);
        System.out.println("✅ Enheten är på plats");

        Thread.sleep(15_000);
        enhet.avslutaInsats();

        Thread.sleep(5_000);
        System.out.println("📁 Case closed");
        System.out.println("🏁 Status: Avslutat");

        Logger.skriv("Status: Avslutat");
        Logger.separator();
    }
}

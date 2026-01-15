import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🚨 Behöver du hjälp?");
        System.out.println("1. Ja");
        System.out.println("2. Nej");

        int svar = scanner.nextInt();

        if (svar == 2) {
            System.out.println("Programmet avslutas.");
            return;
        }

        System.out.println("\nVälj en enhet:");
        System.out.println("1. Polis");
        System.out.println("2. Ambulans");
        System.out.println("3. Brandkår");

        int val = scanner.nextInt();

        LarmTyp typ = null;
        String scenario = "";

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

        System.out.println("\n📞 Larm mottaget");
        System.out.println("Typ: " + typ);
        System.out.println("Scenario: " + scenario);
        System.out.println("Status: Pågår");

        LarmEnhet enhet = LarmEnhetFactory.skapaLarmEnhet(typ);
        enhet.hanteraLarm(scenario);

        Thread.sleep(10_000);
        System.out.println("✅ Enheten är på plats");

        Thread.sleep(15_000);

        switch (typ) {
            case POLIS:
                System.out.println("🚓 Polisen har gripit de kriminella och åker tillbaka till stationen.");
                break;

            case AMBULANS:
                System.out.println("🚑 Ambulansen har tagit hand om den skadade och åker till sjukhuset.");
                break;

            case BRANDKÅR:
                System.out.println("🚒 Branden är släckt och brandkåren återvänder till stationen.");
                break;
        }

        Thread.sleep(5_000);
        System.out.println("📁 Ärendet har avslutat");
        System.out.println("🏁 Status: Avslutat");

    }
}

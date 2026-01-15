public class PolisEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String scenario) {
        System.out.println("🚓 Polis skickas till platsen.");
    }

    @Override
    public void avslutaInsats() {
        System.out.println("🚓 Polisen har gripit de kriminella och återvänder till stationen.");
    }
}

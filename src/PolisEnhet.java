public class PolisEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String scenario) {
        System.out.println("🚓 Polis skickas till platsen.");
    }
}

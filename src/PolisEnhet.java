public class PolisEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String Scenario) {
        System.out.println("\uD83D\uDE93Polis skickas till platsen.");
        System.out.println("Scenario: " + Scenario);
    }
}

public class AmbulansEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String Scenario) {
        System.out.println("\uD83D\uDE91Ambulans skickas till platsen.");
        simulera();
        System.out.println("\uD83D\uDE91Ambulansen är tillbaka på station");
    }

    private void simulera() {
        try {
            Thread.sleep(1000);
            System.out.println("   → På väg till platsen...");
            Thread.sleep(1000);
            System.out.println("   → Patienten omhändertagen...");
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}
    }
}
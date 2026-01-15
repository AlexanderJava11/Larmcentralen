public class PolisEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String Scenario) {
        System.out.println("\uD83D\uDE93Polis skickas till platsen.");
        simulera();
        System.out.println("\uD83D\uDE93Polisen är tillbaka på station");
    }

    private void simulera(){
        try {
            Thread.sleep(1000);
            System.out.println("   → På väg till platsen...");
            Thread.sleep(1000);
            System.out.println("   → På plats...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}

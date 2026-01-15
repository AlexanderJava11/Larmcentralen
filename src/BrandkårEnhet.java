public class BrandkårEnhet implements LarmEnhet{

    @Override
    public void hanteraLarm(String Scenario) {
        System.out.println("\uD83D\uDE92Brandkår rycker ut.");
        simulera();
        System.out.println("\uD83D\uDE92Brandkåren är tillbaka på station");
    }

    private void simulera() {
        try {
            Thread.sleep(1000);
            System.out.println("   → På väg till brand...");
            Thread.sleep(1000);
            System.out.println("   → Släckningsarbete pågår...");
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}
    }
}

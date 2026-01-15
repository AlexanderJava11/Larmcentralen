public class BrandkårEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String scenario) {
        System.out.println("🚒 Brandkår rycker ut.");
    }
}

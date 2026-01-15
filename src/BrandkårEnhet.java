public class BrandkårEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String scenario) {
        System.out.println("🚒 Brandkår rycker ut.");
    }

    @Override
    public void avslutaInsats() {
        System.out.println("🚒 Branden är släckt och brandkåren återvänder till stationen.");
    }
}

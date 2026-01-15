public class AmbulansEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String scenario) {
        System.out.println("🚑 Ambulans skickas till platsen.");
    }

    @Override
    public void avslutaInsats() {
        System.out.println("🚑 Patienten är omhändertagen och ambulansen kör till sjukhus.");
    }
}

public class AmbulansEnhet implements LarmEnhet {

    @Override
    public void hanteraLarm(String scenario) {
        System.out.println("🚑 Ambulans skickas till platsen.");
    }
}

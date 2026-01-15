public interface LarmEnhet {
    void hanteraLarm(String scenario);
    void avslutaInsats();   // 👈 NEW method
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static final String LOGGFIL = "src/Logg";

    public static void skriv(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOGGFIL, true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Fel vid loggning: " + e.getMessage());
        }
    }

    public static void separator() {
        skriv("------------------------------------");
    }
}

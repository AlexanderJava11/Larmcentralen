public class LarmEnhetFactory {

    public static LarmEnhet skapaLarmEnhet(LarmTyp typ) {

        switch (typ) {
            case POLIS:
                return new PolisEnhet();

            case AMBULANS:
                return new AmbulansEnhet();

            case BRANDKÅR:
                return new BrandkårEnhet();

            default:
                throw new IllegalArgumentException("Okänd larmtyp");
            }
        }
    }
public class Superhero {
    private String navn;
    private String rigtigeNavn;
    private boolean menneske;
    private int udgivelsesÅr;
    private double styrke;

    public Superhero(String navn, String rigtigeNavn, boolean menneske, int udgivelsesÅr, double styrke) {
        this.navn = navn;
        this.rigtigeNavn = rigtigeNavn;
        this.menneske = menneske;
        this.udgivelsesÅr = udgivelsesÅr;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public String getRigtigeNavn() {
        return rigtigeNavn;
    }

    public boolean isMenneske() {
        return menneske;
    }

    public int getUdgivelsesÅr() {
        return udgivelsesÅr;
    }

    public double getStyrke() {
        return styrke;
    }
}

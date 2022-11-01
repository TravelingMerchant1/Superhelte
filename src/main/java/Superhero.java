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

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getRigtigeNavn() {
        return rigtigeNavn;
    }

    public void setRigtigeNavn(String rigtigeNavn) {
        this.rigtigeNavn = rigtigeNavn;
    }

    public boolean isMenneske() {
        return menneske;
    }

    public void setMenneske(boolean menneske) {
        this.menneske = menneske;
    }

    public int getUdgivelsesÅr() {
        return udgivelsesÅr;
    }

    public void setUdgivelsesÅr(int udgivelsesÅr) {
        this.udgivelsesÅr = udgivelsesÅr;
    }

    public double getStyrke() {
        return styrke;
    }

    public void setStyrke(double styrke) {
        this.styrke = styrke;
    }
}

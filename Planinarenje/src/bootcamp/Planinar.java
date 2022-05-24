package bootcamp;

public abstract class Planinar {
    private int identifikacioniBroj;
    private String imePlaninara;
    private String prezimePlaninara;

    Planinar() {

    }

    public Planinar(int identifikacioniBroj, String imePlaninara, String prezimePlaninara) {
        this.identifikacioniBroj = identifikacioniBroj;
        this.imePlaninara = imePlaninara;
        this.prezimePlaninara = prezimePlaninara;
    }

    public int getIdentifikacioniBroj() {
        return identifikacioniBroj;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public String getPrezimePlaninara() {
        return prezimePlaninara;
    }

    public abstract void stampaj();

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina planina);
}

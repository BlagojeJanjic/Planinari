package bootcamp;

public class Alpinista extends Planinar{

    private int brojPoena;

    public Alpinista() {

    }

    public Alpinista(int identifikacioniBroj, String imePlaninara, String prezimePlaninara, int brojPoena) {
        super(identifikacioniBroj, imePlaninara, prezimePlaninara);
        this.brojPoena = brojPoena;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: " + getIdentifikacioniBroj() + "\n" +
                "ime: " + getImePlaninara() + " " + getPrezimePlaninara() + "\nBroj poena: " + brojPoena);
    }

    @Override
    public double clanarina() {
        int clanarina = 1500 - (brojPoena * 50);
        if(clanarina > 0) {
            return clanarina;
        } else {
            return 0;
        }
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return planina.getVisinaPlanine() <= 4000;
    }
}

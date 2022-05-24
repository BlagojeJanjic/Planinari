package bootcamp;

public class RekreativniPlaninar extends Planinar {
    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalanUspon;
    private static final int clanarina = 1000;

    RekreativniPlaninar() {

    }


    public RekreativniPlaninar(int identifikacioniBroj, String imePlaninara, String prezimePlaninara, int tezinaOpreme, String nazivOkruga, int maksimalanUspon) {
        super(identifikacioniBroj, imePlaninara, prezimePlaninara);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalanUspon = maksimalanUspon;
    }


    public void setMaksimalanUspon(int maksimalanUspon) {
        this.maksimalanUspon = maksimalanUspon;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + getIdentifikacioniBroj() + "\n" +
                "ime: " + getImePlaninara() + " " + getPrezimePlaninara() + " Okrug: " + nazivOkruga);
    }

    @Override
    public double clanarina() {
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        return (maksimalanUspon - (tezinaOpreme * 50)) > planina.getVisinaPlanine();
    }
}

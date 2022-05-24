package bootcamp;

public class Planina {
    private String imePlanine;
    private String imeDrzave;
    private int visinaPlanine;

    public Planina() {
    }

    public Planina(String imePlanine, String imeDrzave, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.imeDrzave = imeDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getImeDrzave() {
        return imeDrzave;
    }

    public void setImeDrzave(String imeDrzave) {
        this.imeDrzave = imeDrzave;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        if (visinaPlanine < 0) {
            this.visinaPlanine = visinaPlanine;
        } else {
            System.err.println("Nevalidna vrednost!");
        }
    }
}

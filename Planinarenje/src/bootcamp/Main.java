package bootcamp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Planina zlatibor = new Planina("Zlatibor", "Srbija", 1496);

        ArrayList<Planinar> planinari = new ArrayList<>();
        planinari.add(new RekreativniPlaninar(3214, "Petar", "Petrovic", 10, "Kolubarski", 1500));
        planinari.add(new RekreativniPlaninar(12, "Milos", "Petrovic", 12, "Sumadijski", 800));
        planinari.add(new RekreativniPlaninar(214, "Nikola", "Petrovic", 20, "Zlatiborski", 2800));

        planinari.add(new Alpinista(1242, "Darko", "Ilic", 20));
        planinari.add(new Alpinista(1, "Milan", "Ilic", 40));
        planinari.add(new Alpinista(133, "Nemanja", "Ilic", 15));

        int ukupnaClanarina = 0;
        for (Planinar planinar : planinari) {
            planinar.stampaj();
            if (planinar.uspesanUspon(zlatibor)) {
                System.out.println("Uspsan uspon!");
            } else {
                System.out.println("Neuspesan uspon!");
            }
            ukupnaClanarina += planinar.clanarina();
        }

        System.out.println("Ukupna clanarina je " + ukupnaClanarina);
    }
}

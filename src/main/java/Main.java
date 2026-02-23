import cz.uhk.zlomky.Zlomek;

public class Main {
    static void main() {
        IO.println("Projekt zlomky"); //novinka Javy 25



        var a = new Zlomek();


        a.setCitatel(1);
        a.setJmenovatel(2);

        IO.println("Zlomek :" + a.getCitatel() + " / " + a.getJmenovatel());

        Zlomek b = new Zlomek(3, 4);
        IO.println(b);

        var soucet = a.plus(b);
        IO.println("Soucet je %s ".formatted(soucet.zkratit()));
        var rozdil = a.minus(b);
        IO.println("Rozdil je %s ".formatted(rozdil));
        var deleni = a.deleno(b);
        IO.println("Deleni je %s ".formatted(deleni));
        var nasobeni = a.krat(b);
        IO.println("Nasobeni je %s ".formatted(nasobeni));

        Zlomek[] pole = new Zlomek[]{
                new Zlomek(1, 3),
                new Zlomek(1, 2),
               new Zlomek(6, 5),
                new Zlomek(4, 3),
                new Zlomek(7, 8),
                new Zlomek(13, 10),
        };

        Zlomek prumer = prumer(pole);
        IO.println("prumer je %s ".formatted(prumer.zkratit()));


    }

    private static Zlomek prumer(Zlomek[] pole) {
        var soucet = new Zlomek();//nulovy zlomek
        for (var z : pole) {
            soucet.plus(z);

        }
        var pocet = new Zlomek(pole.length, 1);
        return soucet.deleno(pocet);
    }
}

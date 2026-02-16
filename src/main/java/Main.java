import cz.uhk.zlomky.Zlomek;

public class Main {
    static void main() {
        IO.println("Projekt zlomky"); //novinka Javy 25
        IO.println("============================");


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


    }
}

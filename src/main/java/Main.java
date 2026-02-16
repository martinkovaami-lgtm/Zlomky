import cz.uhk.zlomky.Zlomek;

public class Main {
    static void main() {
        IO.println("Projekt zlomky"); //novinka Javy 25
        IO.println("============================");

        var a = new Zlomek();

        a.setCitatel(3);
        a.setJmenovatel(4);

        IO.println("Zlomek :"+a.getCitatel()+" / "+a.getJmenovatel());

        Zlomek b = new Zlomek(4, 5);
        IO.println(b);
    }
}

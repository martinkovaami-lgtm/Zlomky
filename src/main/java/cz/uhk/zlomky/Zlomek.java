package cz.uhk.zlomky;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek() {
    }

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    // defaultni konstruktor


    // selektory= getry = metody pro čteni dat
    public int getCitatel() {

        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    // MODIFIKATORY = SETRY METODY PRO ZMENU/ZÁPIS DAT

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public void setJmenovatel(int jmenovatel) {

        this.jmenovatel = jmenovatel;
        ;
    }

    @Override
    public String toString() {
        return String.format(
                "%3d\n-----\n%3d ",
                citatel, jmenovatel
        );
    }

    /*
    Metoda pro scitani dvou zlomku
    param druhy
    return novy zlomek, ktery je souctem dvou zlomku

     */
    public Zlomek plus(Zlomek druhy) {
        int jm = jmenovatel * druhy.jmenovatel;
        int cit = citatel * druhy.jmenovatel + druhy.citatel * jmenovatel;
        return new Zlomek(cit, jm);
    }

    public Zlomek zkratit() {
        int delitel = nsd(citatel, jmenovatel);
        return new Zlomek(citatel / delitel, jmenovatel / delitel);
    }

    public Zlomek minus(Zlomek druhy) {
        int jm = jmenovatel * druhy.jmenovatel;
        int cit = citatel*druhy.jmenovatel - druhy.citatel*jmenovatel;
        return new Zlomek(cit, jm);
    }

    /**
     * vypocet nejvetsiho spolecnyho delitele cisel a a b
     *
     * @param a
     * @param b
     * @return
     */
    private int nsd(int a, int b) {
        if (a < b) {
            var pom = a;
            a = b;
            b = pom;
        }
        int zbytek;
        do {
            zbytek = a % b;
            a = b;
            b = zbytek;
        }
            while (zbytek != 0) ;
            return a;


    }

}

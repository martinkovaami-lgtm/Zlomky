package cz.uhk.zlomky;



public class Zlomek extends Number{
    private int citatel;
    private int jmenovatel;

    public Zlomek() {
    }

    @Override
    public int intValue() {
        return (int)longValue();
    }

    @Override
    public long longValue() {
        return Math.round(citatel / (double) jmenovatel);
    }

    @Override
    public float floatValue() {
        return citatel / (float) jmenovatel;
    }

    @Override
    public double doubleValue() {
        return citatel / (double) jmenovatel;
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
    /*
    public Zlomek plus(int cislo) {
        int jm = jmenovatel * druhy.jmenovatel;
        int cit = citatel * druhy.jmenovatel + druhy.citatel * jmenovatel;
        return new Zlomek(cit, jm);
    }
    */

    /**
    //pretizene plus pro pretizeni celeho cisla ke zlomku
    public Zlomek plus(int cislo){
        int cit= citatel + jmenovatel * cislo;
    }

     */

    //kraceni
    public Zlomek zkratit() {
        int delitel = nsd(citatel, jmenovatel);
        return new Zlomek(citatel / delitel, jmenovatel / delitel);
    }
    //minus
    public Zlomek minus(Zlomek druhy) {
        int jm = jmenovatel * druhy.jmenovatel;
        int cit = citatel*druhy.jmenovatel - druhy.citatel*jmenovatel;
        return new Zlomek(cit, jm);
    }

    //deleno
    public Zlomek deleno(Zlomek druhy) {
        int jm = jmenovatel * druhy.jmenovatel;
        int cit = citatel*druhy.jmenovatel / druhy.citatel*jmenovatel;
        return new Zlomek(cit, jm);
    }
    //krat
    public Zlomek krat(Zlomek druhy) {
        int jm = jmenovatel * druhy.jmenovatel;
        int cit = citatel*druhy.jmenovatel * druhy.citatel*jmenovatel;
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

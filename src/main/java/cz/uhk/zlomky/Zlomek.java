package cz.uhk.zlomky;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek(){}

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    // selektory= getry = metody pro čteni dat
    public int getCitatel() {

        return citatel;
    }
    public int getJmenovatel(){
        return jmenovatel;
    }

    // MODIFIKATORY = SETRY METODY PRO ZMENU/ZÁPIS DAT

    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }
    public void setJmenovatel(int jmenovatel){

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
}

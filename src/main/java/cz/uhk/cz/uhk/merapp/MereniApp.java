package cz.uhk.cz.uhk.merapp;

import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomky.Zlomek;

public class MereniApp {

    public static void main(String[]args){
        var mereni = new Mereni();

        mereni.pridat(new Zlomek(12,7));
        mereni.pridat(new Zlomek(8,9));
        mereni.pridat(10);

        IO.println("soucet je %s".formatted(mereni.secist()));
        IO.println("prumer je %s".formatted(mereni.prumer()));
        Number max = mereni.max();
        if (max instanceof Double || max instanceof  Float)
            IO.println("maximum je %f".formatted(max));
        else
            IO.println("maximum je %s".formatted(max));
        //IO.println("maximum je %s".formatted(mereni.max()));
        Number min = mereni.min();
        if (min instanceof Double || min instanceof  Float)
            IO.println("minimum je %f".formatted(min));
        else
            IO.println("minimum je %s".formatted(min));
        //IO.println("minimum je %s".formatted(mereni.min()));

        for (int i=0; i<mereni.size(); i++){
            Number m = mereni.get(i);

            IO.println(m);
        }
    }
}

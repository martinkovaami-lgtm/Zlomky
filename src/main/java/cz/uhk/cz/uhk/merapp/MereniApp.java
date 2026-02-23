package cz.uhk.cz.uhk.merapp;

import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomky.Zlomek;

public class MereniApp {

    public static void main(String[]args){
        var mereni = new Mereni();
        mereni.pridat(new Zlomek(12,7));
        mereni.pridat(new Zlomek(8,9));
        mereni.pridat(10);

        IO.println("Soucet je %g" .formatted(mereni.secist()));
        IO.println("Prumer je %g" .formatted(mereni.prumer()));
        IO.println("Maximum je %g" .formatted(mereni.max()));

        for (int i=0; i<mereni.size(); i++){
            Number m = mereni.get(i);

            IO.println(m);
        }
    }
}

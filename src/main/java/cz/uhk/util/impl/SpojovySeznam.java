package cz.uhk.util.impl;

import cz.uhk.util.Seznam;

import java.util.Iterator;

public class SpojovySeznam<E> implements Seznam<E> {

    private PrvekSeznamu<E> prvni, posledni;

    @Override
    public void pridej(E hodnota) {
        var novy = new PrvekSeznamu<E>(hodnota);
        if (prvni==null){
            //seznam je prazny a pridame prvni hodnotu
            prvni=posledni=novy;
        } else {
            posledni.dalsi=novy;
        }

    }

    @Override
    public void smaz(int pozice) {
        if (pozice==0){
            prvni=prvni.dalsi;
        }else{
            var pom=vratPrvek(pozice-1);
            pom.dalsi=pom.dalsi.dalsi;
        }

    }

    @Override
    public E vrat(int pozice) {

        return vratPrvek(pozice).hodnota;
    }

    private PrvekSeznamu<E> vratPrvek(int pozice) {
        var pom = prvni;
        //for (int i=0; i<pozice && pom!= null;i++, pom= pom.dalsi);
        for (int i=0; i<pozice && pom!= null;i++) {
            pom = pom.dalsi;
        }
        return pom;
    }

    @Override
    public int pocet() {
        var pom =prvni;
        int pocet=0;
        while (pom !=null){
            pom=pom.dalsi;
            pocet++;
        }
        return 0;
    }

    public Iterator<E> iterator(){
        return new Iterator<E>() {
            PrvekSeznamu<E> aktualni = prvni;

            public boolean hasNext() {
                return aktualni.dalsi != null;
            }

            @Override
            public E next() {
                return null;
            }
        }
    }
}
//typ prvku ve spoj. seznamu s hodnotou zatim neznameho typu
class PrvekSeznamu <E> {
    E hodnota;
    PrvekSeznamu<E> dalsi;

    public PrvekSeznamu(E hodnota) {
        this.hodnota=hodnota;
    }
}

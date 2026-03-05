package cz.uhk.util.impl;

import cz.uhk.util.Seznam;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpojovySeznamTest {
    Seznam<Integer> seznam;

    @BeforeEach
    void setupData() {
        seznam = new SpojovySeznam<>();
    }

    @Test
    void pridej() {
        initData();
        assertEquals(4, seznam.pocet());
    }

    @Test
    @DisplayName("Přidání prvku na konkrétní index")
    void pridejNaIndex() {
        initData(); // Vytvoří seznam s prvky 10, 20, 30, 40 (celkem 4 prvky)

        // 1. Přidání doprostřed (na index 2)
        seznam.pridej(25, 2);
        assertEquals(5, seznam.pocet());
        assertEquals(20, seznam.vrat(1));
        assertEquals(25, seznam.vrat(2)); // Nový prvek
        assertEquals(30, seznam.vrat(3)); // Původní prvek se posunul

        // 2. Přidání na úplný začátek (index 0)
        seznam.pridej(5, 0);
        assertEquals(6, seznam.pocet());
        assertEquals(5, seznam.vrat(0)); // Nový prvek
        assertEquals(10, seznam.vrat(1)); // Původní první prvek

        // 3. Přidání na konec seznamu (index 6, protože teď máme 6 prvků)
        seznam.pridej(50, seznam.pocet());
        assertEquals(7, seznam.pocet());
        assertEquals(50, seznam.vrat(6)); // Úplně poslední prvek
    }

    @Test
    void smaz() {
        initData();
        seznam.smaz(1);
        assertEquals(3, seznam.pocet());
        assertEquals(30, seznam.vrat(1));
        seznam.smaz(3);
        assertEquals(3, seznam.pocet());
    }

    @Test
    void smazMimo() {
        initData();
        seznam.smaz(-1);
        assertEquals(4, seznam.pocet());
    }

    private void initData() {
        seznam.pridej(10);
        seznam.pridej(20);
        seznam.pridej(30);
        seznam.pridej(40);
    }

    @Test
    void vrat() {
        initData();

        assertEquals(10, seznam.vrat(0));
        assertEquals(20, seznam.vrat(1));
        assertEquals(40, seznam.vrat(seznam.pocet()-1));

        assertNull(seznam.vrat(100), "pozice mimo rozsah seznamu");
        assertNull(seznam.vrat(-100), "pozice mimo rozsah seznamu");


    }

    @Test
    @DisplayName("Pocet prvku")
    void pocet() {
        assertEquals(0,seznam.pocet(), "pocet - prazdny seznam");
        initData();
        assertEquals(4,seznam.pocet(), "pocet - 2 prvky");
    }
}
package test;
import code.Business_logic.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EuroTest {
    @Test
    public void testGetValore() {
        Euro verifica = new Euro (60);
        assertEquals (6000,verifica.getValore ());
    }

    @Test
    public void testMinoreDi() {
        Euro a = new Euro (5);
        Euro b = new Euro (2);
        assertEquals(true,b.minoreDi (a));
    }

    @Test
    public void testSomma() {
        Euro a = new Euro (10);
        Euro b = new Euro (5);
        b.somma (a);
        assertEquals(1500,b.getValore());
    }

    @Test
    public void testSottrai() {

        Euro a = new Euro (10);
        Euro b = new Euro (5);
        a.sottrai(b);
        assertEquals(500,b.getValore());
    }

    @Test
    public void testStampa() {

        Euro a = new Euro (50);
        String k = "50.0 euro";
        assertEquals(k, a.stampa());
    }

    @Test
    public void testUgualeA() {

        Euro a = new Euro (5);
        Euro b = new Euro (5);
        assertEquals(true,b.ugualeA(a));
    }
}

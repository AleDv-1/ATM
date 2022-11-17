package test;
import code.Business_logic.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EuroTest {
    @Test
    public void testGetValore() {
        final Euro verifica = new Euro (60);
        assertEquals (6000,(int)verifica.getValore ());
    }

    @Test
    public void testMinoreDi() {
        final Euro a = new Euro (5);
        final Euro b = new Euro (2);
        assertEquals(true,b.minoreDi (a));
    }

    @Test
    public void testSomma() {
        final Euro a = new Euro (10);
        final Euro b = new Euro (5);
        b.somma (a);
        assertEquals(1500,b.getValore());
    }

    @Test
    public void testSottrai() {

        final Euro a = new Euro (10);
        final Euro b = new Euro (5);
        a.sottrai(b);
        assertEquals(500,b.getValore());
    }

    @Test
    public void testStampa() {

        final Euro a = new Euro (50);
        final String k = "50.0 euro";
        assertEquals(k, a.stampa());
    }

    @Test
    public void testUgualeA() {

        final Euro a = new Euro (5);
        final Euro b = new Euro (5);
        assertEquals(true,b.ugualeA(a));
    }
}

package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import code.Business_logic.*;

public class AccountTest {
    /*
     * Test per verficare funzione Debit dell'Account
     */
    @Test
    public void testCredit() {
        Account acc_one = new Account(12345, 54321, new Euro(200.0), new Euro(1000.0)); 
        acc_one.credit(new Euro(500.0));
        assertEquals(150000, acc_one.getTotalBalance().getValore());
    }

    /*
     * Test per verficare funzione debit() dell'Account
     */
    @Test
    public void testDebit() {
        Account acc_one = new Account(12345, 54321, new Euro(200.0), new Euro(1000.0)); 
        acc_one.debit(new Euro(500.0));
        assertEquals(50000, acc_one.getTotalBalance().getValore());
    }

    /*
     * Test per verficare di dati dell'Account: accountNumber
     */
    @Test
    public void testGetAccountNumber() {
        Account acc_one = new Account(12345, 54321, new Euro(200.0), new Euro(1000.0)); 
        assertEquals(12345, acc_one.getAccountNumber());
    }

    /*
     * Test per verficare di dati dell'Account: availableBalance
     */
    @Test
    public void testGetAvailableBalance() {
        Account acc_one = new Account(12345, 54321, new Euro(200.0), new Euro(1000.0)); 
        assertEquals(20000, acc_one.getAvailableBalance().getValore());
    }

    /*
     * Test per verficare di dati dell'Account: totalBalance
     */
    @Test
    public void testGetTotalBalance() {
        Account acc_one = new Account(12345, 54321, new Euro(200.0), new Euro(1000.0)); 
        assertEquals(100000, acc_one.getTotalBalance().getValore());
    }
}

package edu.sabana.poob.sabanapayroll;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class CheckingTest {

    @Test
    public void shouldGetDepositDiscount() {
        Checking account = new Checking();

        assertTrue(Double.compare(5000, account.getDepositDiscount()) == 0);
    }

    @Test
    public void shouldDepositAmount() {
        Checking account = new Checking();
        boolean result = account.deposit(10000);

        assertTrue(result);
        assertTrue(Double.compare(5000, account.getBalance()) == 0);
    }

    @Test
    public void shouldNotDepositAmount() {
        Checking account = new Checking();

        assertFalse(account.deposit(4000));
        assertFalse(account.deposit(5000));
        assertTrue(Double.compare(0, account.getBalance()) == 0);
    }

    @Test
    public void shouldProcessCheck() {
        Checking account = new Checking();
        Check check = new Check(10000, LocalDate.now().plusMonths(1));

        assertTrue(account.processCheck(check));
        assertTrue(Double.compare(5000, account.getBalance()) == 0);
    }

    @Test
    public void shouldNotProcessCheck() {
        Checking account = new Checking();

        assertFalse(account.processCheck(new Check(5000, LocalDate.now().plusMonths(1))));
        assertFalse(account.processCheck(new Check(4000, LocalDate.now().plusMonths(1))));
        assertFalse(account.processCheck(new Check(10000, LocalDate.now().minusMonths(1))));
        assertTrue(Double.compare(0, account.getBalance()) == 0);
    }

    @Test
    public void shouldKeepBalance() {
        Checking account = new Checking();

        assertTrue(account.deposit(11000)); //6000
        assertFalse(account.deposit(4000));
        assertFalse(account.deposit(5000));
        assertTrue(account.deposit(21000)); // 16000

        assertTrue(account.processCheck(new Check(15000, LocalDate.now().plusMonths(1)))); // 10000
        assertFalse(account.processCheck(new Check(5000, LocalDate.now().plusMonths(1))));
        assertFalse(account.processCheck(new Check(4000, LocalDate.now().plusMonths(1))));
        assertFalse(account.processCheck(new Check(10000, LocalDate.now().minusMonths(1))));

        assertTrue(Double.compare(32000, account.getBalance()) == 0);
    }

}

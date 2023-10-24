package de.telran.lesson17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    @Test
    void isValidAccountNumberTestNotNullAccount() {
        String expAccount1 = null;
        String expAccount2 = "";

        Bank bankTest = new Bank();
        assertFalse(bankTest.isValidAccountNumber(expAccount1));
        assertFalse(bankTest.isValidAccountNumber(expAccount2));
    }
    @Test
    void isValidAccountNumberTestOnly14Symbol() {
        String expAccount13 = "1334567890123";
        String expAccount15 = "123456789012345";
        String expAccount14 = "12345678901234";

        Bank bankTest = new Bank();
        assertFalse(bankTest.isValidAccountNumber(expAccount13));
        assertFalse(bankTest.isValidAccountNumber(expAccount15));
        assertTrue(bankTest.isValidAccountNumber(expAccount14));
    }

    @Test
    void isValidAccountNumberTestAll0() {
        String expAccountZero = "00000000000000";

        Bank bankTest = new Bank();
        assertFalse(bankTest.isValidAccountNumber(expAccountZero));

    }
}
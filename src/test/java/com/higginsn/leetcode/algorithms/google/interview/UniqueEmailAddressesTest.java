package com.higginsn.leetcode.algorithms.google.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueEmailAddressesTest {

    private final UniqueEmailAddresses sut = new UniqueEmailAddresses();

    @Test
    public void example1() {
        String[] emails = new String[]{ "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        int expected = 2;

        Assertions.assertEquals(expected, sut.numUniqueEmails(emails));
    }

    @Test
    public void example2() {
        String[] emails = new String[]{ "a@leetcode.com", "b@leetcode.com", "c@leetcode.com" };
        int expected = 3;

        Assertions.assertEquals(expected, sut.numUniqueEmails(emails));
    }

    @Test
    public void example3() {
        String[] emails = new String[]{ "test.email+alex@leetcode.com", "test.email.leet+alex@code.com" };
        int expected = 2;

        Assertions.assertEquals(expected, sut.numUniqueEmails(emails));
    }

}
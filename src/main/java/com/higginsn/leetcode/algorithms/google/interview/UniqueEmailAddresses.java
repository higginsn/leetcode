package com.higginsn.leetcode.algorithms.google.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/google/67/sql-2/3044
 */
public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        return Arrays.stream(emails).map(this::trimEmail).collect(Collectors.toSet()).size();
    }

    private String trimEmail(String email) {
        String[] splitEmail = email.split("@");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < splitEmail[0].length(); i++) {
            char c = splitEmail[0].charAt(i);
            if (c == '.') {
                continue;
            } else if (c == '+') {
                break;
            } else {
                sb.append(c);
            }
        }

        return sb.append("@").append(splitEmail[1]).toString();
    }

}

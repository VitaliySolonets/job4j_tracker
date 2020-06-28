package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void whenDeleteDuplicate() {
        List<Account> accounts = Arrays.asList(
                new Account("321", "Vitaly Solonets", "q2w3e4r5t6"),
                new Account("543", "Vasily Pupkin", "9i8y6t543"),
                new Account("321", "Vitaly Solonets", "q2w3e4r5t6")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("321", "Vitaly Solonets", "q2w3e4r5t6"),
                        new Account("543", "Vasily Pupkin", "9i8y6t543")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}

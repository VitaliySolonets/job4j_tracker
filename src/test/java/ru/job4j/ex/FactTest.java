package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenParameterLessThanZero() {
        new Fact().calc(-2);
    }

    @Test
    public void whenParameter5Than120() {
        int rls = new Fact().calc(5);
        assertThat(rls, is(120));
    }
}

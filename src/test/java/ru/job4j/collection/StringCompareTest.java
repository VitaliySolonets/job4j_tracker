package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenLeftLessRightThanResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Patrov",
                "Petrov"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenStringEmpty() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "",
                ""
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenEmptyStringLessThanComplete() {
        StringCompare compare = new StringCompare();
        int rsl = compare.compare(
                "Ivanov",
                ""
        );
        assertThat(rsl, greaterThan(0));
    }
}

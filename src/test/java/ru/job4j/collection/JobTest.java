package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;


public class JobTest {
    @Test
    public void whenCompareAscByName() {
        int result = new JobAscByName().compare(
                new Job("Fix bug", 2),
                new Job("Impl task", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenCompareAscByPriority() {
        int result = new JobAscByPriority().compare(
                new Job("Fix bug", 2),
                new Job("Impl task", 1)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenCompareDescByName() {
        int result = new JobDescendingByName().compare(
                new Job("Fix bug", 2),
                new Job("Impl task", 1)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenCompareDescByPriority() {
        int result = new JobDescendingByPriority().compare(
                new Job("Fix bug", 2),
                new Job("Impl task", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescendingByName().thenComparing(new JobDescendingByPriority());
        int result = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenCompareAscByNameAndPriority() {
        Comparator<Job> cmpAscNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int result = cmpAscNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result, lessThan(0));
    }
}

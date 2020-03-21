package ru.job4j.ex;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class CountTest {
    /* @Test(expected = IllegalArgumentException.class)
     public void whenStartGreaterThenFinish() {
         Count.add(10, 2);
     }*/
   /* @Test(expected = IllegalArgumentException.class)
    public void when0to2then3() {
        int rls = Count.add(0, 3);
        assertThat(rls, is(3));
    }    */

    @Test()
    public void when0to2then3() {
        int rls = Count.add(0, 3);
        assertThat(rls, is(3));
    }
}

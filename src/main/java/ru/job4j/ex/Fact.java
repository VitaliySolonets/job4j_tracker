package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.calc(5));
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The parameter cannot be less than zero");
        }
        int rls = 1;
        for (int index = 1; index <= n; index++) {
            rls *= index;
        }
        return rls;
    }
}

package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The parameter n cannot be less than zero");
        }
        int rls = 1;
        for (int index = 1; index <= n; index++) {
            rls *= index;
        }
        return rls;
    }
}

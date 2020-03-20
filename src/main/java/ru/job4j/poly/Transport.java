package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int amountOfPassengers);

    int fill(int amountOfFuel);
}

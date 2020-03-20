package ru.job4j.poly;

public class Bus implements Transport {
    int fuelPrice;
    int costOfFuel;

    @Override
    public void go() {
        System.out.println("Поехали!!!");
    }

    @Override
    public void passengers(int amountOfPassengers) {
        System.out.println("Количество пассажиров: " + amountOfPassengers);
    }

    @Override
    public int fill(int amountOfFuel) {
        return amountOfFuel * fuelPrice;
    }
}

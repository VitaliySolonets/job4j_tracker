package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        //создаем объект класса Car.
        Car car = new Car();
        //делаем приведение к типу родителя.
        Transport tr = car;
        //делаем приведение к типу родителя Object.
        Object obj = car;
        //приведение типа при создании объекта.
        Object ocar = new Car();
        //приведение типа за счет приведения по иерархии.
        Car carFromObject = (Car) ocar;

        //Ошибка в приведении типа.
        // Object bicycle = new Bicycle();
        // Car cb = (Car) bicycle;
        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}

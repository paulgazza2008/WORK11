package com.company;

public class TestAnimal {
    public static void main(String[] args) {
        Animal one = new Animal();
        one.setSize(90);
        Animal two = new Animal();
        two.setSize(10);
        System.out.println("first Animal:" + one.getSize());
        System.out.println("second Animal:" + two.getSize());
        one.roar();
        two.roar();
    }
}
